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

public class Group
{
	public String id;
	public String name;
	public String shortDescription;
	public String description;
	public RelationToViewer relationToViewer;
	public CountsByCategory countsByCategory;
	public boolean isOpenToNonMembers;
	public GroupCategory groupCategory;
	public String siteGroupUrl;
	public String contactEmail;
	public String locale;
	public boolean allowMemberInvites;
	public String smallLogoUrl;
	public String largeLogoUrl;
	public Posts posts;
	
	public String getLogoUrl()
	{
		if (largeLogoUrl!=null)
			return largeLogoUrl;
		return smallLogoUrl;
	}
}
