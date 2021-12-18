package Prepbytes;
import java.util.*;
import java.io.*;
public class MixedInput {
    public static void main(String args[]) throws IOException {
      
        //write your code here
        Scanner sc=new Scanner(System.in);
        int N;float M;char ch;
        N=sc.nextInt();
        M=sc.nextFloat();
        ch=sc.next().charAt(0);
        System.out.print(N+"$");
        System.out.printf("%.2f",M);
        System.out.print("$"+ch);
        sc.close();
      }
}
