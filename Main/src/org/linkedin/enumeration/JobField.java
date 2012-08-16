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
public enum JobField implements CompositeEnum<JobField> {

    /**
     * A human readable name for the facet.
     */
	ID("id", null),

    /**
     * The machine processable value for the facet.
     */
	CUSTOMER_JOB_CODE("customer-job-code", null),

    /**
     * The facet bucket values for the facet.
     */
	ACTIVE("active", null),

    /**
     * A human readable name for the facet.
     */
	POSTING_DATE("posting-date", null),
    /**
     * A human readable name for the facet.
     */
	EXPIRATION_DATE("expiration-date", null),
    /**
     * A human readable name for the facet.
     */
	POSTING_TIMESTAMP("posting-timestamp", null),
    /**
     * A human readable name for the facet.
     */
	EXPIRATION_TIMESTAMP("expiration-timestamp", null),
    /**
     * A human readable name for the facet.
     */
	COMPANY("company", null),
    /**
     * A human readable name for the facet.
     */
	COMPANY_ID("id", COMPANY),
    /**
     * A human readable name for the facet.
     */
	COMPANY_NAME("name", COMPANY),
    /**
     * A human readable name for the facet.
     */
	POSITION("position", null),
    /**
     * A human readable name for the facet.
     */
	POSITION_TITLE("title", POSITION),
    /**
     * A human readable name for the facet.
     */
	POSITION_LOCATION("location", POSITION),
    /**
     * A human readable name for the facet.
     */
	POSITION_JOB_FUNCTIONS("job-functions", POSITION),
    /**
     * A human readable name for the facet.
     */
	POSITION_INDUSTRIES("industries", POSITION),
    /**
     * A human readable name for the facet.
     */
	POSITION_JOB_TYPE("job-type", POSITION),
    /**
     * A human readable name for the facet.
     */
	POSITION_EXPERIENCE_LEVEL("experience-level", POSITION),
    /**
     * A human readable name for the facet.
     */
	SKILLS_AND_EXPERIENCE("skills-and-experience", null),
    /**
     * A human readable name for the facet.
     */
	DESCRIPTION_SNIPPET("description-snippet", null),
    /**
     * A human readable name for the facet.
     */
	DESCRIPTION("description", null),
    /**
     * A human readable name for the facet.
     */
	SALARY("salary", null),
    /**
     * A human readable name for the facet.
     */
	JOB_POSTER("job-poster", null),
    /**
     * A human readable name for the facet.
     */
	JOB_POSTER_ID("id", JOB_POSTER),
    /**
     * A human readable name for the facet.
     */
	JOB_POSTER_FIRST_NAME("first-name", JOB_POSTER),
    /**
     * A human readable name for the facet.
     */
	JOB_POSTER_LAST_NAME("last-name", JOB_POSTER),
    /**
     * A human readable name for the facet.
     */
	JOB_POSTER_HEADLINE("headline", JOB_POSTER),
    /**
     * A human readable name for the facet.
     */
	REFERRAL_BONUS("referral-bonus", null),
    /**
     * A human readable name for the facet.
     */
	SITE_JOB_URL("site-job-url", null),
	
    /**
     * A human readable name for the facet.
     */
	LOCATION_DESCRIPTION("location-description", null);
    
    /**
     * Field Description.
     */
	private static final Map<String, JobField> stringToEnum = new HashMap<String, JobField>();

	static { // Initialize map from constant name to enum constant
		for (JobField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final JobField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    JobField(String name, JobField parent) {
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
	public static JobField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	@Override
	public JobField parent() {
		return parent;
	}
}
