package designpatterns.factory.factoryExample.webSites;

import designpatterns.factory.factoryExample.pages.CartPage;
import designpatterns.factory.factoryExample.pages.ItemPage;
import designpatterns.factory.factoryExample.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new SearchPage());
        pages.add(new ItemPage());
    }
}
