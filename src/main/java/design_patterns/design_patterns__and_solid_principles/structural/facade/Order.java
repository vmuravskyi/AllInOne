package design_patterns.design_patterns__and_solid_principles.structural.facade;

public class Order {

	private String id;
	
	private double total;

	public Order(String id, double total) {
		this.id = id;
		this.total =total;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
