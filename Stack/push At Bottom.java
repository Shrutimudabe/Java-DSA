package stack;
import java.util.*;
public class PushAtBottom {
      public static void pushAtBottom(Stack<Integer>s,int data){
          if(s.isEmpty()){
            s.push(data);
            return;
          }
          int top = s.pop();
          pushAtBottom(s,data);
           s.push(top);
      }

      public static void printStack(Stack<Integer>s){

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
      }

      public static void reverseStack(Stack<Integer>s){
          if(s.isEmpty()){
            return;
          }
          int top = s.pop();
          reverseStack(s);
           pushAtBottom(s,top);
      }
    public static void main(String[]args){
        Stack<Integer>s = new Stack<>();
        int data = 4;
        s.push(1);
         s.push(2);
          s.push(3);

            //pushAtBottom(s,data);
            reverseStack(s);
            printStack(s);


    }
    
}
