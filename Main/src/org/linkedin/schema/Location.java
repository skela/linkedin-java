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

public class Location
{
	public String description;
	public boolean isHeadquarters;
	public boolean isActive;
	public Address address;
	public ContactInfo contactInfo;
	public String name;
	public String postalCode;
	public Country country;
	
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
     * Gets the value of the isHeadquarters property.
     * 
     */
	public boolean isHeadquarters()
    {
    	return isHeadquarters;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
	public boolean isActive()
    {
    	return isActive;
    }


    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
	public Address getAddress()
    {
    	return address;
    }


    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
	public ContactInfo getContactInfo()
    {
    	return contactInfo;
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
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getPostalCode()
    {
    	return postalCode;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
	public Country getCountry()
    {
    	return country;    	
    }

}
