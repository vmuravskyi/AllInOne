package designPatterns.factory.factoryExample.webSites;

import designPatterns.factory.factoryExample.pages.CartPage;
import designPatterns.factory.factoryExample.pages.ItemPage;
import designPatterns.factory.factoryExample.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new SearchPage());
        pages.add(new ItemPage());
    }
}
