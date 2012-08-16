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
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ExperienceLevelCode {

    @XmlEnumValue("0")
    NOT_APPLICABLE("0"),
    @XmlEnumValue("1")
    INTERNSHIP("1"),
    @XmlEnumValue("2")
    ENTRY_LEVEL("2"),
    @XmlEnumValue("3")
    ASSOCIATE("3"),
    @XmlEnumValue("4")
    MID_SENIOR_LEVEL("4"),
    @XmlEnumValue("5")
    DIRECTOR("5"),
    @XmlEnumValue("6")
    EXECUTIVE("6");
    private final String value;

    ExperienceLevelCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExperienceLevelCode fromValue(String v) {
        for (ExperienceLevelCode c: ExperienceLevelCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
