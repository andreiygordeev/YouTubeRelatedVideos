/**
 * 
 */
package andrey.gordeev.application;

/**
 * @author Пользователь
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
