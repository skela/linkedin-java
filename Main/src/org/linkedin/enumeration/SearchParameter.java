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
public enum SearchParameter implements FieldEnum, SearchEnum {

    /**
     * Returns members who have keywords anywhere in their profile. Multiple words should be separated by a plus (+) sign. Boolean logic isn't supported in this parameter.
     */
    KEYWORDS("keywords", EnumSet.of(SearchScope.PEOPLE, SearchScope.COMPANIES, SearchScope.JOBS)),

    /**
     * Members with a matching first name. Matches must be exact. Multiple words should be separated by a space.
     */
    FIRST_NAME("first-name", EnumSet.of(SearchScope.PEOPLE)),
    
    /**
     * Members with a matching last name. Matches must be exactly. Multiple words should be separated by a space.
     */
    LAST_NAME("last-name", EnumSet.of(SearchScope.PEOPLE)),    

    /**
     * Returns members who have a particular company name on their profile. company works with the current-company parameter which specifies whether the company must be a current company or whether it can be anywhere on a profile.
     */
    COMPANY_NAME("company-name", EnumSet.of(SearchScope.PEOPLE, SearchScope.JOBS)),

    /**
     * Valid values are true or false.
     */
    CURRENT_COMPANY("current-company", EnumSet.of(SearchScope.PEOPLE)),

    /**
     * Returns members who have a particular title on their profile
     */
    TITLE("title", EnumSet.of(SearchScope.PEOPLE)),

    /**
     * Valid values are true or false.
     */
    CURRENT_TITLE("current-title", EnumSet.of(SearchScope.PEOPLE)),

    /**
     * Members who have a matching school name on their profile.
     */
    SCHOOL_NAME("school-name", EnumSet.of(SearchScope.PEOPLE)),

    /**
     * Valid values are true or false. A value of true matches members who currently attend the school specified in the school-name parameter.
     */
    CURRENT_SCHOOL("current-school", EnumSet.of(SearchScope.PEOPLE)),
    
    /**
     * Returns members within a specific country.
     */
    COUNTRY_CODE("country-code", EnumSet.of(SearchScope.PEOPLE, SearchScope.JOBS)),

    /**
     * Returns members within a specific postal code.
     */
    POSTAL_CODE("postal-code", EnumSet.of(SearchScope.PEOPLE, SearchScope.JOBS)),

    /**
     * Matches members within a distance from a central point. This is measured in miles.
     */
    DISTANCE("distance", EnumSet.of(SearchScope.PEOPLE, SearchScope.JOBS)),
    
    /**
     * Matching companies by the headquarters location.
     */
    HEADQUARTER("hq-only", EnumSet.of(SearchScope.COMPANIES)),
    
    /**
     * Matches jobs with the same job title.
     */
    JOB_TITLE("job-title", EnumSet.of(SearchScope.JOBS)),
    
    /**
     * Facet values to search over.
     */
    FACET("facet", EnumSet.of(SearchScope.PEOPLE, SearchScope.COMPANIES, SearchScope.JOBS)),
    
    /**
     * Facet buckets to return.
     */
    FACETS("facets", EnumSet.of(SearchScope.PEOPLE, SearchScope.COMPANIES, SearchScope.JOBS));
    
    /**
     * Field Description.
     */
	private static final Map<String, SearchParameter> stringToEnum = new HashMap<String, SearchParameter>();

	static { // Initialize map from constant name to enum constant
		for (SearchParameter op : values()) {
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
    SearchParameter(String name, Set<SearchScope> scopes) {
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
	 * @return Returns SearchParameter for string, or null if string is invalid
	 */
	public static SearchParameter fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
}
