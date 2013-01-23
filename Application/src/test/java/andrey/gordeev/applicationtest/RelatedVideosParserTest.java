/**
 * 
 */
package andrey.gordeev.applicationtest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import andrey.gordeev.application.RelatedVideo;
import andrey.gordeev.application.RelatedVideosParser;
import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * @author Пользователь
 *
 */
public class RelatedVideosParserTest {

	private static final String youTubeTestURL = "http://www.youtube.com/watch?v=c9mmxawZ-6w";
	
	/**
	 * Test method for {@link andrey.gordeev.application.RelatedVideosParser#getRelatedVideos(java.lang.String)}.
	 * @throws YouTubeConnectException 
	 */
	@Test
	public void testGetRelatedVideosIncorrect() throws YouTubeConnectException {
		RelatedVideosParser relatedVidoesParser = new RelatedVideosParser();
		ArrayList<RelatedVideo> realRelatedVideos = new ArrayList<RelatedVideo>();
		try {
			realRelatedVideos = relatedVidoesParser.getRelatedVideos("https://www.google.ru/");
		} catch (YouTubeConnectException exception) {
			throw new YouTubeConnectException("Can't connect to YouTube!");
		}
		assertTrue(realRelatedVideos.size() == 0);
	}
	
	/**
	 * Test method for {@link andrey.gordeev.application.RelatedVideosParser#getRelatedVideos(java.lang.String)}.
	 * @throws YouTubeConnectException 
	 */
	@Test
	public void testGetRelatedVideosCorrect() throws YouTubeConnectException {
		RelatedVideosParser relatedVidoesParser = new RelatedVideosParser();
		ArrayList<RelatedVideo> realRelatedVideos = new ArrayList<RelatedVideo>();
		try {
			realRelatedVideos = relatedVidoesParser.getRelatedVideos(youTubeTestURL);
		} catch (YouTubeConnectException exception) {
			throw new YouTubeConnectException("Can't connect to YouTube!");
		}
		assertTrue(realRelatedVideos.size() != 0);
	}

}
