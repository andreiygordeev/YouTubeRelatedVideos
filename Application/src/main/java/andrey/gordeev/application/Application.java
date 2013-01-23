/**
 * 
 */
package andrey.gordeev.application;

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
		output(relatedVideos);
	}
	
	private String input() {
		System.out.print("Input YouTube video URL: ");
		Scanner in = new Scanner(System.in);
		String videoURL = in.nextLine();
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
}
