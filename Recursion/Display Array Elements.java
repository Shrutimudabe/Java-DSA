import java.io.*;
import java.util.*;

public class Solution {
    public static void displayArray(int[] arr,int n){
      
     if(n==-1) return;
        
         displayArray(arr,n-1);
        System.out.println(arr[n]);
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        displayArray(arr,n-1);

    }
}
