package org.qacinema.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.qacinema.beans.constants.Constants;

public class EMailProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        User user = exchange.getIn().getBody(User.class);
        exchange.setProperty("id", user.getId());
        exchange.setProperty("name", user.getName());
        exchange.setProperty("score", user.getScore());
        exchange.setProperty("email", user.getEmail());
        exchange.getOut().setHeader("email", user.getEmail());
        exchange.getOut().setBody(Constants.HELLO + " " + exchange.getProperty("name") + "\n \n" + Constants.CONGRATS_MESSAGE + " " + exchange.getProperty("score") +
                Constants.FIVE_SPACES + Constants.FOOTER);

    }
}
