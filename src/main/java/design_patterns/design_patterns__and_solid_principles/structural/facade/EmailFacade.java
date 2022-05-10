package design_patterns.design_patterns__and_solid_principles.structural.facade;

import design_patterns.design_patterns__and_solid_principles.structural.facade.email.*;

public class EmailFacade {

    public boolean sendOrderEmail(Order order) {
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }

}
