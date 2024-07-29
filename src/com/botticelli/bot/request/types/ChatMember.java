package com.botticelli.bot.request.types;

public class ChatMember {

	private User user;
	
	private MemberStatus status;

	private long until_date;
	
	private boolean can_be_edited;
	
	private boolean can_change_info;
	
	private boolean can_post_messages;
	
	private boolean can_edit_messages;
	
	private boolean can_delete_messages;
	
	private boolean can_invite_users;
	
	private boolean can_restrict_members;
	
	private boolean can_pin_messages;
	
	private boolean can_promote_members;
	
	private boolean can_send_messages;
	
	private boolean can_send_media_messages;
	
	private boolean can_send_other_messages;
	
	private boolean can_add_web_page_previews;
	
	public User getUser() 
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}

	public MemberStatus getStatus() 
	{
		return status;
	}

	public void setStatus(MemberStatus status) 
	{
		this.status = status;
	}

	public long getUntil_date() 
	{
		return until_date;
	}

	public void setUntil_date(long until_date) 
	{
		this.until_date = until_date;
	}

	public boolean isCan_be_edited() 
	{
		return can_be_edited;
	}

	public void setCan_be_edited(boolean can_be_edited) 
	{
		this.can_be_edited = can_be_edited;
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

	public boolean isCan_send_messages() 
	{
		return can_send_messages;
	}

	public void setCan_send_messages(boolean can_send_messages) 
	{
		this.can_send_messages = can_send_messages;
	}

	public boolean isCan_send_media_messages() 
	{
		return can_send_media_messages;
	}

	public void setCan_send_media_messages(boolean can_send_media_messages) 
	{
		this.can_send_media_messages = can_send_media_messages;
	}

	public boolean isCan_send_other_messages() 
	{
		return can_send_other_messages;
	}

	public void setCan_send_other_messages(boolean can_send_other_messages) 
	{
		this.can_send_other_messages = can_send_other_messages;
	}

	public boolean isCan_add_web_page_previews() 
	{
		return can_add_web_page_previews;
	}

	public void setCan_add_web_page_previews(boolean can_add_web_page_previews) 
	{
		this.can_add_web_page_previews = can_add_web_page_previews;
	}

	
	
	
	
}
