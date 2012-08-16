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
 *     &lt;enumeration value="alumni"/>
 *     &lt;enumeration value="corporate"/>
 *     &lt;enumeration value="conference"/>
 *     &lt;enumeration value="network"/>
 *     &lt;enumeration value="philanthropic"/>
 *     &lt;enumeration value="professional"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum GroupCategoryCode {

    @XmlEnumValue("alumni")
    ALUMNI("alumni"),
    @XmlEnumValue("corporate")
    CORPORATE("corporate"),
    @XmlEnumValue("conference")
    CONFERENCE("conference"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("philanthropic")
    PHILANTHROPIC("philanthropic"),
    @XmlEnumValue("professional")
    PROFESSIONAL("professional"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupCategoryCode fromValue(String v) {
        for (GroupCategoryCode c: GroupCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
