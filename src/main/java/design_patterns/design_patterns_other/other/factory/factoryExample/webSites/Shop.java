package design_patterns.design_patterns_other.other.factory.factoryExample.webSites;

import design_patterns.design_patterns_other.other.factory.factoryExample.pages.CartPage;
import design_patterns.design_patterns_other.other.factory.factoryExample.pages.ItemPage;
import design_patterns.design_patterns_other.other.factory.factoryExample.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new SearchPage());
        pages.add(new ItemPage());
    }
}
