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
public enum GroupMembershipField implements CompositeEnum<GroupMembershipField> {

	PERSON("person", null),
	
	GROUP("group", null),
	
	GROUP_ID("id", GROUP),
	
	GROUP_NAME("name", GROUP),

	MEMBERSHIP_STATE("membership-state", null),
	
	CONTACT_EMAIL("contact-email", null),
	
	SHOW_GROUP_LOGO_IN_PROFILE("show-group-logo-in-profile", null),

	ALLOW_MESSAGES_FROM_MEMBERS("allow-messages-from-members", null),
	
	EMAIL_DIGEST_FREQUENCY("email-digest-frequency", null),
	
	EMAIL_ANNOUNCEMENTS_FROM_MANAGERS("email-announcements-from-managers", null),
	
	EMAIL_FOR_EVERY_NEW_POST("email-for-every-new-post", null),
	POSTS("posts", null);
    
    /**
     * Field Description.
     */
	private static final Map<String, GroupMembershipField> stringToEnum = new HashMap<String, GroupMembershipField>();

	static { // Initialize map from constant name to enum constant
		for (GroupMembershipField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final GroupMembershipField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    GroupMembershipField(String name, GroupMembershipField parent) {
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
	public static GroupMembershipField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	@Override
	public GroupMembershipField parent() {
		return parent;
	}
}
