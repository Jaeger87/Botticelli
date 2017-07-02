package com.botticelli.bot.request.methods;

import java.util.Map;

public class PromoteChatMemberRequest extends AbstractToSend{

	private long user_id;
	private boolean can_change_info;
	private boolean can_post_messages;
	private boolean can_edit_messages;
	private boolean can_delete_messages;
	private boolean can_invite_users;
	private boolean can_restrict_members;
	private boolean can_pin_messages;
	private boolean can_promote_members;
	
	public PromoteChatMemberRequest(long chat_id, long user_id) 
	{
		super(chat_id);
		this.user_id = user_id;
	}
	
	@Override
	public Map<String, Object> getValuesMap()
	{
		Map <String, Object> map = super.getValuesMap();
		map.put("user_id", user_id);
		map.put("can_change_info", can_change_info);
		map.put("can_post_messages", can_post_messages);
		map.put("can_edit_messages", can_edit_messages);
		map.put("can_delete_messages", can_delete_messages);
		map.put("can_invite_users", can_invite_users);
		map.put("can_restrict_members", can_restrict_members);
		map.put("can_pin_messages", can_pin_messages);
		map.put("can_promote_members", can_promote_members);
		return map;
	}


	public boolean isCan_change_info() 
	{
		return can_change_info;
	}


	public void setCan_change_info(boolean can_change_info) 
	{
		this.can_change_info = can_change_info;
	}


	public boolean isCan_post_messages() 
	{
		return can_post_messages;
	}


	public void setCan_post_messages(boolean can_post_messages) 
	{
		this.can_post_messages = can_post_messages;
	}


	public boolean isCan_edit_messages() 
	{
		return can_edit_messages;
	}


	public void setCan_edit_messages(boolean can_edit_messages) 
	{
		this.can_edit_messages = can_edit_messages;
	}


	public boolean isCan_delete_messages() 
	{
		return can_delete_messages;
	}


	public void setCan_delete_messages(boolean can_delete_messages) 
	{
		this.can_delete_messages = can_delete_messages;
	}


	public boolean isCan_invite_users() 
	{
		return can_invite_users;
	}


	public void setCan_invite_users(boolean can_invite_users)
	{
		this.can_invite_users = can_invite_users;
	}


	public boolean isCan_restrict_members() 
	{
		return can_restrict_members;
	}


	public void setCan_restrict_members(boolean can_restrict_members) 
	{
		this.can_restrict_members = can_restrict_members;
	}


	public boolean isCan_pin_messages() 
	{
		return can_pin_messages;
	}


	public void setCan_pin_messages(boolean can_pin_messages) 
	{
		this.can_pin_messages = can_pin_messages;
	}


	public boolean isCan_promote_members() 
	{
		return can_promote_members;
	}


	public void setCan_promote_members(boolean can_promote_members) 
	{
		this.can_promote_members = can_promote_members;
	}
	
	
}
