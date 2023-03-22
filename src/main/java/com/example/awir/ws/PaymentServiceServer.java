package com.example.awir.ws;

import com.example.awir.ws.server.Header;
import com.example.awir.ws.server.PaymentAddRequest;
import com.example.awir.ws.server.PaymentAddResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import java.util.Objects;

import static com.example.awir.ValidatorImplement.getToken;

@Slf4j
@Service
@WebService(serviceName = "PaymentService", targetNamespace = "http://www.wi.zut.edu.pl/service/payment/v1.0")
public class PaymentServiceServer {
    @WebMethod(operationName = "Add")
    public PaymentAddResponse add(@XmlElement(required = true) @WebParam(name = "secret") final String secret, @XmlElement(required = true) @WebParam(name = "paymentAddRequest") final PaymentAddRequest request) {

        //TODO: zgodnie z instrukcją
        //sprawdzic, czy token secret jest aktualny
        String tokenValid = getToken();
        //sprawdzic czy token jest zgodny z otrzymanymi danymi




        log.info("<<RECEIVED SECRET>>: " + secret);
        log.info("<<RECEIVED DOCUMENT>>: " + new ReflectionToStringBuilder(request, new MultilineRecursiveToStringStyle()));

        final Header header = new Header();
        header.setDocumentIdentifier("IDdoc0000001");

        final PaymentAddResponse response = new PaymentAddResponse();
        response.setHeader(header);

        if (Objects.equals(tokenValid, secret)){
            System.out.println("Otrzymany token: ");
            System.out.println(tokenValid);
            header.setDocumentIdentifier("Token jest poprawny."); //dane sa zgodne
        } else {
            header.setDocumentIdentifier("Otrzymano błędny token."); //dane nie sa zgodne albo token stracil waznosc
        }

        return response;
    }
}
