package designPatterns.factory.factoryExample.webSites;

import designPatterns.factory.factoryExample.pages.AboutPage;
import designPatterns.factory.factoryExample.pages.CommentPage;
import designPatterns.factory.factoryExample.pages.ContactPage;
import designPatterns.factory.factoryExample.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
