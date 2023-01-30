package leetCode;

import java.util.Stack;

/*
Day=>1. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


*/


public class Day1 {
    public static void main(String[] args) {
        Day1.isValid("(){}}{");
    }
    public static boolean isValid(String s) {

        int length = s.length();
        char[] s1 = s.toCharArray();
        if(length==0)
            return true;
        Stack<Character> st = new Stack<>();

        for(int i=0;i<length;i++){
            if(s1[i]=='(' || s1[i]=='[' || s1[i]=='{'){
                st.push(s1[i]);
            }
            else if(!st.empty() && s1[i]==')' && st.peek()=='('){
                st.pop();
            }
            else if(!st.empty() && s1[i]==']' && st.peek()=='['){
                st.pop();
            }
            else if(!st.empty() && s1[i]=='}' && st.peek()=='{'){
                st.pop();
            }
            else {
                return false;
            }
        }
        return st.empty();


/*        for (int i=0;i<s.length();i++){
            for (int j =i+1;j<s.length();j++){
                if (s.charAt(i)=='(' && s.charAt(j)==')'){
                    System.out.println("1true");
                    return true;
                } else if (s.charAt(i)=='{' && s.charAt(j)=='}') {
                    System.out.println("2true");
                    return true;
                } else if (s.charAt(i)=='[' && s.charAt(j)==']') {
                    System.out.println("3true");
                    return true;
                }
            }
        }*/
/*        try {

            for (int i = 0; i < s.length()-1; i++) {
                if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                    System.out.println("1true");
                    return true;
                } else if (s.charAt(i) == '{' && s.charAt(i + 1) == '}') {
                    System.out.println("2true");
                    return true;
                } else if (s.charAt(i) == '[' && s.charAt(i + 1) == ']') {
                    System.out.println("3true");
                    return true;
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("false");
        return false;*/

  /*      if(s.length() %2 !=0){
            return false;
        }
        Stack<Character> st = new Stack<>();

        for (char c:s.toCharArray()){
            if(c == '(' || c=='{' || c=='['){
                st.push(c);
            } else if (c==')' && !st.isEmpty() && st.peek()=='(') {
                st.pop();
            }else if (c=='}' && !st.isEmpty() && st.peek()=='{') {
                st.pop();
            }else if (c==']' && !st.isEmpty() && st.peek()=='[') {
                st.pop();
            }
        }
        return st.isEmpty();*/

    }
}
