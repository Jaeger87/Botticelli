package com.botticelli.bot.request;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.botticelli.bot.request.methods.*;
import com.botticelli.bot.request.methods.types.Chat;
import com.botticelli.bot.request.methods.types.ChatMember;
import com.botticelli.bot.request.methods.types.DownlodableFile;
import com.botticelli.bot.request.methods.types.GameHighScore;
import com.botticelli.bot.request.methods.types.GameScoreResult;
import com.botticelli.bot.request.methods.types.GsonOwner;
import com.botticelli.bot.request.methods.types.Message;
import com.botticelli.bot.request.methods.types.Result;
import com.botticelli.bot.request.methods.types.StickerSet;
import com.botticelli.bot.request.methods.types.Update;
import com.botticelli.bot.request.methods.types.UserProfilePhotos;
import com.botticelli.bot.request.methods.types.WebhookInfo;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import okhttp3.FormBody;
import okhttp3.FormBody.Builder;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;

public class RequestMaker {
	private OkHttpClient client;
	public static final MediaType TEXTMEDIATYPE = MediaType.parse("text/html; charset=UTF-8");
	public static final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("multipart/form-data; charset=utf-8");

	private static final int JSONBOOLEANLENGHT = 50;
	private String urlGetUpdates;
	private String urlSendMessage;
	private String urlForwardMessage;
	private String urlSendPhoto;
	private String urlSendAudio;
	private String urlSendDocument;
	private String urlSendSticker;
	private String urlSendVideo;
	private String urlSendVideoNote;
	private String urlSendVoice;
	private String urlSendVenue;
	private String urlSendInvoice;
	private String urlSendMediaGroup;
	private String urlSendContact;
	private String urlAnswerInlineQuery;
	private String urlAnswerShippingQuery;
	private String urlAnswerCallbackQuery;
	private String urlLeaveChat;;
	private String urlGetChat;
	private String urlGetChatAdministrators;
	private String urlGetMembersCount;
	private String urlGetMember;
	private String urlKickChatMember;
	private String urlDeleteMessage;
	private String urlUnbanChatMember;
	private String urlEditMessageText;
	private String urlEditMessageCaption;
	private String urlEditMessageReplyMarkup;
	private String urlSendLocation;
	private String urlSendChatAction;
	private String urlSendGame;
	private String urlSetGameScore;
	private String urlGetGameHighScores;
	private String urlGetWebhookInfo;
	private String urlRescrictChatMembers;
	private String urlPromoteChatMember;
	private String urlExportChatInviteLink;
	private String urlSetChatPhoto;
	private String urlDeleteChatPhoto;
	private String urlSetChatTitle;
	private String urlSendDice;
	private String urlSetWebHook;
	private String urlSetChatDescription;
	private String urlPinChatMessage;
	private String urlUnpinChatMessage;
	private String urlGetUserProfilePhotos;
	private String urlGetFile;
	private String urlDownloadFile;
	private String urlGetStickerSet;
	private String urlUploadStickerFile;
	private String urlCreateNewStickerSet;
	private String urlAddStickerToSet;
	private String urlSetStickerPositionInSet;
	private String urlDeleteStickerFromSet;
	private String urlEditMessageLiveLocation;
	private String urlStopMessageLiveLocation;
	
	
	private Type intResult;
	private Type chatResult;
	private Type booleanResult;
	private Type messageResult;
	private Type listMessageResult;
	private Type stringResult;
	private Type userProfilePhotosResult;
	private Type downlodableFileResult;
	private Type listUpdateResult;
	private Type listChatMembersResult;
	private Type webHookInfoResult;
	private Type gameHighScoresListResult;
	private Type chatMembersResult;
	private Type stickerSetResult;

	private final static Logger errorLogger = Logger.getLogger("errors");

	private Gson gson;

	public RequestMaker(String token) {
		gson = GsonOwner.getInstance().getGson();

		client = new OkHttpClient();

		urlGetUpdates = Constants.APIURL + token + Constants.GETUPDATES;
		urlSendMessage = Constants.APIURL + token + Constants.SENDMESSAGE;
		urlForwardMessage = Constants.APIURL + token + Constants.FORWARDMESSAGE;
		urlSendPhoto = Constants.APIURL + token + Constants.SENDPHOTO;
		urlSendAudio = Constants.APIURL + token + Constants.SENDAUDIO;
		urlSendDocument = Constants.APIURL + token + Constants.SENDDOCUMENT;
		urlSendSticker = Constants.APIURL + token + Constants.SENDSTICKER;
		urlSendVideo = Constants.APIURL + token + Constants.SENDVIDEO;
		urlSendVideoNote = Constants.APIURL + token + Constants.SENDVIDEONOTE;
		urlSendVoice = Constants.APIURL + token + Constants.SENDVOICE;
		urlSendLocation = Constants.APIURL + token + Constants.SENDLOCATION;
		urlSendChatAction = Constants.APIURL + token + Constants.SENDCHATACTION;
		urlGetUserProfilePhotos = Constants.APIURL + token + Constants.GETUSERPROFILEPHOTOS;
		urlSendVenue = Constants.APIURL + token + Constants.SENDVENUE;
		urlSendMediaGroup = Constants.APIURL + token + Constants.SENDMEDIAGROUP;
		urlAnswerShippingQuery = Constants.APIURL + token + Constants.ANSWERSHIPPINGQUERY;
		urlSendContact = Constants.APIURL + token + Constants.SENDCONTACT;
		urlLeaveChat = Constants.APIURL + token + Constants.LEAVECHAT;
		urlSendInvoice = Constants.APIURL + token + Constants.SENDINVOICE;
		urlGetChat = Constants.APIURL + token + Constants.GETCHAT;
		urlGetChatAdministrators = Constants.APIURL + token + Constants.GETCHATADMINISTRATORS;
		urlSendGame = Constants.APIURL + token + Constants.SENDGAME;
		urlGetGameHighScores = Constants.APIURL + token + Constants.GETGAMEHIGHSCORES;
		urlSetGameScore = Constants.APIURL + token + Constants.SETGAMESCORE;
		urlGetWebhookInfo = Constants.APIURL + token + Constants.GETWEBHOOKINFO;
		urlGetMembersCount = Constants.APIURL + token + Constants.GETCHATMEMBERSCOUNT;
		urlGetMember = Constants.APIURL + token + Constants.GETCHATMEMBER;
		urlKickChatMember = Constants.APIURL + token + Constants.KICKCHATMEMBER;
		urlDeleteMessage = Constants.APIURL + token + Constants.DELETEMESSAGE;
		urlUnbanChatMember = Constants.APIURL + token + Constants.UNBANCHATMEMBER;
		urlEditMessageText = Constants.APIURL + token + Constants.EDITMESSAGETEXT;
		urlEditMessageCaption = Constants.APIURL + token + Constants.EDITMESSAGECAPTION;
		urlEditMessageReplyMarkup = Constants.APIURL + token + Constants.EDITMESSAGEREPLYMARKUP;
		urlAnswerInlineQuery = Constants.APIURL + token + Constants.ANSWERINLINEQUERY;
		urlAnswerCallbackQuery = Constants.APIURL + token + Constants.ANSWERCALLBACKQUERY;
		urlGetFile = Constants.APIURL + token + Constants.GETFILE;
		urlDownloadFile = Constants.APIFILEURL + token + '/';
		urlRescrictChatMembers = Constants.APIURL + token + Constants.RESTRICTCHATMEMBER;
		urlPromoteChatMember = Constants.APIURL + token + Constants.PROMOTECHATMEMBER;
		urlExportChatInviteLink = Constants.APIURL + token + Constants.EXPORTCHATINVITELINK;
		urlSetChatPhoto = Constants.APIURL + token + Constants.SETCHATPHOTO;
		urlDeleteChatPhoto = Constants.APIURL + token + Constants.DELETECHATPHOTO;
		urlSetChatTitle = Constants.APIURL + token + Constants.SETCHATTITLE;
		urlSetChatDescription = Constants.APIURL + token + Constants.SETCHATDESCRIPTION;
		urlPinChatMessage = Constants.APIURL + token + Constants.PINCHATMESSAGE;
		urlUnpinChatMessage = Constants.APIURL + token + Constants.UNPINCHATMESSAGE;		
		urlGetStickerSet = Constants.APIURL + token + Constants.GETSTICKERSET;
		urlUploadStickerFile = Constants.APIURL + token + Constants.UPLOADSTICKERFILE;
		urlCreateNewStickerSet = Constants.APIURL + token + Constants.CREATENEWSTICKERSET;
		urlAddStickerToSet = Constants.APIURL + token + Constants.ADDSTICKERTOSET;
		urlSetStickerPositionInSet = Constants.APIURL + token + Constants.SETSTICKERPOSITIONINSET;
		urlDeleteStickerFromSet = Constants.APIURL + token + Constants.DELETESTICKERFROMSET;
		urlEditMessageLiveLocation = Constants.APIURL + token + Constants.EDITMESSAGELIVELOCATION;
		urlStopMessageLiveLocation = Constants.APIURL + token + Constants.STOPMESSAGELIVELOCATION;
		urlSendDice = Constants.APIURL + token + Constants.SENDDICE;
		urlSetWebHook = Constants.APIURL + token + Constants.SETWEBHOOK;
		
		intResult = new TypeToken<Result<Integer>>() {
		}.getType();
		booleanResult = new TypeToken<Result<Boolean>>() {
		}.getType();
		chatResult = new TypeToken<Result<Chat>>() {
		}.getType();
		messageResult = new TypeToken<Result<Message>>() {
		}.getType();
		listMessageResult = new TypeToken<Result<List<Message>>>() {
		}.getType();
		stringResult = new TypeToken<Result<String>>() {
		}.getType(); 
		userProfilePhotosResult = new TypeToken<Result<UserProfilePhotos>>() {
		}.getType();
		downlodableFileResult = new TypeToken<Result<DownlodableFile>>() {
		}.getType();
		listUpdateResult = new TypeToken<Result<List<Update>>>() {
		}.getType();
		listChatMembersResult = new TypeToken<Result<List<ChatMember>>>() {
		}.getType();
		chatMembersResult = new TypeToken<Result<ChatMember>>() {
		}.getType();
		webHookInfoResult = new TypeToken<Result<WebhookInfo>>() {
		}.getType();
		gameHighScoresListResult = new TypeToken<Result<List<ChatMember>>>() {
		}.getType();
		stickerSetResult = new TypeToken<Result<List<StickerSet>>>() {
		}.getType();

	}

	/**
	 * Return the error logger (use to log exception or others strange things).
	 * 
	 * @return
	 */
	public static Logger getErrorLogger() {
		return errorLogger;
	}

	/**
	 * Use this method to receive incoming updates using long polling. An Array
	 * of Update objects is returned.
	 * 
	 * @param upr
	 * @return
	 */
	public List<Update> getUpdates(UpdateRequest upr) {
		String json = makeRequest(urlGetUpdates, upr);
		return buildResult(json, listUpdateResult, new Result<List<Update>>()).getResult();
	}

	/**
	 * Use this method to send text messages. On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param mts
	 * @return
	 */
	public Message sendMessage(MessageToSend mts) {
		String json = makeRequest(urlSendMessage, mts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to forward messages of any kind. On success, the sent
	 * Message is returned, else return null.
	 * 
	 * @param fts
	 * @return
	 */
	public Message forwardMessage(ForwardMessageToSend fts) {
		String json = makeRequest(urlForwardMessage, fts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send Photos by file_id, On success, the sent Message
	 * is returned, else return null.
	 * 
	 * @param prs
	 * @return
	 */
	public Message sendPhotobyReference(PhotoReferenceToSend prs) {
		String json = makeRequest(urlSendPhoto, prs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send photos by file. On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param pfs
	 * @return
	 */
	public Message sendPhotoFile(PhotoFileToSend pfs) {
		String json = makeFileRequest(urlSendPhoto, pfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send Audio by file_id, On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param ars
	 * @return
	 */
	public Message sendAudiobyReference(AudioReferenceToSend ars) {
		String json = makeRequest(urlSendAudio, ars);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send audio files, if you want Telegram clients to
	 * display the file as a playable voice message. For this to work, your
	 * audio must be in an .ogg file encoded with OPUS (other formats may be
	 * sent as Document). On success, the sent Message is returned, else return
	 * null. Bots can currently send audio files of up to 50 MB in size, this
	 * limit may be changed in the future.
	 * 
	 * @param afs
	 * @return
	 */
	public Message sendAudioFile(AudioFileToSend afs) {
		String json = makeFileRequest(urlSendAudio, afs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}


	/**
	 * Use this method to send an animated emoji that will display a random value. On success,
	 * the sent Message is returned.
	 *
	 * @param dts
	 * @return
	 */
	public Message sendDice(DiceToSend dts) {
		String json = makeRequest(urlSendDice, dts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send files by file_id, On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param drs
	 * @return
	 */
	public Message sendDocumentbyReference(DocumentReferenceToSend drs) {
		String json = makeRequest(urlSendDocument, drs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send general files. On success, the sent Message is
	 * returned, else return null. Bots can currently send files of any type of
	 * up to 50 MB in size, this limit may be changed in the future.
	 * 
	 * @param dfs
	 * @return
	 */
	public Message sendDocumentFile(DocumentFileToSend dfs) {
		String json = makeFileRequest(urlSendDocument, dfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send Stickers by file_id, On success, the sent Message
	 * is returned, else return null.
	 * 
	 * @param srs
	 * @return
	 */
	public Message sendStickerbyReference(StickerReferenceToSend srs) {
		String json = makeRequest(urlSendSticker, srs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send .webp stickers. On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param sfs
	 * @return
	 */
	public Message sendStickerFile(StickerFileToSend sfs) {
		String json = makeFileRequest(urlSendSticker, sfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send video files by file_id, On success, the sent
	 * Message is returned, else return null.
	 * 
	 * @param vrs
	 * @return
	 */
	public Message sendVideobyReference(VideoReferenceToSend vrs) {
		String json = makeRequest(urlSendVideo, vrs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * 
	 * @param gss
	 * @return
	 */
	public StickerSet getStickerSet(GetStickerSetRequest gss)
	{
		String json = makeRequest(urlGetStickerSet, gss);
		return buildResult(json, stickerSetResult, new Result<StickerSet>()).getResult();
	}
	
	/**
	 * 
	 * @param usf
	 * @return
	 */
	public File uploadStickerFile(UploadStickerFileRequest usf)
	{
		okhttp3.Request request = new okhttp3.Request.Builder().url(urlUploadStickerFile)
				.post(getMultipartBodyBuilderFromRequest(usf).build()).build();
			try (Response response = client.newCall(request).execute()) {
				File f = new File("(updated)" + usf.getFile().getName());
				BufferedSink sink = Okio.buffer(Okio.sink(f));
	            sink.writeAll(response.body().source());
	            sink.close();
	            return f;
			}
		catch (IOException e1) {
			errorLogger.log(Level.SEVERE, usf.getClass().getName(), e1);
		}
		return null;
	}
	
	/**
	 * 
	 * @param cns
	 * @return
	 */
	public boolean createNewStickerSetByReferenceOrLink(CreateNewStickerSetByReferenceOrLinkRequest cns)
	{
		String json = makeRequest(urlCreateNewStickerSet, cns);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	public boolean createNewStickerSetByFile(CreateNewStickerSetByFile cnf)
	{
		String json = makeFileRequest(urlCreateNewStickerSet, cnf);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}

	public boolean addStickerToSetByReferenceOrLink(AddStickerToSetByReferenceOrLink asr)
	{
		String json = makeRequest(urlAddStickerToSet, asr);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	public boolean addStickerToSetByFile(AddStickerToSetByFile asf)
	{
		String json = makeFileRequest(urlAddStickerToSet, asf);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	public boolean setStickerPositionInSet(SetStickerPositionInSet ssp)
	{
		String json = makeRequest(urlSetStickerPositionInSet, ssp);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	public boolean deleteStickerFromSet(DeleteStickerFromSetRequest dss)
	{
		String json = makeRequest(urlDeleteStickerFromSet, dss);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	/**
	 * 
	 * @param vnr
	 * @return
	 */
	public Message sendVideoNotebyReference(VideoNoteReferenceToSend vnr) {
		String json = makeRequest(urlSendVideoNote, vnr);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	/**
	 * Use this method to send video files, Telegram clients support mp4 videos
	 * (other formats may be sent as Document). On success, the sent Message is
	 * returned, else return null. Bots can currently send video files of up to
	 * 50 MB in size, this limit may be changed in the future.
	 * 
	 * @param vfs
	 * @return
	 */
	public Message sendVideoFile(VideoFileToSend vfs) {
		String json = makeFileRequest(urlSendVideo, vfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	public Message sendVideoNoteFile(VideoNoteFileToSend vnf) {
		String json = makeFileRequest(urlSendVideoNote, vnf);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	/**
	 * 
	 * @param vrs
	 * @return
	 */
	public Message sendVoicebyReference(VoiceReferenceToSend vrs) {
		String json = makeRequest(urlSendVoice, vrs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * 
	 * @param vfs
	 * @return
	 */
	public Message sendVoiceFile(VoiceFileToSend vfs) {
		String json = makeFileRequest(urlSendVoice, vfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * 
	 * @param gts
	 * @return
	 */
	public Message sendGame(GameToSend gts) {
		String json = makeRequest(urlSendGame, gts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send venue. On success, the sent Message is returned,
	 * else return null.
	 * 
	 * @param vts
	 * @return
	 */
	public Message sendVenue(VenueToSend vts) {
		String json = makeRequest(urlSendVenue, vts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send a contact. On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param cts
	 * @return
	 */
	public Message sendContact(ContactToSend cts) {
		String json = makeRequest(urlSendContact, cts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send point on the map. On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param lts
	 * @return
	 */
	public Message sendLocation(LocationToSend lts) {
		String json = makeRequest(urlSendLocation, lts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	
	public Message sendInvoice(InvoiceToSend its) {
		String json = makeRequest(urlSendInvoice, its);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	
	/**
	 * Use this method when you need to tell the user that something is
	 * happening on the bot's side. The status is set for 5 seconds or less
	 * (when a message arrives from your bot, Telegram clients clear its typing
	 * status). Example: The ImageBot needs some time to process a request and
	 * upload the image. Instead of sending a text message along the lines of
	 * �Retrieving image, please wait��, the bot may use sendChatAction with
	 * action = upload_photo. The user will see a �sending photo� status for the
	 * bot.
	 * 
	 * @param cts
	 * @return
	 */
	public void sendChatAction(ChatActionToSend cts) {
		makeRequest(urlSendChatAction, cts);
	}

	/**
	 * 
	 * @param kmr
	 * @return
	 */
	public boolean kickChatMember(KickChatMemberRequest kmr) {
		return buildResult(makeRequest(urlKickChatMember, kmr), booleanResult, new Result<Boolean>()).getOk();
	}

	/**
	 * 
	 * @param crs
	 * @return
	 */
	public boolean leaveChat(ChatRequests crs) {
		return buildResult(makeRequest(urlLeaveChat, crs), booleanResult, new Result<Boolean>()).getOk();
	}

	/**
	 * 
	 * @param dms
	 * @return
	 */
	public boolean deleteMessage(DeleteMessageToSend dms) {
		return buildResult(makeRequest(urlDeleteMessage, dms), booleanResult, new Result<Boolean>()).getOk();
	}
	
	
	/**
	 * 
	 * @param asq
	 * @return
	 */
	public boolean answerShippingQuery(AnswerShippingQuery asq) {
		return buildResult(makeRequest(urlAnswerShippingQuery, asq), booleanResult, new Result<Boolean>()).getOk();
	}
	/**
	 * 
	 * @param crs
	 * @return
	 */
	public Chat getChat(ChatRequests crs) {
		return buildResult(makeRequest(urlGetChat, crs), chatResult, new Result<Chat>()).getResult();
	}

	/**
	 * 
	 * @param crs
	 * @return
	 */
	public int getChatMembersCount(ChatRequests crs) {
		return buildResult(makeRequest(urlGetMembersCount, crs), intResult, new Result<Integer>()).getResult();
	}

	public List<ChatMember> getChatAdministrators(ChatRequests crs) {
		return buildResult(makeRequest(urlGetChatAdministrators, crs), listChatMembersResult,
				new Result<List<ChatMember>>()).getResult();
	}

	/**
	 * 
	 * @param cmr
	 * @return
	 */
	public ChatMember getChatMember(ChatMemberRequest cmr) {
		return buildResult(makeRequest(urlGetMember, cmr), chatMembersResult, new Result<ChatMember>()).getResult();
	}

	public GameScoreResult setGameScore(SetGameScoreRequest sgs) {
		String json = makeRequest(urlSetGameScore, sgs);
		GameScoreResult gsr = new GameScoreResult();
		if (json.length() > JSONBOOLEANLENGHT)
			gsr.setMessage(buildResult(json, messageResult, new Result<Message>()).getResult());
		else
			gsr.setOk(buildResult(json, booleanResult, new Result<Boolean>()).getResult());
		return gsr;
	}

	public List<GameHighScore> getGameHighScores(GetGameHighScoresRequest gghsr) {
		String json = makeRequest(urlGetGameHighScores, gghsr);
		return buildResult(json, gameHighScoresListResult, new Result<List<GameHighScore>>()).getResult();
	}

	/**
	 * 
	 * @param umr
	 * @return
	 */
	public boolean unbanChatMember(UnbanChatMemberRequest umr) {
		return buildResult(makeRequest(urlUnbanChatMember, umr), booleanResult, new Result<Boolean>()).getOk();
	}

	/**
	 * 
	 * @param emt
	 * @return
	 */
	public Message editMessageText(EditMessageTextRequest emt) {
		String json = makeRequest(urlEditMessageText, emt);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * 
	 * @param emc
	 * @return
	 */
	public Message editMessageCaption(EditMessageCaptionRequest emc) {
		String json = makeRequest(urlEditMessageCaption, emc);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * 
	 * @param rcm
	 * @return
	 */
	public boolean restrictChatMember(RestrictChatMemberRequest rcm)
	{
		String json = makeRequest(urlRescrictChatMembers, rcm);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	/**
	 * 
	 * @param pcm
	 * @return
	 */
	public boolean promoteChatMember(PromoteChatMemberRequest pcm)
	{
		String json = makeRequest(urlPromoteChatMember, pcm);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	/**
	 * 
	 * @param eci
	 * @return
	 */
	public String exportChatInviteLink(ExportChatInviteLinkRequest eci)
	{
		String json = makeRequest(urlExportChatInviteLink, eci);
		return buildResult(json, stringResult, new Result<String>()).getResult();
	}
	
	/**
	 * 
	 * @param lte
	 * @return
	 */
	public Message editMessageLiveLocation(LiveLocationToEdit lte)
	{
		String json = makeRequest(urlEditMessageLiveLocation, lte);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	
	
	/**
	 * 
	 * @param lts
	 * @return
	 */
	public Message stopMessageLiveLocation(LiveLocationToStop lts)
	{
		String json = makeRequest(urlStopMessageLiveLocation, lts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	
	
	/**
	 * 
	 * @param scp
	 * @return
	 */
	public boolean setChatPhoto(SetChatPhotoRequest scp)
	{
		String json = makeRequest(urlSetChatPhoto, scp);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	/**
	 * 
	 * @param dcp
	 * @return
	 */
	public boolean deleteChatPhoto(DeleteChatPhotoRequest dcp)
	{
		String json = makeRequest(urlDeleteChatPhoto, dcp);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}

	public List<Message> sendMediaGroup(MediaGroupToSend<?> mediaGroupToSend)
	{
		String json = makeMediaGroupToSendRequest(urlSendMediaGroup, mediaGroupToSend);
		return buildResult(json, listMessageResult, new Result<List<Message>>()).getResult();
	}
	/**
	 * 
	 * @param sct
	 * @return
	 */
	public boolean setChatTitle(SetChatTitleRequest sct)
	{
		String json = makeRequest(urlSetChatTitle, sct);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	/**
	 * 
	 * @param scd
	 * @return
	 */
	public boolean setChatDescription(SetChatDescriptionRequest scd)
	{
		String json = makeRequest(urlSetChatDescription, scd);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	
	/**
	 * 
	 * @param pcm
	 * @return
	 */
	public boolean pinChatMessage(PinChatMessageRequest pcm)
	{
		String json = makeRequest(urlPinChatMessage, pcm);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}

	public boolean unpinChatMessage(UnpinChatMessageRequest ucm)
	{
		String json = makeRequest(urlUnpinChatMessage, ucm);
		return buildResult(json, booleanResult, new Result<Boolean>()).getResult();
	}
	/**
	 * 
	 * @param emr
	 * @return
	 */
	public Message editMessageReplyMarkup(EditMessageReplyMarkupRequest emr) {
		String json = makeRequest(urlEditMessageReplyMarkup, emr);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	public WebhookInfo getWebhookInfo() {
		String json = makeRequest(urlGetWebhookInfo, null);
		return buildResult(json, webHookInfoResult, new Result<WebhookInfo>()).getResult();
	}

	/**
	 * 
	 * @param aiq
	 * @return
	 */
	public boolean answerInlineQuery(AnswerInlineQueryRequest aiq) {
		return buildResult(makeRequest(urlAnswerInlineQuery, aiq), booleanResult, new Result<Boolean>()).getOk();
	}

	/**
	 * 
	 * @param acq
	 * @return
	 */
	public boolean answerCallbackQuery(AnswerCallbackQueryToSend acq) {
		return buildResult(makeRequest(urlAnswerCallbackQuery, acq), booleanResult, new Result<Boolean>()).getOk();
	}

	/**
	 * Use this method to get a list of profile pictures for a user. Returns a
	 * UserProfilePhotos object.
	 * 
	 * @param upr
	 * @return
	 */
	public UserProfilePhotos getUserProfilePhotos(UserProfilePhotosRequest upr) {
		String json = makeRequest(urlGetUserProfilePhotos, upr);
		return buildResult(json, userProfilePhotosResult, new Result<UserProfilePhotos>()).getResult();
	}

	public DownlodableFile getFile(GetFile gf) {
		String json = makeRequest(urlGetFile, gf);
		return buildResult(json, downlodableFileResult, new Result<DownlodableFile>()).getResult();
	}

	private <T> Result<T> buildResult(String json, Type type, Result<T> source) {
		Result<T> result = source;
		try {
			result = gson.fromJson(json, type);
		}

		catch (JsonSyntaxException e) {
			errorLogger.log(Level.SEVERE, json, e);
		}

		catch (Exception e) {
			errorLogger.log(Level.SEVERE, json, e);
		}

		if (result == null)
			return source;
		return result;
	}
	
	public File downloadFileFromTelegramServer(DownlodableFile df, String filename) {

		okhttp3.Request request = new okhttp3.Request.Builder().url(urlDownloadFile + df.getFilePath()).build();
		try (Response response = client.newCall(request).execute()) {
			File f = new File(filename);
			BufferedSink sink = Okio.buffer(Okio.sink(f));
            sink.writeAll(response.body().source());
            sink.close();
            return f;
		}
		
		catch (IOException e1) {
			errorLogger.log(Level.SEVERE, df.getClass().getName(), e1);
		}
		return null;
	}
	
	private String makeRequest(String url, Request req) {
		Builder formBody = getFormBodyBuilderFromRequest(req);
		okhttp3.Request request = new okhttp3.Request.Builder().url(url).post(formBody.build()).build();
		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		} catch (IOException e1) {
			errorLogger.log(Level.SEVERE, req.getClass().getName(), e1);
		}
		return "";
	}

	private String makeFileRequest(String url, FileRequest fr) {
		okhttp3.Request request = new okhttp3.Request.Builder().url(url)
				.post(getMultipartBodyBuilderFromRequest(fr).build()).build();
		Response response;
		try {
			response = client.newCall(request).execute();
			return response.body().string();
		} catch (IOException e) {
			errorLogger.log(Level.SEVERE, fr.getClass().getName(), e);
		}

		return "";
	}

	private String makeMediaGroupToSendRequest(String url, MediaGroupToSend<?> mgts) {
		okhttp3.Request request = new okhttp3.Request.Builder().url(url)
				.post(getMultipartBodyBuilderFromRequest(mgts).build()).build();
		Response response;
		try {
			response = client.newCall(request).execute();
			return response.body().string();
		} catch (IOException e) {
			errorLogger.log(Level.SEVERE, mgts.getClass().getName(), e);
		}
		return "";
	}

	private Builder getFormBodyBuilderFromRequest(Request req) {
		Builder formBody = new FormBody.Builder();
		if (req != null)
			for (Entry<String, Object> e : req.getValuesMap().entrySet()) {
				if (e.getValue() != null && e.getKey() != null)
					formBody.add(e.getKey(), e.getValue().toString());
			}

		return formBody;
	}

	private okhttp3.MultipartBody.Builder getMultipartBodyBuilderFromRequest(FileRequest req) {
		MediaType contentType = MediaType.parse(Constants.URLDATACONTENTTYPE);
		okhttp3.MultipartBody.Builder requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM);

		requestBody.addFormDataPart(req.getFormDataParameterName(), req.getFile().getName(),
				RequestBody.create(contentType, req.getFile()));

		for (Entry<String, Object> e : req.getValuesMap().entrySet()) {
			if (e.getValue() != null && e.getKey() != null)
				requestBody.addFormDataPart(e.getKey(), e.getValue().toString());
		}
		return requestBody;
	}

	private okhttp3.MultipartBody.Builder getMultipartBodyBuilderFromRequest(MediaGroupToSend<?> mgts) {
		MediaType contentType = MediaType.parse(Constants.URLDATACONTENTTYPE);
		okhttp3.MultipartBody.Builder requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM);

		List<File> inputMediaFiles = mgts.getMediaFiles();

		for(File inputMediaFile : inputMediaFiles)
		{
			requestBody.addFormDataPart(inputMediaFile.getName(), inputMediaFile.getName(),
					RequestBody.create(contentType, inputMediaFile));
		}

		for (Entry<String, Object> e : mgts.getValuesMap().entrySet()) {
			if (e.getValue() != null && e.getKey() != null)
				requestBody.addFormDataPart(e.getKey(), e.getValue().toString());
		}
		return requestBody;
	}


}
