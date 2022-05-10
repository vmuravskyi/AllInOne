package design_patterns.design_patterns__and_solid_principles.structural.facade.email;


public class TemplateFactory {

	public static Template createTemplateFor(Template.TemplateType type) {
		switch (type) {
		case Email:
			return new OrderEmailTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}
		
	}
}
