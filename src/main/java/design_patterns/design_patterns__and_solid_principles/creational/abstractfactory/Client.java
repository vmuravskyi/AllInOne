package design_patterns.design_patterns__and_solid_principles.creational.abstractfactory;


import design_patterns.design_patterns__and_solid_principles.creational.abstractfactory.aws.AwsResourceFactory;
import design_patterns.design_patterns__and_solid_principles.creational.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.println("*********************************************************");
        Client gcp = new Client(new GoogleResourceFactory());
        Instance g1 = gcp.createServer(Instance.Capacity.large, 20480);
        g1.start();
        g1.stop();

    }

}
