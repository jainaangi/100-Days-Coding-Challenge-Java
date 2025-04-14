import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
        public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
     
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        
        int factorial = calculateFactorial(n);  
        
        System.out.println(factorial);
    }
}