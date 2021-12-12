package designpatterns.other.factory.factoryExample.webSites;

import designpatterns.other.factory.factoryExample.pages.CartPage;
import designpatterns.other.factory.factoryExample.pages.ItemPage;
import designpatterns.other.factory.factoryExample.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new SearchPage());
        pages.add(new ItemPage());
    }
}
