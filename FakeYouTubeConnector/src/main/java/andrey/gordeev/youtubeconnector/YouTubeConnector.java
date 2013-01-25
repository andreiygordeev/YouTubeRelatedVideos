/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.youtubeconnector is providing connection to fake YouTube page, for test
 * functionality of application.
 */
package andrey.gordeev.youtubeconnector;

import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


/**
 * Provides mock-realization of YouTube connector, that getting YouTube page
 * from resources. Transforming input resource to a string with {@link Utils#readInputSream(InputStream in)}.
 * To get page uses JSoup library (see <a href="http://jsoup.org/">JSoup</a>).
 */
public final class YouTubeConnector {
	
	/**
	 * @param videoURL URL to connect to the page.
	 * @return document, which contains html source-code of the page.
	 * @throws YouTubeConnectException
	 */
	public Document getYouTubePage(String videoURL) throws YouTubeConnectException{
		InputStream inputResource = null;
		try {
			inputResource = this.getClass().getResource("/Maroon 5 - Moves Like Jagger ft. Christina Aguilera - YouTube.html").openStream();
		} catch (IOException exception) {
			exception.printStackTrace();
		}	
		String fakeYouTubePage = Utils.readInputSream(inputResource);
		Document doc = Jsoup.parse(fakeYouTubePage);
		return doc;
	}
	
}