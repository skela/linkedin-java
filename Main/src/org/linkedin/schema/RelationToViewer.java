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


public class RelationToViewer    
{
	public RelatedConnections relatedConnections;
	public Long distance;
	public MembershipState membershipState;
	public boolean isFollowing;
	public boolean isLiked;
	public AvailableActions availableActions;
	
    /**
     * Gets the value of the relatedConnections property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedConnections }
     *     
     */
    RelatedConnections getRelatedConnections()
    {
    	return relatedConnections;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getDistance()
    {
    	return distance;
    }

    /**
     * Gets the value of the membershipState property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipState }
     *     
     */
    MembershipState getMembershipState()
    {
    	return membershipState;
    }


    /**
     * Gets the value of the isFollowing property.
     * 
     */
    boolean isFollowing()
    {
    	return isFollowing;
    }

    /**
     * Gets the value of the isLiked property.
     * 
     */
    boolean isLiked()
    {
    	return isLiked;
    }

    /**
     * Gets the value of the availableActions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableActions }
     *     
     */
    AvailableActions getAvailableActions()
    {
    	return availableActions;
    }
}
