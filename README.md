**LinkedIn Java Library**
==============

The goal of this library is to replace linkedin-j with a smaller, faster and more efficient linkedin library for java.
Using scribe for the oauth-heavy lifting and gson for the json parsing. Another goal is to avoid a common issue with most of these
libraries, and that is they close down or make it much more difficult to allow custom classes or custom parsing of the responses.
With this library, my goal is to allow you to use the prepared classes and class structure for the responses should you want to.
However, if for example properties and data fields  have been added by LinkedIn, and these are needed, but you don't have time to wait
for the library to catch up with the API, then use the GetResource function to get the JSON or XML string and 
parse the data yourself.

Some of the method signatures will be similar to linkedin-j for the time being, as that's the most common linkedin library for java.

**Setup:**
--------------
After cloning the repo, you'll need to perform the following commands inside the local repo:

	git submodule init
	git submodule update

**Note:**
--------------
Currently only the Connections and Person/PPL APIs have been implemented.

**Known Issues:**
--------------
EnumSet.allOf(ProfileField.class) will not work : so for example:

	Person person = api.getProfileForCurrentUser(EnumSet.allOf(ProfileField.class));

or

	Connections connections = api.getConnectionsForCurrentUser(EnumSet.allOf(ProfileField.class));

**Sample Usage:**
--------------
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

**License**
--------------
The license for this project is MIT unless otherwise specified.

