import java.io.*;
import java.util.*;

public class Solution {
    public static void contextualSuccessorPrediction(String text, String first, String second){
        String[] arr = text.split(" ");
        for(int i=0; i<arr.length-1; i++){
            String firstArr = arr[i];
            String secondArr = arr[i+1];
            
            if(firstArr.equals(first) && secondArr.equals(second)){
                 System.out.println(arr[i+2]);
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
          String text = sc.nextLine();
          String str1 = sc.next();
          String str2 = sc.next();
        contextualSuccessorPrediction(text,str1,str2);
    }
}
