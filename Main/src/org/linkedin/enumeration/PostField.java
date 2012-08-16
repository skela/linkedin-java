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
public enum PostField implements CompositeEnum<PostField> {

    /**
     * A human readable name for the facet.
     */
	ID("id", null),
	
    /**
     * A human readable name for the facet.
     */
	TYPE("type", null),

	CATEGORY("category", null),
	
	CREATOR("creator", null),
	
	CREATOR_ID("id", CREATOR),
	CREATOR_FIRST_NAME("first-name", CREATOR),
	CREATOR_LAST_NAME("last-name", CREATOR),
	CREATOR_HEADLINE("headline", CREATOR),
	CREATOR_PICTURE_URL("picture-url", CREATOR),
	
	TITLE("title", null),
	
	SUMMARY("summary", null),
	
	CREATION_TIMESTAMP("creation-timestamp", null),
	
	RELATION_TO_VIEWER("relation-to-viewer", null),
	
	RELATION_TO_VIEWER_IS_FOLLOWING("is-following", RELATION_TO_VIEWER),
	
	RELATION_TO_VIEWER_IS_LIKED("is-liked", RELATION_TO_VIEWER),
	
	RELATION_TO_VIEWER_AVAILABLE_ACTIONS("available-actions", RELATION_TO_VIEWER),	
	
	LIKES("likes", null),
	
	COMMENTS("comments", null),
	
	ATTACHMENT("attachment", null),
	
	SITE_GROUP_POST_URL("site-group-post-url", null);
	
    
    /**
     * Field Description.
     */
	private static final Map<String, PostField> stringToEnum = new HashMap<String, PostField>();

	static { // Initialize map from constant name to enum constant
		for (PostField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final PostField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    PostField(String name, PostField parent) {
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
	public static PostField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	@Override
	public PostField parent() {
		return parent;
	}
}
