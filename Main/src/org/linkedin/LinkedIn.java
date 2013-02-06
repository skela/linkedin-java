package org.linkedin;

import java.util.Set;

import org.linkedin.enumeration.ProfileField;
import org.linkedin.schema.Connections;
import org.linkedin.schema.Person;
import org.linkedin.schema.Post;
import org.linkedin.utils.Urls;
import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.LinkedInApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;




import com.google.gson.Gson;

public class LinkedIn 
{
	//
	// Init
	//
	
	OAuthService service;
	Token accessToken;
	Gson gson;
	
	public LinkedIn(String consumerKey,String consumerSecret)
	{
		init(consumerKey,consumerSecret,null,null);		
	}

	public LinkedIn(String consumerKey,String consumerSecret,String accessToken,String accessSecret)
	{
		init(consumerKey,consumerSecret,accessToken,accessSecret);		
	}
	
	public void setAccessToken(String token,String secret)
	{		
		this.accessToken = new Token(token, secret);
	}
	
	private void init(String consumerKey,String consumerSecret,String accessKey,String accessSecret)
	{
		gson = new Gson();
		
		service = new ServiceBuilder()
		.provider(LinkedInApi.class)
        .apiKey(consumerKey)
        .apiSecret(consumerSecret)
        .build();
		
		if (accessKey!=null && accessSecret!=null)
			setAccessToken(accessKey,accessSecret);		
	}
	
	//
	// Get Requests
	//
	
	public String getResource(String url,boolean useXML)
	{
		OAuthRequest request = new OAuthRequest(Verb.GET,url);
		if (!useXML)
			request.addHeader("x-li-format","json");
		service.signRequest(accessToken,request);
		try
		{
			Response response = request.send();
			return response.getBody();
		}
		catch (RuntimeException er)
		{
			
		}
		return null;
	}
	
	public String getResource(String url) throws RuntimeException
	{
		return getResource(url,false);
	}
	
	//
	// Post Requests
	//

	public String postResource(String url,String data,boolean useXML)
	{		
		OAuthRequest request = new OAuthRequest(Verb.POST,url);		
		if (!useXML)
			request.addHeader("x-li-format","json");		
		request.addPayload(data);
		
		service.signRequest(accessToken,request);
		try
		{
			Response response = request.send();
			return response.getBody();
		}
		catch (RuntimeException er)
		{
			
		}
		return null;	
	}
	
	public String postResource(String url,String data)
	{
		return postResource(url,data,false);
	}

	//
	// Person Api
	//

    /**
     * Gets the profile for current user.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1002">http://developer.linkedin.com/docs/DOC-1002</a>
     * 
     * @return the profile for current user
     */
    public Person getProfileForCurrentUser()
    {
    	return Person.fromJson(getResource(Urls.PERSON_URL_SELF),gson);
    }

    /**
     * Gets the profile by id.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1002">http://developer.linkedin.com/docs/DOC-1002</a>
     * 
     * @param id the id
     * 
     * @return the profile by id
     */
    public Person getProfileById(String id)
    {
    	return Person.fromJson(getResource(String.format(Urls.PERSON_URL_ID,id)),gson);
    }
    
    /**
     * Gets the profile for current user.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1002">http://developer.linkedin.com/docs/DOC-1002</a>
     * 
     * @param profileFields the profile fields
     * 
     * @return the profile for current user
     */
    public Person getProfileForCurrentUser(Set<ProfileField> profileFields)
    {    
    	return Person.fromJson(getResource(Urls.getProfileUrl(Urls.PERSON_URL_SELF,profileFields)),gson);
    }
   
    /**
     * Gets the profile by id.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1002">http://developer.linkedin.com/docs/DOC-1002</a>
     * 
     * @param id the id
     * @param profileFields the profile fields
     * 
     * @return the profile by id
     */
    public Person getProfileById(String id, Set<ProfileField> profileFields)
    {
    	return Person.fromJson(getResource(Urls.getProfileUrl(String.format(Urls.PERSON_URL_ID,id),profileFields)),gson);
    }
    
    /**
     * Gets the profile for the url like: https://api.linkedin.com/v1/people/~
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1002">http://developer.linkedin.com/docs/DOC-1002</a>
     * 
     * @return the profile for current user
     */
    public Person getProfileForUrl(String url)
    {
    	return Person.fromJson(getResource(url),gson);
    }
    
    //
    // Connections API
    //
    
    /**
     * Gets the connections for current user.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1004">http://developer.linkedin.com/docs/DOC-1004</a>
     * 
     * @return the connections for current user
     */
    public Connections getConnectionsForCurrentUser()
    {
    	return Connections.fromJson(getResource(Urls.PERSON_CONNECTIONS_URL_SELF),gson);
    }

    /**
     * Gets the connections by id.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1004">http://developer.linkedin.com/docs/DOC-1004</a>
     * 
     * @param id the id
     * 
     * @return the connections by id
     */
    public Connections getConnectionsById(String id)
    {
    	return Connections.fromJson(getResource(String.format(Urls.PERSON_CONNECTIONS_URL_ID,id)),gson);
    }

    /**
     * Gets the connections for current user.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1004">http://developer.linkedin.com/docs/DOC-1004</a>
     * 
     * @param profileFields the profile fields
     * 
     * @return the connections for current user
     */
    public Connections getConnectionsForCurrentUser(Set<ProfileField> profileFields)
    {
    	return Connections.fromJson(getResource(Urls.getProfileUrl(Urls.PERSON_CONNECTIONS_URL_SELF,profileFields)),gson);
    }

    /**
     * Gets the connections by id.
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1004">http://developer.linkedin.com/docs/DOC-1004</a>
     * 
     * @param id the id
     * @param profileFields the profile fields
     * 
     * @return the connections by id
     */
    public Connections getConnectionsById(String id, Set<ProfileField> profileFields)
    {
    	return Connections.fromJson(getResource(Urls.getProfileUrl(String.format(Urls.PERSON_CONNECTIONS_URL_ID,id),profileFields)),gson);
    }
    
    /**
     * Gets the connections by a url like: https://api.linkedin.com/v1/people/~:(id,relation-to-viewer:(connections:(person:(first-name))))
     * For details see <a href="http://developer.linkedin.com/docs/DOC-1004">http://developer.linkedin.com/docs/DOC-1004</a>
     * 
     * @param id the id
     * @param profileFields the profile fields
     * 
     * @return the connections by id
     */
    public Connections getConnectionsForUrl(String url)
    {
    	return Connections.fromJson(getResource(url),gson);
    }
    
    //
	// Groups Api
	//
    
    /**
     * Posts a discussion entry to a group
     * For details see <a href="http://developer.linkedin.com/documents/groups-api#create">http://developer.linkedin.com/documents/groups-api#create</a>
     * 
     */
    public org.linkedin.schema.Response createGroupDiscussionPost(long groupId,String title,String summary,String submittedUrl,String submittedUrlTitle,String submittedUrlDescription)
    {
    	String responseString = createGroupDiscussionPostRaw(groupId,title,summary,submittedUrl,submittedUrlTitle,submittedUrlDescription);
    	return org.linkedin.schema.Response.fromJson(responseString,gson);
    }
    
    public String createGroupDiscussionPostRaw(long groupId,String title,String summary,String submittedUrl,String submittedUrlTitle,String submittedUrlDescription)
    {
    	Post post = new Post(title,summary,submittedUrl,submittedUrlTitle,submittedUrlDescription);
    	String url = String.format("http://api.linkedin.com/v1/groups/%d/posts",groupId);
    	String data = post.toJson();
    	return postResource(url,data);
    }
    
    
}
