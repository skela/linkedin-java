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
public enum CommentField implements CompositeEnum<CommentField> {

	ID("id", null),
	
	TEXT("text", null),

	CREATOR("creator", null),

	CREATION_TIMESTAMP("creation-timestamp", null),
	
	RELATION_TO_VIEWER("relation-to-viewer", null),
	RELATION_TO_VIEWER_AVAILABLE_ACTIONS("available-actions", RELATION_TO_VIEWER);	
    
    /**
     * Field Description.
     */
	private static final Map<String, CommentField> stringToEnum = new HashMap<String, CommentField>();

	static { // Initialize map from constant name to enum constant
		for (CommentField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final CommentField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    CommentField(String name, CommentField parent) {
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
	public static CommentField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	@Override
	public CommentField parent() {
		return parent;
	}
}
