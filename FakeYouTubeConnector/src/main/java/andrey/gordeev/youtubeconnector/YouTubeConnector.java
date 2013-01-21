/**
 * 
 */
package andrey.gordeev.youtubeconnector;

import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


/**
 * @author Пользователь
 *
 */
public final class YouTubeConnector {
	
	public Document getYouTubePage(String videoURL) throws YouTubeConnectException{
		InputStream inputRecource = null;
		try {
			inputRecource = this.getClass().getResource("/Maroon 5 - Moves Like Jagger ft. Christina Aguilera - YouTube.html").openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		String fakeYouTubePage = Utils.readInputSream(inputRecource);
		Document doc;
		doc = Jsoup.parse(fakeYouTubePage);
		return doc;
	}
	
}