package edu.mtc.egr283.project03;

import javax.swing.JOptionPane;
/*******************************************************
 * Driver Class for <code>Walrus</code> <code>Herd</code>.
 * @professor William Sims
 * @MTCclass EGR-283
 * @author Jacob Vaught
 * @version 1.00 2021-02-15 Approximately 5:30 PM EST.
 * Due 2-17-2021
 *
 * Copyright © 2021 by Jacob C. Vaught. All rights reserved.
 **/
public class WalrusHerdDriver {
	static String[] DEFAULTNAME= {"Blobby","Cinnamon","Cubby","Tusker","Wally"};
	static int[] DEFAULTAGE = {23, 12, 17, 34, 28};
	static double[] DEFAULTWEIGHT = {3305.5, 2873.6, 1945.0, 3035.5, 2764.8};

	/**
	 * main method
	 */
	public static void main(String[] args) {
		Herd mainHerd=new Herd();
		int a=JOptionPane.showConfirmDialog(null, "Do You want to Add or Remove your own Walruses?\n(if NO, will ask if you want to remove Walrus.)");  
		if(a==JOptionPane.NO_OPTION){  
			for(int i=0; i<DEFAULTNAME.length; i++) {
				mainHerd.addWalrus(DEFAULTNAME[i], DEFAULTAGE[i], DEFAULTWEIGHT[i]);
			}//ending bracket of for
		}else if(a==JOptionPane.YES_OPTION) {
			mainHerd=add_Walrus_User(mainHerd);
			mainHerd=remove_Walrus_User(mainHerd);
		}else {
			System.out.println("Canceled");
			System.exit(0);
		}//end of else
		System.out.println(toString(mainHerd));
	}//end of main method

	/**
	 * @param <code>Herd</code>and asks user to input more Walruses
	 * @return <code>Herd</code> after user has added walruses.
	 */
	private static Herd add_Walrus_User(Herd herd) {
		int b = JOptionPane.YES_OPTION;
		do {
			b=JOptionPane.showConfirmDialog(null, "Do You want to Add a Walrus?\n(if NO, Program will end after displaying data.)");  
			if(b==JOptionPane.YES_OPTION){  
				herd.addWalrus( JOptionPane.showInputDialog(null, "Enter Walrus Name"),Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Walrus Age")) ,Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Walrus Weight")));
				System.out.println(herd.toString());
			}//End of if statement
		}while(b==JOptionPane.YES_OPTION);
		return herd;
	}//ending bracket of add_Walrus_User
	
	/**
	 * @param <code>Herd</code>and asks user to input more Walruses
	 * @return <code>Herd</code> after user has added walruses.
	 */
	private static Herd remove_Walrus_User(Herd herd) {
		int b = JOptionPane.YES_OPTION;
		do {
			b=JOptionPane.showConfirmDialog(null, "Do You want to Remove a Walrus?\n(if NO, Program will end after displaying data.)");  
			if(b==JOptionPane.YES_OPTION){  
				herd.removeWalrus(JOptionPane.showInputDialog(null, "Enter Walrus Name"));
				System.out.println(herd.toString());
			}//End of if statement
		}while(b==JOptionPane.YES_OPTION);
		return herd;
	}//ending bracket of add_Walrus_User
	
	/*******************************************************
	 * Usual <code>toString</code> method to return all data in user-friendly format.
	 * @return the <code>toString</code> value.
	 **/
	private static String toString(Herd herd) {
		StringBuffer sb=new StringBuffer();
		sb.append(herd.toString());
		sb.append("\n");
		sb.append(averages_Lows_Highs_toString(herd));
		sb.append("\n");
		sb.append("Good Bye");
		return sb.toString();
		
	}//ending bracket of toString
	
	/*******************************************************
	 * <code>averages_Lows_Highs_toString</code> method to simplify code.
	 * @return the <code>String</code> value of a bunch of stuff, including smallest, largest, oldest, youngest and averages..
	 **/
	private static String averages_Lows_Highs_toString(Herd herd) {
		StringBuffer sb=new StringBuffer();
		
		sb.append("\n Average Age: ");
		sb.append(herd.averageAge());
		sb.append("\n\n Youngest   : ");
		sb.append(herd.youngestWalrus());
		sb.append("\n Oldest     : ");
		sb.append(herd.oldestWalrus());
		
		sb.append("\n\n");
		
		sb.append("\n Average Weight: ");
		sb.append(herd.averageWeight());
		sb.append("\n\n Smallest      : ");
		sb.append(herd.smallestWalrus());
		sb.append("\n Largest       : ");
		sb.append(herd.largestWalrus());
		
		sb.append("\n\n\n");
		return sb.toString();
	}//ending bracket of averages_Lows_Highs_toString
	
}//ending bracket of class WalrusHerdDriver
