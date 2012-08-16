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
public enum PostSortOrder implements FieldEnum {
	
	/**
	 * recency.
	 */
	RECENCY("recency"),
	
    /**
     * popularity.
     */
	POPULARITY("popularity");
    
    /**
     * Field Description.
     */
	private static final Map<String, PostSortOrder> stringToEnum = new HashMap<String, PostSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (PostSortOrder op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}
	
    /** Field description */
    private final String fieldName;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    PostSortOrder(String name) {
        this.fieldName = name;
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
	 * @return Returns PostSortOrder for string, or null if string is invalid
	 */
	public static PostSortOrder fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
}
