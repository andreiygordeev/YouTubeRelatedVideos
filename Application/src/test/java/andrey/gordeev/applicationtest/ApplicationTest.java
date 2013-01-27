/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.applicationtest - package for testing application API.
 */
package andrey.gordeev.applicationtest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import andrey.gordeev.application.Application;
import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * Test cases for application API.
 */
public class ApplicationTest {

	private Application application;
	boolean result = false;
	
	@Before
	public void setUp() {
		application = new Application();
	}
	
	/**
	 * Testing behavior of application, with invalid URL. Result of parsing must be false.
	 */
	@Test
	public void testExistingURL() {
		application.setVideoURL("dss");
		getPreparingVideosResult();
		assertFalse(result);
	}

	/**
	 * Testing behavior of application, with valid YouTube URL. Result of parsing must be true.
	 */
	@Test
	public void correctURLTest() {
		application.setVideoURL("http://www.youtube.com/watch?v=Z_AFSemknGs");
		getPreparingVideosResult();
		assertTrue(result);
	}

	private void getPreparingVideosResult() {
		try {
			result = application.prepareVideos();
		} catch (YouTubeConnectException e) {
			e.printStackTrace();
		}
	}

}
