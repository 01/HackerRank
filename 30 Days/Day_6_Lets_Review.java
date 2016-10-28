import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numStrings = read.nextInt();
        String current;
        read.nextLine();
        for(int i=0; i<numStrings; i++){
            current = read.nextLine();
            char [] currentString = current.toCharArray();
            for(int j=0; j<current.length(); j=j+2){
                System.out.print(currentString[j]);
            }
            System.out.print(" ");
            for(int k=1; k<current.length(); k=k+2){
                System.out.print(currentString[k]);
            }
            System.out.print("\n");
            
        }
    }
}