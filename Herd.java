package edu.mtc.egr283.project03;

import java.util.ArrayList;

/*******************************************************
 * Class for handling activity at the <code>Walrus</code> herd.
 * This class has an <code>ArrayList</code> of
 * <code>Walrus</code> data and an index list for sorting,
 * methods to access, and to <code>toString</code>.
 * @author Jacob Vaught
 * @version 1.00 2021-02-15 Approximately 4:00 PM EST.
 *
 * Copyright © 2021 by Jacob C. Vaught. All rights reserved.
 **/
public class Herd {
	static final int LENGTH_OF_AGE=5;
	static final int LENGTH_OF_WEIGHT=8;
	static final int LENGTH_OF_NAME=6;
	ArrayList<Walrus> herd;
	int length=LENGTH_OF_NAME;

	/**
	 * Constructor.
	 * Initialize the <code>ArrayList</code> variables.
	 */
	public Herd() {
		this.herd=new ArrayList<Walrus>();
	}// ending bracket of this.herd


	/**
	 * Adds a <code>Walrus</code> to the herd
	 * @param uses name to set name 
	 * @param uses age to set age 
	 * @param uses weight to set weight 
	 */
	public void addWalrus(String name, int age, double weight) {
		Walrus walrus = new Walrus();
		walrus.setName(name);
		walrus.setAge(age);
		walrus.setWeight(weight);
		this.addWalrus(walrus);
	}//ending bracket of method addWalrus

	/**
	 * Adds a <code>Walrus</code> to the herd
	 * @param walrus
	 */
	public void addWalrus(Walrus walrus) {
		this.herd.add(walrus);
	}//ending bracket of method addWalrus

	/**
	 * Returns The Average <code>Walrus</code>'s Age.
	 * @return Average <code>Walrus</code> Age in the <code>herd</code>
	 */
	public int averageAge() {
		double totalAge = 0;
		for(int i=0;i<this.herd.size();i++){
			totalAge=totalAge+this.herd.get(i).getAge();
		}//ending bracket of for
		return (int)(totalAge/this.herd.size());
	}//ending bracket of method averageAge

	/**
	 * Returns The Average <code>Walrus</code>'s weight.
	 * @return Average <code>Walrus</code> weight in the <code>herd</code>
	 */
	public int averageWeight() {
		double totalWeight = 0;
		for(int i=0;i<this.herd.size();i++){
			totalWeight=totalWeight+this.herd.get(i).getWeight();
		}//ending bracket of for
		return (int)(totalWeight/this.herd.size());
	}//ending bracket of method averageWeight

	/**
	 * Method to get an individual <code>Walrus</code>.
	 * @param indexOfWalrusToGet subscript of <code>Walrus</code> to return
	 * @return the <code>Walrus</code>
	 */
	public Walrus getWalrus(int indexOfWalrusToGet) {
		return this.herd.get(indexOfWalrusToGet);
	}//ending bracket of method getWalrus

	/**
	* Method to get the size of the <code>ArrayList</code> of data.
	* We are going to call this an accessor, although it is actually
	* generating derived data.
	* @return the size of the <code>ArrayList</code>
	*/
	public int getSize() {
		return this.herd.size();
	}//ending bracket of method getSize

	/**
	 * Method to find a Walrus in the herd.
	 * This is a linear search.
	 * @param <code>name</code> the name to look up the <code>Walrus</code> of
	 * @return The found <code>Walrus</code>, or null if not found
	 */
	public Walrus findWalrus(String name) {
		int walrusNumber = -1;
		for(int i=0;i<this.herd.size();i++){
			if(this.herd.get(i).compareName(name)) {
				walrusNumber=i;
			}//ending bracket of if
		}//ending bracket of for
		return this.herd.get(walrusNumber);
	}//ending bracket of method findWalrus

	/**
	 * Removes a <code>Walrus</code> using <code>findWalrus()</code>
	 * @param <code>name</code> the name to look up the <code>Walrus</code> to remove.
	 */
	public void removeWalrus(String name) {
		this.herd.remove(findWalrus(name));
	}//ending bracket of method removeWalrus

	/**
	 * Returns The Largest <code>Walrus</code>
	 * @return Largest <code>Walrus</code> in the <code>herd</code>
	 */
	public Walrus largestWalrus() {
		int walrusNumber = 0;
		double highestWeight = this.herd.get(walrusNumber).getWeight();
		for(int i=0;i<this.herd.size();i++){
			if(this.herd.get(i).getWeight()>highestWeight) {
				highestWeight=this.herd.get(i).getWeight();
				walrusNumber=i;
			}//ending bracket of if
		}//ending bracket of for
		return this.herd.get(walrusNumber);
	}//ending bracket of method largestWalrus

	/**
	 * Returns The smallest <code>Walrus</code>
	 * @return smallest <code>Walrus</code> in the <code>herd</code>
	 */
	public Walrus smallestWalrus() {
		int walrusNumber = 0;
		double lowestWeight = this.herd.get(walrusNumber).getWeight();
		for(int i=0;i<this.herd.size();i++){
			if(this.herd.get(i).getWeight()<lowestWeight) {
				lowestWeight=this.herd.get(i).getWeight();
				walrusNumber=i;
			}//ending bracket of if
		}//ending bracket of for
		return this.herd.get(walrusNumber); 
	}//ending bracket of method smallestWalrus

	/**
	 * Returns The Oldest <code>Walrus</code>
	 * @return Oldest <code>Walrus</code> in the <code>herd</code>
	 */
	public Walrus oldestWalrus() {
		int walrusNumber = 0;
		int highestAge = this.herd.get(walrusNumber).getAge();
		for(int i=0;i<this.herd.size();i++){
			if(this.herd.get(i).getAge()>highestAge) {
				highestAge=this.herd.get(i).getAge();
				walrusNumber=i;
			}//ending bracket of if
		}//ending bracket of for
		return this.herd.get(walrusNumber); 
	}//ending bracket of method oldestWalrus

	/**
	 * Returns The Youngest <code>Walrus</code>
	 * @return Youngest <code>Walrus</code> in the <code>herd</code>
	 */
	public Walrus youngestWalrus() {
		int walrusNumber = 0;
		int lowestAge = this.herd.get(walrusNumber).getAge();
		for(int i=0;i<this.herd.size();i++){
			if(this.herd.get(i).getAge()<lowestAge) {
				lowestAge=this.herd.get(i).getAge();
				walrusNumber=i;
			}//ending bracket of if
		}//ending bracket of for
		return this.herd.get(walrusNumber); 
	}//ending bracket of method youngestWalrus

	/*******************************************************
	 *<code>toString</code> method to convert the herd into a <code>String</code>.
	 * @return the <code>toString</code> value of the herd in user-pleasing form.
	 **/
	public String toString() {
		StringBuffer sb=new StringBuffer();

		for(int i=0; i<this.herd.size(); i++) {
			if(this.herd.get(i).getName().length()>length) {
				length=this.herd.get(i).getName().length();
			}//ending bracket of if
		}//ending bracket of for

		String n= "Name: ";
		String a="Age: ";
		String w = "Weight: "; 
		sb.append("| ");
		sb.append(String.format("%1$-" + length + "s", n).replace(' ', ' ')+"| ");
		sb.append(String.format("%1$-" + LENGTH_OF_AGE + "s", a).replace(' ', ' ')+"| ");
		sb.append(String.format("%1$-" + LENGTH_OF_WEIGHT + "s", w).replace(' ', ' ')+"| \n");
		for(int i=0; i<this.herd.size(); i++) {
			sb.append("| ");
			sb.append(String.format("%1$-" + length + "s", this.herd.get(i).getName()).replace(' ', ' ')+"| ");
			sb.append(String.format("%1$-" + LENGTH_OF_AGE + "s", this.herd.get(i).getAge()).replace(' ', ' ')+"| ");
			sb.append(String.format("%1$-" + LENGTH_OF_WEIGHT + "s", this.herd.get(i).getWeight()).replace(' ', ' ')+"| \n");
		}//ending bracket of for loop
		return sb.toString();
	}//ending bracket of method toString
	
}//ending bracket of Herd class