package com.botticelli.bot.request.methods;

import java.util.List;
import java.util.Map;

import com.botticelli.bot.request.types.LabeledPrice;

public class InvoiceToSend extends AbstractReplyManageToSend{

	private String title;
	private String description;
	private String payload;
	private String provider_token;
	private String start_parameter;
	private String currency;
	private List<LabeledPrice> prices;
	private String provider_data;
	private String photo_url;
	private int photo_size;
	private int photo_width;
	private int photo_height;
	private boolean need_name;
	private boolean need_phone_number;
	private boolean need_email;
	private boolean need_shipping_address;
	private boolean is_flexible;
	private boolean disable_notification;
	private boolean send_phone_number_to_provider;
	private boolean send_email_to_provider;

	private boolean protect_content;
	private String message_effect_id;

	public InvoiceToSend(long chat_id, String title, String description, String payload, String provider_token,
			String start_parameter, String currency, List<LabeledPrice> prices) {
		super(chat_id);
		this.title = title;
		this.description = description;
		this.payload = payload;
		this.provider_token = provider_token;
		this.start_parameter = start_parameter;
		this.currency = currency;
		this.prices = prices;
	}

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
		map.put("protect_content", protect_content);
		map.put("message_effect_id", message_effect_id);
		return map;
	}


	public String getProvider_data()
	{
		return provider_data;
	}


	public void setProvider_data(String provider_data)
	{
		this.provider_data = provider_data;
	}


	public String getPhoto_url() 
	{
		return photo_url;
	}


	public void setPhoto_url(String photo_url)
	{
		this.photo_url = photo_url;
	}


	public int getPhoto_size()
	{
		return photo_size;
	}


	public void setPhoto_size(int photo_size) 
	{
		this.photo_size = photo_size;
	}


	public int getPhoto_width()
	{
		return photo_width;
	}


	public void setPhoto_width(int photo_width) 
	{
		this.photo_width = photo_width;
	}


	public int getPhoto_height() 
	{
		return photo_height;
	}


	public void setPhoto_height(int photo_height) 
	{
		this.photo_height = photo_height;
	}


	public boolean isNeed_name() 
	{
		return need_name;
	}


	public void setNeed_name(boolean need_name) 
	{
		this.need_name = need_name;
	}


	public boolean isNeed_phone_number()
	{
		return need_phone_number;
	}


	public void setNeed_phone_number(boolean need_phone_number) 
	{
		this.need_phone_number = need_phone_number;
	}


	public boolean isNeed_email() 
	{
		return need_email;
	}


	public void setNeed_email(boolean need_email) 
	{
		this.need_email = need_email;
	}


	public boolean isNeed_shipping_address() 
	{
		return need_shipping_address;
	}


	public void setNeed_shipping_address(boolean need_shipping_address) 
	{
		this.need_shipping_address = need_shipping_address;
	}


	public boolean isIs_flexible()
	{
		return is_flexible;
	}


	public void setIs_flexible(boolean is_flexible) 
	{
		this.is_flexible = is_flexible;
	}


	public boolean isDisable_notification() 
	{
		return disable_notification;
	}


	public void setDisable_notification(boolean disable_notification)
	{
		this.disable_notification = disable_notification;
	}



	public String getMessage_effect_id() {
		return message_effect_id;
	}

	public void setMessage_effect_id(String message_effect_id) {
		this.message_effect_id = message_effect_id;
	}

	public boolean isProtect_content() {
		return protect_content;
	}

	public void setProtect_content(boolean protect_content) {
		this.protect_content = protect_content;
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
