/**
 * 
 */
package andrey.gordeev.application;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * @author ������������
 *
 */
public final class Main {

	/**
	 * @param args
	 * @throws YouTubeConnectException 
	 */
	public static void main(String[] args) throws YouTubeConnectException {
		Application application = new Application();
		application.youTubeRelatedVideos();
	}

}