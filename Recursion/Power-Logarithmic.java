import java.io.*;
import java.util.*;

public class Solution {
    public static int logarithmicPow(int x,int n){
        if(n==0) return 1;
        
        int subans =logarithmicPow(x,n/2);
         int ans = subans*subans;
          if(n%2!=0){
             ans = x*ans; 
          }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
           int x = sc.nextInt();
           int n = sc.nextInt();
        
        System.out.println(logarithmicPow(x,n));
    }
}
