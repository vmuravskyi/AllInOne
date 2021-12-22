package designpatterns.design_patterns_other.other.factory.factoryExample;

import designpatterns.design_patterns_other.other.factory.factoryExample.webSites.Blog;
import designpatterns.design_patterns_other.other.factory.factoryExample.webSites.Shop;
import designpatterns.design_patterns_other.other.factory.factoryExample.webSites.Website;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
