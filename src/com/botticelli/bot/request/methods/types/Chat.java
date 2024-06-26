package com.botticelli.bot.request.methods.types;

/**
 * This object represent a generic Chat.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Chat extends User{

	
	private String type;
	private String title;
	private boolean all_members_are_administrators;
	private ChatPhoto photo;
	private String description;
	private String invite_link;
	private String pinned_message;
	private String sticker_set_name;
	
	/**
	 * Type of chat, can be either “private”, “group”, “supergroup” or “channel”
	 * @return
	 */
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	/**
	 * 
	 * @return
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public boolean isAll_members_are_administrators() 
	{
		return all_members_are_administrators;
	}

	public void setAll_members_are_administrators(boolean all_members_are_administrators) 
	{
		this.all_members_are_administrators = all_members_are_administrators;
	}

	public ChatPhoto getPhoto() {
		return photo;
	}

	public void setPhoto(ChatPhoto photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getInvite_link() 
	{
		return invite_link;
	}

	public void setInvite_link(String invite_link) 
	{
		this.invite_link = invite_link;
	}

	public String getPinned_message() 
	{
		return pinned_message;
	}

	public void setPinned_message(String pinned_message) 
	{
		this.pinned_message = pinned_message;
	}

	public String getSticker_set_name() 
	{
		return sticker_set_name;
	}

	public void setSticker_set_name(String sticker_set_name) 
	{
		this.sticker_set_name = sticker_set_name;
	}
}
