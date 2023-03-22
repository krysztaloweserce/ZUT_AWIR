package com.example.awir.ws;

import com.example.awir.ws.client.AddResponse;
import com.example.awir.ws.client.Add.PaymentAddRequest;
import com.example.awir.ws.client.PaymentService_Service;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
@Service
public class PaymentServiceClient {
    private final com.example.awir.ws.client.PaymentService port;

    public PaymentServiceClient() {
        final PaymentService_Service service = new PaymentService_Service();
        port = service.getPaymentServicePort();
    }

    public AddResponse.Return add(@NotNull final String secret, final PaymentAddRequest paymentAddRequest) {
        return port.add(secret, paymentAddRequest); //nadaje requesta na danym adresie/porcie
    }
}
