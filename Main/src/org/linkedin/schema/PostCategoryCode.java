/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package org.linkedin.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType>
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="discussion"/>
 *     &lt;enumeration value="job"/>
 *     &lt;enumeration value="promotion"/>
 *     &lt;enumeration value="linkedin-job"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum PostCategoryCode {

    @XmlEnumValue("discussion")
    DISCUSSION("discussion"),
    @XmlEnumValue("job")
    JOB("job"),
    @XmlEnumValue("promotion")
    PROMOTION("promotion"),
    @XmlEnumValue("linkedin-job")
    LINKEDIN_JOB("linkedin-job");
    private final String value;

    PostCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostCategoryCode fromValue(String v) {
        for (PostCategoryCode c: PostCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
