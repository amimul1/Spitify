/*
 * AUTHOR: Amimul Ehsan Zoha 
 * 
 * FILE: Song.java
 * 
 * ASSIGNMENT: PA 4 Spitify
 * 
 * COURSE: CS 210 Fall 21
 * 
 * PURPOSE: This class is a blueprint for creating 
 * song objects on mother class spitify.
 * 
 * 
 */

public class Song {
	// declaring the private fields
	private String title;
	private String artist;
	private int playCount;
	
	// Constructing an instance of the song class.
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;	
	}
	/*
	* A method that return the title of the song. 
	* @return title. title of the song.
	*/
	public String getTitle() {
		return this.title;
	}
	/*
	* A method that return the artist of the song.
	* @return artist, the artist of the song
	*/
	public String getArtist() {
		return this.artist;
	}
	/*
	* A method that return the number of times this song has been played. 
	
	* @return playCount, the number of times a song is played.
	*/
	public int getTimesPlayed() {
		return this.playCount;
		
	}
	/*
	* A method that ‘play’ the song by printing a description of it 
	* and increment the number of times it has been played. 
	*/
	public void play() {
		System.out.println(this.toString());
		this.playCount+=1;
		
	}
	/*
	* A method that returns return a string description of this song. 
	* format: title by artist, timesPlayed play(s).
	*/
	public String toString() {
		return title + " by " + artist + ", " + playCount + " play(s)" ;
	}
	

}
