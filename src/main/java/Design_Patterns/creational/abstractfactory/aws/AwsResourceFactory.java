package Design_Patterns.creational.abstractfactory.aws;

import Design_Patterns.creational.abstractfactory.Instance;
import Design_Patterns.creational.abstractfactory.ResourceFactory;
import Design_Patterns.creational.abstractfactory.Storage;

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
