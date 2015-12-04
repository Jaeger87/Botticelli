package com.botticelli.bot.request.methods.types;

/**
 * The return for the request of user profile photo
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class ResultUserProfilePhoto extends Result{

	private UserProfilePhotos result;
	
	/**
	 * User profile photo.
	 * @return
	 */
	public UserProfilePhotos getResult()
	{
		return result;
	}
}
