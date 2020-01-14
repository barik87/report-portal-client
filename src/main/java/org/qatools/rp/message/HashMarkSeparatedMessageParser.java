/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.qatools.rp.message;

import static com.google.common.io.Files.asByteSource;
import static com.google.common.io.Resources.getResource;
import static org.qatools.rp.utils.MimeTypeDetector.detect;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteSource;
import com.google.common.io.Resources;

/**
 * Colon separated message parser. Expects string in the following format:<br>
 * RP_MESSAGE#FILE#FILENAME#MESSAGE_TEST<br>
 * RP_MESSAGE#BASE64#BASE_64_REPRESENTATION#MESSAGE_TEST<br>
 *
 * @author Andrei Varabyeu
 */
public class HashMarkSeparatedMessageParser implements MessageParser {

    /**
     * Different representations of binary data
     */
    private enum MessageType {
        FILE {
            @Override
            public TypeAwareByteSource toByteSource(String data) throws IOException {
                File file = new File(data);
                if (!file.exists()) {
                    return null;
                }
                return new TypeAwareByteSource(asByteSource(file), detect(file));
            }
        },
        BASE64 {
            @Override
            public TypeAwareByteSource toByteSource(final String data) throws IOException {
                if (data.contains(":")) {
                    final String[] parts = data.split(":");
                    String type = parts[1];
                    return new TypeAwareByteSource(ByteSource.wrap(BaseEncoding.base64().decode(parts[0])), type);

                }
                final ByteSource source = ByteSource.wrap(BaseEncoding.base64().decode(data));
                return new TypeAwareByteSource(source, detect(source, null));
            }
        },
        RESOURCE {
            @Override
            public TypeAwareByteSource toByteSource(String resourceName) throws IOException {
                URL resource = getResource(resourceName);
                if (null == resource) {
                    return null;
                }
                final ByteSource source = Resources.asByteSource(resource);
                return new TypeAwareByteSource(source, detect(source, resourceName));
            }
        };

        abstract public TypeAwareByteSource toByteSource(String data) throws IOException;

        public static MessageType fromString(String messageType) {
            return MessageType.valueOf(messageType);
        }
    }

    private static final int CHUNKS_COUNT = 4;

    @Override
    public ReportPortalMessage parse(String message) throws IOException {
        List<String> split = Splitter.on("#").limit(CHUNKS_COUNT).splitToList(message);

        // -1 because there may be no
        if (CHUNKS_COUNT != split.size()) {
            throw new RuntimeException(
                    "Incorrect message format. Chunks: " + Joiner.on("\n").join(split) + "\n count: " + split.size());
        }
        return new ReportPortalMessage(MessageType.fromString(split.get(1)).toByteSource(split.get(2)), split.get(3));
    }

    @Override
    public boolean supports(String message) {
        return message.startsWith(RP_MESSAGE_PREFIX);
    }
}
