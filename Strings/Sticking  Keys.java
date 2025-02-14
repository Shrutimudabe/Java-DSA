import java.io.*;
import java.util.*;

public class Solution {
    public static String updatedString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='i'){
                sb.reverse();
            }else{
                sb.append(ch);
            }
        }
       return sb.toString();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
          String s = sc.next();
         System.out.println(updatedString(s));
    }
}
