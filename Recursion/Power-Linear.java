import java.io.*;
import java.util.*;

public class Solution {
    public static int power(int x ,int n){
        if(n==0)return 1;
        
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int n = sc.nextInt();
         
        System.out.println(power(x,n));
    }
}
