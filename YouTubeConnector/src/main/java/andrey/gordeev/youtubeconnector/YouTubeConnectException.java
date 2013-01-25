/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
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
