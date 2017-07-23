package com.finepointmobile.digitalturbinexml;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by danielmalone on 7/22/17.
 */

@Root(strict = false)
public class Ads {

    @ElementList(inline = true)
    private List<Ad> ad;

    public List<Ad> getAds() {
        return this.ad;
    }
}
