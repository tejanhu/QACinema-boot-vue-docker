package org.qacinema.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;
import org.qacinema.beans.constants.Constants;


public class EmployeeServiceRouteBuilder extends RouteBuilder {



    public void configure() throws Exception {
        from("cxfrs://bean://restService")
                .process(new UserProcessor())
                .process(new EMailProcessor())
                .log("${body}")
                .setHeader("subject", simple("Please Read Me"))
                .log("its cool benny ${header.email}")
                .recipientList(simple("smtps:smtp.gmail.com:465?username=QACBWong@gmail.com&password=QACTesting123&to=${header.email}&mail.smtp.auth=true"));
    }

}
