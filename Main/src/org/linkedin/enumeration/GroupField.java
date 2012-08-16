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
public enum GroupField implements CompositeEnum<GroupField> {

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
	SHORT_DESCRIPTION("short-description", null),

    /**
     * A human readable name for the facet.
     */
	DESCRIPTION("description", null),
	
	RELATION_TO_VIEWER("relation-to-viewer", null),
	
	RELATION_TO_VIEWER_MEMBERSHIP_STATE("membership-state", RELATION_TO_VIEWER),
	
	RELATION_TO_VIEWER_AVAILABLE_ACTIONS("available-actions", RELATION_TO_VIEWER),
	
	POSTS("posts", null),
	
	COUNTS_BY_CATEGORY("counts-by-category", null),
	
	IS_OPEN_TO_NON_MEMBERS("is-open-to-non-members", null),
	
	CATEGORY("category", null),
	
	WEBSITE_URL("website-url", null),
	
	SITE_GROUP_URL("site-group-url", null),
	
	CONTACT_EMAIL("contact-email", null),
	
	LOCALE("locale", null),
	
	LOCATION("location", null),
	
	LOCATION_COUNTRY("country", LOCATION),
	
	LOCATION_POSTAL_CODE("postal-code", LOCATION),
	
	ALLOW_MEMBER_INVITES("allow-member-invites", null),
	
	SMALL_LOGO_URL("small-logo-url", null),
	LARGE_LOGO_URL("large-logo-url", null);
	
    
    /**
     * Field Description.
     */
	private static final Map<String, GroupField> stringToEnum = new HashMap<String, GroupField>();

	static { // Initialize map from constant name to enum constant
		for (GroupField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final GroupField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    GroupField(String name, GroupField parent) {
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
	public static GroupField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	@Override
	public GroupField parent() {
		return parent;
	}
}
