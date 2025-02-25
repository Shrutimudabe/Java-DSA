import java.io.*;
import java.util.*;

public class Solution {
    public static int firstIndex(int[] arr,int i,int x){
         if(i==arr.length) return -1;  
        
        if(arr[i]==x) return i;
         
      return firstIndex(arr,i+1,x);  
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         int x = sc.nextInt();
        System.out.println(firstIndex(arr,0,x));
    }
}
