import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 
    public static boolean isBalanced(String expression) {
        if (expression.length() % 2 != 0) return false;
        else {
            char[] brackets = expression.toCharArray();
            Stack<Character> stack = new Stack<>();
            for (char bracket : brackets){
                if(bracket == '{') stack.push('}'); 
                else if(bracket == '(') stack.push(')');
                else if(bracket == '[') stack.push(']'); 
                else if(stack.empty() || bracket != stack.peek())return false;
                else stack.pop();
    }
  return stack.empty();
}
    }

     
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
