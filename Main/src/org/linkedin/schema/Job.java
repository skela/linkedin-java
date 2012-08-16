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
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}partner-job-id"/>
 *         &lt;element ref="{}contract-id"/>
 *         &lt;element ref="{}customer-job-code" minOccurs="0"/>
 *         &lt;element ref="{}active" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}posting-date"/>
 *           &lt;element ref="{}expiration-date"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}company"/>
 *           &lt;element ref="{}description"/>
 *           &lt;element ref="{}description-snippet"/>
 *           &lt;element ref="{}position"/>
 *           &lt;element ref="{}skills-and-experience"/>
 *           &lt;element ref="{}expiration-timestamp"/>
 *           &lt;element ref="{}job-poster"/>
 *           &lt;element ref="{}location-description"/>
 *           &lt;element ref="{}posting-timestamp"/>
 *           &lt;element ref="{}salary"/>
 *           &lt;element ref="{}site-job-request"/>
 *           &lt;element ref="{}site-job-url"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}referral-bonus"/>
 *           &lt;element ref="{}poster"/>
 *           &lt;element ref="{}how-to-apply"/>
 *           &lt;element ref="{}tracking-pixel-url"/>
 *           &lt;element ref="{}renewal"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Job
    extends SchemaEntity
{


    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * Gets the value of the partnerJobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPartnerJobId();

    /**
     * Sets the value of the partnerJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPartnerJobId(String value);

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getContractId();

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setContractId(Long value);

    /**
     * Gets the value of the customerJobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCustomerJobCode();

    /**
     * Sets the value of the customerJobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCustomerJobCode(String value);

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean isActive();

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setActive(Boolean value);

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link PostingDate }
     *     
     */
    PostingDate getPostingDate();

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingDate }
     *     
     */
    void setPostingDate(PostingDate value);

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationDate }
     *     
     */
    ExpirationDate getExpirationDate();

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationDate }
     *     
     */
    void setExpirationDate(ExpirationDate value);

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    Company getCompany();

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    void setCompany(Company value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescription(String value);

    /**
     * Gets the value of the descriptionSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescriptionSnippet();

    /**
     * Sets the value of the descriptionSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescriptionSnippet(String value);

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    Position getPosition();

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    void setPosition(Position value);

    /**
     * Gets the value of the skillsAndExperience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSkillsAndExperience();

    /**
     * Sets the value of the skillsAndExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSkillsAndExperience(String value);

    /**
     * Gets the value of the expirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getExpirationTimestamp();

    /**
     * Sets the value of the expirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setExpirationTimestamp(Long value);

    /**
     * Gets the value of the jobPoster property.
     * 
     * @return
     *     possible object is
     *     {@link JobPoster }
     *     
     */
    JobPoster getJobPoster();

    /**
     * Sets the value of the jobPoster property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobPoster }
     *     
     */
    void setJobPoster(JobPoster value);

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLocationDescription();

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLocationDescription(String value);

    /**
     * Gets the value of the postingTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPostingTimestamp();

    /**
     * Sets the value of the postingTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPostingTimestamp(Long value);

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSalary();

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSalary(String value);

    /**
     * Gets the value of the siteJobRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SiteJobRequest }
     *     
     */
    SiteJobRequest getSiteJobRequest();

    /**
     * Sets the value of the siteJobRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteJobRequest }
     *     
     */
    void setSiteJobRequest(SiteJobRequest value);

    /**
     * Gets the value of the siteJobUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSiteJobUrl();

    /**
     * Sets the value of the siteJobUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSiteJobUrl(String value);

    /**
     * Gets the value of the referralBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getReferralBonus();

    /**
     * Sets the value of the referralBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setReferralBonus(String value);

    /**
     * Gets the value of the poster property.
     * 
     * @return
     *     possible object is
     *     {@link Poster }
     *     
     */
    Poster getPoster();

    /**
     * Sets the value of the poster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Poster }
     *     
     */
    void setPoster(Poster value);

    /**
     * Gets the value of the howToApply property.
     * 
     * @return
     *     possible object is
     *     {@link HowToApply }
     *     
     */
    HowToApply getHowToApply();

    /**
     * Sets the value of the howToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link HowToApply }
     *     
     */
    void setHowToApply(HowToApply value);

    /**
     * Gets the value of the trackingPixelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTrackingPixelUrl();

    /**
     * Sets the value of the trackingPixelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTrackingPixelUrl(String value);

    /**
     * Gets the value of the renewal property.
     * 
     * @return
     *     possible object is
     *     {@link Renewal }
     *     
     */
    Renewal getRenewal();

    /**
     * Sets the value of the renewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Renewal }
     *     
     */
    void setRenewal(Renewal value);

}
