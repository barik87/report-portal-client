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
package org.qatools.rp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PagedList<T> {
    @JsonProperty("page")
    private PageMetadata pageMetadata;

    @JsonProperty("content")
    private List<T> content;

    public PageMetadata getPageMetadata() {
        return this.pageMetadata;
    }

    public List<T> getContent() {
        return this.content;
    }
}
