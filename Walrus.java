package edu.mtc.egr283.project03;

/****************************************************************************
 * Class for handling the data in a <code>Walrus</code>.
 * This is the class to handle the information for a single Walrus.
 * @author Jacob Vaught
 * @version 1.00 2021-02-15
 *
 * Copyright (C) 2021 by Jacob C. Vaught. All rights reserved.
 **/

public class Walrus {
	private String name ="";
	private int age=0;
	private double weight=0;
	
	/*******************************************************
	 * Constructor.
	 * We create the record and assign dummy values so as not to
	 * have null values.
	 **/
	public Walrus() {
		setAge(0);
		setWeight(0);
		setName("");
	}//ending bracket of method walrus

	/*******************************************************
	 * Accessor method to get the <code>name</code>.
	 * @return the value of <code>name</code>.
	 **/
	public String getName() {
		return this.name;
	}//ending bracket of method getName
	
	/*******************************************************
	 * Accessor method to get the <code>age</code>.
	 * @return the value of <code>age</code>.
	 **/
	public int getAge() {
		return this.age;
	}//ending bracket of method getAge
	
	/*******************************************************
	 * Accessor method to get the <code>weight</code>.
	 * @return the value of <code>weight</code>.
	 **/
	public double getWeight() {
		return this.weight;
	}//ending bracket of method getWeight

	/*******************************************************
	 * Mutator method to set the <code>name</code>.
	 * @param what the value of <code>name</code> to be set.
	 **/
	public void setName(String newName) {
		this.name=newName;
	}//ending bracket of method setName

	/*******************************************************
	 * Mutator method to set the <code>age</code>.
	 * @param what the value of <code>age</code> to be set.
	 **/
	public void setAge(int newAge) {
		this.age=newAge;
	}//ending bracket of method setAge

	/*******************************************************
	 * Mutator method to set the <code>weight</code>.
	 * @param what the value of <code>weight</code> to be set.
	 **/
	public void setWeight(double newWeight) {
		this.weight=newWeight;
	}//ending bracket of method setWeight
	
	/*******************************************************
	 * Method to compare the <code>name</code> values of Walrus name.
	 * @param otherName the string to compare last name against
	 * @return true or false for the comparison
	 */
	public boolean compareName(String otherName) {
		if(this.getName().equalsIgnoreCase(otherName)) {
			return true;
		}//ending bracket of if
		else {
			return false;
		}//ending bracket of else
	}//ending bracket of method compareName
	
	/*******************************************************
	 * Method to compare the <code>name</code> values of records.
	 * @param otherWalrus the other walrus to compare to
	 * Return -1, 0, or +1 depending on how the comparison goes.
	 */
	public int compareTo(Walrus otherWalrus) {
		return this.getName().compareTo(otherWalrus.getName());
	}//ending bracket of method compareAgeTo
	
	/*******************************************************
	 * Usual <code>toString</code> method to convert a record to a <code>String</code>.
	 * @return the <code>toString</code> value of the record.
	 **/
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("Name: " +this.getName());
		sb.append(", Age: " +this.getAge());
		sb.append(", Weight: " +this.getWeight());
		sb.append("\n");
		return sb.toString();
	}//ending bracket of method toString

}//ending bracket of class Walrus
