package design_patterns.design_patterns__and_solid_principles.creational.abstractfactory;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int minMib);

}
