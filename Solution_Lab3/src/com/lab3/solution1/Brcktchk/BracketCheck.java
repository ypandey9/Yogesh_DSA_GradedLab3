package com.lab3.solution1.Brcktchk;

import java.util.Stack;

public class BracketCheck {
	  Stack<Character> stack = new Stack<>();

	public boolean isBalanced(String input) {
		boolean status = false;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					status = false;
					break;
				}
				char top = stack.pop();
				if (ch == ')' && top == '(' || ch == ']' && top == '[' || ch == '}' && top == '{') {
					status = true;
				} else {
					status = false;
					break;
				}
			}
		}
		if (!stack.isEmpty()) {
			status = false;
		}
		return status;
	}

}
