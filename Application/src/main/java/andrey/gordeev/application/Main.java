/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * 
 */
package andrey.gordeev.application;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * @author Пользователь
 *
 */
public final class Main {

	/**
	 * @param args
	 * @throws YouTubeConnectException 
	 */
	public static void main(String[] args) throws YouTubeConnectException {
		Application application = new Application();
		application.input();
		if(application.prepareVideos()) {
			application.output();
		} else {
			System.exit(1);
		}
	}

}
