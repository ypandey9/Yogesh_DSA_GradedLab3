package com.lab3.solution2.main;
import com.lab3.solution2.pairsum.PairSum;
import com.lab3.solution2.pairsum.PairSum.Node;;

public class DriverClass {

	public static void main(String[] args) {
		PairSum pairSum=new PairSum();
		Node root=null;
		root=pairSum.insertData(root, 40);
		root=pairSum.insertData(root, 60);
		root=pairSum.insertData(root, 20);
		root=pairSum.insertData(root, 50);
		root=pairSum.insertData(root, 70);
		root=pairSum.insertData(root, 30);
		root=pairSum.insertData(root, 10);
		
		int sum=130;
		pairSum.findPairWithSum(root, sum);

	}

}
