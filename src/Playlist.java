/*
 * AUTHOR: Amimul Ehsan Zoha 
 * 
 * FILE: Playlist.java
 * 
 * ASSIGNMENT: PA 4 Playlist
 * 
 * COURSE: CS 210 Fall 21
 * 
 * PURPOSE: This class is a blueprint for creating 
 * playlist objects on mother class spitify.
 * 
 * 
 */

import java.util.List;
import java.util.ArrayList;
//constructs a new instance of the Playlist class

public class Playlist {
	//Fields
	private String name;
	private List<Song> playlistContents;
	
	public Playlist(String name) {
		this.name = name;
		playlistContents = new ArrayList<Song>();

	}
	
	//constructs a new instance of the Playlist class
	public Playlist(String name, List <Song> contents) {
		this.name = name;
		playlistContents = new ArrayList<Song>();
		playlistContents.addAll(contents);
	}
	/*
	* A method that returns the name of the playlist
	* @return string, the name of the playlist
	*/
	
	public String getName() {
		return this.name;
	}
	/*
	* A method that returns adds song to the playlist
	* @return string, the name of the playlist
	*/
	
	public void addSong(Song song) {
		playlistContents.add(song);
	}
	/*
	* A method that plays the playlist by printing 
	* each song
	*/
	
	public void play() {
		for (Song song : playlistContents) {
			song.play();
		}
	}
	/*
	* A method that removes song from the playlist if it
	* exists in the playlist.
	*/
	
	public void removeSong(Song song) {
		if (playlistContents.contains(song)) {
			playlistContents.remove(song);	
		}	
	}
}
