/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.application provides interface for YouTubeRelatedVideos.
 */
package andrey.gordeev.application;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * Main class, that controls application.
 */
public final class Main {

	/**
	 * Controls application. If input URL is correct, output related video to console. 
	 * Else, exit application with error.
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
