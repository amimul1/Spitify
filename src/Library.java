/*
 * AUTHOR: Amimul Ehsan Zoha 
 * 
 * FILE: Library.java
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
//Constructs a new instance of the library class.
public class Library {
	private Map<String,Song> songMap;
	public Library() {
		songMap= new TreeMap<String,Song>();
	}
	/*
	* A method that returns -returns the Song associated 
	* with the Stringtitle if it is in the library, or 
	* null if it is not.
	* @return string, the song or null.
	*/
	public Song getSong(String title){
		if (songMap.containsKey(title)) {
			Song song  = (Song) songMap.get(title);
			return song;
			}
		return null;	
	}
	/*
	* A method that adds song to the library
	*/
	public void addSong(Song song) {
		songMap.put(song.getTitle(),song);
	}
	/*
	* A method that removes song from the library
	*  if it exists.
	*/
	public void removeSong(Song song) {
		if (songMap.containsKey(song.getTitle())){
			songMap.remove(song.getTitle());
		}
		
	}
	/*
	returns a string representation of this library
	@return String, a string representation of the library
	*/
	public String toString()
	{
		String songLibrary = "";
		for (Entry<String, Song> entry : songMap.entrySet())
		{
		    songLibrary += entry.getValue().toString() + "\n";
		}

	 return songLibrary;
	}
}	
	


