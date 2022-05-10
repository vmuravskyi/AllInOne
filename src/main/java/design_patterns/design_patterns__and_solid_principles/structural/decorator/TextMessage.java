package design_patterns.design_patterns__and_solid_principles.structural.decorator;

public class TextMessage implements Message {

    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg;
    }
}
