package org.linkedin.schema;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PictureUrls 
{
	@SerializedName("_total")
	public long total;
	public List<String>values;
	/*
	   "pictureUrls": {
    "_total": 1,
    "values": ["http://m3.licdn.com/mpr/mprx/0_YjNQCrM5wWTi2ObcpmRe3lvduEA_WgwcpOoIkAbICOKhmyJMYDzE6Rv9SaZ"]
	 */	
}
