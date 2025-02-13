import java.io.*;
import java.util.*;

public class Solution {
       public static boolean typedUsingRow(String str,String row){
           for(int i=0; i<str.length(); i++){
               char ch = str.charAt(i);
               if(!row.contains(ch+"")){
                   return false;
               }
           }
          return true;
       }
    public static void americanKeyboard(String[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
             
            if(typedUsingRow(arr[i],"qwertyuiop") || typedUsingRow(arr[i],"asdfghjkl") ||  typedUsingRow(arr[i],"zxcvbnm")){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        if(count==0){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        String arr[] = new String[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
         americanKeyboard(arr);
    }
}
