package com.botticelli.bot.request.types;

import java.util.ArrayList;
import java.util.List;
/**
 * This object represent a user's profile pictures.
 * @author Andrea Rosati (@Jaeger87)
 *
 */
public class UserProfilePhotos {
	
	private int total_count;
	
	private List<PhotoSize> photos;

	/**
	 * Total number of profile pictures the target user has
	 * @return
	 */
	public int getTotalCount()
	{
		return total_count;
	}
	
	/**
	 * Set total number of profile pictures the target user has
	 */
	public void setTotalCount(int total_count)
	{
		this.total_count = total_count;
	}
	
	/**
	 * Requested profile pictures (in up to 4 sizes each)
	 * @return
	 */
	public List<PhotoSize> getPhotos()
	{
		if(photos == null)
			return new ArrayList<PhotoSize>();;
		return new ArrayList<PhotoSize>(photos);
	}
	
	/**
	 * Set profile pictures (in up to 4 sizes each)
	 */
	public void setPhotos(List<PhotoSize> photos)
	{
		if(photos != null)
			this.photos = photos;
	}
}
