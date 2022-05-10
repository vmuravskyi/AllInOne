package design_patterns.design_patterns__and_solid_principles.structural.decorator;

public class Client {

    public static void main(String[] args) {

        Message msg = new TextMessage("The <FORCE> os strong with this one");
        System.out.println(msg.getContent());

        HtmlEncodedMessage decoratorHtml = new HtmlEncodedMessage(msg);
        System.out.println(decoratorHtml.getContent());

        Base64EncodedMessage decoratorBase64 = new Base64EncodedMessage(decoratorHtml);
        System.out.println(decoratorBase64.getContent());

    }

}
