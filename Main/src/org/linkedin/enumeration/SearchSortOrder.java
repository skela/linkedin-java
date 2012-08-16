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

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Nabeel Mukhtar
 *
 */
public enum SearchSortOrder implements FieldEnum, SearchEnum {
	
	
	/**
	 * Number of connections per person, from largest to smallest.
	 */
	CONNECTIONS("connections", EnumSet.of(SearchScope.PEOPLE)),
	
    /**
     * Orders the returns by number of ensorsers each of the search returns has.
     */
    RECOMMENDERS("recommenders", EnumSet.of(SearchScope.PEOPLE)),

    /**
     * Orders the returns based on the ascending degree of separation within a member's network, with first degree connections first.
     */
    DISTANCE("distance", EnumSet.of(SearchScope.PEOPLE)),
    
    RELATIONSHIP("relationship", EnumSet.of(SearchScope.COMPANIES)),
    FOLLOWERS("followers", EnumSet.of(SearchScope.COMPANIES)),
    COMPANY_SIZE("company-size", EnumSet.of(SearchScope.COMPANIES)),

    /**
     * Orders the returns based on relevance for the keywords provided.
     */
    RELEVANCE("relevance", EnumSet.of(SearchScope.PEOPLE, SearchScope.COMPANIES));
    
    /**
     * Field Description.
     */
	private static final Map<String, SearchSortOrder> stringToEnum = new HashMap<String, SearchSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (SearchSortOrder op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}
	
    /** Field description */
    private final String fieldName;
    private final Set<SearchScope> scopes;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    SearchSortOrder(String name, Set<SearchScope> scopes) {
        this.fieldName = name;
        this.scopes = scopes;
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

    public boolean hasScope(SearchScope scope) {
    	return scopes.contains(scope);
    }
    
	/**
	 *
	 * @return Returns SearchSortOrder for string, or null if string is invalid
	 */
	public static SearchSortOrder fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
}
