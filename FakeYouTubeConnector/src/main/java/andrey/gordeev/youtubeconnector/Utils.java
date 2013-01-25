/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.youtubeconnector is providing connection to fake YouTube page, for test
 * functionality of application.
 */
package andrey.gordeev.youtubeconnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Util's for FakeYouTube connector.
 */
public final class Utils {
	
	/**
	 * Transforming data from InputStream to String.
	 * @param in - InputStream.
	 * @return result string.
	 */
	public static String readInputSream(InputStream in) {
		InputStreamReader is = new InputStreamReader(in);
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(is);
		String read;
		try {
			read = br.readLine();

			while(read != null) {
			    sb.append(read);
			    read = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
