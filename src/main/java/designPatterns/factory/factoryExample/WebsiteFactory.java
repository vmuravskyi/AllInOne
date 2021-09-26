package designPatterns.factory.factoryExample;

import designPatterns.factory.factoryExample.webSites.Blog;
import designPatterns.factory.factoryExample.webSites.Shop;
import designPatterns.factory.factoryExample.webSites.Website;

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
