package stack;

import java.util.ArrayList;

public class StackUsingArrayList{
    static  class Stack{
        ArrayList<Integer>list = new ArrayList<>();

        public  boolean  isEmpty(){
            if(list.size()==0){
               return true;
            }
            return false;
        }
        public int pop(){
            return list.remove(list.size()-1);
        }

        public void push(int data){
            list.add(data);
        }

        public int peek(){
            return list.get(list.size()-1);
        }

        public void display(){
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }
    public static void main(String[]args){
       Stack st1 = new Stack();
       System.out.println(st1.isEmpty());
       st1.push(10);
       st1.push(20);
       st1.push(30);
       st1.push(40);
       st1.display();

       st1.pop();
       st1.display();

       System.out.println("peek:"+st1.peek());
       
}
}
