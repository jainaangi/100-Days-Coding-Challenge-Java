import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n=sr.nextInt();
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}