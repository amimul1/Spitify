/*
 * AUTHOR: Amimul Ehsan Zoha 
 * 
 * FILE: User.java
 * 
 * ASSIGNMENT: PA 4 Spitify
 * 
 * COURSE: CS 210 Fall 21
 * 
 * PURPOSE: This class is a blueprint for creating 
 * userCollection objects on mother class spitify.
 * 
 * 
 */

import java.util.ArrayList;
import java.util.List;
// Creating instances of the user class
public class User {
	 // Fields
	private String name;
	private String password;
	private ArrayList<Playlist> userPlaylist;
	
	public User(String name,String password) {
		this.name = name;
		this.password = password;
		this.userPlaylist = new ArrayList<Playlist>();
	}
	/*
	* A method that returns the name of the user.
	* @param username, is the string representing username
	* @return String, returns the username
	*/ 
	public String getName() {
		return this.name;
	}
	/*
	* A method that returns true if the password is
	*  valid for this user. False otherwise
	* @param password, is the string representing password
	* @return boolean, returns the username
	*/ 
	public boolean attemptLogin(String password) {
		return this.password.equals(password);
	}
	
	/*
	* A method that adds specified playlist to users
	* playlists 
	*/ 

	public void addPlaylist(Playlist newPlaylist) {
		userPlaylist.add(newPlaylist);
		
	}
	
	/*
	* A method that returns  playlist for user
	* @return a list of playlist of user
	*/
	public List<Playlist> getPlaylists() {
		return userPlaylist;
	}
	
	/*
	* A method that selects the playlist with the 
	* specified name if the user has a playlist by 
	* that name and plays it.
	*/
	public void selectPlaylist(String name) {
		for (Playlist plist : this.userPlaylist) {
			if (plist.getName().equals(name)){
				plist.play();
			}
		}
	}
	
	/*
	* A method that eturns a string description of the user 
	* @return a string description of the user
	*/
	public String toString() {
		return this.name + ", " + userPlaylist.size() + " playlists.";
	}
	

}
