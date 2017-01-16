/**************Day 28: RegEx, Patterns, and Intro to Databases *****************/
/*https://www.hackerrank.com/challenges/30-regex-patterns*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList <String> namesArray = new ArrayList();
        int i=0;
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if(emailID.indexOf("@gmail.com")!=-1){
                namesArray.add(firstName);
                i++;
            }
        }
       
        Collections.sort(namesArray);
        for(int b0 = 0; b0 < i; b0++){
            System.out.println(namesArray.get(b0));
        }
        

    }
}
