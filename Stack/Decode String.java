package stack;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String str){
       Stack<Integer>integerStack = new Stack<>();
       Stack<Character>stringStack = new Stack<>();
                
           String  result = "";
           

       for(int i=0; i<str.length();i++){
          char ch = str.charAt(i);
            int count = 0;

            if(Character.isDigit(ch)){
                while(Character.isDigit(str.charAt(i))){
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                integerStack.push(count);
            }else if(ch == ']'){
               String temp = "";
              

               if(!integerStack.isEmpty()){
                count = integerStack.pop();
               }

               while(!stringStack.isEmpty() && stringStack.peek() != '['){
                 temp = stringStack.pop() + temp;
               }
               if(!stringStack.isEmpty() && stringStack.peek() =='['){
                stringStack.pop();
               }

               for(int j=0;j<count;j++){
                result = result + temp;
               }
               for(int j=0;j<result.length();j++){
                 stringStack.push(result.charAt(j));
               }

               result = "";
            }else if(ch == '['){
                if(!Character.isDigit(str.charAt(i-1))){
                  integerStack.push(1);
                }
                stringStack.push(ch);
            }else{
                stringStack.push(ch);
            }
       }
       while(!stringStack.isEmpty()){
           result = stringStack.pop() + result;
       }
       
       return result;
    }
    public static void main(String[]args){
        //String str = "2[bv]";
        String str = "3[a2[c]]";
        System.out.println(str);
        //System.out.println(decodeString(str));
        System.out.print(decodeString(str));
    }
    
}
