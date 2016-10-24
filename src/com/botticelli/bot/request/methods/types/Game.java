package com.botticelli.bot.request.methods.types;

import java.util.List;

public class Game {
	
	private String title;
	private String description;
	private List<PhotoSize> photo;
	private String text;
	private List<MessageEntity> text_entities;
	private Animation animation;
	
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public List<PhotoSize> getPhoto() 
	{
		return photo;
	}
	
	public void setPhoto(List<PhotoSize> photo)
	{
		this.photo = photo;
	}
	
	public String getText() 
	{
		return text;
	}
	
	public void setText(String text) 
	{
		this.text = text;
	}
	
	public List<MessageEntity> getText_entities()
	{
		return text_entities;
	}
	
	public void setText_entities(List<MessageEntity> text_entities)
	{
		this.text_entities = text_entities;
	}
	
	public Animation getAnimation() 
	{
		return animation;
	}
	
	public void setAnimation(Animation animation)
	{
		this.animation = animation;
	}
	
	

}
