/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * 
 */
package andrey.gordeev.youtubeconnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Пользователь
 *
 */
public final class Utils {
	
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
