package cristianosilva.APIHotmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Cristiano Silva Entidade é a class espelho da tabela do banco de
 * dados
 */
@Entity
@Table(name = "compra")

public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "callback_type")
    private Long callback_type;
    @Column(name = "hottok")
    private String hottok;
    @Column(name = "aff")
    private String aff;
    @Column(name = "currency")
    private String currency;
    @Column(name = "transaction")
    private String transaction;
    @Column(name = "xcod")
    private String xcod;
    @Column(name = "payment_type")
    private String payment_type;
    @Column(name = "payment_engine")
    private String payment_engine;
    @Column(name = "status")
    private String status;
    @Column(name = "prod")
    private String prod;
    @Column(name = "prod_name")
    private String prod_name;
    @Column(name = "producer_name")
    private String producer_name;
    @Column(name = "producer_document")
    private String producer_document;
    @Column(name = "producer_legal_nature")
    private String producer_legal_nature;
    @Column(name = "transaction_ext")
    private String transaction_ext;
    @Column(name = "purchase_date")
    private String purchase_date;
    @Column(name = "confirmation_purchase_date")
    private String confirmation_purchase_date;
    @Column(name = "currency_code_from")
    private String currency_code_from;
    @Column(name = "currency_code_from_")
    private String currency_code_from_;
    @Column(name = "original_offer_price")
    private double original_offer_price;
    @Column(name = "productofferpaymentmode")
    private String productOfferPaymentMode;
    @Column(name = "warranty_date")
    private String warranty_date;
    @Column(name = "receiver_type")
    private String receiver_type;
    @Column(name = "installments_number")
    private int installments_number;
    @Column(name = "funnel")
    private String funnel;
    @Column(name = "order_bump")
    private String order_bump;
    @Column(name = "cms_marketplace")
    private double cms_marketplace;
    @Column(name = "cms_vendor")
    private double cms_vendor;
    @Column(name = "off")
    private String off;
    @Column(name = "price")
    private double price;
    @Column(name = "full_price")
    private double full_price;
    @Column(name = "subscriber_code")
    private String subscriber_code;
    @Column(name = "signature_status")
    private String signature_status;
    @Column(name = "subscription_status")
    private String subscription_status;
    @Column(name = "name_subscription_plan")
    private String name_subscription_plan;
    @Column(name = "has_co_production")
    private String has_co_production;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "phone_checkout_local_code")
    private String phone_checkout_local_code;
    @Column(name = "phone_checkout_number")
    private String phone_checkout_number;
    @Column(name = "sck")
    private String sck;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCallback_type() {
        return callback_type;
    }

    public void setCallback_type(Long callback_type) {
        this.callback_type = callback_type;
    }

    public String getHottok() {
        return hottok;
    }

    public void setHottok(String hottok) {
        this.hottok = hottok;
    }

    public String getAff() {
        return aff;
    }

    public void setAff(String aff) {
        this.aff = aff;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getXcod() {
        return xcod;
    }

    public void setXcod(String xcod) {
        this.xcod = xcod;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getPayment_engine() {
        return payment_engine;
    }

    public void setPayment_engine(String payment_engine) {
        this.payment_engine = payment_engine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProducer_name() {
        return producer_name;
    }

    public void setProducer_name(String producer_name) {
        this.producer_name = producer_name;
    }

    public String getProducer_document() {
        return producer_document;
    }

    public void setProducer_document(String producer_document) {
        this.producer_document = producer_document;
    }

    public String getProducer_legal_nature() {
        return producer_legal_nature;
    }

    public void setProducer_legal_nature(String producer_legal_nature) {
        this.producer_legal_nature = producer_legal_nature;
    }

    public String getTransaction_ext() {
        return transaction_ext;
    }

    public void setTransaction_ext(String transaction_ext) {
        this.transaction_ext = transaction_ext;
    }

    public String getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getConfirmation_purchase_date() {
        return confirmation_purchase_date;
    }

    public void setConfirmation_purchase_date(String confirmation_purchase_date) {
        this.confirmation_purchase_date = confirmation_purchase_date;
    }

    public String getCurrency_code_from() {
        return currency_code_from;
    }

    public void setCurrency_code_from(String currency_code_from) {
        this.currency_code_from = currency_code_from;
    }

    public String getCurrency_code_from_() {
        return currency_code_from_;
    }

    public void setCurrency_code_from_(String currency_code_from_) {
        this.currency_code_from_ = currency_code_from_;
    }

    public double getOriginal_offer_price() {
        return original_offer_price;
    }

    public void setOriginal_offer_price(double original_offer_price) {
        this.original_offer_price = original_offer_price;
    }

    public String getProductOfferPaymentMode() {
        return productOfferPaymentMode;
    }

    public void setProductOfferPaymentMode(String productOfferPaymentMode) {
        this.productOfferPaymentMode = productOfferPaymentMode;
    }

    public String getWarranty_date() {
        return warranty_date;
    }

    public void setWarranty_date(String warranty_date) {
        this.warranty_date = warranty_date;
    }

    public String getReceiver_type() {
        return receiver_type;
    }

    public void setReceiver_type(String receiver_type) {
        this.receiver_type = receiver_type;
    }

    public int getInstallments_number() {
        return installments_number;
    }

    public void setInstallments_number(int installments_number) {
        this.installments_number = installments_number;
    }

    public String getFunnel() {
        return funnel;
    }

    public void setFunnel(String funnel) {
        this.funnel = funnel;
    }

    public String getOrder_bump() {
        return order_bump;
    }

    public void setOrder_bump(String order_bump) {
        this.order_bump = order_bump;
    }

    public double getCms_marketplace() {
        return cms_marketplace;
    }

    public void setCms_marketplace(double cms_marketplace) {
        this.cms_marketplace = cms_marketplace;
    }

    public double getCms_vendor() {
        return cms_vendor;
    }

    public void setCms_vendor(double cms_vendor) {
        this.cms_vendor = cms_vendor;
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFull_price() {
        return full_price;
    }

    public void setFull_price(double full_price) {
        this.full_price = full_price;
    }

    public String getSubscriber_code() {
        return subscriber_code;
    }

    public void setSubscriber_code(String subscriber_code) {
        this.subscriber_code = subscriber_code;
    }

    public String getSignature_status() {
        return signature_status;
    }

    public void setSignature_status(String signature_status) {
        this.signature_status = signature_status;
    }

    public String getSubscription_status() {
        return subscription_status;
    }

    public void setSubscription_status(String subscription_status) {
        this.subscription_status = subscription_status;
    }

    public String getName_subscription_plan() {
        return name_subscription_plan;
    }

    public void setName_subscription_plan(String name_subscription_plan) {
        this.name_subscription_plan = name_subscription_plan;
    }

    public String getHas_co_production() {
        return has_co_production;
    }

    public void setHas_co_production(String has_co_production) {
        this.has_co_production = has_co_production;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_checkout_local_code() {
        return phone_checkout_local_code;
    }

    public void setPhone_checkout_local_code(String phone_checkout_local_code) {
        this.phone_checkout_local_code = phone_checkout_local_code;
    }

    public String getPhone_checkout_number() {
        return phone_checkout_number;
    }

    public void setPhone_checkout_number(String phone_checkout_number) {
        this.phone_checkout_number = phone_checkout_number;
    }

    public String getSck() {
        return sck;
    }

    public void setSck(String sck) {
        this.sck = sck;
    }

    
    
}
/*    
   @Column(name = "transaction")
    private Long transaction;

    @Column(name = "status")
    private String status;

    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "prod")
    private String prod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransaction() {
        return transaction;
    }

    public void setTransaction(Long transaction) {
        this.transaction = transaction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }
 */
