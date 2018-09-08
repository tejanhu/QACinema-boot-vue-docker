package com.qa.application.cinemaapp.domain;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.paypal.api.payments.*;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.base.rest.PayPalResource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("deprecation")
public class Payment {

   private Payment payment;
    private com.paypal.api.payments.Payment configurePayment;
    //Perhaps I need empty constructor for each?

    private Payer setPaymentMethod(){
        Payer payer = new Payer();
        payer.setPaymentMethod("paypal");
        return payer;
    }

    private RedirectUrls setRedirectUrls(){
        RedirectUrls redirectUrls = new RedirectUrls();
        redirectUrls.setReturnUrl("http://localhost:8182/process");
        redirectUrls.setCancelUrl("http://localhost:8182/cancel");
        return redirectUrls;
    }
    private Amount setAmount(){
        Amount amount = new Amount();
        amount.setCurrency("GBP");
        amount.setTotal("6.00");
        Details details = new Details();
        amount.setDetails(details);
        return amount;
    }

    private List<Transaction> setTransaction(){
        Transaction transaction = new Transaction();
        transaction.setAmount(setAmount());
        transaction.setDescription("This is the payment transaction description");
        List<Transaction> transactions = new ArrayList<Transaction>();
        transactions.add(transaction);
        return transactions;
    }
    private com.paypal.api.payments.Payment configPayment(com.paypal.api.payments.Payment payment1){
        System.out.println("adjusting details");

        payment1.setIntent("sale");
        System.out.println("set intent");

        payment1.setPayer(setPaymentMethod());
        System.out.println("set Method of payment");

        payment1.setRedirectUrls(setRedirectUrls());
        System.out.println("set redirect urls");

        payment1.setTransactions(setTransaction());
        System.out.println("adjusted details"+payment1);
        return payment1;
    }
    public com.paypal.api.payments.Payment createPayment(){
        //not sure whats happening here...NullPointer

        com.paypal.api.payments.Payment payPalPayment = payment.configPayment(configurePayment);
        APIContext apiContext = new APIContext();
        try{
            payPalPayment.create(apiContext);
            Iterator links = payPalPayment.getLinks().iterator();
            while(links.hasNext()){
                Links link = (Links) links.next();
                if(link.getRel().equalsIgnoreCase("approval_url")){
                    link.getHref();
                }
            }
        } catch (PayPalRESTException e){
            System.err.println(e.getDetails());
        }
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject)parser.parse(PayPalResource.getLastResponse());

        payPalPayment.setId(jsonObject.get("paymentID").toString());
        PaymentExecution paymentExecution = new PaymentExecution();
        paymentExecution.setPayerId(jsonObject.get("PayerID").toString());
        try{
            payPalPayment.execute(apiContext, paymentExecution);
            System.out.println(payPalPayment);
        } catch(PayPalRESTException e){
            e.printStackTrace();
        }
        return payPalPayment;
    }
}
