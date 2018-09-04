package org.qacinema.beans;

import org.apache.camel.builder.RouteBuilder;


public class EMailServiceRouteBuilder extends RouteBuilder {


    public void configure() throws Exception {
        from("cxfrs://bean://emailService")
                .process(new UserProcessor())
                .process(new EMailProcessor())
                .log("${body}")
                .setHeader("subject", simple("Thank you for your purchase!"))
                .log("its cool benny ${header.email}")
                .recipientList(simple("smtps:smtp.gmail.com:465?username=QACBWong@gmail.com&password=QACTesting123&to=${header.email}&mail.smtp.auth=true"));
    }

}
