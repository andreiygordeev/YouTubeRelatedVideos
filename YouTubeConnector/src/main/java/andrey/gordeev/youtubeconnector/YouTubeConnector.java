/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * 
 */
package andrey.gordeev.youtubeconnector;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author ������������
 *
 */
public final class YouTubeConnector {

	public Document getYouTubePage(String videoURL) throws YouTubeConnectException {
		try {
			Document doc = Jsoup.connect(videoURL).get();
			return doc;
		} catch (IOException exception) {
			throw new YouTubeConnectException("Can't connect to YouTube!");
		}
	}
}
