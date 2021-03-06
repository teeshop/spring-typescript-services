/**
 * Copyright © 2016 Mathias Kowalzik (Mathias.Kowalzik@leandreck.org)
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
package org.leandreck.endpoints.epname;

import org.leandreck.endpoints.annotations.TypeScriptEndpoint;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@TypeScriptEndpoint(template = "/org/leandreck/endpoints/templates/testing/service.ftl", value = "CustomName")
@RestController
public class Endpoint {

    @RequestMapping(value = "/int", method = GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getInt() {
        return "Some";
    }
}