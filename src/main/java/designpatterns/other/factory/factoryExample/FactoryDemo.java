package designpatterns.other.factory.factoryExample;

import designpatterns.other.factory.factoryExample.webSites.Website;

public class FactoryDemo {
    public static void main(String[] args) {

        Website blogSite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blogSite.getPages());

        Website shopSite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shopSite.getPages());
    }
}
