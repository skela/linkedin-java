package org.linkedin;

import java.util.EnumSet;

import org.linkedin.enumeration.ProfileField;
import org.linkedin.schema.Connections;
import org.linkedin.schema.Person;


public class Main 
{
	public static void main(String [] args)
	{
		System.out.println("<Started Main>");
		
		String licToken = "ConsumerKey";
		String licSecret = "ConsumerSecret";
		String liToken = "AccessKey";
		String liSecret = "AccessSecret";

		LinkedIn api = new LinkedIn(licToken,licSecret,liToken,liSecret);
		
		Person person = api.getProfileForCurrentUser();
		//Person person = api.getProfileForCurrentUser(EnumSet.of(ProfileField.ID,ProfileField.FIRST_NAME,ProfileField.LAST_NAME,ProfileField.PICTURE_URL,ProfileField.PICTURE_URLS_ORIGINAL,ProfileField.DATE_OF_BIRTH));
		//Person person = api.getProfileById("someId",EnumSet.of(ProfileField.ID,ProfileField.FIRST_NAME,ProfileField.LAST_NAME,ProfileField.PICTURE_URL,ProfileField.PICTURE_URLS_ORIGINAL));
		//Person person = api.getProfileById("someOtherId",EnumSet.of(ProfileField.ID,ProfileField.FIRST_NAME,ProfileField.LAST_NAME,ProfileField.PICTURE_URL,ProfileField.PRIMARY_TWITTER_ACCOUNT));		
		Connections connections = api.getConnectionsForCurrentUser();
		
		System.out.println("<Finished Main>");
	}
}
