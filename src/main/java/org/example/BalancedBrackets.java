package org.example;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        BalancedBrackets bb = new BalancedBrackets();
        System.out.println(bb.isBalanced("()[]{}"));
    }

    public boolean isBalanced(String s1) {
//        Stack<Character> stack = new Stack<>();
//        for (Character ch : s1.toCharArray()) {
//            if (ch == '(') {
//                stack.push(')');
//            } else if (ch == '{') {
//                stack.push('}');
//            } else if (ch == '[') {
//                stack.push(']');
//            } else if (stack.isEmpty() || stack.pop() != ch) {
//                return false;
//            }
//        }
//        return stack.isEmpty();
    	HashMap<Character,Character> hm = new HashMap<Character,Character>();
    	hm.put('(', ')');
    	hm.put('{', '}');
    	hm.put('[', ']');
    	boolean flag = false;
    	
    	for(int i=0;i<s1.length();i=i+2) {
    		if(hm.get(s1.charAt(i)) == s1.charAt(i+1)) {
    			flag = true;
    		}
    		else {
    			flag = false;
    			break;
    		}
    	}
    	return flag;
    }
}