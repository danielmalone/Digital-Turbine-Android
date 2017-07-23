package com.finepointmobile.digitalturbinexml.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by danielmalone on 7/22/17.
 */

@Root(strict = false)
public class Ad {

    @Element
    private String productThumbnail;

    @Element
    private String productName;

    @Element
    private String rating;

    @Element
    private String productDescription;

    @Element
    private String categoryName;

    @Element(required = false)
    private String minOSVersion;

    @Element
    private String numberOfRatings;

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public String getProductName() {
        return productName;
    }

    public String getRating() {
        return rating;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getMinOSVersion() {
        return minOSVersion;
    }

    public String getNumberOfRatings() {
        return numberOfRatings;
    }
}
