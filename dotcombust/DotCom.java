import java.util.*;

public class DotCom { // dotcom's instance variables
	private ArrayList<String> locationCells; //an arraylist of cell locations
	private String name; // the dotcom's name

	public void setLocationCells(ArrayList<String> loc) { // a setter method that updates the dotcom's location. (random location provided by the gamehelper placedotcom() method)
		locationCells = loc;
	}

	public void setName(String n) { // your basic setter method
		name = n;
	}

	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput); // the arraylist indexof() method in action! if the user guess is one of the entries in the arraylist indexof() will return its arraylist location. if not, indexof() will return -1
		if (index >= 0) {
			locationCells.remove(index); //using arraylist's remove() moethod to delete an entry

			if (locationCells.isEmpty()) { // using the isempty() method to see if all of the locations have been guessed
				result = "kill";
				System.out.println("Ouch! You sunk " + name + "  : ( "); // tell the user when a dotcom has been sunk
			} else {
				result = "hit";
			} //close if
		} // close if
		return result; //return: 'miss' or 'hit' or 'kill'
	} //close method
} //close class