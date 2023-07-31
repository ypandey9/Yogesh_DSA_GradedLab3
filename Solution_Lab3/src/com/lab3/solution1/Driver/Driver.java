package com.lab3.solution1.Driver;

import com.lab3.solution1.Brcktchk.BracketCheck;

public class Driver {

	public static void main(String[] args) {
		BracketCheck bc = new BracketCheck();
		String input1 = "( [ [ { } ] ] ) ";
		boolean sts = bc.isBalanced(input1);
		if (sts)
			System.out.println("The entered String has Balanced Brackets");
		else
		
		System.out.println("The entered Strings do not contain Balanced Brackets");
		
	}
	
	
}
