/**
 * 
 */
package andrey.gordeev.youtubeconnector;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author Пользователь
 *
 */
public final class YouTubeConnector {

	public Document getYouTubePage(String videoURL) throws YouTubeConnectException {
		try {
			Document doc = Jsoup.connect(videoURL).get();
			return doc;
		} catch (IOException e) {
			throw new YouTubeConnectException("Can't connect to YouTube!");
		}
	}
}
