/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * 
 */
package andrey.gordeev.applicationtest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import andrey.gordeev.application.Application;
import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * @author Пользователь
 *
 */
public class ApplicationTest {

	private Application application;
	boolean result = false;
	
	@Before
	public void setUp() {
		application = new Application();
	}
	
	@Test
	public void testExistingURL() {
		application.setVideoURL("dss");
		getPreparingVideosResult();
		assertFalse(result);
	}

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
