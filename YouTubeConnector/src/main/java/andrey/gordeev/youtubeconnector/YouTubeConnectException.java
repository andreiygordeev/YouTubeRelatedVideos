/**
 * 
 */
package andrey.gordeev.youtubeconnector;

import java.io.IOException;

/**
 * @author Пользователь
 *
 */
public final class YouTubeConnectException extends IOException{

	private static final long serialVersionUID = 1L;
	
	public YouTubeConnectException(String message) {
		super(message);
	}
}
