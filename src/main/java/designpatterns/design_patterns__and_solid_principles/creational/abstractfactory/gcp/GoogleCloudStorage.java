package designpatterns.design_patterns__and_solid_principles.creational.abstractfactory.gcp;

import designpatterns.design_patterns__and_solid_principles.creational.abstractfactory.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        //Use gcp api
        System.out.println("Allocated "+capacityInMib+" on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }
}
