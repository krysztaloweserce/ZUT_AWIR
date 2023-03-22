package com.example.awir;

import com.example.awir.ws.PaymentServiceServer;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * http://localhost:8080/services/payment?wsdl //do zapisania w katalogu wsdl
 */
@Configuration
@RequiredArgsConstructor
public class WebServiceConfig {
	private final Bus bus;
	private final PaymentServiceServer paymentServiceServer;

	@Bean
	public Endpoint endpoint() {
		final EndpointImpl endpoint = new EndpointImpl(bus, paymentServiceServer);
		endpoint.publish("/payment");
		return endpoint;
	}
}
