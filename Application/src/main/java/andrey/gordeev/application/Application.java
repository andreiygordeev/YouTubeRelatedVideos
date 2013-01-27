/**
 * Copyright (C) 25.01.2013 Andrey Gordeev andreiy.gordeev@gmail.com
 * Free to use all application, or any part of source code.
 */
/**
 * andrey.gordeev.application provides interface for YouTubeRelatedVideos.
 */
package andrey.gordeev.application;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import andrey.gordeev.youtubeconnector.YouTubeConnectException;

/**
 * Destination of this class is to control all part's of the application. It is responsible
 * for interaction with user, by console.
 *
 */
public final class Application {
	
	private String videoURL = " ";
	private ArrayList<RelatedVideo> relatedVideos = new ArrayList<RelatedVideo>();

	/**
	 * Method getting related videos, by URL, that contain's in videoURL. If URL is not
	 * valid, returning false, without parsing.
	 * 
	 * @return true - when parsing is done.
	 * 		   false - when URL is not valid.
	 * @throws YouTubeConnectException
	 */
	public boolean prepareVideos() throws YouTubeConnectException {
		if(!exists(videoURL)) {
			System.out.println("Your URL does not exist.");
			return false;
		}
		
		RelatedVideosParser relatedVideosParser = new RelatedVideosParser();
		relatedVideos = relatedVideosParser.getRelatedVideos(videoURL);
		return true;
	}
	
	/**
	 * Console user input. Getting video URL, to parse.
	 */
	public void input() {
		System.out.print("Input YouTube video URL: ");
		Scanner in = new Scanner(System.in);
		videoURL = in.nextLine();
	}
	
	/**
	 * Outputting information of related videos to console.
	 */
	public void output() {
		if(relatedVideos.size() == 0) {
			System.out.println("There are no related videos.");
			return;
		}
		System.out.println("\nRelated videos info: ");
		for(int i = 0; i < relatedVideos.size(); i++) {
			System.out.println("Tittle: " + relatedVideos.get(i).getTitle());
			System.out.println("URL: " + relatedVideos.get(i).getURL());
			System.out.println("Rating: " + relatedVideos.get(i).getRating() + "\n");
		}
	}
	
	/**
	 *  Checking, is URL really exist's, by HTTP HEAD-request.
	 * @param URLName
	 * @return true - if URL exist.
	 * 		   false - if URL does not exist.
	 */
	private boolean exists(String URLName) {
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
	
	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public ArrayList<RelatedVideo> getRelatedVideos() {
		return relatedVideos;
	}

	public void setRelatedVideos(ArrayList<RelatedVideo> relatedVideos) {
		this.relatedVideos = relatedVideos;
	}

}
