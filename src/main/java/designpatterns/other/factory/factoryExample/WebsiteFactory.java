package designpatterns.other.factory.factoryExample;

import designpatterns.other.factory.factoryExample.webSites.Blog;
import designpatterns.other.factory.factoryExample.webSites.Shop;
import designpatterns.other.factory.factoryExample.webSites.Website;

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
