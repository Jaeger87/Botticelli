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
	
	private int edit_date;
	
	private Chat chat;
	
	private User forward_from;
	
	private Chat forward_from_chat;
	
	private int forward_from_message_id;
	
	private int forward_date;
	
	private Message reply_to_message;
	
	private String text;
	
	private List<MessageEntity> entities;
	
	private List<MessageEntity> caption_entities;
	
	private Audio audio;
	
	private Document document;
	
	private List<PhotoSize> photo;
	
	private Sticker sticker;
	
	private Video video;
	
	private Voice voice;
	
	private String caption;
	
	private Contact contact;
	
	private Location location;
	
	private Venue venue;

	private Dice dice;
	
	private User new_chat_member;
	
	private List<User> new_chat_members;
	
	private User left_chat_member;
	
	private String new_chat_title;
	
	private List<PhotoSize> new_chat_photo;
	
	private String author_signature;
	
	private String forward_signature;
	
	private boolean delete_chat_photo;
	
	private boolean group_chat_created;
	
	private boolean supergroup_chat_created;
	
	private boolean channel_chat_created;

	private long migrate_to_chat_id;
	
	private long migrate_from_chat_id;
	
	private Message pinned_message;
	
	private Game game;
	
	private VideoNote video_note;
	
	private Invoice invoice;
	
	private SuccessfulPayment successful_payment;
	
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
	 * 
	 * @return
	 */
	public int getEdit_date() 
	{
		return edit_date;
	}

	/**
	 * 
	 * @param edit_date
	 */
	public void setEdit_date(int edit_date) 
	{
		this.edit_date = edit_date;
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
	 *  	Optional. For forwarded channel posts, identifier of the original message in the channel
	 * @return
	 */
	public int getForward_from_message_id() 
	{
		return forward_from_message_id;
	}

	/**
	 *  	Optional. For forwarded channel posts, identifier of the original message in the channel
	 * @param forward_from_message_id
	 */
	public void setForward_from_message_id(int forward_from_message_id)
	{
		this.forward_from_message_id = forward_from_message_id;
	}

	/**
	 * 
	 * @return
	 */
	public Chat getForward_from_chat() 
	{
		return forward_from_chat;
	}

	public void setForward_from_chat(Chat forward_from_chat) 
	{
		this.forward_from_chat = forward_from_chat;
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
	public User getNewChatMember()
	{
		return new_chat_member;
	}
	
	/**
	 * Optional. A new member was added to the group, set information about them 
	 * (this member may be bot itself)
	 * @param new_chat_member
	 */
	public void setNewChatMember(User new_chat_member)
	{
		this.new_chat_member = new_chat_member;
	}
	
	/**
	 * Optional. A member was removed from the group, information about them 
	 * (this member may be bot itself)
	 * @return
	 */
	public User getLeftChatMember()
	{
		return left_chat_member;
	}
	
	/**
	 * Optional. A member was removed from the group, set information about them 
	 * (this member may be bot itself)
	 * @param left_chat_member
	 */
	public void setLeftChatMember(User left_chat_member)
	{
		this.left_chat_member = left_chat_member;
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
	 * @param group_chat_created
	 * @return
	 */
	public void setGroupChatCreated(boolean group_chat_created)
	{
		this.group_chat_created = group_chat_created;
	}
	
	
	/**
	 * Optional. Informs that the super group has been created
	 * @return
	 */
	public boolean getSuperGroupChatCreated()
	{
		return supergroup_chat_created;
	}
	
	/**
	 * Optional. Set that the super group has been created or not 
	 * @param supergroup_chat_created
	 * @return
	 */
	public void setSuperGroupChatCreated(boolean supergroup_chat_created)
	{
		this.supergroup_chat_created = supergroup_chat_created;
	}
	
	/**
	 * Optional. Informs that the chanel chat has been created
	 * @return
	 */
	public boolean getChanelChatCreated()
	{
		return channel_chat_created;
	}
	
	/**
	 * Optional. Set that the chanel chat has been created or not 
	 * @param channel_chat_created
	 * @return
	 */
	public void setChanelChatCreated(boolean channel_chat_created)
	{
		this.channel_chat_created = channel_chat_created;
	}
	
	
	/**
	 * Conversation the message belongs to � user in case of a private message,
	 * GroupChat in case of a group
	 * @return
	 */
	public Chat getChat()
	{
		return chat;
	}
	
	/**
	 * Set the chat
	 * @param chat
	 */
	public void setChat(Chat chat)
	{
		this.chat = chat;
	}
	
	/**
	 * Set the specified identifier for the supergroup, not exceeding 1e13 by absolute value
	 * @param chat_id
	 */
	public void setMigrateToChatId(long chat_id)
	{
		migrate_to_chat_id = chat_id;
	}
	
	/**
	 * The group has been migrated to a supergroup with the specified identifier, not exceeding 1e13 by absolute value
	 * @return
	 */
	public long getMigrateToChatId()
	{
		return migrate_to_chat_id;
	}
	
	/**
	 * Set the specified identifier for the group before the migration to the supergroup, not exceeding 1e13 by absolute value
	 * @param chat_id
	 */
	public void setMigrateFromChatId(long chat_id)
	{
		migrate_from_chat_id = chat_id;
	}
	
	/**
	 * The supergroup has been migrated from a group with the specified identifier, not exceeding 1e13 by absolute value
	 * @return
	 */
	public long getMigratefromChatId()
	{
		return migrate_from_chat_id;
	}

	/**
	 * Optional. Message is a venue, information about the venue
	 * @return
	 */
	public Venue getVenue() {
		return venue;
	}

	/**
	 * Set the venue
	 * @param venue
	 */
	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	/**
	 * Optional. For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
	 * @return
	 */
	public List<MessageEntity> getEntities() 
	{
		return entities;
	}

	/**
	 * Set special entities like usernames, URLs, bot commands, etc. that appear in the text
	 * @param entities
	 */
	public void setEntities(List<MessageEntity> entities) 
	{
		this.entities = entities;
	}

	/**
	 * Optional. Specified message was pinned. Note that the Message object in this field will not contain further reply_to_message 
	 * fields even if it is itself a reply.
	 * @return
	 */
	public Message getPinned_message() 
	{
		return pinned_message;
	}

	/**
	 * Set the pinned message
	 * @param pinned_message
	 */
	public void setPinned_message(Message pinned_message) 
	{
		this.pinned_message = pinned_message;
	}

	/**
	 * 
	 * @return
	 */
	public Game getGame() 
	{
		return game;
	}

	/**
	 * 
	 * @param game
	 */
	public void setGame(Game game) 
	{
		this.game = game;
	}

	/**
	 * 
	 * @return
	 */
	public List<User> getNewChatMembers() 
	{
		return new_chat_members;
	}

	/**
	 * 
	 * @param new_chat_members
	 */
	public void setNewChatMembers(List<User> new_chat_members) 
	{
		this.new_chat_members = new_chat_members;
	}

	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * 
	 * @return
	 */
	public VideoNote getVideoNote() 
	{
		return video_note;
	}

	/**
	 * 
	 * @param video_note
	 */
	public void setVideoNote(VideoNote video_note) 
	{
		this.video_note = video_note;
	}

	public Invoice getInvoice() 
	{
		return invoice;
	}

	public void setInvoice(Invoice invoice) 
	{
		this.invoice = invoice;
	}

	public SuccessfulPayment getSuccessfulPayment() 
	{
		return successful_payment;
	}

	public void setSuccessfulPayment(SuccessfulPayment successful_payment) 
	{
		this.successful_payment = successful_payment;
	}

	public String getAuthor_signature() {
		return author_signature;
	}

	public void setAuthor_signature(String author_signature) {
		this.author_signature = author_signature;
	}

	public String getForward_signature() 
	{
		return forward_signature;
	}

	public void setForward_signature(String forward_signature) 
	{
		this.forward_signature = forward_signature;
	}

	public List<MessageEntity> getCaption_entities()
	{
		return caption_entities;
	}

	public void setCaption_entities(List<MessageEntity> caption_entities)
	{
		this.caption_entities = caption_entities;
	}

}
