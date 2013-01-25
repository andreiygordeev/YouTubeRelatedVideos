/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.youtubeconnector is a connector to YouTube page, for loading html-code of the page.
 */
package andrey.gordeev.youtubeconnector;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Provides interface to get html-page code. Uses JSoup library for connect to page and get
 * it's source-code (@see <a href="http://jsoup.org/">JSoup</a>).
 */
public final class YouTubeConnector {

	/**
	 * Connected to html-page and getting it's source-code.
	 * 
	 * @param videoURL URL to connect to the page.
	 * @return document, which contains html source-code of the page.
	 * @throws YouTubeConnectException
	 */
	public Document getYouTubePage(String videoURL) throws YouTubeConnectException {
		try {
			Document doc = Jsoup.connect(videoURL).get();
			return doc;
		} catch (IOException exception) {
			throw new YouTubeConnectException("Can't connect to YouTube!");
		}
	}
}
