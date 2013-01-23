/**
 * 
 */
package andrey.gordeev.application;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * @author Пользователь
 *
 */
public final class Application {
	
	public void youTubeRelatedVideos() throws YouTubeConnectException {
		RelatedVideosParser relatedVideosParser = new RelatedVideosParser();
		ArrayList<RelatedVideo> relatedVideos = relatedVideosParser.getRelatedVideos(input());
		if(relatedVideos.size() == 0) {
			System.out.println("You input incorrect URL");
			System.exit(1);
		}
		output(relatedVideos);
	}
	
	private String input() {
		System.out.print("Input YouTube video URL: ");
		Scanner in = new Scanner(System.in);
		String videoURL = in.nextLine();
		if(!exists(videoURL)) {
			System.out.println("Your URL does not exist.");
			System.exit(1);
		}
		return videoURL;
	}
	
	private void output(ArrayList<RelatedVideo> relatedVideos) {
		System.out.println("\nRelated videos info: ");
		for(int i = 0; i < relatedVideos.size(); i++) {
			System.out.println("Tittle: " + relatedVideos.get(i).getTitle());
			System.out.println("URL: " + relatedVideos.get(i).getURL());
			System.out.println("Rating: " + relatedVideos.get(i).getRating() + "\n");
		}
	}
	
	public boolean exists(String URLName) {
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(URLName).openConnection();
			connection.setRequestMethod("HEAD");
			return (connection.getResponseCode() == HttpURLConnection.HTTP_OK);
	    }
		catch(MalformedURLException exception) {
			return false;
		}
	    catch(Exception exception) {
	       exception.printStackTrace();
	       return false;
	    }
	}  
}
