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

public class Company
{
	public String id;
	public String universalName;
	public String description;
	public String industry;
	public String logoUrl;
	public String name;
	public String type;
	public CompanyType companyType;
	public String size;
	public StockExchange stockExchange;	
	public String ticker;
	public Specialties specialties;
	public String blogRssUrl;
	public String twitterId;
	public String squareLogoUrl;
	public Locations locations;
	public Integer foundedYear;
	public Integer endYear;
	public Long numFollowers;
	public EmailDomains emailDomains;
	public CompanyStatus companyStatus;
	public String websiteUrl;
	public EmployeeCountRange employeeCountRange;
	public String key;
	
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
     * Gets the value of the universalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getUniversalName()
    {
    	return universalName;
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
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getIndustry()
    {
    	return industry;
    }

    /**
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getLogoUrl()
    {
    	return logoUrl;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getName()
    {
    	return name;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getType()
    {
    	return type;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
	public CompanyType getCompanyType()
    {
    	return companyType;
    }



    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getSize()
    {
    	return size;
    }



    /**
     * Gets the value of the stockExchange property.
     * 
     * @return
     *     possible object is
     *     {@link StockExchange }
     *     
     */
	public StockExchange getStockExchange()
    {
    	return stockExchange;
    }


    /**
     * Gets the value of the ticker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getTicker()
    {
    	return ticker;
    }



    /**
     * Gets the value of the specialties property.
     * 
     * @return
     *     possible object is
     *     {@link Specialties }
     *     
     */
	public Specialties getSpecialties()
    {
    	return specialties;
    }



    /**
     * Gets the value of the blogRssUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getBlogRssUrl()
    {
    	return blogRssUrl;
    }



    /**
     * Gets the value of the twitterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getTwitterId()
    {
    	return twitterId;
    }


    /**
     * Gets the value of the squareLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getSquareLogoUrl()
    {
    	return squareLogoUrl;
    }


    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link Locations }
     *     
     */
	public Locations getLocations()
    {
    	return locations;
    }


    /**
     * Gets the value of the foundedYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public Integer getFoundedYear()
    {
    	return foundedYear;
    }


    /**
     * Gets the value of the endYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public Integer getEndYear()
    {
    	return endYear;
    }


    /**
     * Gets the value of the numFollowers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public Long getNumFollowers()
    {
    	return numFollowers;    	
    }


    /**
     * Gets the value of the emailDomains property.
     * 
     * @return
     *     possible object is
     *     {@link EmailDomains }
     *     
     */
	public EmailDomains getEmailDomains()
    {
    	return emailDomains;
    }


    /**
     * Gets the value of the websiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getWebsiteUrl()
    {
    	return websiteUrl;
    }


    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyStatus }
     *     
     */
	public CompanyStatus getStatus()
    {
    	return companyStatus;
    }


    /**
     * Gets the value of the employeeCountRange property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCountRange }
     *     
     */
	public EmployeeCountRange getEmployeeCountRange()
    {
    	return employeeCountRange;
    }


    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getKey()
    {
    	return key;
    }


}
