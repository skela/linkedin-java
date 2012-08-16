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

public class Position    
{
	public String id;
	public String title;
	public String summary;
	public StartDate startDate;
	public EndDate endDate;
	public boolean isCurrent;
	public Company company;
	public String description;
	public String descriptionSnippet;
	public String skillsAndExperience;
	public Location location;
	public JobFunctions jobFunctions;
	public Industries industries;
	public JobType jobType;
	public ExperienceLevel experienceLevel;
	
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getTitle()
    {
    	return title;
    }


    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getSummary()
    {
    	return summary;
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

    /**
     * Gets the value of the isCurrent property.
     * 
     */
	public boolean isCurrent()
    {
    	return isCurrent;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
	public Company getCompany()
    {
    	return company;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getDescription()
    {
    	return description;
    }

    /**
     * Gets the value of the descriptionSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getDescriptionSnippet()
    {
    	return descriptionSnippet;
    }

    /**
     * Gets the value of the skillsAndExperience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getSkillsAndExperience()
    {
    	return skillsAndExperience;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
	public Location getLocation()
    {
    	return location;
    }



    /**
     * Gets the value of the jobFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link JobFunctions }
     *     
     */
	public JobFunctions getJobFunctions()
    {
    	return jobFunctions;
    }

    /**
     * Gets the value of the industries property.
     * 
     * @return
     *     possible object is
     *     {@link Industries }
     *     
     */
	public Industries getIndustries()
    {
    	return industries;
    }


    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
	public JobType getJobType()
    {
    	return jobType;
    }


    /**
     * Gets the value of the experienceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceLevel }
     *     
     */
	public ExperienceLevel getExperienceLevel()
    {
    	return experienceLevel;
    }

}
