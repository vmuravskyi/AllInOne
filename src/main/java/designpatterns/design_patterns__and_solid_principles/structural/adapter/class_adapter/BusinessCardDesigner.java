package designpatterns.design_patterns__and_solid_principles.structural.adapter.class_adapter;

/**
 * Client code which requires Customer interface.
 */
public class BusinessCardDesigner {

	public String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}
}
