package org.qacinema.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.qacinema.beans.util.JSONUtil;


public class UserProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {

        String msg = exchange.getIn().getBody(String.class);
        User user = new JSONUtil().getObjectForJSON(msg, User.class);
        exchange.getOut().setBody(user);

    }
}
