package designpatterns.design_patterns__and_solid_principles.structural.adapter.class_adapter;

/**
 * Target interface required by new client code
 */
public interface Customer {

	String getName();
	
	String getDesignation();
	
	String getAddress();
}
