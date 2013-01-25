/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
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
		} catch (IOException exception) {
			exception.printStackTrace();
		}	
		String fakeYouTubePage = Utils.readInputSream(inputRecource);
		Document doc = Jsoup.parse(fakeYouTubePage);
		return doc;
	}
	
}