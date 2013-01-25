/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.youtubeconnector is a connector to YouTube page, for loading html-code of the page.
 */
package andrey.gordeev.youtubeconnector;

import java.io.IOException;

/**
 * Exception, which throws, when can't get page for some reason.
 */
public final class YouTubeConnectException extends IOException{

	private static final long serialVersionUID = 1L;
	
	public YouTubeConnectException(String message) {
		super(message);
	}
}
