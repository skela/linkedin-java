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

import org.linkedin.Parser;

import com.google.gson.Gson;

public class Post    
{
	public String id;
	public Type type;	
	public Category category;
	public Long creationTimestamp;
	public Creator creator;
	public String summary;
	public String title;
	public Likes likes;
	public RelationToViewer relationToViewer;
	public Attachment attachment;
	public Comments comments;
	public String siteGroupPostUrl;
	public Content content;	
	
	public Post(String title,String summary,String submittedUrl,String submittedUrlTitle,String submittedUrlDescription)
	{
		this.title = title;
		this.summary=summary;		
		this.content = new Content(submittedUrl,submittedUrlTitle,submittedUrlDescription);
	}
	
	public static Post fromJson(String json,Gson gson) 
	{
		return Parser.fromJson(json,gson,Post.class);
	}
	
	public static Post fromJson(String json) 
	{
		return fromJson(json,null);
	}
	
	public String toJson()
	{
		return toJson(null);
	}
	
	public String toJson(Gson gson)
	{
		return Parser.toJson(this,gson);
	}

}
