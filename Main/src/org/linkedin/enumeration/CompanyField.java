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
package org.linkedin.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nabeel Mukhtar
 *
 */
public enum CompanyField implements CompositeEnum<CompanyField> {

    /**
     * A human readable name for the facet.
     */
	ID("id", null),
	
    /**
     * A human readable name for the facet.
     */
	NAME("name", null),

    /**
     * A human readable name for the facet.
     */
	UNIVERSAL_NAME("universal-name", null),

    /**
     * A human readable name for the facet.
     */
	EMAIL_DOMAINS("email-domains", null),

    /**
     * A human readable name for the facet.
     */
	COMPANY_TYPE("company-type", null),

    /**
     * A human readable name for the facet.
     */
	TICKER("ticker", null),

    /**
     * A human readable name for the facet.
     */
	WEBSITE_URL("website-url", null),

    /**
     * A human readable name for the facet.
     */
	INDUSTRY("industry", null),

    /**
     * A human readable name for the facet.
     */
	STATUS("status", null),

    /**
     * A human readable name for the facet.
     */
	LOGO_URL("logo-url", null),

    /**
     * A human readable name for the facet.
     */
	SQUARE_LOGO_URL("square-logo-url", null),

    /**
     * A human readable name for the facet.
     */
	BLOG_RSS_URL("blog-rss-url", null),

    /**
     * A human readable name for the facet.
     */
	TWITTER_ID("twitter-id", null),

    /**
     * A human readable name for the facet.
     */
	EMPLOYEE_COUNT_RANGE("employee-count-range", null),

    /**
     * A human readable name for the facet.
     */
	SPECIALTIES("specialties", null),

    /**
     * A human readable name for the facet.
     */
	LOCATIONS("locations", null),

    /**
     * A human readable name for the facet.
     */
	LOCATIONS_DESCRIPTION("description", LOCATIONS),

    /**
     * A human readable name for the facet.
     */
	LOCATIONS_IS_HEADQUARTERS("is-headquarters", LOCATIONS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_IS_ACTIVE("is-active", LOCATIONS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS("address", LOCATIONS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS_STREET1("street1", LOCATIONS_ADDRESS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS_STREET2("street2", LOCATIONS_ADDRESS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS_CITY("city", LOCATIONS_ADDRESS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS_STATE("state", LOCATIONS_ADDRESS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS_POSTAL_CODE("postal-code", LOCATIONS_ADDRESS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS_COUNTRY_CODE("country-code", LOCATIONS_ADDRESS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_ADDRESS_REGION_CODE("region-code", LOCATIONS_ADDRESS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_CONTACT_INFO("contact-info", LOCATIONS),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_CONTACT_INFO_PHONE1("phone1", LOCATIONS_CONTACT_INFO),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_CONTACT_INFO_PHONE2("phone2", LOCATIONS_CONTACT_INFO),
    /**
     * A human readable name for the facet.
     */
	LOCATIONS_CONTACT_INFO_FAX("fax", LOCATIONS_CONTACT_INFO),
    /**
     * A human readable name for the facet.
     */
	DESCRIPTION("description", null),
    /**
     * A human readable name for the facet.
     */
	STOCK_EXCHANGE("stock-exchange", null),
    /**
     * A human readable name for the facet.
     */
	FOUNDED_YEAR("founded-year", null),
    /**
     * A human readable name for the facet.
     */
	END_YEAR("end-year", null),
    /**
     * A human readable name for the facet.
     */
	NUM_FOLLOWERS("num-followers", null);
    
    /**
     * Field Description.
     */
	private static final Map<String, CompanyField> stringToEnum = new HashMap<String, CompanyField>();

	static { // Initialize map from constant name to enum constant
		for (CompanyField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final CompanyField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    CompanyField(String name, CompanyField parent) {
        this.fieldName = name;
        this.parent = parent;
    }

    /**
     * @return the name of the field
     */
    public String fieldName() {
        return this.fieldName;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    @Override
    public String toString() {
        return fieldName();
    }

	/**
	 *
	 * @return Returns ProfileType for string, or null if string is invalid
	 */
	public static CompanyField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	@Override
	public CompanyField parent() {
		return parent;
	}
}
