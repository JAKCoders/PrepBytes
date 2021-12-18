package Prepbytes;
import java.util.*;
import java.io.*;
public class PrintFloatsNumber {
    public static void main(String args[]) throws IOException {
      
        //write your code here
        Scanner sc = new Scanner(System.in);
        float N = sc.nextFloat();
        float M = sc.nextFloat();
        if ((N>=1 && N<=100) && (M>=1 && M<=100))
          System.out.printf("%.2f %.2f",N,M);
        sc.close();
      }
}
