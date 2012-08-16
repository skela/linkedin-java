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
 *     &lt;enumeration value="acct"/>
 *     &lt;enumeration value="adm"/>
 *     &lt;enumeration value="advr"/>
 *     &lt;enumeration value="anls"/>
 *     &lt;enumeration value="art"/>
 *     &lt;enumeration value="bd"/>
 *     &lt;enumeration value="cnsl"/>
 *     &lt;enumeration value="cust"/>
 *     &lt;enumeration value="dist"/>
 *     &lt;enumeration value="dsgn"/>
 *     &lt;enumeration value="edu"/>
 *     &lt;enumeration value="eng"/>
 *     &lt;enumeration value="fin"/>
 *     &lt;enumeration value="genb"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="lgl"/>
 *     &lt;enumeration value="mgmt"/>
 *     &lt;enumeration value="mnfc"/>
 *     &lt;enumeration value="mrkt"/>
 *     &lt;enumeration value="othr"/>
 *     &lt;enumeration value="pr"/>
 *     &lt;enumeration value="prch"/>
 *     &lt;enumeration value="prdm"/>
 *     &lt;enumeration value="prjm"/>
 *     &lt;enumeration value="prod"/>
 *     &lt;enumeration value="qa"/>
 *     &lt;enumeration value="rsch"/>
 *     &lt;enumeration value="sale"/>
 *     &lt;enumeration value="sci"/>
 *     &lt;enumeration value="stra"/>
 *     &lt;enumeration value="supl"/>
 *     &lt;enumeration value="trng"/>
 *     &lt;enumeration value="wrt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum JobFunctionCode {

    @XmlEnumValue("acct")
    ACCOUNTING_AUDITING("acct"),
    @XmlEnumValue("adm")
    ADMINISTRATIVE("adm"),
    @XmlEnumValue("advr")
    ADVERTISING("advr"),
    @XmlEnumValue("anls")
    ANALYST("anls"),
    @XmlEnumValue("art")
    ART_CREATIVE("art"),
    @XmlEnumValue("bd")
    BUSINESS_DEVELOPMENT("bd"),
    @XmlEnumValue("cnsl")
    CONSULTING("cnsl"),
    @XmlEnumValue("cust")
    CUSTOMER_SERVICE("cust"),
    @XmlEnumValue("dist")
    DISTRIBUTION("dist"),
    @XmlEnumValue("dsgn")
    DESIGN("dsgn"),
    @XmlEnumValue("edu")
    EDUCATION("edu"),
    @XmlEnumValue("eng")
    ENGINEERING("eng"),
    @XmlEnumValue("fin")
    FINANCE("fin"),
    @XmlEnumValue("genb")
    GENERAL_BUSINESS("genb"),
    @XmlEnumValue("hr")
    HUMAN_RESOURCES("hr"),
    @XmlEnumValue("it")
    INFORMATION_TECHNOLOGY("it"),
    @XmlEnumValue("lgl")
    LEGAL("lgl"),
    @XmlEnumValue("mgmt")
    MANAGEMENT("mgmt"),
    @XmlEnumValue("mnfc")
    MANUFACTURING("mnfc"),
    @XmlEnumValue("mrkt")
    MARKETING("mrkt"),
    @XmlEnumValue("othr")
    OTHER("othr"),
    @XmlEnumValue("pr")
    PUBLIC_RELATIONS("pr"),
    @XmlEnumValue("prch")
    PURCHASING("prch"),
    @XmlEnumValue("prdm")
    PRODUCT_MANAGEMENT("prdm"),
    @XmlEnumValue("prjm")
    PROJECT_MANAGEMENT("prjm"),
    @XmlEnumValue("prod")
    PRODUCTION("prod"),
    @XmlEnumValue("qa")
    QUALITY_ASSURANCE("qa"),
    @XmlEnumValue("rsch")
    RESEARCH("rsch"),
    @XmlEnumValue("sale")
    SALES("sale"),
    @XmlEnumValue("sci")
    SCIENCE("sci"),
    @XmlEnumValue("stra")
    STRATEGY_PLANNING("stra"),
    @XmlEnumValue("supl")
    SUPPLY_CHAIN("supl"),
    @XmlEnumValue("trng")
    TRAINING("trng"),
    @XmlEnumValue("wrt")
    WRITING_EDITING("wrt");
    private final String value;

    JobFunctionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobFunctionCode fromValue(String v) {
        for (JobFunctionCode c: JobFunctionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
