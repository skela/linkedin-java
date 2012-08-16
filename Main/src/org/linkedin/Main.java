package org.linkedin;

import org.linkedin.schema.Connections;
import org.linkedin.schema.Person;
import org.linkedin.utils.Urls;


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
		
		// If you want the JSON String
		String personJSON = api.getResource(Urls.PERSON_URL_SELF);
		
		// If you want the XML String
		String personXML = api.getResource(Urls.PERSON_URL_SELF,true);
		
		// Or if you want to specify the url yourself, but let the library handle the parsing:
		// Note: obviously this only works if you give it a url that points to a person resource in this case:
		Person person2 = api.getProfileForUrl("https://api.linkedin.com/v1/people/~:(id,firstName,lastName)");
		
		System.out.println("<Finished Main>");
	}
}
