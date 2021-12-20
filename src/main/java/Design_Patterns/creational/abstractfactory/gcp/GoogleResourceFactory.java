package Design_Patterns.creational.abstractfactory.gcp;


import Design_Patterns.creational.abstractfactory.Instance;
import Design_Patterns.creational.abstractfactory.ResourceFactory;
import Design_Patterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int minMib) {
        return new GoogleCloudStorage(minMib);
    }
}
