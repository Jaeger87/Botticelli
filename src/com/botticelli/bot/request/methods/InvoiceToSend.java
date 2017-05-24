package com.botticelli.bot.request.methods;

public class InvoiceToSend extends AbstractReplyManageToSend{

	private String title;
	private String description;
	private String payload;
	private String provider_token;
	private String start_parameter;
	private String currency;
	
	
	
	public InvoiceToSend(long chat_id) {
		super(chat_id);
		// TODO Auto-generated constructor stub
	}

}
