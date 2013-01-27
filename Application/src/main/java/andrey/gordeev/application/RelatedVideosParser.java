/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.application provides interface for YouTubeRelatedVideos.
 */
package andrey.gordeev.application;

import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;
import andrey.gordeev.youtubeconnector.YouTubeConnector;

/**
 * Provides interface for parsing YouTube page, to get related videos. Using JSoup
 * library to parse HTML page (see <a href="http://jsoup.org/">JSoup</a>). Information about 
 * finding related videos, storing in {@link RelatedVideo}. Getting information about related 
 * videos performed using select-query of JSoup using CSS construction's.
 */
public final class RelatedVideosParser {
	
	private final String TITLE_CSS = "span.title";
	private final String URL_CSS = "a.related-video";
	private final String RATING_CSS = "span.stat.view-count";
	private final String ATTR_URL_CSS = "href";	
	private final String YOUTUBEURL = "http://www.youtube.com";
	
	/**
	 * Method provides connection to YouTube, by {@link YouTubeConnector}. Then, parsed 
	 * received page by using CSS construction's to get information about related videos, 
	 * and storing them in array.
	 * @param videoURL URL to connect to the page.
	 * @return array of related videos.
	 * @throws YouTubeConnectException
	 */
	public ArrayList<RelatedVideo> getRelatedVideos(String videoURL) throws YouTubeConnectException {
		Document doc;
		YouTubeConnector youTubeConnector = new YouTubeConnector();
		
		try {
			doc = youTubeConnector.getYouTubePage(videoURL);
		} catch (YouTubeConnectException exception) {
			throw new YouTubeConnectException("Can't connect to YouTube!");
		}
		
		Elements relatedVideoHTMLElements = doc.select(URL_CSS);		
		ArrayList<RelatedVideo> relatedVideos = new ArrayList<RelatedVideo>();
		
		for(Element element : relatedVideoHTMLElements) {			
			String title = element.select(TITLE_CSS).text();
			String URL = YOUTUBEURL + element.select(URL_CSS).attr(ATTR_URL_CSS);
			String rating = element.select(RATING_CSS).text();
			relatedVideos.add(new RelatedVideo(title, URL, rating));
		}		
		return relatedVideos;
	}
	
}
