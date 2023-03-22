
package com.example.awir.ws.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.awir.ws.server package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DocumentIdentifier_QNAME = new QName("", "DocumentIdentifier");
    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _CriteriaInclude_QNAME = new QName("", "CriteriaInclude");
    private final static QName _ResponseDetailsOmit_QNAME = new QName("", "ResponseDetailsOmit");
    private final static QName _Period_QNAME = new QName("", "Period");
    private final static QName _PaymentIdentifier_QNAME = new QName("", "PaymentIdentifier");
    private final static QName _PmtCategory_QNAME = new QName("", "PmtCategory");
    private final static QName _ExecutionDateRequested_QNAME = new QName("", "ExecutionDateRequested");
    private final static QName _DueDate_QNAME = new QName("", "DueDate");
    private final static QName _PayorParty_QNAME = new QName("", "PayorParty");
    private final static QName _PayeeParty_QNAME = new QName("", "PayeeParty");
    private final static QName _PayorAccount_QNAME = new QName("", "PayorAccount");
    private final static QName _PayeeAccount_QNAME = new QName("", "PayeeAccount");
    private final static QName _ChargeAccount_QNAME = new QName("", "ChargeAccount");
    private final static QName _PayorFinancialInstitution_QNAME = new QName("", "PayorFinancialInstitution");
    private final static QName _PayeeFinancialInstitution_QNAME = new QName("", "PayeeFinancialInstitution");
    private final static QName _PmtAdditionalInformation_QNAME = new QName("", "PmtAdditionalInformation");
    private final static QName _TransactionIdentifier_QNAME = new QName("", "TransactionIdentifier");
    private final static QName _Responsibility_QNAME = new QName("", "Responsibility");
    private final static QName _ImmediatePmt_QNAME = new QName("", "ImmediatePmt");
    private final static QName _OrderedAmount_QNAME = new QName("", "OrderedAmount");
    private final static QName _CustomerPayeeIdentifier_QNAME = new QName("", "CustomerPayeeIdentifier");
    private final static QName _BankServerPaymentIdentifier_QNAME = new QName("", "BankServerPaymentIdentifier");
    private final static QName _BankTransactionIdentifier_QNAME = new QName("", "BankTransactionIdentifier");
    private final static QName _ChargeResponsibility_QNAME = new QName("", "ChargeResponsibility");
    private final static QName _AdditionalDetails_QNAME = new QName("", "AdditionalDetails");
    private final static QName _PaymentStatus_QNAME = new QName("", "PaymentStatus");
    private final static QName _PaymentRejectionInfo_QNAME = new QName("", "PaymentRejectionInfo");
    private final static QName _DebitAmount_QNAME = new QName("", "DebitAmount");
    private final static QName _AdditionalDeclaration_QNAME = new QName("", "AdditionalDeclaration");
    private final static QName _TransactionRejection_QNAME = new QName("", "TransactionRejection");
    private final static QName _SoldCheque_QNAME = new QName("", "SoldCheque");
    private final static QName _PmtCashCategory_QNAME = new QName("", "PmtCashCategory");
    private final static QName _CardStatus_QNAME = new QName("", "CardStatus");
    private final static QName _CardStatementInfoType_QNAME = new QName("", "CardStatementInfoType");
    private final static QName _CardTransactionStatus_QNAME = new QName("", "CardTransactionStatus");
    private final static QName _ReversalIndicator_QNAME = new QName("", "ReversalIndicator");
    private final static QName _CardStatementCriteriaStartDate_QNAME = new QName("", "StartDate");
    private final static QName _CardStatementCriteriaEndDate_QNAME = new QName("", "EndDate");
    private final static QName _CardStatementCriteriaCardAccountOwner_QNAME = new QName("", "CardAccountOwner");
    private final static QName _CardStatementCriteriaCustomerAccount_QNAME = new QName("", "CustomerAccount");
    private final static QName _CardStatementCriteriaCardAccount_QNAME = new QName("", "CardAccount");
    private final static QName _CardStatementCriteriaCardFinancialInstitution_QNAME = new QName("", "CardFinancialInstitution");
    private final static QName _CardStatementCriteriaCustomerFinancialInstitution_QNAME = new QName("", "CustomerFinancialInstitution");
    private final static QName _StopCardCriteriaAdditionalInformationType_QNAME = new QName("", "AdditionalInformationType");
    private final static QName _StopCardCriteriaAdditionalInformation_QNAME = new QName("", "AdditionalInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.awir.ws.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Max210Text }
     * 
     */
    public Max210Text createMax210Text() {
        return new Max210Text();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Max35Text }
     * 
     */
    public Max35Text createMax35Text() {
        return new Max35Text();
    }

    /**
     * Create an instance of {@link Max26Text }
     * 
     */
    public Max26Text createMax26Text() {
        return new Max26Text();
    }

    /**
     * Create an instance of {@link Max70Text }
     * 
     */
    public Max70Text createMax70Text() {
        return new Max70Text();
    }

    /**
     * Create an instance of {@link CountryCode }
     * 
     */
    public CountryCode createCountryCode() {
        return new CountryCode();
    }

    /**
     * Create an instance of {@link DocumentStatus }
     * 
     */
    public DocumentStatus createDocumentStatus() {
        return new DocumentStatus();
    }

    /**
     * Create an instance of {@link Max140Text }
     * 
     */
    public Max140Text createMax140Text() {
        return new Max140Text();
    }

    /**
     * Create an instance of {@link ResponseRecordsControl }
     * 
     */
    public ResponseRecordsControl createResponseRecordsControl() {
        return new ResponseRecordsControl();
    }

    /**
     * Create an instance of {@link Numeric }
     * 
     */
    public Numeric createNumeric() {
        return new Numeric();
    }

    /**
     * Create an instance of {@link CurrencyConvertor }
     * 
     */
    public CurrencyConvertor createCurrencyConvertor() {
        return new CurrencyConvertor();
    }

    /**
     * Create an instance of {@link CurrencyCode }
     * 
     */
    public CurrencyCode createCurrencyCode() {
        return new CurrencyCode();
    }

    /**
     * Create an instance of {@link PeriodType }
     * 
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link FinancialInstitution }
     * 
     */
    public FinancialInstitution createFinancialInstitution() {
        return new FinancialInstitution();
    }

    /**
     * Create an instance of {@link ResponsibilityCode }
     * 
     */
    public ResponsibilityCode createResponsibilityCode() {
        return new ResponsibilityCode();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link AdditionalDetailsType }
     * 
     */
    public AdditionalDetailsType createAdditionalDetailsType() {
        return new AdditionalDetailsType();
    }

    /**
     * Create an instance of {@link RegulatoryReport }
     * 
     */
    public RegulatoryReport createRegulatoryReport() {
        return new RegulatoryReport();
    }

    /**
     * Create an instance of {@link RegInfoCode }
     * 
     */
    public RegInfoCode createRegInfoCode() {
        return new RegInfoCode();
    }

    /**
     * Create an instance of {@link RemittanceInformation }
     * 
     */
    public RemittanceInformation createRemittanceInformation() {
        return new RemittanceInformation();
    }

    /**
     * Create an instance of {@link RemittanceDetails }
     * 
     */
    public RemittanceDetails createRemittanceDetails() {
        return new RemittanceDetails();
    }

    /**
     * Create an instance of {@link PartyIdentType }
     * 
     */
    public PartyIdentType createPartyIdentType() {
        return new PartyIdentType();
    }

    /**
     * Create an instance of {@link AdjustmentDetails }
     * 
     */
    public AdjustmentDetails createAdjustmentDetails() {
        return new AdjustmentDetails();
    }

    /**
     * Create an instance of {@link AdjustmentReasonCode }
     * 
     */
    public AdjustmentReasonCode createAdjustmentReasonCode() {
        return new AdjustmentReasonCode();
    }

    /**
     * Create an instance of {@link US }
     * 
     */
    public US createUS() {
        return new US();
    }

    /**
     * Create an instance of {@link PayorIdentType }
     * 
     */
    public PayorIdentType createPayorIdentType() {
        return new PayorIdentType();
    }

    /**
     * Create an instance of {@link Max40Text }
     * 
     */
    public Max40Text createMax40Text() {
        return new Max40Text();
    }

    /**
     * Create an instance of {@link MPP }
     * 
     */
    public MPP createMPP() {
        return new MPP();
    }

    /**
     * Create an instance of {@link VATAmountType }
     * 
     */
    public VATAmountType createVATAmountType() {
        return new VATAmountType();
    }

    /**
     * Create an instance of {@link Max33Text }
     * 
     */
    public Max33Text createMax33Text() {
        return new Max33Text();
    }

    /**
     * Create an instance of {@link Charge }
     * 
     */
    public Charge createCharge() {
        return new Charge();
    }

    /**
     * Create an instance of {@link Max14Text }
     * 
     */
    public Max14Text createMax14Text() {
        return new Max14Text();
    }

    /**
     * Create an instance of {@link PaymentDocument }
     * 
     */
    public PaymentDocument createPaymentDocument() {
        return new PaymentDocument();
    }

    /**
     * Create an instance of {@link PaymentHeader }
     * 
     */
    public PaymentHeader createPaymentHeader() {
        return new PaymentHeader();
    }

    /**
     * Create an instance of {@link PaymentStatusType }
     * 
     */
    public PaymentStatusType createPaymentStatusType() {
        return new PaymentStatusType();
    }

    /**
     * Create an instance of {@link TransactionRejectionType }
     * 
     */
    public TransactionRejectionType createTransactionRejectionType() {
        return new TransactionRejectionType();
    }

    /**
     * Create an instance of {@link PaymentLineItem }
     * 
     */
    public PaymentLineItem createPaymentLineItem() {
        return new PaymentLineItem();
    }

    /**
     * Create an instance of {@link CardIdentifier }
     * 
     */
    public CardIdentifier createCardIdentifier() {
        return new CardIdentifier();
    }

    /**
     * Create an instance of {@link AdditionalDeclarationType }
     * 
     */
    public AdditionalDeclarationType createAdditionalDeclarationType() {
        return new AdditionalDeclarationType();
    }

    /**
     * Create an instance of {@link TransactionStatus }
     * 
     */
    public TransactionStatus createTransactionStatus() {
        return new TransactionStatus();
    }

    /**
     * Create an instance of {@link PaymentSummaryType }
     * 
     */
    public PaymentSummaryType createPaymentSummaryType() {
        return new PaymentSummaryType();
    }

    /**
     * Create an instance of {@link PaymentLineIdentifier }
     * 
     */
    public PaymentLineIdentifier createPaymentLineIdentifier() {
        return new PaymentLineIdentifier();
    }

    /**
     * Create an instance of {@link PaymentRefusalSelectionCriteria }
     * 
     */
    public PaymentRefusalSelectionCriteria createPaymentRefusalSelectionCriteria() {
        return new PaymentRefusalSelectionCriteria();
    }

    /**
     * Create an instance of {@link PaymentRefusalInfoDetails }
     * 
     */
    public PaymentRefusalInfoDetails createPaymentRefusalInfoDetails() {
        return new PaymentRefusalInfoDetails();
    }

    /**
     * Create an instance of {@link Min1Max4Text }
     * 
     */
    public Min1Max4Text createMin1Max4Text() {
        return new Min1Max4Text();
    }

    /**
     * Create an instance of {@link Max105Text }
     * 
     */
    public Max105Text createMax105Text() {
        return new Max105Text();
    }

    /**
     * Create an instance of {@link PaymentRefusalResponseInfoDetails }
     * 
     */
    public PaymentRefusalResponseInfoDetails createPaymentRefusalResponseInfoDetails() {
        return new PaymentRefusalResponseInfoDetails();
    }

    /**
     * Create an instance of {@link PaymentTransactionList }
     * 
     */
    public PaymentTransactionList createPaymentTransactionList() {
        return new PaymentTransactionList();
    }

    /**
     * Create an instance of {@link PaymentCashDocument }
     * 
     */
    public PaymentCashDocument createPaymentCashDocument() {
        return new PaymentCashDocument();
    }

    /**
     * Create an instance of {@link PaymentCashDetails }
     * 
     */
    public PaymentCashDetails createPaymentCashDetails() {
        return new PaymentCashDetails();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link Max2000Text }
     * 
     */
    public Max2000Text createMax2000Text() {
        return new Max2000Text();
    }

    /**
     * Create an instance of {@link Denominations }
     * 
     */
    public Denominations createDenominations() {
        return new Denominations();
    }

    /**
     * Create an instance of {@link ImmediatePaymentDocument }
     * 
     */
    public ImmediatePaymentDocument createImmediatePaymentDocument() {
        return new ImmediatePaymentDocument();
    }

    /**
     * Create an instance of {@link ImmediatePaymentDetails }
     * 
     */
    public ImmediatePaymentDetails createImmediatePaymentDetails() {
        return new ImmediatePaymentDetails();
    }

    /**
     * Create an instance of {@link CardDetails }
     * 
     */
    public CardDetails createCardDetails() {
        return new CardDetails();
    }

    /**
     * Create an instance of {@link Max25Text }
     * 
     */
    public Max25Text createMax25Text() {
        return new Max25Text();
    }

    /**
     * Create an instance of {@link Max50Text }
     * 
     */
    public Max50Text createMax50Text() {
        return new Max50Text();
    }

    /**
     * Create an instance of {@link CardLimit }
     * 
     */
    public CardLimit createCardLimit() {
        return new CardLimit();
    }

    /**
     * Create an instance of {@link BalanceDetailsType }
     * 
     */
    public BalanceDetailsType createBalanceDetailsType() {
        return new BalanceDetailsType();
    }

    /**
     * Create an instance of {@link CardStatementCriteria }
     * 
     */
    public CardStatementCriteria createCardStatementCriteria() {
        return new CardStatementCriteria();
    }

    /**
     * Create an instance of {@link AccountNumber }
     * 
     */
    public AccountNumber createAccountNumber() {
        return new AccountNumber();
    }

    /**
     * Create an instance of {@link CardCriteria }
     * 
     */
    public CardCriteria createCardCriteria() {
        return new CardCriteria();
    }

    /**
     * Create an instance of {@link StopCardCriteria }
     * 
     */
    public StopCardCriteria createStopCardCriteria() {
        return new StopCardCriteria();
    }

    /**
     * Create an instance of {@link StoppedCardList }
     * 
     */
    public StoppedCardList createStoppedCardList() {
        return new StoppedCardList();
    }

    /**
     * Create an instance of {@link PaymentAddRequest }
     * 
     */
    public PaymentAddRequest createPaymentAddRequest() {
        return new PaymentAddRequest();
    }

    /**
     * Create an instance of {@link PaymentAddResponse }
     * 
     */
    public PaymentAddResponse createPaymentAddResponse() {
        return new PaymentAddResponse();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link Max15Text }
     * 
     */
    public Max15Text createMax15Text() {
        return new Max15Text();
    }

    /**
     * Create an instance of {@link Max16Text }
     * 
     */
    public Max16Text createMax16Text() {
        return new Max16Text();
    }

    /**
     * Create an instance of {@link Max20Text }
     * 
     */
    public Max20Text createMax20Text() {
        return new Max20Text();
    }

    /**
     * Create an instance of {@link Max21Text }
     * 
     */
    public Max21Text createMax21Text() {
        return new Max21Text();
    }

    /**
     * Create an instance of {@link Max34Text }
     * 
     */
    public Max34Text createMax34Text() {
        return new Max34Text();
    }

    /**
     * Create an instance of {@link Min1Max35Text }
     * 
     */
    public Min1Max35Text createMin1Max35Text() {
        return new Min1Max35Text();
    }

    /**
     * Create an instance of {@link Max4Text }
     * 
     */
    public Max4Text createMax4Text() {
        return new Max4Text();
    }

    /**
     * Create an instance of {@link Min1Max70Text }
     * 
     */
    public Min1Max70Text createMin1Max70Text() {
        return new Min1Max70Text();
    }

    /**
     * Create an instance of {@link Min1Max210Text }
     * 
     */
    public Min1Max210Text createMin1Max210Text() {
        return new Min1Max210Text();
    }

    /**
     * Create an instance of {@link Max350Text }
     * 
     */
    public Max350Text createMax350Text() {
        return new Max350Text();
    }

    /**
     * Create an instance of {@link FIIdentType }
     * 
     */
    public FIIdentType createFIIdentType() {
        return new FIIdentType();
    }

    /**
     * Create an instance of {@link AcctIdentType }
     * 
     */
    public AcctIdentType createAcctIdentType() {
        return new AcctIdentType();
    }

    /**
     * Create an instance of {@link DurationType }
     * 
     */
    public DurationType createDurationType() {
        return new DurationType();
    }

    /**
     * Create an instance of {@link CommunicationNumberDetails }
     * 
     */
    public CommunicationNumberDetails createCommunicationNumberDetails() {
        return new CommunicationNumberDetails();
    }

    /**
     * Create an instance of {@link PaymentRefusalDocumentType }
     * 
     */
    public PaymentRefusalDocumentType createPaymentRefusalDocumentType() {
        return new PaymentRefusalDocumentType();
    }

    /**
     * Create an instance of {@link PaymentRefusalStatementType }
     * 
     */
    public PaymentRefusalStatementType createPaymentRefusalStatementType() {
        return new PaymentRefusalStatementType();
    }

    /**
     * Create an instance of {@link PaymentRefusalResponseDocumentType }
     * 
     */
    public PaymentRefusalResponseDocumentType createPaymentRefusalResponseDocumentType() {
        return new PaymentRefusalResponseDocumentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DocumentIdentifier")
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Max210Text }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Max210Text }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Description")
    public JAXBElement<Max210Text> createDescription(Max210Text value) {
        return new JAXBElement<Max210Text>(_Description_QNAME, Max210Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CriteriaInclude", defaultValue = "false")
    public JAXBElement<Boolean> createCriteriaInclude(Boolean value) {
        return new JAXBElement<Boolean>(_CriteriaInclude_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ResponseDetailsOmit", defaultValue = "false")
    public JAXBElement<Boolean> createResponseDetailsOmit(Boolean value) {
        return new JAXBElement<Boolean>(_ResponseDetailsOmit_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Period")
    public JAXBElement<PeriodType> createPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_Period_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PaymentIdentifier")
    public JAXBElement<String> createPaymentIdentifier(String value) {
        return new JAXBElement<String>(_PaymentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtCatCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PmtCatCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PmtCategory")
    public JAXBElement<PmtCatCode> createPmtCategory(PmtCatCode value) {
        return new JAXBElement<PmtCatCode>(_PmtCategory_QNAME, PmtCatCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ExecutionDateRequested")
    public JAXBElement<String> createExecutionDateRequested(String value) {
        return new JAXBElement<String>(_ExecutionDateRequested_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DueDate")
    public JAXBElement<String> createDueDate(String value) {
        return new JAXBElement<String>(_DueDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PayorParty")
    public JAXBElement<Party> createPayorParty(Party value) {
        return new JAXBElement<Party>(_PayorParty_QNAME, Party.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PayeeParty")
    public JAXBElement<Party> createPayeeParty(Party value) {
        return new JAXBElement<Party>(_PayeeParty_QNAME, Party.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PayorAccount")
    public JAXBElement<Account> createPayorAccount(Account value) {
        return new JAXBElement<Account>(_PayorAccount_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PayeeAccount")
    public JAXBElement<Account> createPayeeAccount(Account value) {
        return new JAXBElement<Account>(_PayeeAccount_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ChargeAccount")
    public JAXBElement<Account> createChargeAccount(Account value) {
        return new JAXBElement<Account>(_ChargeAccount_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PayorFinancialInstitution")
    public JAXBElement<FinancialInstitution> createPayorFinancialInstitution(FinancialInstitution value) {
        return new JAXBElement<FinancialInstitution>(_PayorFinancialInstitution_QNAME, FinancialInstitution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PayeeFinancialInstitution")
    public JAXBElement<FinancialInstitution> createPayeeFinancialInstitution(FinancialInstitution value) {
        return new JAXBElement<FinancialInstitution>(_PayeeFinancialInstitution_QNAME, FinancialInstitution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Max210Text }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Max210Text }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PmtAdditionalInformation")
    public JAXBElement<Max210Text> createPmtAdditionalInformation(Max210Text value) {
        return new JAXBElement<Max210Text>(_PmtAdditionalInformation_QNAME, Max210Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TransactionIdentifier")
    public JAXBElement<String> createTransactionIdentifier(String value) {
        return new JAXBElement<String>(_TransactionIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsibilityCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponsibilityCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Responsibility")
    public JAXBElement<ResponsibilityCode> createResponsibility(ResponsibilityCode value) {
        return new JAXBElement<ResponsibilityCode>(_Responsibility_QNAME, ResponsibilityCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ImmediatePmt")
    public JAXBElement<Boolean> createImmediatePmt(Boolean value) {
        return new JAXBElement<Boolean>(_ImmediatePmt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "OrderedAmount")
    public JAXBElement<AmountType> createOrderedAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OrderedAmount_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CustomerPayeeIdentifier")
    public JAXBElement<String> createCustomerPayeeIdentifier(String value) {
        return new JAXBElement<String>(_CustomerPayeeIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BankServerPaymentIdentifier")
    public JAXBElement<String> createBankServerPaymentIdentifier(String value) {
        return new JAXBElement<String>(_BankServerPaymentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BankTransactionIdentifier")
    public JAXBElement<String> createBankTransactionIdentifier(String value) {
        return new JAXBElement<String>(_BankTransactionIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsibilityCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponsibilityCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ChargeResponsibility")
    public JAXBElement<ResponsibilityCode> createChargeResponsibility(ResponsibilityCode value) {
        return new JAXBElement<ResponsibilityCode>(_ChargeResponsibility_QNAME, ResponsibilityCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AdditionalDetails")
    public JAXBElement<AdditionalDetailsType> createAdditionalDetails(AdditionalDetailsType value) {
        return new JAXBElement<AdditionalDetailsType>(_AdditionalDetails_QNAME, AdditionalDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PaymentStatus")
    public JAXBElement<PaymentStatusType> createPaymentStatus(PaymentStatusType value) {
        return new JAXBElement<PaymentStatusType>(_PaymentStatus_QNAME, PaymentStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionRejectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransactionRejectionType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PaymentRejectionInfo")
    public JAXBElement<TransactionRejectionType> createPaymentRejectionInfo(TransactionRejectionType value) {
        return new JAXBElement<TransactionRejectionType>(_PaymentRejectionInfo_QNAME, TransactionRejectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DebitAmount")
    public JAXBElement<AmountType> createDebitAmount(AmountType value) {
        return new JAXBElement<AmountType>(_DebitAmount_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalDeclarationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalDeclarationType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AdditionalDeclaration")
    public JAXBElement<AdditionalDeclarationType> createAdditionalDeclaration(AdditionalDeclarationType value) {
        return new JAXBElement<AdditionalDeclarationType>(_AdditionalDeclaration_QNAME, AdditionalDeclarationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionRejectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransactionRejectionType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TransactionRejection")
    public JAXBElement<TransactionRejectionType> createTransactionRejection(TransactionRejectionType value) {
        return new JAXBElement<TransactionRejectionType>(_TransactionRejection_QNAME, TransactionRejectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SoldCheque")
    public JAXBElement<String> createSoldCheque(String value) {
        return new JAXBElement<String>(_SoldCheque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtCashCatCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PmtCashCatCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PmtCashCategory")
    public JAXBElement<PmtCashCatCode> createPmtCashCategory(PmtCashCatCode value) {
        return new JAXBElement<PmtCashCatCode>(_PmtCashCategory_QNAME, PmtCashCatCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardStatusCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardStatus")
    public JAXBElement<CardStatusCode> createCardStatus(CardStatusCode value) {
        return new JAXBElement<CardStatusCode>(_CardStatus_QNAME, CardStatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatInfoTypeCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardStatInfoTypeCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardStatementInfoType")
    public JAXBElement<CardStatInfoTypeCode> createCardStatementInfoType(CardStatInfoTypeCode value) {
        return new JAXBElement<CardStatInfoTypeCode>(_CardStatementInfoType_QNAME, CardStatInfoTypeCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTransactionStatusCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTransactionStatusCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardTransactionStatus")
    public JAXBElement<CardTransactionStatusCode> createCardTransactionStatus(CardTransactionStatusCode value) {
        return new JAXBElement<CardTransactionStatusCode>(_CardTransactionStatus_QNAME, CardTransactionStatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ReversalIndicator", defaultValue = "false")
    public JAXBElement<Boolean> createReversalIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ReversalIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatInfoTypeCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardStatInfoTypeCode }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardStatementInfoType", scope = CardStatementCriteria.class)
    public JAXBElement<CardStatInfoTypeCode> createCardStatementCriteriaCardStatementInfoType(CardStatInfoTypeCode value) {
        return new JAXBElement<CardStatInfoTypeCode>(_CardStatementInfoType_QNAME, CardStatInfoTypeCode.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "StartDate", scope = CardStatementCriteria.class)
    public JAXBElement<String> createCardStatementCriteriaStartDate(String value) {
        return new JAXBElement<String>(_CardStatementCriteriaStartDate_QNAME, String.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "EndDate", scope = CardStatementCriteria.class)
    public JAXBElement<String> createCardStatementCriteriaEndDate(String value) {
        return new JAXBElement<String>(_CardStatementCriteriaEndDate_QNAME, String.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardAccountOwner", scope = CardStatementCriteria.class)
    public JAXBElement<Party> createCardStatementCriteriaCardAccountOwner(Party value) {
        return new JAXBElement<Party>(_CardStatementCriteriaCardAccountOwner_QNAME, Party.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountNumber }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CustomerAccount", scope = CardStatementCriteria.class)
    public JAXBElement<AccountNumber> createCardStatementCriteriaCustomerAccount(AccountNumber value) {
        return new JAXBElement<AccountNumber>(_CardStatementCriteriaCustomerAccount_QNAME, AccountNumber.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountNumber }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardAccount", scope = CardStatementCriteria.class)
    public JAXBElement<AccountNumber> createCardStatementCriteriaCardAccount(AccountNumber value) {
        return new JAXBElement<AccountNumber>(_CardStatementCriteriaCardAccount_QNAME, AccountNumber.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardFinancialInstitution", scope = CardStatementCriteria.class)
    public JAXBElement<FinancialInstitution> createCardStatementCriteriaCardFinancialInstitution(FinancialInstitution value) {
        return new JAXBElement<FinancialInstitution>(_CardStatementCriteriaCardFinancialInstitution_QNAME, FinancialInstitution.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CustomerFinancialInstitution", scope = CardStatementCriteria.class)
    public JAXBElement<FinancialInstitution> createCardStatementCriteriaCustomerFinancialInstitution(FinancialInstitution value) {
        return new JAXBElement<FinancialInstitution>(_CardStatementCriteriaCustomerFinancialInstitution_QNAME, FinancialInstitution.class, CardStatementCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Party }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardAccountOwner", scope = StopCardCriteria.class)
    public JAXBElement<Party> createStopCardCriteriaCardAccountOwner(Party value) {
        return new JAXBElement<Party>(_CardStatementCriteriaCardAccountOwner_QNAME, Party.class, StopCardCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountNumber }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardAccount", scope = StopCardCriteria.class)
    public JAXBElement<AccountNumber> createStopCardCriteriaCardAccount(AccountNumber value) {
        return new JAXBElement<AccountNumber>(_CardStatementCriteriaCardAccount_QNAME, AccountNumber.class, StopCardCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinancialInstitution }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CardFinancialInstitution", scope = StopCardCriteria.class)
    public JAXBElement<FinancialInstitution> createStopCardCriteriaCardFinancialInstitution(FinancialInstitution value) {
        return new JAXBElement<FinancialInstitution>(_CardStatementCriteriaCardFinancialInstitution_QNAME, FinancialInstitution.class, StopCardCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Max35Text }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Max35Text }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AdditionalInformationType", scope = StopCardCriteria.class)
    public JAXBElement<Max35Text> createStopCardCriteriaAdditionalInformationType(Max35Text value) {
        return new JAXBElement<Max35Text>(_StopCardCriteriaAdditionalInformationType_QNAME, Max35Text.class, StopCardCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Max70Text }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Max70Text }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AdditionalInformation", scope = StopCardCriteria.class)
    public JAXBElement<Max70Text> createStopCardCriteriaAdditionalInformation(Max70Text value) {
        return new JAXBElement<Max70Text>(_StopCardCriteriaAdditionalInformation_QNAME, Max70Text.class, StopCardCriteria.class, value);
    }

}
