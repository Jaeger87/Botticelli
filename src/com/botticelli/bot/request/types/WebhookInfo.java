package com.botticelli.bot.request.types;

public class WebhookInfo {

	private String url;
	private boolean has_custom_certificate;
	private int pending_update_count;
	private int last_error_date;
	private String last_error_message;
	
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url) 
	{
		this.url = url;
	}
	
	public boolean isHas_custom_certificate()
	{
		return has_custom_certificate;
	}
	
	public void setHas_custom_certificate(boolean has_custom_certificate) 
	{
		this.has_custom_certificate = has_custom_certificate;
	}
	
	public int getPending_update_count() 
	{
		return pending_update_count;
	}
	
	public void setPending_update_count(int pending_update_count)
	{
		this.pending_update_count = pending_update_count;
	}
	
	public int getLast_error_date() 
	{
		return last_error_date;
	}
	
	public void setLast_error_date(int last_error_date)
	{
		this.last_error_date = last_error_date;
	}
	
	public String getLast_error_message() 
	{
		return last_error_message;
	}
	
	public void setLast_error_message(String last_error_message)
	{
		this.last_error_message = last_error_message;
	}
	
	
	
	
}
