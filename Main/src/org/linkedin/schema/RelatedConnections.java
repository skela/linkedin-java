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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class RelatedConnections
{
	@SerializedName("_total")
	public long total;
	@SerializedName("_start")	
	public long start;
	@SerializedName("_count")
	public long count;
	public List<PersonHolder> values;
	
    List<Person> getPersonList()
    {
    	if (values!=null)
    	{
    		ArrayList <Person> ppl = new ArrayList<Person>();
    		for (PersonHolder holder : values)
    			ppl.add(holder.person);
    		return ppl;
    	}
    	return null;
    }

    long getTotal()
    {
    	return total;
    }
}
