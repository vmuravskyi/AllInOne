package designpatterns.design_patterns__and_solid_principles.creational.abstractfactory.aws;

import designpatterns.design_patterns__and_solid_principles.creational.abstractfactory.Instance;
import designpatterns.design_patterns__and_solid_principles.creational.abstractfactory.ResourceFactory;
import designpatterns.design_patterns__and_solid_principles.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int minMib) {
        return new S3Storage(minMib);
    }
}
