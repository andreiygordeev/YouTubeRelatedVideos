/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
package andrey.gordeev.youtubeconnectortest;

import org.junit.Test;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;
import andrey.gordeev.youtubeconnector.YouTubeConnector;

/**
 * Tested class {@link YouTubeConnector}.
 *
 */
public class YouTubeConnectorTest {

	/**
	 * Testing behavior getting YouTube page with incorrect URL.
	 * @throws YouTubeConnectException when user input incorrect URL. 
	 * If exception were thrown, all working correctly and test are succeed.
	 */
	@Test(expected = YouTubeConnectException.class)
	public void testGetYouTubePage() throws YouTubeConnectException {
		YouTubeConnector youTubeConnector = new YouTubeConnector();
		try {
			youTubeConnector.getYouTubePage("htp://www.youtube.m/");
		} catch(IllegalArgumentException exception) {
			throw new YouTubeConnectException("Incorrect link to YouTube page!");
		}
	}

}
