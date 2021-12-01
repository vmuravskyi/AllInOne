package designpatterns.factory.factoryExample.webSites;

import designpatterns.factory.factoryExample.pages.AboutPage;
import designpatterns.factory.factoryExample.pages.CommentPage;
import designpatterns.factory.factoryExample.pages.ContactPage;
import designpatterns.factory.factoryExample.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
