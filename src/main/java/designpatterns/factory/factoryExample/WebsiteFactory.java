package designpatterns.factory.factoryExample;

import designpatterns.factory.factoryExample.webSites.Blog;
import designpatterns.factory.factoryExample.webSites.Shop;
import designpatterns.factory.factoryExample.webSites.Website;

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
