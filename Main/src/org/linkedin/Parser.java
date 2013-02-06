package org.linkedin;

/**
 * Parsing Utility Helper class.
 * 
 * @author Alek Slater
 */

import com.google.gson.Gson;

public class Parser
{
	public static <T> T fromJson(String json,Gson gson_,Class<T>classe) 
	{
		Gson gson = gson_;
		if (gson==null)
			gson = new Gson();
		try
		{
			return gson.fromJson(json,classe);
		}
		catch (Exception er)	
		{
			
		}
		return null;
	}
	
	public static <T> T fromJson(String json,Class<T>classe)
	{
		return fromJson(json,null,classe);
	}
	
	public static <T> String toJson(T obj,Gson gson_)
	{
		Gson gson = gson_;
		if (gson==null)
			gson = new Gson();
		try
		{
			return gson.toJson(obj,obj.getClass());
		}
		catch (Exception er)	
		{
			
		}
		return null;
	}
}
