package org.linkedin.schema;

public class ApiResponse
{
	public ApiRawResponse response;
	public String stringResponse;
	public boolean didSucceed;
	public String error;
	
	public void setResponse(org.scribe.model.Response oauthResponse)
	{
		stringResponse = oauthResponse.getBody();
		response = ApiRawResponse.fromJson(stringResponse);
		int responseCode = oauthResponse.getCode();
		if (responseCode==200 || responseCode==201 || responseCode==204)
		{
			didSucceed=true;
		}
		else
		{
			didSucceed=false;
			error = "HTTP Status code is " + responseCode;
		}
	}
}
