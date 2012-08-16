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

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Connections
{
	@SerializedName("_total")
	public long total;
	public List<Person>values;
	/*
	 *   "_total": 239,
  "values": [
    {
	 */
	
	

    /**
     * Gets the value of the personList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
	public List<Person> getPersonList()
    {
    	return values;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public long getTotal()
    {
    	return total;
    }
	
    // Parsing
	public static Connections fromJson(String json,Gson gson_) 
	{
		Gson gson = gson_;
		if (gson==null)
			gson = new Gson();
		return gson.fromJson(json,Connections.class);		
	}
	
	public static Connections fromJson(String json)
	{
		return fromJson(json,null);
	}
    
}
