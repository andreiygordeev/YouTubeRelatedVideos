/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.application provides interface for YouTubeRelatedVideos.
 */
package andrey.gordeev.application;

/**
 * Java-Bean for storage YouTube related videos information.
 *
 */
public final class RelatedVideo {
	
	private String title;
	private String URL;
	private String rating;
	
	public RelatedVideo() {
		
	}
	
	public RelatedVideo(String title, String URL, String rating) {
		this.title = title;
		this.URL = URL;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}
