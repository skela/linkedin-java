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
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum CompanyTypeCode {

    @XmlEnumValue("C")
    PUBLIC_COMPANY("C"),
    @XmlEnumValue("D")
    EDUCATIONAL("D"),
    @XmlEnumValue("E")
    SELF_EMPLOYED("E"),
    @XmlEnumValue("G")
    GOVT_AGENCY("G"),
    @XmlEnumValue("N")
    NON_PROFIT("N"),
    @XmlEnumValue("O")
    SELF_OWNED("O"),
    @XmlEnumValue("P")
    PRIVATELY_HELD("P"),
    @XmlEnumValue("S")
    PARTNERSHIP("S");
    private final String value;

    CompanyTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyTypeCode fromValue(String v) {
        for (CompanyTypeCode c: CompanyTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
