import java.io.*;
import java.util.*;

public class Solution {
    public static String updatedString(String str){
        StringBuilder sb = new StringBuilder();
          for(int i=0; i<str.length(); i++){
              char ch = str.charAt(i);
              if(ch=='#'){
                  if(sb.length()>0){
                      sb.deleteCharAt(sb.length()-1);
                  }
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
          String t = sc.next();
        
           s = updatedString(s);
           t = updatedString(t);
        
        if(s.equals(t)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
