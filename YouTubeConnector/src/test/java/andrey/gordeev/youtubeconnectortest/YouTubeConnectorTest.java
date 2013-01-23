/**
 * 
 */
package andrey.gordeev.youtubeconnectortest;

import org.junit.Test;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;
import andrey.gordeev.youtubeconnector.YouTubeConnector;

/**
 * @author Пользователь
 *
 */
public class YouTubeConnectorTest {

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
