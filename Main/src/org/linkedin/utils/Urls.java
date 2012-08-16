package org.linkedin.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.linkedin.enumeration.ProfileField;


//
// Urls
//

public class Urls
{
	public final static String URL_BASE = "https://api.linkedin.com/v1/";		
	public final static String PERSON_URL_SELF = URL_BASE + "people/~";
	public final static String PERSON_URL_ID = URL_BASE + "people/%s";
	public final static String PERSON_CONNECTIONS_URL_SELF = URL_BASE + "people/~/connections";
	public final static String PERSON_CONNECTIONS_URL_ID = URL_BASE + "people/%s/connections";
	
	public static String getProfileUrl(String startUrl,Set<ProfileField> profileFields)
	{
		HashMap<ProfileField,List<ProfileField>>map = new HashMap<ProfileField,List<ProfileField>>();
		StringBuilder surl = new StringBuilder();
    	surl.append(startUrl).append(":(");	    	
    	for (ProfileField f : profileFields)
    	{
    		if (f.parent()==null)
    			surl.append(f.fieldName()).append(",");
    		else
    		{
    			List<ProfileField> l  = null;
    			if (map.containsKey(f.parent()))
    				l = map.get(f.parent());
    			else
    			{
    				l = new ArrayList<ProfileField>();
    				map.put(f.parent(),l);
    			}
    			l.add(f);
    		}
    	}
    	
    	for (ProfileField f : map.keySet())
    	{
    		int index = surl.indexOf(f.fieldName()+",");
    		if (index!=-1)
    		{
    			StringBuilder subSurl = new StringBuilder();
    			subSurl.append(":(");
    			for (ProfileField f2 : map.get(f))
    				subSurl.append(f2.fieldName()).append(",");
    			if (subSurl.toString().endsWith(","))
    				subSurl.deleteCharAt(subSurl.length()-1);	    			
    			subSurl.append(")");
    			surl.insert(index + f.fieldName().length(),subSurl.toString());
    		}
    	}
    	
    	if (surl.toString().endsWith(","))
    		surl.deleteCharAt(surl.length()-1);
    	surl.append(")");
    	return surl.toString();
	}
	
	public static String getProfileUrlOld(String startUrl,Set<ProfileField> profileFields)
	{
		HashMap<ProfileField,List<ProfileField>>map = new HashMap<ProfileField,List<ProfileField>>();
		StringBuilder surl = new StringBuilder();
    	surl.append(startUrl).append(":(");	    	
    	for (ProfileField f : profileFields)
    	{
    		if (f.parent()==null)
    			surl.append(f.fieldName()).append(",");
    		else
    		{
    			List<ProfileField> l  = null;
    			if (map.containsKey(f.parent()))
    				l = map.get(f.parent());
    			else
    			{
    				l = new ArrayList<ProfileField>();
    				map.put(f.parent(),l);
    			}
    			l.add(f);
    		}
    	}
    	
    	for (ProfileField f : map.keySet())
    	{
    		int index = surl.indexOf(f.fieldName()+",");
    		if (index!=-1)
    		{
    			StringBuilder subSurl = new StringBuilder();
    			subSurl.append(":(");	    	
    			for (ProfileField f2 : map.get(f))
    				subSurl.append(f2.fieldName()).append(",");
    			if (subSurl.toString().endsWith(","))
    				subSurl.deleteCharAt(subSurl.length()-1);	    			
    			subSurl.append(")");
    			surl.insert(index + f.fieldName().length(),subSurl.toString());
    		}
    	}
    	
    	if (surl.toString().endsWith(","))
    		surl.deleteCharAt(surl.length()-1);
    	surl.append(")");
    	return surl.toString();
	}
}

