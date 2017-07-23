package com.finepointmobile.digitalturbinexml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by danielmalone on 7/22/17.
 */

@Root(strict = false)
public class Ad {

    @Element
    private String clickProxyURL;

    public String getClickProxyURL() {
        return this.clickProxyURL;
    }
}