package design_patterns.design_patterns__and_solid_principles.structural.decorator;

import org.apache.commons.lang.StringEscapeUtils;

public class HtmlEncodedMessage implements Message {

    private Message msg;

    // Gets object to be decorated
    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml(msg.getContent());
    }

}
