package com.udemy.automation_design_patterns.factory;

public abstract class GooglePage {

    public abstract void launchSite();
    public abstract void search(String keyword);
    public abstract int getResultCount();

}
