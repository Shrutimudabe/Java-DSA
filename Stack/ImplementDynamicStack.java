import java.io.*;
import java.util.*;

class CustomStack{
       int capacity = -1;
       int size = 0;
       int arr[];
    
    public CustomStack(int capacity){
        this.capacity = capacity;
         arr = new int[capacity];
    }
    void push(int data){
        if(size==capacity){
            capacity += capacity;
            int newArr[] = new int[capacity];
            
            for(int i=0; i<size; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;//arr points to newArr
        }
        arr[size] = data;
        size++;
        
    }
    void pop(){
        if(size==0){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(arr[size-1]);
         size--;
    }
    
    void top(){
        if(size==0){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(arr[size-1]);
    }
    void display(){
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void size(){
        System.out.println(size);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int capacity = sc.nextInt();
        CustomStack cs  = new CustomStack(capacity);
        String s = "";
        
        while(sc.hasNext()){
            s = sc.next();
            
          if(s.equals("push")){
              int data = sc.nextInt();
              cs.push(data);
          }else if(s.equals("pop")){
              cs.pop();
          }else if(s.equals("top")){
              cs.top();
          }else if(s.equals("display")){
              cs.display();
          }else if(s.equals("size")){
             cs.size();
          }else{
              break;
          }
        }
    }
}
