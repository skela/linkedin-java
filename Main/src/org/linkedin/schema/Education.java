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

public class Education
{
/*
 *  {
            "activities": "",
            "degree": "MBA",
            "endDate": {"year": 2013},
            "fieldOfStudy": "",
            "id": 80101904,
            "notes": "",
            "schoolName": "Columbia Business School",
            "startDate": {"year": 2011}
          },
 */
	
	public String activities;
	public String fieldOfStudy;
	public String id;
	public String degree;
	public String schoolName;
	public String notes;
	public StartDate startDate;
	public EndDate endDate;
	
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getId()
    {
    	return id;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getSchoolName()
    {
    	return schoolName;
    }

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getDegree()
    {
    	return degree;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getNotes()
    {
    	return notes;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getActivities()
    {
    	return activities;
    }


    /**
     * Gets the value of the fieldOfStudy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getFieldOfStudy()
    {
    	return fieldOfStudy;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
	public StartDate getStartDate()
    {
    	return startDate;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link EndDate }
     *     
     */
	public EndDate getEndDate()
    {
    	return endDate;
    }
}
