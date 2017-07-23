package com.finepointmobile.digitalturbinexml;

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

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public String getProductName() {
        return productName;
    }

    public String getRating() {
        return rating;
    }
}
