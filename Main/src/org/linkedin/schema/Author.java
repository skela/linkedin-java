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

public class Author    
{	
	public String id;
	public String firstName;
	public String lastName;
	public String headline;
	public RelationToViewer relationToViewer;
	public ApiStandardProfileRequest apiStandardProfileRequest;
	public SiteStandardProfileRequest siteStandardProfileRequest;
	
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId()
    {
    	return id;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFirstName()
    {
    	return firstName;
    }    	

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLastName()
    {
    	return lastName;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getHeadline()
    {
    	return headline;
    }

    /**
     * Gets the value of the relationToViewer property.
     * 
     * @return
     *     possible object is
     *     {@link RelationToViewer }
     *     
     */
    RelationToViewer getRelationToViewer()
    {
    	return relationToViewer;
    }

    /**
     * Gets the value of the apiStandardProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ApiStandardProfileRequest }
     *     
     */
    ApiStandardProfileRequest getApiStandardProfileRequest()
    {
    	return apiStandardProfileRequest;
    }

    /**
     * Gets the value of the siteStandardProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SiteStandardProfileRequest }
     *     
     */
    SiteStandardProfileRequest getSiteStandardProfileRequest()
    {
    	return siteStandardProfileRequest;
    }
}
