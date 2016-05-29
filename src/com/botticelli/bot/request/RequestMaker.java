package com.botticelli.bot.request;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Type;


import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import com.botticelli.bot.request.methods.AnswerCallbackQueryToSend;
import com.botticelli.bot.request.methods.AnswerInlineQueryRequest;
import com.botticelli.bot.request.methods.AudioFileToSend;
import com.botticelli.bot.request.methods.AudioReferenceToSend;
import com.botticelli.bot.request.methods.ChatActionToSend;
import com.botticelli.bot.request.methods.ChatMemberRequest;
import com.botticelli.bot.request.methods.ChatRequests;
import com.botticelli.bot.request.methods.ContactToSend;
import com.botticelli.bot.request.methods.DocumentFileToSend;
import com.botticelli.bot.request.methods.DocumentReferenceToSend;
import com.botticelli.bot.request.methods.EditMessageCaptionRequest;
import com.botticelli.bot.request.methods.EditMessageReplyMarkupRequest;
import com.botticelli.bot.request.methods.EditMessageTextRequest;
import com.botticelli.bot.request.methods.FileRequest;
import com.botticelli.bot.request.methods.ForwardMessageToSend;
import com.botticelli.bot.request.methods.GetFile;
import com.botticelli.bot.request.methods.KickChatMemberRequest;
import com.botticelli.bot.request.methods.LocationToSend;
import com.botticelli.bot.request.methods.MessageToSend;
import com.botticelli.bot.request.methods.PhotoFileToSend;
import com.botticelli.bot.request.methods.PhotoReferenceToSend;
import com.botticelli.bot.request.methods.Request;
import com.botticelli.bot.request.methods.StickerFileToSend;
import com.botticelli.bot.request.methods.StickerReferenceToSend;
import com.botticelli.bot.request.methods.UnbanChatMemberRequest;
import com.botticelli.bot.request.methods.UpdateRequest;
import com.botticelli.bot.request.methods.UserProfilePhotosRequest;
import com.botticelli.bot.request.methods.VenueToSend;
import com.botticelli.bot.request.methods.VideoFileToSend;
import com.botticelli.bot.request.methods.VideoReferenceToSend;
import com.botticelli.bot.request.methods.VoiceFileToSend;
import com.botticelli.bot.request.methods.VoiceReferenceToSend;
import com.botticelli.bot.request.methods.types.Chat;
import com.botticelli.bot.request.methods.types.ChatMember;
import com.botticelli.bot.request.methods.types.DownlodableFile;
import com.botticelli.bot.request.methods.types.Result;
import com.botticelli.bot.request.methods.types.GsonOwner;
import com.botticelli.bot.request.methods.types.Message;
import com.botticelli.bot.request.methods.types.Update;
import com.botticelli.bot.request.methods.types.UserProfilePhotos;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class RequestMaker
{
	private String urlGetUpdates;
	private String urlSendMessage;
	private String urlForwardMessage;
	private String urlSendPhoto;
	private String urlSendAudio;
	private String urlSendDocument;
	private String urlSendSticker;
	private String urlSendVideo;
	private String urlSendVoice;
	private String urlSendVenue;
	private String urlSendContact;
	private String urlAnswerInlineQuery;
	private String urlAnswerCallbackQuery;
	private String urlLeaveChat;;
	private String urlGetChat;
	private String urlGetChatAdministrators;
	private String urlGetMembersCount;
	private String urlGetMember;
	private String urlKickChatMember;
	private String urlUnbanChatMember;
	private String urlEditMessageText;
	private String urlEditMessageCaption;
	private String urlEditMessageReplyMarkup;
	private String urlSendLocation;
	private String urlSendChatAction;
	private String urlGetUserProfilePhotos;
	private String urlGetFile;
	private String urlDownloadFile;
	
	
	private Type intResult;
	private Type chatResult;
	private Type booleanResult;
	private Type messageResult;
	private Type userProfilePhotosResult;
	private Type downlodableFileResult;
	private Type listUpdateResult;
	private Type listChatMembersResult;
	private Type chatMembersResult;
	
	
	private final static Logger errorLogger = Logger.getLogger("errors");

	private Gson gson;

	public RequestMaker(String token)
	{
		gson = GsonOwner.getInstance().getGson();

		urlGetUpdates = Constants.APIURL + token + Constants.GETUPDATES;
		urlSendMessage = Constants.APIURL + token + Constants.SENDMESSAGE;
		urlForwardMessage = Constants.APIURL + token + Constants.FORWARDMESSAGE;
		urlSendPhoto = Constants.APIURL + token + Constants.SENDPHOTO;
		urlSendAudio = Constants.APIURL + token + Constants.SENDAUDIO;
		urlSendDocument = Constants.APIURL + token + Constants.SENDDOCUMENT;
		urlSendSticker = Constants.APIURL + token + Constants.SENDSTICKER;
		urlSendVideo = Constants.APIURL + token + Constants.SENDVIDEO;
		urlSendVoice = Constants.APIURL + token + Constants.SENDVOICE;
		urlSendLocation = Constants.APIURL + token + Constants.SENDLOCATION;
		urlSendChatAction = Constants.APIURL + token + Constants.SENDCHATACTION;
		urlGetUserProfilePhotos = Constants.APIURL + token + Constants.GETUSERPROFILEPHOTOS;
		urlSendVenue = Constants.APIURL + token + Constants.SENDVENUE;
		urlSendContact = Constants.APIURL + token + Constants.SENDCONTACT;
		urlLeaveChat = Constants.APIURL + token + Constants.LEAVECHAT;
		urlGetChat = Constants.APIURL + token + Constants.GETCHAT;
		urlGetChatAdministrators = Constants.APIURL + token + Constants.GETCHATADMINISTRATORS;
		urlGetMembersCount = Constants.APIURL + token + Constants.GETCHATMEMBERSCOUNT;
		urlGetMember = Constants.APIURL + token + Constants.GETCHATMEMBER;
		urlKickChatMember = Constants.APIURL + token + Constants.KICKCHATMEMBER;
		urlUnbanChatMember = Constants.APIURL + token + Constants.UNBANCHATMEMBER;
		urlEditMessageText = Constants.APIURL + token + Constants.EDITMESSAGETEXT;
		urlEditMessageCaption = Constants.APIURL + token + Constants.EDITMESSAGECAPTION;
		urlEditMessageReplyMarkup = Constants.APIURL + token + Constants.EDITMESSAGEREPLYMARKUP;
		urlAnswerInlineQuery = Constants.APIURL + token + Constants.ANSWERINLINEQUERY;
		urlAnswerCallbackQuery = Constants.APIURL + token + Constants.ANSWERCALLBACKQUERY;
		urlGetFile = Constants.APIURL + token + Constants.GETFILE;
		urlDownloadFile = Constants.APIFILEURL + token + '/';
		
		
		intResult = new TypeToken<Result<Integer>>() {
        }.getType();
        booleanResult = new TypeToken<Result<Boolean>>() {
        }.getType();
        chatResult = new TypeToken<Result<Chat>>() {
        }.getType();
        messageResult = new TypeToken<Result<Message>>() {
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
	}

	/**
	 * Return the error logger (use to log exception or others strange things).
	 * 
	 * @return
	 */
	public static Logger getErrorLogger()
	{
		return errorLogger;
	}

	/**
	 * Use this method to receive incoming updates using long polling. An Array
	 * of Update objects is returned.
	 * 
	 * @param upr
	 * @return
	 */
	public List<Update> getUpdates(UpdateRequest upr)
	{
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
	public Message sendMessage(MessageToSend mts)
	{
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
	public Message forwardMessage(ForwardMessageToSend fts)
	{
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
	public Message sendPhotobyReference(PhotoReferenceToSend prs)
	{
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
	public Message sendPhotoFile(PhotoFileToSend pfs)
	{
		String json = makeRequestFile(urlSendPhoto, pfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send Audio by file_id, On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param ars
	 * @return
	 */
	public Message sendAudiobyReference(AudioReferenceToSend ars)
	{
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
	public Message sendAudioFile(AudioFileToSend afs)
	{
		String json = makeRequestFile(urlSendAudio, afs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send files by file_id, On success, the sent Message is
	 * returned, else return null.
	 * 
	 * @param drs
	 * @return
	 */
	public Message sendDocumentbyReference(DocumentReferenceToSend drs)
	{
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
	public Message sendDocumentFile(DocumentFileToSend dfs)
	{
		String json = makeRequestFile(urlSendDocument, dfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send Stickers by file_id, On success, the sent Message
	 * is returned, else return null.
	 * 
	 * @param srs
	 * @return
	 */
	public Message sendStickerbyReference(StickerReferenceToSend srs)
	{
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
	public Message sendStickerFile(StickerFileToSend sfs)
	{
		String json = makeRequestFile(urlSendSticker, sfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send video files by file_id, On success, the sent
	 * Message is returned, else return null.
	 * 
	 * @param vrs
	 * @return
	 */
	public Message sendVideobyReference(VideoReferenceToSend vrs)
	{
		String json = makeRequest(urlSendVideo, vrs);
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
	public Message sendVideoFile(VideoFileToSend vfs)
	{
		String json = makeRequestFile(urlSendVideo, vfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * 
	 * @param vrs
	 * @return
	 */
	public Message sendVoicebyReference(VoiceReferenceToSend vrs)
	{
		String json = makeRequest(urlSendVoice, vrs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * 
	 * @param vfs
	 * @return
	 */
	public Message sendVoiceFile(VoiceFileToSend vfs)
	{
		String json = makeRequestFile(urlSendVoice, vfs);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}

	/**
	 * Use this method to send venue. On success, the sent Message is
	 * returned, else return null.
	 * @param vts
	 * @return
	 */
	public Message sendVenue(VenueToSend vts)
	{
		String json = makeRequest(urlSendVenue, vts);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	
	/**
	 * Use this method to send a contact. On success, the sent Message is
	 * returned, else return null.
	 * @param vts
	 * @return
	 */
	public Message sendContact(ContactToSend cts)
	{
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
	public Message sendLocation(LocationToSend lts)
	{
		String json = makeRequest(urlSendLocation, lts);
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
	public void sendChatAction(ChatActionToSend cts)
	{
		makeRequest(urlSendChatAction, cts);
	}

	/**
	 * 
	 * @param kmr
	 * @return
	 */
	public boolean kickChatMember(KickChatMemberRequest kmr)
	{
		return buildResult(makeRequest(urlKickChatMember, kmr), booleanResult, new Result<Boolean>()).getOk();
	}
	
	/**
	 * 
	 * @param kmr
	 * @return
	 */
	public boolean leaveChat(ChatRequests crs)
	{
		return buildResult(makeRequest(urlLeaveChat, crs), booleanResult, new Result<Boolean>()).getOk();
	}
	
	/**
	 * 
	 * @param crs
	 * @return
	 */
	public Chat getChat(ChatRequests crs)
	{
		return buildResult(makeRequest(urlGetChat, crs), chatResult, new Result<Chat>()).getResult();
	}
	/**
	 * 
	 * @param crs
	 * @return
	 */
	public int getChatMembersCount(ChatRequests crs)
	{
		return buildResult(makeRequest(urlGetMembersCount, crs), intResult, new Result<Integer>()).getResult();
	}
	
	
	public List<ChatMember> getChatAdministrators(ChatRequests crs)
	{
		return buildResult(makeRequest(urlGetChatAdministrators, crs), listChatMembersResult, new Result<List<ChatMember>>()).getResult();
	}
	
	public ChatMember getChatMember(ChatMemberRequest cmr)
	{
		return buildResult(makeRequest(urlGetMember, cmr), chatMembersResult, new Result<ChatMember>()).getResult();
	}
	
	
	/**
	 * 
	 * @param umr
	 * @return
	 */
	public boolean unbanChatMember(UnbanChatMemberRequest umr)
	{
		return buildResult(makeRequest(urlUnbanChatMember, umr), booleanResult, new Result<Boolean>()).getOk();
	}
	/**
	 * 
	 * @param emt
	 * @return
	 */
	public Message editMessageText(EditMessageTextRequest emt)
	{
		String json = makeRequest(urlEditMessageText, emt);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	/**
	 * 
	 * @param emc
	 * @return
	 */
	public Message editMessageCaption(EditMessageCaptionRequest emc)
	{
		String json = makeRequest(urlEditMessageCaption, emc);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	/**
	 * 
	 * @param emr
	 * @return
	 */
	public Message editMessageReplyMarkup(EditMessageReplyMarkupRequest emr)
	{
		String json = makeRequest(urlEditMessageReplyMarkup, emr);
		return buildResult(json, messageResult, new Result<Message>()).getResult();
	}
	
	/**
	 * 
	 * @param aiq
	 * @return
	 */
	public boolean answerInlineQuery(AnswerInlineQueryRequest aiq)
	{
        return buildResult(makeRequest(urlAnswerInlineQuery, aiq), booleanResult, new Result<Boolean>()).getOk();
	}
	
	/**
	 * 
	 * @param acq
	 * @return
	 */
	public boolean answerCallbackQuery(AnswerCallbackQueryToSend acq)
	{
        return buildResult(makeRequest(urlAnswerCallbackQuery, acq), booleanResult, new Result<Boolean>()).getOk();
	}
	
	/**
	 * Use this method to get a list of profile pictures for a user. Returns a
	 * UserProfilePhotos object.
	 * 
	 * @param upr
	 * @return
	 */
	public UserProfilePhotos getUserProfilePhotos(UserProfilePhotosRequest upr)
	{
		String json = makeRequest(urlGetUserProfilePhotos, upr);
		return buildResult(json, userProfilePhotosResult, new Result<UserProfilePhotos>()).getResult();
	}

	public DownlodableFile getFile(GetFile gf)
	{
		String json = makeRequest(urlGetFile, gf);
		return buildResult(json, downlodableFileResult, new Result<DownlodableFile>()).getResult();
	}
	
	
	private <T> Result<T> buildResult(String json, Type type, Result<T> source)
	{
		Result<T> result = source;
		try
		{
			result = gson.fromJson(json, type);
		}
		
		catch(JsonSyntaxException e)
		{
			errorLogger.log(Level.SEVERE, json, e);
		}
		
		catch(Exception e)
		{
			errorLogger.log(Level.SEVERE, json, e);
		}
		
		if(result == null)
			return source;
		return result;
	}
	
	
	public File downloadFileFromTelegramServer(DownlodableFile df, String filename)
	{
		
		try {
			URL u = new URL(urlDownloadFile + df.getFilePath());
			File f = new File(filename);
			FileUtils.copyURLToFile(u, f);
			return f;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private String makeRequestFile(String url, FileRequest fr)
	{
		String json = "";
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		Charset chars = Charset.forName("UTF-8");
		builder.setCharset(chars);
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		FileBody fileBody = new FileBody(fr.getFile()); // image should be a
														// String
		builder.addPart(fr.getTypeFile(), fileBody);

		for (Entry<String, Object> e : fr.getValuesMap().entrySet())
		{
			if (e.getValue() != null && e.getKey() != null)
				builder.addTextBody(e.getKey(), e.getValue().toString(), ContentType.TEXT_PLAIN);
		}

		HttpEntity entity = builder.build();

		RequestConfig timeoutParams = RequestConfig.custom().setSocketTimeout(Constants.SOCKETTIMEOUT)
				.setConnectTimeout(Constants.CONNECTTIMEOUT)
				.setConnectionRequestTimeout(Constants.CONNECTIONREQUESTTIMEOUT).build();

		post.setEntity(entity);
		post.setConfig(timeoutParams);

		try
		{
			CloseableHttpResponse response = client.execute(post);

			try
			{
				if (response.getEntity() != null)
					json = readInputStream(response.getEntity().getContent());
			}

			finally
			{
				response.close();
			}
		} catch (ClientProtocolException e1)
		{
			e1.printStackTrace();
			errorLogger.log(Level.SEVERE, fr.getClass().getName(), e1);
			json = "";
		} catch (IOException e1)
		{
			e1.printStackTrace();
			errorLogger.log(Level.SEVERE, fr.getClass().getName(), e1);
			json = "";
		} finally
		{
			try
			{
				client.close();
			}

			catch (IOException e1)

			{
				e1.printStackTrace();
				errorLogger.log(Level.SEVERE, fr.getClass().getName(), e1);
				json = "";
			}
		}
		return json;
	}

	private String makeRequest(String url, Request req)
	{
		String json = "";

		CloseableHttpClient httpclient = HttpClients.createDefault();

		HttpPost httppost = new HttpPost(url);

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		for (Entry<String, Object> e : req.getValuesMap().entrySet())
		{
			if (e.getValue() != null && e.getKey() != null)
				params.add(new BasicNameValuePair(e.getKey(), e.getValue().toString()));
		}
		try
		{
			RequestConfig timeoutParams = RequestConfig.custom().setSocketTimeout(Constants.SOCKETTIMEOUT)
					.setConnectTimeout(Constants.CONNECTTIMEOUT)
					.setConnectionRequestTimeout(Constants.CONNECTIONREQUESTTIMEOUT).build();
			httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
			httppost.setConfig(timeoutParams);
		} catch (UnsupportedEncodingException e)
		{
			// e.printStackTrace();
			errorLogger.log(Level.SEVERE, req.getClass().getName(), e);
			return "";
		}

		try
		{

			CloseableHttpResponse response = httpclient.execute(httppost);

			try
			{
				HttpEntity entity = response.getEntity();

				if (entity != null)
					json = readInputStream(entity.getContent());
			}

			finally
			{
				try
				{
					response.close();
				} catch (IOException e1)
				{
					e1.printStackTrace();
					json = "";
				}

			}
		} catch (ClientProtocolException e1)
		{
			// e1.printStackTrace();
			errorLogger.log(Level.SEVERE, req.getClass().getName(), e1);
			json = "";
		} catch (IOException e1)
		{
			// e1.printStackTrace();
			errorLogger.log(Level.SEVERE, req.getClass().getName(), e1);
			json = "";
		}

		finally
		{
			try
			{
				httpclient.close();
			}
			catch (IOException e1)
			{
				errorLogger.log(Level.SEVERE, req.getClass().getName(), e1);
				json = "";
			}
		}
		return json;
	}

	private String readInputStream(InputStream input)
	{
		String result = "";
		try
		{
			try
			{
				for (int c = input.read(); c != -1; c = input.read())
					result += (char) c;
			} catch (IOException e)
			{
				errorLogger.log(Level.SEVERE, "", e);
				return "";
			}

		} finally
		{
			try
			{
				input.close();
			} catch (IOException e)
			{
				errorLogger.log(Level.SEVERE, "", e);
				return "";
			}
		}
		return result;
	}
}
