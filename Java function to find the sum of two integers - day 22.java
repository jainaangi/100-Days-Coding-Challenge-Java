import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int calculateSum(int a, int b) {
        return a+b;
    } 

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
       
        int a = sr.nextInt();
        int b = sr.nextInt();
        
        
        int sum = calculateSum(a, b);
        
        System.out.println(sum);
    }
}