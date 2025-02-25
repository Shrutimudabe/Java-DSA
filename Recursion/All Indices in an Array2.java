import java.io.*;
import java.util.*;

public class Solution {
    public static int[] allIndices(int[] arr,int i,int x,int count){
        if(i==arr.length){
            int base[] = new int[count];
            return base;
        }
        
        int ans[];
        if(arr[i]==x){
          ans = allIndices(arr,i+1,x,count+1);
            ans[count] = i;
        }else{
            ans = allIndices(arr,i+1,x,count);
            
        }
        return ans;
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
        int ans[] =  allIndices(arr,0,x,0);
        
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
