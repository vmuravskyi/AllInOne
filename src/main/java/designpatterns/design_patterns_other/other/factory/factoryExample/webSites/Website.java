package designpatterns.design_patterns_other.other.factory.factoryExample.webSites;

import designpatterns.design_patterns_other.other.factory.factoryExample.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();

}
