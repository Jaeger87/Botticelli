package com.botticelli.bot.request.methods.types;

public class SuccessfulPayment {

	private String currency;
	private int total_amount;
	private String invoice_payload;
	private String shipping_option_id;
	private OrderInfo order_info;
	private String telegram_payment_charge_id;
	private String provider_payment_charge_id;
	
	
	public String getCurrency() 
	{
		return currency;
	}
	
	public void setCurrency(String currency) 
	{
		this.currency = currency;
	}
	
	public int getTotalAmount() 
	{
		return total_amount;
	}
	
	public void setTotalAmount(int total_amount) 
	{
		this.total_amount = total_amount;
	}
	
	public String getInvoicePayload() 
	{
		return invoice_payload;
	}
	public void setInvoicePayload(String invoice_payload) 
	{
		this.invoice_payload = invoice_payload;
	}
	public String getShippingOption_id() {
		return shipping_option_id;
	}
	
	public void setShippingOption_id(String shipping_option_id) 
	{
		this.shipping_option_id = shipping_option_id;
	}
	
	public OrderInfo getOrderInfo() 
	{
		return order_info;
	}
	
	public void setOrderInfo(OrderInfo order_info) 
	{
		this.order_info = order_info;
	}
	
	public String getTelegramPayment_charge_id() 
	{
		return telegram_payment_charge_id;
	}
	
	public void setTelegramPaymentChargeId(String telegram_payment_charge_id) 
	{
		this.telegram_payment_charge_id = telegram_payment_charge_id;
	}
	
	public String getProviderPaymentChargeId() 
	{
		return provider_payment_charge_id;
	}
	
	public void setProviderPaymentChargeId(String provider_payment_charge_id) 
	{
		this.provider_payment_charge_id = provider_payment_charge_id;
	}
	
	
	
	
	
}
