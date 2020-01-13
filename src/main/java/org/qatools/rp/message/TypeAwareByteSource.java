/*
 * Copyright 2019 Maksym Barvinskyi <maksym@mbarvinskyi.com>
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

import java.io.IOException;
import java.io.InputStream;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource;

/**
 * {@link ByteSource} which knows about content mime type
 *
 * @author Andrei Varabyeu
 */
public class TypeAwareByteSource extends ByteSource {

    private final ByteSource delegate;
    private final String mediaType;

    public TypeAwareByteSource(ByteSource delegate, String mediaType) {
        this.delegate = Preconditions.checkNotNull(delegate);
        this.mediaType = mediaType;
    }

    @Override
    public InputStream openStream() throws IOException {
        return delegate.openStream();
    }

    public String getMediaType() {
        return mediaType;
    }
}
