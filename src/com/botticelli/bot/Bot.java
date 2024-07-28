package com.botticelli.bot;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import com.botticelli.bot.request.RequestMaker;
import com.botticelli.bot.request.methods.*;
import com.botticelli.bot.request.methods.types.*;
import com.botticelli.bot.request.methods.types.inlinequery.InlineQuery;

public abstract class Bot {

	private RequestMaker rm;
	
	public Bot(String token)
	{
		if(token == null)
			throw new IllegalArgumentException("Token was null");
		rm = new RequestMaker(token);
	}
	
	/**
	 * Return the error logger (use to log exception or others strange things).
	 * @return
	 */
	public static Logger getErrorLogger()
	{
		return RequestMaker.getErrorLogger();
	}
	
	
	/**
	 * Use this method to receive incoming updates using long polling. 
	 * An Array of Update objects is returned. 
	 * @param upr
	 * @return
	 */
	public final List<Update> getUpdates(UpdateRequest upr)
	{
		if(upr == null)
			return null;
		return rm.getUpdates(upr);
	}
	
	/**
	 * Use this method to send text messages. On success, the sent Message is returned.
	 * @param mts
	 * @return
	 */
	public final Message sendMessage(MessageToSend mts)
	{
		if(mts == null)
			return null;
		return rm.sendMessage(mts);
	}
	
	/**
	 * Use this method to forward messages of any kind. On success, the sent Message is returned.
	 * @param fts
	 * @return
	 */
	public final Message forwardMessage(ForwardMessageToSend fts)
	{
		if(fts == null)
			return null;
		return rm.forwardMessage(fts);
	}
	
	/**
	 * Use this method to send Photos by file_id, On success, the sent Message is returned.
	 * @param prs
	 * @return
	 */
	public final Message sendPhotobyReference(PhotoReferenceToSend prs)
	{
		if(prs == null)
			return null;
		return rm.sendPhotobyReference(prs);
	}
	
	/**
	 * Use this method to send photos by file. On success, the sent Message is returned.
	 * @param pfs
	 * @return
	 */
	public final Message sendPhotoFile(PhotoFileToSend pfs)
	{
		if(pfs == null)
			return null;
		return rm.sendPhotoFile(pfs);
	}
	
	/**
	 * Use this method to send Audio by file_id, On success, the sent Message is returned.
	 * @param ars
	 * @return
	 */
	public final Message sendAudiobyReference(AudioReferenceToSend ars)
	{
		if(ars == null)
			return null;
		return rm.sendAudiobyReference(ars);
	}
	
	public final Message sendInvoice(InvoiceToSend its)
	{
		if(its == null)
			return null;
		return rm.sendInvoice(its);
	}
	
	/**
	 * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
	 * For this to work, your audio must be in an .ogg file encoded with OPUS 
	 * (other formats may be sent as Document). 
	 * On success, the sent Message is returned. 
	 * Bots can currently send audio files of up to 50 MB in size, 
	 * this limit may be changed in the future.
	 * @param afs
	 * @return
	 */
	public final Message sendAudioFile(AudioFileToSend afs)
	{
		if(afs == null)
			return null;
		return rm.sendAudioFile(afs);
	}

	public final List<Message> sendMediaGroup(MediaGroupToSend<?> mediaGroupToSend)
	{
		if(mediaGroupToSend == null)
			return null;
		return rm.sendMediaGroup(mediaGroupToSend);
	}
	
	
	/**
	 * 
	 * @param gts
	 * @return
	 */
	public final Message sengGame(GameToSend gts)
	{
		if(gts == null)
			return null;
		return rm.sendGame(gts);
	}
	/**
	 * Use this method to send general files. 
	 * On success, the sent Message is returned. 
	 * Bots can currently send files of any type of up to 50 MB in size, 
	 * this limit may be changed in the future.
	 * @param dfs
	 * @return
	 */
	public Message sendDocumentFile(DocumentFileToSend dfs)
	{
		if(dfs == null)
			return null;
		return rm.sendDocumentFile(dfs);
	}


	/**
	 * Use this method to send an animated emoji that will display a random value. On success,
	 * the sent Message is returned.
	 *
	 * @param dts
	 * @return
	 */
	public Message sendDice(DiceToSend dts) {
		if(dts == null)
			return null;
		return rm.sendDice(dts);
	}

	/**
	 * Use this method to send files by file_id, On success, the sent Message is returned.
	 * @param drs
	 * @return
	 */
	public final Message sendDocumentbyReference(DocumentReferenceToSend drs)
	{
		if(drs == null)
			return null;
		return rm.sendDocumentbyReference(drs);
	}
	
	/**
	 * Use this method to send Stickers by file_id, On success, the sent Message is returned.
	 * @param srs
	 * @return
	 */
	public final Message sendStickerbyReference(StickerReferenceToSend srs)
	{
		if(srs == null)
			return null;
		return rm.sendStickerbyReference(srs);
	}
	
	/**
	 * Use this method to send .webp stickers. On success, the sent Message is returned.
	 * @param sfs
	 * @return
	 */
	public final Message sendStickerFile(StickerFileToSend sfs)
	{
		if(sfs == null)
			return null;
		return rm.sendStickerFile(sfs);
	}
	
	/**
	 * Use this method to send video files by file_id, On success, the sent Message is returned.
	 * @param vrs
	 * @return
	 */
	public final Message sendVideobyReference(VideoReferenceToSend vrs)
	{
		if(vrs == null)
			return null;
		return rm.sendVideobyReference(vrs);
	}
	

	/**
	 * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
	 * For this to work, your audio must be in an .ogg file encoded with OPUS (other formats may be sent as Audio or Document). 
	 * On success, the sent Message is returned. Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the future.
	 * @param vfs
	 * @return
	 */
	public final Message sendVoiceFile(VoiceFileToSend vfs)
	{
		if(vfs == null)
			return null;
		return rm.sendVoiceFile(vfs);
	}
	
	/**
	 * Use this method to send audio files by reference, if you want Telegram clients to display the file as a playable voice message. 
	 * For this to work, your audio must be in an .ogg file encoded with OPUS (other formats may be sent as Audio or Document). 
	 * On success, the sent Message is returned. Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the future.
	 * @param vrs
	 * @return
	 */
	public final Message sendVoicebyReference(VoiceReferenceToSend vrs)
	{
		if(vrs == null)
			return null;
		return rm.sendVoicebyReference(vrs);
	}
	
	
	public final Message sendVideoNotebyReference(VideoNoteReferenceToSend vnr)
	{
		if(vnr == null)
			return null;
		return rm.sendVideoNotebyReference(vnr);
	}
	/**
	 * 
	 * @param vts
	 * @return
	 */
	public final Message sendVenue(VenueToSend vts)
	{
		if(vts == null)
			return null;
		return rm.sendVenue(vts);
	}
	
	/**
	 * 
	 * @param gss
	 * @return
	 */
	public final StickerSet getStickerSet(GetStickerSetRequest gss)
	{
		if(gss == null)
			return null;
		return rm.getStickerSet(gss);
	}
	
	
	public final File uploadStickerFile(UploadStickerFileRequest usf)
	{
		if(usf == null)
			return null;
		return rm.uploadStickerFile(usf);
	}
	
	
	public final boolean createNewStickerSetByReferenceOrLink(CreateNewStickerSetByReferenceOrLinkRequest cns)
	{
		if(cns == null)
			return false;
		return rm.createNewStickerSetByReferenceOrLink(cns);
	}
	
	
	public final boolean createNewStickerSetByFile(CreateNewStickerSetByFile cnf)
	{
		if(cnf == null)
			return false;
		return rm.createNewStickerSetByFile(cnf);
	}
	
	
	public final boolean addStickerToSetByReferenceOrLink(AddStickerToSetByReferenceOrLink asr)
	{
		if(asr == null)
			return false;
		return rm.addStickerToSetByReferenceOrLink(asr);
	}
	
	
	public final boolean addStickerToSetByFile(AddStickerToSetByFile asf)
	{
		if(asf == null)
			return false;
		return rm.addStickerToSetByFile(asf);
	}
	
	public final boolean setStickerPositionInSet(SetStickerPositionInSet ssp)
	{
		if(ssp == null)
			return false;
		return rm.setStickerPositionInSet(ssp);
	}
	
	public final boolean deleteStickerFromSet(DeleteStickerFromSetRequest dss)
	{
		if(dss == null)
			return false;
		return rm.deleteStickerFromSet(dss);
	}
	
	
	/**
	 * 
	 * @param cts
	 * @return
	 */
	public final Message sendContact(ContactToSend cts)
	{
		if(cts == null)
			return null;
		return rm.sendContact(cts);
	}
	
	/**
	 * Use this method to send video files, 
	 * Telegram clients support mp4 videos (other formats may be sent as Document). 
	 * On success, the sent Message is returned. 
	 * Bots can currently send video files of up to 50 MB in size, 
	 * this limit may be changed in the future.
	 * @param vfs
	 * @return
	 */
	public final Message sendVideoFile(VideoFileToSend vfs)
	{
		if(vfs == null)
			return null;
		return rm.sendVideoFile(vfs);
	}
	
	public final Message sendVideoNoteFile(VideoNoteFileToSend vnf)
	{
		if(vnf == null)
			return null;
		return rm.sendVideoNoteFile(vnf);
	}
	/**
	 * Use this method to send point on the map. On success, the sent Message is returned.
	 * @param lts
	 * @return
	 */
	public final Message sendLocation(LocationToSend lts)
	{
		if(lts == null)
			return null;
		return rm.sendLocation(lts);
	}
	
	/**
	 * Use this method when you need to tell the user that something is happening on the bot's side.
	 * The status is set for 5 seconds or less (when a message arrives from your bot, 
	 * Telegram clients clear its typing status).
	 * Example: 
	 * The ImageBot needs some time to process a request and upload the image. 
	 * Instead of sending a text message along the lines of Retrieving image, please wait, 
	 * the bot may use sendChatAction with action = upload_photo. 
	 * The user will see a sending photo status for the bot. 
	 * @param cts
	 * @return
	 */
	public final void sendChatAction(ChatActionToSend cts)
	{
		if(cts == null)
			return;
		rm.sendChatAction(cts);
	}

	/**
	 * 
	 * @param kmr
	 * @return
	 */
	public final boolean kickChatMember(KickChatMemberRequest kmr)
	{
		if(kmr == null)
			return false;
		return rm.kickChatMember(kmr);
	}
	
	/**
	 * 
	 * @param dms
	 * @return
	 */
	public final boolean deleteMessage(DeleteMessageToSend dms)
	{
		if(dms == null)
			return false;
		return rm.deleteMessage(dms);
	}
	
	
	public final boolean answerShippingQuery(AnswerShippingQuery asq)
	{
		if(asq == null)
			return false;
		return rm.answerShippingQuery(asq);
	}
	/**
	 * 
	 * @param aiq
	 * @return
	 */
	public final boolean answerInlineQuery(AnswerInlineQueryRequest aiq)
	{
		if(aiq == null)
			return false;
		return rm.answerInlineQuery(aiq);
	}
	
	/**
	 * 
	 * @param acq
	 * @return
	 */
	public final boolean answerCallbackQuery(AnswerCallbackQueryToSend acq)
	{
		if(acq == null)
			return false;
		return rm.answerCallbackQuery(acq);
	}
	
	/**
	 * 
	 * @param crs
	 * @return
	 */
	public final int getChatMembersCount(ChatRequests crs)
	{
		if(crs == null)
			return -1;
		return rm.getChatMembersCount(crs);
	}
	
	/**
	 * 
	 * @param cmr
	 * @return
	 */
	public final ChatMember getChatMember(ChatMemberRequest cmr)
	{
		if(cmr == null)
			return null;
		return rm.getChatMember(cmr);
	}
	
	/**
	 * 
	 * @param crs
	 * @return
	 */
	public final List<ChatMember> getChatAdministrators(ChatRequests crs)
	{
		if(crs == null)
			return null;
		return rm.getChatAdministrators(crs);
	}
	
	/**
	 * 
	 * @param crs
	 * @return
	 */
	public final Chat getChat(ChatRequests crs)
	{
		if(crs == null)
			return null;
		return rm.getChat(crs);
	}
	
	
	public boolean leaveChat(ChatRequests crs)
	{
		if(crs == null)
			return false;
		return rm.leaveChat(crs);
	}
	
	/**
	 * 
	 * @param emt
	 * @return
	 */
	public final Message editMessageText(EditMessageTextRequest emt)
	{
		if(emt == null)
			return null;
		return rm.editMessageText(emt);
	}
	
	/**
	 * 
	 * @param emc
	 * @return
	 */
	public final Message editMessageCaption(EditMessageCaptionRequest emc)
	{
		if(emc == null)
			return null;
		return rm.editMessageCaption(emc);
	}
	
	/**
	 * 
	 * @param emr
	 * @return
	 */
	public final Message editMessageReplyMarkup(EditMessageReplyMarkupRequest emr)
	{
		if(emr == null)
			return null;
		return rm.editMessageReplyMarkup(emr);
	}
	
	/**
	 * 
	 * @param rcm
	 * @return
	 */
	public final boolean restrictChatMember(RestrictChatMemberRequest rcm)
	{
		if(rcm == null)
			return false;
		return rm.restrictChatMember(rcm);
	}
	/**
	 * 
	 * @param pcm
	 * @return
	 */
	public final boolean promoteChatMember(PromoteChatMemberRequest pcm)
	{
		if(pcm == null)
			return false;
		return rm.promoteChatMember(pcm);
	}
	
	public final String exportChatInviteLink(ExportChatInviteLinkRequest eci)
	{
		if(eci == null)
			return null;
		return rm.exportChatInviteLink(eci);
	}
	/**
	 * 
	 * @param scp
	 * @return
	 */
	public final boolean setChatPhoto(SetChatPhotoRequest scp)
	{
		if(scp == null)
			return false;
		return rm.setChatPhoto(scp);
	}
	/**
	 * 
	 * @param dcp
	 * @return
	 */
	public final boolean deleteChatPhoto(DeleteChatPhotoRequest dcp)
	{
		if(dcp == null)
			return false;
		return rm.deleteChatPhoto(dcp);
	}
	/**
	 * 
	 * @param sct
	 * @return
	 */
	public final boolean setChatTitle(SetChatTitleRequest sct)
	{
		if(sct == null)
			return false;
		return rm.setChatTitle(sct);
	}
	/**
	 * 
	 * @param scd
	 * @return
	 */
	public final boolean setChatDescription(SetChatDescriptionRequest scd)
	{
		if(scd == null)
			return false;
		return rm.setChatDescription(scd);
	}
	/**
	 * 
	 * @param pcm
	 * @return
	 */
	public final boolean pinChatMessage(PinChatMessageRequest pcm)
	{
		if(pcm == null)
			return false;
		return rm.pinChatMessage(pcm);
	}
	/**
	 * 
	 * @param ucm
	 * @return
	 */
	public final boolean unpinChatMessage(UnpinChatMessageRequest ucm)
	{
		if(ucm == null)
			return false;
		return rm.unpinChatMessage(ucm);
	}
	/**
	 * 
	 * @param sgs
	 * @return
	 */
	public final GameScoreResult setGameScore(SetGameScoreRequest sgs)
	{
		if(sgs == null)
			return null;
		return rm.setGameScore(sgs);
	}
	
	/**
	 * 
	 * @param gghsr
	 * @return
	 */
	public final List<GameHighScore> getGameHighScores(GetGameHighScoresRequest gghsr)
	{
		if(gghsr == null)
			return null;
		return rm.getGameHighScores(gghsr);
	}
	
	public final WebhookInfo getWebhookInfo() {
		return rm.getWebhookInfo();
	}
	/**
	 * 
	 * @param lte
	 * @return
	 */
	public final Message editMessageLiveLocation(LiveLocationToEdit lte)
	{
		if(lte == null)
			return null;
		return rm.editMessageLiveLocation(lte);
	}
	
	/**
	 * 
	 * @param lts
	 * @return
	 */
	public final Message stopMessageLiveLocation(LiveLocationToStop lts)
	{
		if(lts == null)
			return null;
		return rm.stopMessageLiveLocation(lts);
	}
	
	/**
	 * Use this method to get a list of profile pictures for a user. 
	 * Returns a UserProfilePhotos object.
	 * @param upr
	 * @return
	 */
	public final UserProfilePhotos getUserProfilePhotos(UserProfilePhotosRequest upr)
	{
		if(upr == null)
			return null;
		return rm.getUserProfilePhotos(upr);
	}
	/**
	 * 
	 * @param gf
	 * @return
	 */
	public final DownlodableFile getFile(GetFile gf)
	{
		if(gf == null)
			return null;
		return rm.getFile(gf);
	}
	/**
	 * 
	 * @param df
	 * @param filename
	 * @return
	 */
	public final File downloadFileFromTelegramServer(DownlodableFile df, String filename)
	{
		if(df == null)
			return null;
		if(filename == null)
			filename = df.getFilePath();
		return rm.downloadFileFromTelegramServer(df, filename);
	}
	/**
	 * 
	 * @param tf
	 * @param filename
	 * @return
	 */
	public final File downloadFileFromTelegramServer(TelegramFile tf, String filename)
	{
		if(tf == null)
			return null;
		return downloadFileFromTelegramServer(getFile(new GetFile(tf.getFileID())), filename);
	}
	
	
	public final File downloadFileFromTelegramServer(String fileId, String filename)
	{
		if(fileId == null || filename == null)
			return null;
		return downloadFileFromTelegramServer(getFile(new GetFile(fileId)), filename);
	}
	
	
	/**
	 * This method read the message values and pass the message on to the appropriate method.
	 * @param message
	 */
	public final void manageMessage(Message message)
	{
		if(message.getText() != null)
		{
			textMessage(message);
			return;
		}
		
		if(message.getAudio() != null)
		{
			audioMessage(message);
			return;
		}
		
		if(message.getDocument() != null)
		{
			documentMessage(message);
			return;
		}
		
		if(message.getPhoto() != null)
		{
			photoMessage(message);
			return;
		}
		
		if(message.getSticker() != null)
		{
			stickerMessage(message);
			return;
		}
		
		if(message.getVideo() != null)
		{
			videoMessage(message);
			return;
		}

		if(message.getVideoNote() != null)
		{
			videoNoteMessage(message);
			return;
		}
		
		if(message.getVoice() != null)
		{
			voiceMessage(message);
			return;
		}
		if(message.getContact() != null)
		{
			contactMessage(message);
			return;
		}
		
		if(message.getLocation() != null)
		{
			locationMessage(message);
			return;
		}
		
		if(message.getVenue() != null)
		{
			venueMessage(message);
			return;
		}

		if (message.getDice() != null)
		{
			diceMessage(message);
			return;
		}
		
		if(message.getNewChatMember() != null)
		{
			newChatMemberMessage(message);
			return;
		}
		
		if(message.getNewChatMembers() != null)
		{
			newChatMembersMessage(message);
			return;
		}
		
		if(message.getLeftChatMember() != null)
		{
			leftChatMemberMessage(message);
			return;
		}
		
		if(message.getPinned_message() != null)
		{
			pinnedMessage(message);
			return;
		}
		
		if(message.getNewChatTitle() != null)
		{
			newChatTitleMessage(message);
			return;
		}
		
		if(message.getNewChatPhoto() != null)
		{
			newChatPhotoMessage(message);
			return;
		}
		
		if(message.GetDeleteChatPhoto())
		{
			groupChatPhotoDeleteMessage(message);
			return;
		}
		
		if(message.GetGroupChatCreated())
		{
			groupChatCreatedMessage(message);
			return;
		}
		
		if(message.getGame() != null)
		{
			gameMessage(message);
			return;
		}
		
		if(message.getSuccessfulPayment() != null)
		{
			successfulPaymentMessage(message);
			return;
		}
		
		if(message.getInvoice() != null)
		{
			invoiceMessage(message);
			return;
		}
	}
	/**
	 * This method will be called when bot received a text message.
	 * @param m
	 */
	public abstract void textMessage(Message m);
	/**
	 * This method will be called when bot received an audio file (not voice).
	 * @param m
	 */
	public abstract void audioMessage(Message m);
	/**
	 * This method will be called when bot received a video.
	 * @param m
	 */
	public abstract void videoMessage(Message m);
	/**
	 * This method will be called when bot received a voice message
	 * @param m
	 */
	public abstract void voiceMessage(Message m);
	/**
	 * This method will be called when bot received a sticker.
	 * @param m
	 */
    public abstract void stickerMessage(Message m);
	/**
	 * This method will be called when bot received a File
	 * @param m
	 */
    public abstract void documentMessage(Message m);
    /**
     * This method will be called when bot received a photo
     * @param m
     */
    public abstract void photoMessage(Message m);

	/**
	 * This method will be called when bot received a dice
	 * @param m
	 */
	public abstract void diceMessage(Message m);
    /**
     * This method will be called when bot received a contact
     * @param m
     */


    public abstract void contactMessage(Message m);
    /**
     * This method will be called when bot received a location
     * @param m
     */
    public abstract void locationMessage(Message m);
    /**
     * This method will be called when bot received a venue
     * @param m
     */
    public abstract void venueMessage(Message m);
    /**
     * This method will be called when a new member join the Chat.
     * @param m
     */
    @Deprecated
    public abstract void newChatMemberMessage(Message m);
    /**
     * This method will be called when a new members join the Chat.
     * @param m
     */
    public abstract void newChatMembersMessage(Message m);
    /**
     * This method will be called when a member left the chat
     * @param m
     */
    public abstract void leftChatMemberMessage(Message m);
    /**
     * This method will be called when the chat title is changed
     * @param m
     */
    public abstract void newChatTitleMessage(Message m);
    /**
     * This method will be called when the photo chat is changed
     * @param m
     */
    public abstract void newChatPhotoMessage(Message m);
    /**
     * This method will be called when the photo chat is deleted
     * @param m
     */
    public abstract void groupChatPhotoDeleteMessage(Message m);
    /**
     * This method will be called when the group chat is created
     * @param m
     */
    public abstract void groupChatCreatedMessage(Message m);
    /**
     * This method will be called when the update is an inline query
     * @param q
     */
    public abstract void inLineQuery(InlineQuery q);
	/**
	 * This method will be called when the update is a chose inline result
	 * @param c
	 */
    public abstract void chose_inline_result(ChosenInlineResult c);
    /**
     * This method will be called when the update is a CallbackQuery
     * @param cq
     */
    public abstract void callback_query(CallbackQuery cq);
    
    /**
     * 
     */
    public abstract void gameMessage(Message m);
    /**
     * 
     * @param m
     */
    public abstract void videoNoteMessage(Message m);
    /*
     * 
     */
    public abstract void pinnedMessage(Message m);
    
    public abstract void preCheckOutQueryMessage(PreCheckoutQuery pcq);
    
    public abstract void shippingQueryMessage(ShippingQuery sq);
    
    public abstract void invoiceMessage(Message m);
    
    public abstract void successfulPaymentMessage(Message m);
    
    public abstract void routine();
}