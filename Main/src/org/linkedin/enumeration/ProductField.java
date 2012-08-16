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
package org.linkedin.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nabeel Mukhtar
 *
 */
public enum ProductField implements CompositeEnum<ProductField> {

    /**
     * A human readable name for the facet.
     */
	ID("id", null),

    /**
     * The machine processable value for the facet.
     */
	NAME("name", null),

    /**
     * The machine processable value for the facet.
     */
	TYPE("type", null),
    /**
     * The machine processable value for the facet.
     */
	CREATION_TIMESTAMP("creation-timestamp", null),
    /**
     * The machine processable value for the facet.
     */
	LOGO_URL("logo-url", null),
    /**
     * The machine processable value for the facet.
     */
	DESCRIPTION("description", null),
    /**
     * The machine processable value for the facet.
     */
	FEATURES("features", null),
    /**
     * The machine processable value for the facet.
     */
	VIDEO("video", null),
    /**
     * The machine processable value for the facet.
     */
	VIDEO_TITLE("title", VIDEO),
    /**
     * The machine processable value for the facet.
     */
	VIDEO_URL("url", VIDEO),
    /**
     * The machine processable value for the facet.
     */
	PRODUCT_DEAL("product-deal", null),
    /**
     * The machine processable value for the facet.
     */
	PRODUCT_DEAL_TITLE("title", PRODUCT_DEAL),
    /**
     * The machine processable value for the facet.
     */
	PRODUCT_DEAL_URL("url", PRODUCT_DEAL),
    /**
     * The machine processable value for the facet.
     */
	PRODUCT_DEAL_TEXT("text", PRODUCT_DEAL),
    /**
     * The machine processable value for the facet.
     */
	SALES_PERSONS("sales-persons", null),
    /**
     * The machine processable value for the facet.
     */
	NUM_RECOMMENDATIONS("num-recommendations", null),
    /**
     * The machine processable value for the facet.
     */
	RECOMMENDATIONS("recommendations", null),
    /**
     * The machine processable value for the facet.
     */
	RECOMMENDATIONS_RECOMMENDER("recommender", RECOMMENDATIONS),
    /**
     * The machine processable value for the facet.
     */
	RECOMMENDATIONS_ID("id", RECOMMENDATIONS),
    /**
     * The machine processable value for the facet.
     */
	RECOMMENDATIONS_PRODUCT_ID("product-id", RECOMMENDATIONS),
    /**
     * The machine processable value for the facet.
     */
	RECOMMENDATIONS_TIMESTAMP("timestamp", RECOMMENDATIONS),
    /**
     * The machine processable value for the facet.
     */
	RECOMMENDATIONS_TEXT("text", RECOMMENDATIONS),
    /**
     * The machine processable value for the facet.
     */
	RECOMMENDATIONS_REPLY("reply", RECOMMENDATIONS),
	
	RECOMMENDATIONS_LIKES("likes", RECOMMENDATIONS),
	RECOMMENDATIONS_LIKES_TIMESTAMP("timestamp", RECOMMENDATIONS_LIKES),
	RECOMMENDATIONS_LIKES_PERSON("person", RECOMMENDATIONS_LIKES),
    /**
     * The machine processable value for the facet.
     */
	PRODUCT_CATEGORY("product-category", null),
    /**
     * The machine processable value for the facet.
     */
	WEBSITE_URL("website-url", null),
    /**
     * The machine processable value for the facet.
     */
	DISCLAIMER("disclaimer", null);
    
    /**
     * Field Description.
     */
	private static final Map<String, ProductField> stringToEnum = new HashMap<String, ProductField>();

	static { // Initialize map from constant name to enum constant
		for (ProductField op : values()) {
			stringToEnum.put(op.fieldName(), op);
		}
	}

    /** Field description */
    private final String fieldName;

    /** Field description */
    private final ProductField parent;

    /**
     * Constructs ...
     *
     *
     * @param name
     */
    ProductField(String name, ProductField parent) {
        this.fieldName = name;
        this.parent = parent;
    }

    /**
     * @return the name of the field
     */
    public String fieldName() {
        return this.fieldName;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    @Override
    public String toString() {
        return fieldName();
    }

	/**
	 *
	 * @return Returns ProfileType for string, or null if string is invalid
	 */
	public static ProductField fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	@Override
	public ProductField parent() {
		return parent;
	}
}
