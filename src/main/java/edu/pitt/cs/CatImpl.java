package edu.pitt.cs;

public class CatImpl implements Cat {

	// TOD: Fill in with member variables
	private String catname;
	private int catid;
	private boolean rented;

	public CatImpl(int id, String name) {
		// TOD: Fill in
		catname = name;
		catid = id;
		rented = false;
	}

	public void rentCat() {
		// TOD: Fill in
		rented = true;
	}

	public void returnCat() {
		// TOD: Fill in
		rented = false;
	}

	public void renameCat(String name) {
		// TOD: Fill in
		catname = name;
	}

	public String getName() {
		// TOD: Fill in
		return catname;
	}

	public int getId() {
		// TOD: Fill in
		return catid;
	}

	public boolean getRented() {
		// TOD: Fill in
		return rented;
	}

	public String toString() {
		// TOD: Fill in
		return ("ID "+catid+". "+catname);
	}

}