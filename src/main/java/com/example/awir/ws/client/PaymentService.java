package com.example.awir.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.4
 * 2022-11-15T22:05:01.091+01:00
 * Generated source version: 3.5.4
 *
 */
@WebService(targetNamespace = "http://www.wi.zut.edu.pl/service/payment/v1.0", name = "PaymentService")
@XmlSeeAlso({ObjectFactory.class})
public interface PaymentService {

    @WebMethod(operationName = "Add")
    @RequestWrapper(localName = "Add", targetNamespace = "http://www.wi.zut.edu.pl/service/payment/v1.0", className = "com.example.awir.ws.client.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://www.wi.zut.edu.pl/service/payment/v1.0", className = "com.example.awir.ws.client.AddResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.example.awir.ws.client.AddResponse.Return add(

        @WebParam(name = "secret", targetNamespace = "")
        java.lang.String secret,
        @WebParam(name = "paymentAddRequest", targetNamespace = "")
        com.example.awir.ws.client.Add.PaymentAddRequest paymentAddRequest
    );
}
