package org.linkedin.schema;

/**
 * Represents the response from LinkedIn
 * 
 * @author Alek Slater
 */

import org.linkedin.Parser;

import com.google.gson.Gson;

public class Response
{
	public long errorCode;
	public String message;
	public String requestId;
	public int status;
	public long timestamp;
	
	public static Response fromJson(String json,Gson gson_) 
	{
		return Parser.fromJson(json,gson_,Response.class);
	}
	
	public static Response fromJson(String json)
	{
		return fromJson(json,null);
	}
}
