package com.jid.java.datastructures.stack;

/**
 * Created by Jorge on 2015-09-24.
 */
import java.util.*;

class Solution{

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            char[] array = input.toCharArray();
            System.out.println(isBalanced(array));
        }
    }

    private static boolean isBalanced(char[] array) {
        Stack<String> stack = new Stack<String>();
        Solution solution = new Solution();

        for (char character : array) {
            String input = String.valueOf(character);

            if (stack.size() == 0){
                if (solution.isClosing(input)) {
                    return false;
                }
            }

            if (solution.isClosing(input)) {
                String open = stack.peek();
                if(solution.isOpenParenthesis(open) && solution.isClosingParenthesis(input)) {
                    stack.pop();
                }
                else if(solution.isOpenCurlyBracket(open) && solution.isClosingCurlyBracket(input)) {
                    stack.pop();
                }
                else if(solution.isOpenSquareBracket(open) && solution.isClosingSquareBracket(input)) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }

            if(solution.isOpen(input))
                stack.push(input);
        }
        if (stack.size() == 0)
            return true;
        else return false;
    }

    private boolean isClosing(String input) {
        return isClosingParenthesis(input) ||
                isClosingCurlyBracket(input) ||
                isClosingSquareBracket(input);
    }

    private boolean isOpen(String input) {
        return isOpenParenthesis(input) ||
                isOpenCurlyBracket(input) ||
                isOpenSquareBracket(input);
    }

    boolean isOpenParenthesis(String value){
        return value.equals("(");
    }

    boolean isOpenSquareBracket(String value){
        return value.equals("[");
    }

    boolean isOpenCurlyBracket(String value){
        return value.equals("{");
    }

    boolean isClosingParenthesis(String value){
        return value.equals(")");
    }

    boolean isClosingSquareBracket(String value){
        return value.equals("]");
    }

    boolean isClosingCurlyBracket(String value){
        return value.equals("}");
    }
}