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



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}group"/>
 *         &lt;element ref="{}person"/>
 *         &lt;element ref="{}membership-state"/>
 *         &lt;element ref="{}contact-email"/>
 *         &lt;element ref="{}show-group-logo-in-profile"/>
 *         &lt;element ref="{}allow-messages-from-members"/>
 *         &lt;element ref="{}email-digest-frequency"/>
 *         &lt;element ref="{}email-announcements-from-managers"/>
 *         &lt;element ref="{}email-for-every-new-post"/>
 *       &lt;/sequence>
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GroupMembership
    extends SchemaEntity
{


    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    Group getGroup();

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    void setGroup(Group value);

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    Person getPerson();

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    void setPerson(Person value);

    /**
     * Gets the value of the membershipState property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipState }
     *     
     */
    MembershipState getMembershipState();

    /**
     * Sets the value of the membershipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipState }
     *     
     */
    void setMembershipState(MembershipState value);

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getContactEmail();

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setContactEmail(String value);

    /**
     * Gets the value of the showGroupLogoInProfile property.
     * 
     */
    boolean isShowGroupLogoInProfile();

    /**
     * Sets the value of the showGroupLogoInProfile property.
     * 
     */
    void setShowGroupLogoInProfile(boolean value);

    /**
     * Gets the value of the allowMessagesFromMembers property.
     * 
     */
    boolean isAllowMessagesFromMembers();

    /**
     * Sets the value of the allowMessagesFromMembers property.
     * 
     */
    void setAllowMessagesFromMembers(boolean value);

    /**
     * Gets the value of the emailDigestFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link EmailDigestFrequency }
     *     
     */
    EmailDigestFrequency getEmailDigestFrequency();

    /**
     * Sets the value of the emailDigestFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailDigestFrequency }
     *     
     */
    void setEmailDigestFrequency(EmailDigestFrequency value);

    /**
     * Gets the value of the emailAnnouncementsFromManagers property.
     * 
     */
    boolean isEmailAnnouncementsFromManagers();

    /**
     * Sets the value of the emailAnnouncementsFromManagers property.
     * 
     */
    void setEmailAnnouncementsFromManagers(boolean value);

    /**
     * Gets the value of the emailForEveryNewPost property.
     * 
     */
    boolean isEmailForEveryNewPost();

    /**
     * Sets the value of the emailForEveryNewPost property.
     * 
     */
    void setEmailForEveryNewPost(boolean value);

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getKey();

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setKey(Long value);

}
