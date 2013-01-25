/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * 
 */
package andrey.gordeev.youtubeconnectortest;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/**
 * @author Пользователь
 *
 */
public class YouTubeConnectorTest {

	@Test(expected = NullPointerException.class)
	public void testInputFakeFile() {
		try {
			@SuppressWarnings("unused")
			InputStream inputRecource = this.getClass().getResource("sss").openStream();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
