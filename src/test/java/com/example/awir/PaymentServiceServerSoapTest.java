package com.example.awir;

import com.example.awir.ws.PaymentServiceClient;
import com.example.awir.ws.client.*;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.MessageFormat;
import java.util.Base64;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class PaymentServiceServerSoapTest {
	public static Validator validator;
	private final PaymentServiceClient paymentServiceClient;

	@Test
	public void testAdd() throws MalformedURLException, NotBoundException, RemoteException {

		validator = (Validator) Naming.lookup(RMI.adres);

		byte[] decodedPassword = Base64.getDecoder().decode(Secret.password);
		String realPassword = new String(decodedPassword);
		validator.validate("ka40003", realPassword); //walidacja
		String token = ValidatorImplement.getToken(); //pobieranie tokena


		final Add.PaymentAddRequest paymentAddRequest = new Add.PaymentAddRequest();
		final Header header = new Header();
		paymentAddRequest.setHeader(header);
		final PaymentDocument paymentDocument = new PaymentDocument();
		paymentAddRequest.setPaymentDocument(paymentDocument);

		header.setIssueDateTime(MessageFormat.format("{0,date,yyyy-MM-dd'T'HH:mm:ss}", new Date()));
		header.setDocumentIdentifier("IDdoc0000001");
		header.setSenderIdentifier("WI ZUT");
		header.setReceiverIdentifier("NBP");

		final PaymentHeader paymentHeader = new PaymentHeader();
		paymentDocument.setPaymentHeader(paymentHeader);
		final PaymentLineItem paymentLineItem = new PaymentLineItem();
		paymentDocument.getPaymentLineItem().add(paymentLineItem);

		paymentHeader.setPaymentIdentifier("IDnr00000001");
		final Account account = new Account();
		paymentHeader.setPayorAccount(account);
		final AcctIdentType acctIdentType = new AcctIdentType();
		account.setAccountIdentifier(acctIdentType);
		acctIdentType.setIdentificationSchemeName(AcctIdentNameType.IBAN);
		final FinancialInstitution payorFinancialInstitution = new FinancialInstitution();
		paymentHeader.setPayorFinancialInstitution(payorFinancialInstitution);
		final FIIdentType fIIdentType = new FIIdentType();
		payorFinancialInstitution.setFIIdentifier(fIIdentType);
		fIIdentType.setIdentificationSchemeName(FIIdentNameType.BIC);

		paymentLineItem.setTransactionIdentifier("IDtr00000001");
		final AmountType amountType = new AmountType();
		paymentLineItem.setOrderedAmount(amountType);
		amountType.setAmountCurrencyIdentificationCode("PLN");
		amountType.setValue(new BigDecimal("99.00"));

		final FinancialInstitution payeeFinancialInstitution = new FinancialInstitution();
		paymentLineItem.setPayeeFinancialInstitution(payeeFinancialInstitution);
		final FIIdentType fIIdentType2 = new FIIdentType();
		payeeFinancialInstitution.setFIIdentifier(fIIdentType2);
		fIIdentType2.setIdentificationSchemeName(FIIdentNameType.BIC);

		final RemittanceInformation remittanceInformation = new RemittanceInformation();
		paymentLineItem.setRemittanceInformation(remittanceInformation);

		//wysylanie zadania, serwer daje response
		final AddResponse.Return paymentAddResponse = paymentServiceClient.add(token, paymentAddRequest);

		assertThat(paymentAddResponse).isNotNull();
		assertThat(paymentAddResponse.getHeader()).isNotNull();
		assertThat(paymentAddResponse.getHeader().getDocumentIdentifier()).isEqualTo("Token jest poprawny.");
		//czy identyfikator jest zgodny z otrzymanym
	}
}
