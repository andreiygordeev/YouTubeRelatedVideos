/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * 
 */
package andrey.gordeev.youtubeconnectortest;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import andrey.gordeev.youtubeconnector.YouTubeConnector;

/**
 * Tested class {@link YouTubeConnector}.
 *
 */
public class YouTubeConnectorTest {

	/**
	 * Test for input resources. If inputResource == null, resource was not loaded.
	 */
	@Test
	public void testInputFakeFile() {
		InputStream inputResource = null;
		try {
			inputResource = this.getClass().getResource("/Maroon 5 - Moves Like Jagger ft. Christina Aguilera - YouTube.html").openStream();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		assertFalse(inputResource == null);
	}

}
