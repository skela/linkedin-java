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
 *         &lt;element ref="{}name"/>
 *         &lt;element name="type" type="{}product-type"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}logo-url"/>
 *         &lt;element ref="{}creation-timestamp"/>
 *         &lt;element ref="{}features"/>
 *         &lt;element ref="{}num-recommendations"/>
 *         &lt;element ref="{}product-deal"/>
 *         &lt;element ref="{}sales-persons"/>
 *         &lt;element ref="{}video"/>
 *         &lt;element ref="{}recommendations" minOccurs="0"/>
 *         &lt;element ref="{}product-category"/>
 *         &lt;element ref="{}website-url"/>
 *         &lt;element ref="{}disclaimer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Product
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    ProductType getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    void setType(ProductType value);

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
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLogoUrl();

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLogoUrl(String value);

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getCreationTimestamp();

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCreationTimestamp(Long value);

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    Features getFeatures();

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    void setFeatures(Features value);

    /**
     * Gets the value of the numRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getNumRecommendations();

    /**
     * Sets the value of the numRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNumRecommendations(Long value);

    /**
     * Gets the value of the productDeal property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDeal }
     *     
     */
    ProductDeal getProductDeal();

    /**
     * Sets the value of the productDeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDeal }
     *     
     */
    void setProductDeal(ProductDeal value);

    /**
     * Gets the value of the salesPersons property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersons }
     *     
     */
    SalesPersons getSalesPersons();

    /**
     * Sets the value of the salesPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersons }
     *     
     */
    void setSalesPersons(SalesPersons value);

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link Video }
     *     
     */
    Video getVideo();

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link Video }
     *     
     */
    void setVideo(Video value);

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link Recommendations }
     *     
     */
    Recommendations getRecommendations();

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recommendations }
     *     
     */
    void setRecommendations(Recommendations value);

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategory }
     *     
     */
    ProductCategory getProductCategory();

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategory }
     *     
     */
    void setProductCategory(ProductCategory value);

    /**
     * Gets the value of the websiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getWebsiteUrl();

    /**
     * Sets the value of the websiteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setWebsiteUrl(String value);

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDisclaimer();

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDisclaimer(String value);

}
