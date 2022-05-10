package design_patterns.design_patterns__and_solid_principles.structural.facade.email;

public abstract class Template {

	public enum TemplateType {Email, NewsLetter};
	
	public abstract String format(Object obj);
	
}
