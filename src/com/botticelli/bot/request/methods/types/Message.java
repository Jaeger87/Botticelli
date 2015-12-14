package com.botticelli.bot.request.methods.types;

import java.util.ArrayList;
import java.util.List;

/**
 * This object represents a message.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class Message {
	
	private int message_id;
	
	private User from;
	
	private int date;
	
	private User chat;
	
	private User forward_from;
	
	private int forward_date;
	
	private Message reply_to_message;
	
	private String text;
	
	private Audio audio;
	
	private Document document;
	
	private List<PhotoSize> photo;
	
	private Sticker sticker;
	
	private Video video;
	
	private Voice voice;
	
	private String caption;
	
	private Contact contact;
	
	private Location location;
	
	private User new_chat_participant;
	
	private User left_chat_participant;
	
	private String new_chat_title;
	
	private List<PhotoSize> new_chat_photo;
	
	private boolean delete_chat_photo;
	
	private boolean group_chat_created;
	
	private boolean supergroup_chat_created;


	/**
	 * Unique message identifier
	 * @return
	 */
	public int getMessageID()
	{
		return message_id;
	}
	
	/**
	 * Set the unique message identifier
	 */
	public void setMessageID(int message_id)
	{
		this.message_id = message_id;
	}
	
	/**
	 * Sender
	 * @return
	 */
	public User getFrom()
	{
		return from;
	}
	
	/**
	 * Set the sender
	 */
	public void setFrom(User from)
	{
		this.from = from;
	}
	
	/**
	 * Date the message was sent in Unix time
	 * @return
	 */
	public int getDate()
	{
		return date;
	}
	
	/**
	 * Set the date the message was sent in Unix time
	 * @param date
	 */
	public void setDate(int date)
	{
		this.date = date;
	}
	
	/**
	 * Optional. For forwarded messages, sender of the original message
	 * @return
	 */
	public User getForwardFrom()
	{
		return forward_from;
	}
	
	/**
	 * Optional. For forwarded messages, set the sender of the original message
	 * @param forward_from
	 */
	public void setForwardFrom(User forward_from)
	{
		this.forward_from = forward_from;
	}
	
	
	/**
	 * Optional. For forwarded messages, date the original message was sent in Unix time
	 * @return
	 */
	public int getForwardDate()
	{
		return forward_date;
	}
	
	/**
	 * Optional. For forwarded messages, set the date the original message was sent in Unix time
	 * @return
	 */
	public void setForwardDate(int forward_date)
	{
		this.forward_date = forward_date;
	}
	
	/**
	 * Optional. For replies, the original message. 
	 * Note that the Message object in this field will not contain further reply_to_message fields
	 * even if it itself is a reply.
	 * @return
	 */
	public Message getReplyToMessage()
	{
		return reply_to_message;
	}
	
	/**
	 * Optional. For replies, set the original message. 
	 * Note that the Message object in this field will not contain further reply_to_message fields
	 * even if it itself is a reply.
	 * @return
	 * @param reply_to_message
	 */
	public void setReplyToMessage(Message reply_to_message)
	{
		this.reply_to_message = reply_to_message;
	}
	
	/**
	 * Optional. For text messages, the actual UTF-8 text of the message
	 * @return
	 */
	public String getText()
	{
		return text;
	}
	
	/**
	 * Optional. For text messages, set the actual UTF-8 text of the message
	 */
	public void setText(String text)
	{
		this.text = text;
	}
	/**
	 * Optional. Message is an audio file, information about the file
	 * @return
	 */
	public Audio getAudio()
	{
		return audio;
	}
	
	/**
	 * Optional. Message is an audio file, set information about the file
	 * @param audio
	 */
	public void setAudio(Audio audio)
	{
		this.audio = audio;
	}
	/**
	 * Optional. Message is a general file, information about the file
	 * @return
	 */
	public Document getDocument()
	{
		return document;
	}
	
	/**
	 * Optional. Message is a general file, set information about the file
	 * @param document
	 */
	public void setDocument(Document document)
	{
		this.document = document;
	}
	
	
	/**
	 * Optional. Message is a photo, available sizes of the photo
	 * @return
	 */
	public List<PhotoSize> getPhoto()
	{
		if(photo == null)
			return null;
		return new ArrayList<PhotoSize>(photo);
	}
	
	/**
	 * Optional. Message is a photo, set the photo
	 * @param photo
	 */
	public void setPhoto(List<PhotoSize> photo)
	{
		this.photo = photo;
	}
	
	/**
	 * Optional. Message is a sticker, information about the sticker
	 * @return
	 */
	public Sticker getSticker() 
	{
	    return sticker;	
	}
	
	/**
	 * Optional. Message is a sticker, set information about the sticker
	 */
	public void setSticker(Sticker sticker)
	{
		this.sticker = sticker;
	}
	/**
	 * Optional. Message is a video, information about the video
	 * @return
	 */
	public Video getVideo()
	{
		return video;
	}
	
	/**
	 * Optional. Message is a video, set information about the video
	 * @param video
	 */
	public void setVideo(Video video)
	{
		this.video = video;
	}
	
	/**
	 * Optional. Message is a voice message, information about the file
	 * @return
	 */
	public Voice getVoice()
	{
		return voice;
	}
	
	/**
	 * Optional. Message is a voice message, set information about the file
	 * @param voice
	 */
	public void setVoice(Voice voice)
	{
		this.voice = voice;
	}
	/**
	 * Optional. Caption for the photo or video
	 * @return
	 */
	public String getCaption()
	{
		return caption;
	}
	
	/**
	 * Optional. Set caption for the photo or video
	 * @param caption
	 */
	public void setCaption(String caption)
	{
		this.caption = caption;
	}
	
	/**
	 * Optional. Message is a shared contact, information about the contact
	 * @return
	 */
	public Contact getContact()
	{
		return contact;
	}
	
	/**
	 * Optional. Message is a shared contact, set information about the contact
	 */
	public void setContact(Contact contact)
	{
		this.contact = contact;
	}
	
	/**
	 * Optional. Message is a shared location, information about the location
	 * @return
	 */
	public Location getLocation()
	{
		return location;
	}
	
	/**
	 * Optional. Message is a shared location, set information about the location
	 */
	public void setLocation(Location location)
	{
		this.location = location;
	}
	
	/**
	 * Optional. A new member was added to the group, information about them 
	 * (this member may be bot itself)
	 * @return
	 */
	public User getNewChatParticipant()
	{
		return new_chat_participant;
	}
	
	/**
	 * Optional. A new member was added to the group, set information about them 
	 * (this member may be bot itself)
	 * @param new_chat_participant
	 */
	public void setNewChatParticipant(User new_chat_participant)
	{
		this.new_chat_participant = new_chat_participant;
	}
	
	/**
	 * Optional. A member was removed from the group, information about them 
	 * (this member may be bot itself)
	 * @return
	 */
	public User getLeftChatPartecipant()
	{
		return left_chat_participant;
	}
	
	/**
	 * Optional. A member was removed from the group, set information about them 
	 * (this member may be bot itself)
	 * @param new_chat_participant
	 */
	public void setLeftChatParticipant(User left_chat_participant)
	{
		this.left_chat_participant = left_chat_participant;
	}
	
	/**
	 * Optional. A group title was changed to this value
	 * @return
	 */
	public String getNewChatTitle()
	{
		return new_chat_title;
	}
	
	/**
	 * Optional. set the new chat title
	 * @param new_chat_title
	 */
	public void setNewChatTitle(String new_chat_title)
	{
		this.new_chat_title = new_chat_title;
	}
	
	/**
	 * Optional. A group photo was change to this value
	 * @return
	 */
	public List<PhotoSize> getNewChatPhoto()
	{
		if(new_chat_photo == null)
			return null;
		return new ArrayList<PhotoSize>(new_chat_photo);
	}
	
	/** 	
	 * Optional. Informs that the group photo was deleted
	 * @return
	 */
	public boolean GetDeleteChatPhoto()
	{
		return delete_chat_photo;
	}
	
	/**
	 * Optional. Set that the group photo was deleted or not 
	 * @param delete_chat_photo
	 * @return
	 */
	public void setDeleteChatPhoto(boolean delete_chat_photo)
	{
		this.delete_chat_photo = delete_chat_photo;
	}
	
	/**
	 * Optional. Informs that the group has been created
	 * @return
	 */
	public boolean GetGroupChatCreated()
	{
		return group_chat_created;
	}
	
	/**
	 * Optional. Set that the group has been created or not 
	 * @param delete_chat_photo
	 * @return
	 */
	public void setGroupChatCreated(boolean group_chat_created)
	{
		this.group_chat_created = group_chat_created;
	}
	
	
	/**
	 * Optional. Informs that the group has been created
	 * @return
	 */
	public boolean getSuperGroupChatCreated()
	{
		return supergroup_chat_created;
	}
	
	/**
	 * Optional. Set that the superGroup has been created or not 
	 * @param delete_chat_photo
	 * @return
	 */
	public void setSuperGroupChatCreated(boolean supergroup_chat_created)
	{
		this.supergroup_chat_created = supergroup_chat_created;
	}
	
	/**
	 * Conversation the message belongs to — user in case of a private message,
	 * GroupChat in case of a group
	 * @return
	 */
	public Chat getChat()
	{
		if(chat.getTitle() == null)
			return (Chat)chat;
		GroupChat gc = new GroupChat(chat.getTitle(), chat.getId());
		return (Chat)gc;
	}
	
	/**
	 * Set the chat
	 * @param chat
	 */
	public void setChat(Chat chat)
	{
		this.chat = (User)chat;
	}
}
