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

public class Content
{
	public String id;
	public String title;
	public String submittedUrl;
	public String shortenedUrl;
	public String submittedImageUrl;
	public String description;
	public String thumbnailUrl;
	public String resolvedUrl;
	public String eyebrowUrl;
	
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId()
    {
    	return id;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle()
    {
    	return title;
    }

    /**
     * Gets the value of the submittedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSubmittedUrl()
    {
    	return submittedUrl;
    }

    /**
     * Gets the value of the shortenedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getShortenedUrl()
    {
    	return shortenedUrl;
    }

    /**
     * Gets the value of the submittedImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSubmittedImageUrl()
    {
    	return submittedImageUrl;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescription()
    {
    	return description;
    }

    /**
     * Gets the value of the thumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getThumbnailUrl()
    {
    	return thumbnailUrl;
    }

    /**
     * Gets the value of the resolvedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getResolvedUrl()
    {
    	return resolvedUrl;
    }

    /**
     * Gets the value of the eyebrowUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getEyebrowUrl()
    {
    	return eyebrowUrl;
    }
}
