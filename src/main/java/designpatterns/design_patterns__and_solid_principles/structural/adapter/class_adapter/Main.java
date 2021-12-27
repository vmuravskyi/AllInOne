package designpatterns.design_patterns__and_solid_principles.structural.adapter.class_adapter;

public class Main {

	public static void main(String[] args) {
		// Using Class/Two-way adapter
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);

		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);

		System.out.println("--------------------------------------------");
		// Using Object Adapter
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);

		BusinessCardDesigner designer1 = new BusinessCardDesigner();
		String card2 = designer1.designCard(objectAdapter);
		System.out.println(card2);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
