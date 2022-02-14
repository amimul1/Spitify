/*
 * AUTHOR: Amimul Ehsan Zoha 
 * 
 * FILE: UserCollection.java
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



import java.util.TreeMap;
import java.util.Map;


public class UserCollection {
	private Map<String,User> userMap;
	//Constructing a new instance of the class
	public UserCollection() {
		
		//Tree Map is used for alphabetiacal sorting.
		userMap = new TreeMap<String,User>();	
	}
	/*
	* A method that returns returns true if a user with the specified username exists.
	* @param username, is the string representing username
	* @return boolean, returns true if a user with the specified username exists.
	*/ 
	public boolean userExists(String username) {
		return userMap.containsKey(username);
	}
	/*
	* A method that turns the User associated with the login credentials
	*  if a valid login or null if the login was invalid.
	* @param username, is the string representing username
	* @param password, is the string representing password
	* @return user object or null according to login credentials.
	*/  
	public User login(String username, String password) {
		if (userMap.containsKey(username)){
				
			User userToLogin = userMap.get(username);
			if (userToLogin.attemptLogin(password)==true) {
				return userToLogin;
				}
			return null;
			
		}
			return null;	
	}
	
	/*
	* A method that adds param user to the collection of all users. 
	* @param user, user to be added.
	*/
	
	public void addUser(User add) {
		userMap.put(add.getName(),add);
	}
	/*
	* A  method that returns a string description of all the
	*  users in alphabetical order. 
	*
	* @return stringDescription string description of all the
	*  users in alphabetical order. //Tree Map was used for
	*  alphabetical sorting.
	*/ 
	public String toString() {
        String stringDescription = "";
        for (String userName: userMap.keySet()) {
            stringDescription += userName + userMap.get(userName).toString() + "\n";
        } 
        return stringDescription;
    }

}
