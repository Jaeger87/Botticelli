package com.botticelli.bot.request.methods;

import java.util.List;
import java.util.Map;

import com.botticelli.bot.request.methods.types.Currency;
import com.botticelli.bot.request.methods.types.LabeledPrice;

public class SendInvoice extends AbstractReplyManageToSend{

	
	private String title;
	private String description;
	private String payload;
	private String provider_token;
	private String start_parameter;
	private Currency currency;
	private List<LabeledPrice> prices;
	private String photo_url;
	private String provider_data;
	private int photo_size;
	private int photo_width;
	private int photo_height;
	private boolean need_name;
	private boolean need_phone_number;
	private boolean need_email;
	private boolean need_shipping_address;
	private boolean is_flexible;
	private boolean send_phone_number_to_provider;
	private boolean send_email_to_provider;

	@Override
	public Map<String, Object> getValuesMap()
	{
		Map<String, Object> map = super.getValuesMap();
		map.put("title", title);
		map.put("description", description);
		map.put("payload", payload);
		map.put("provider_token", provider_token);
		map.put("start_parameter", start_parameter);
		map.put("currency", currency);
		map.put("prices", prices);
		map.put("photo_url", photo_url);
		map.put("provider_data", provider_data);
		map.put("photo_size", photo_size);
		map.put("photo_width", photo_width);
		map.put("photo_height", photo_height);
		map.put("need_name", need_name);	
		map.put("need_phone_number", need_phone_number);
		map.put("need_email", need_email);
		map.put("need_shipping_address", need_shipping_address);
		map.put("is_flexible", is_flexible);
		map.put("send_phone_number_to_provider", send_phone_number_to_provider);
		map.put("send_email_to_provider", send_email_to_provider);
		return map;
	}

	public SendInvoice(long chat_id, String title, String description, String payload, String provider_token,
			String start_parameter, Currency currency, List<LabeledPrice> prices) 
	{
		super(chat_id);
		this.title = title;
		this.description = description;
		this.payload = payload;
		this.provider_token = provider_token;
		this.start_parameter = start_parameter;
		this.currency = currency;
		this.prices = prices;
	}

	public String getPhotoUrl() 
	{
		return photo_url;
	}

	public void setPhotoUrl(String photo_url) 
	{
		this.photo_url = photo_url;
	}

	public int getPhotoSize() 
	{
		return photo_size;
	}

	public void setPhotoSize(int photo_size)
	{
		this.photo_size = photo_size;
	}

	public int getPhotoWidth() 
	{
		return photo_width;
	}

	public void setPhotoWidth(int photo_width) 
	{
		this.photo_width = photo_width;
	}

	public int getPhotoHeight()
	{
		return photo_height;
	}

	public void setPhotoHeight(int photo_height) 
	{
		this.photo_height = photo_height;
	}

	public boolean isNeedName()
	{
		return need_name;
	}

	public void setNeedName(boolean need_name) 
	{
		this.need_name = need_name;
	}

	public boolean isNeed_phone_number() 
	{
		return need_phone_number;
	}

	public void setNeedPhoneNumber(boolean need_phone_number)
	{
		this.need_phone_number = need_phone_number;
	}

	public boolean isNeedEmail()
	{
		return need_email;
	}

	public void setNeedEmail(boolean need_email) 
	{
		this.need_email = need_email;
	}

	public boolean isNeedShippingAddress() 
	{
		return need_shipping_address;
	}

	public void setNeedShippingAddress(boolean need_shipping_address) 
	{
		this.need_shipping_address = need_shipping_address;
	}

	public String getProvider_data() {
		return provider_data;
	}

	public void setProvider_data(String provider_data) {
		this.provider_data = provider_data;
	}

	public boolean isIsFlexible()
	{
		return is_flexible;
	}

	public void setIsFlexible(boolean is_flexible) 
	{
		this.is_flexible = is_flexible;
	}

	public boolean isSend_email_to_provider() {
		return send_email_to_provider;
	}

	public void setSend_email_to_provider(boolean send_email_to_provider) {
		this.send_email_to_provider = send_email_to_provider;
	}

	public boolean isSend_phone_number_to_provider() {
		return send_phone_number_to_provider;
	}

	public void setSend_phone_number_to_provider(boolean send_phone_number_to_provider) {
		this.send_phone_number_to_provider = send_phone_number_to_provider;
	}
}
