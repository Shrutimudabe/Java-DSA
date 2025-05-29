package stack;

public class StackUsingLinkedList {
       public static class Node{
         int data;
         Node next;
         Node(int data){
            this.data = data;
            this.next = null;
         }
       }
       static Node head;
       static Node tail;

       public static class Stack{

            public boolean isEmpty(){
                return head==null;
            }

            public void push(int data){
                Node newNode = new Node(data);
                if(head==null){
                    head = tail = newNode;
                }else{
                   newNode.next = head;
                    head = newNode;  

                }
            }
            public void display(){
               Node temp = head;
                while(temp!=null){
                   System.out.print(temp.data+"->");
                   temp = temp.next;
                }
            }
            public int  pop(){
                if(head==null){
                    return -1;
                }
                 int deleteNode = head.data;
                 head = head.next;
                  
             return deleteNode;
            }
            public int peek(){
                if(head==null){
                    return -1;
                }
                return head.data;
            }
       }
    public static void main(String[]args){
        Stack st1  = new Stack();

        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);

        st1.display();
        System.out.println(st1.pop());
         st1.display();
         System.out.println("\n"+st1.peek());


    }
    
}
