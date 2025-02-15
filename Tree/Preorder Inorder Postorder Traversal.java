import java.util.*;
import java.io.*;

public class Tree {
   public static class Node{
        int data;
        Node left;
        Node right;
   
       Node(int data){
           this.data = data;
       }
    }
 public static void preOrderTraversal(Node node){
       if(node==null){
        return ;
       }
       System.out.print(node.data+" ");
       preOrderTraversal(node.left);
       preOrderTraversal(node.right);
       
   }

 public static void postOrderTraversal(Node node){
       if(node==null) return;

       postOrderTraversal(node.left);
       postOrderTraversal(node.right);
       System.out.print(node.data +" ");
 }

 public static void inOrderTraversal(Node node){
     if(node==null) return;

     inOrderTraversal(node.left);
     System.out.print(node.data+" ");
     inOrderTraversal(node.right);

 }
   public static void main(String[]args){

    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(40);
    Node e = new Node(50);
    Node f = new Node(60);
    Node g = new Node(70);
    Node h = new Node(80);
    Node i = new Node(90);


    a.left = b;
    a.right = c;

    b.left = d;
    d.right = i;
    
    c.left = e;
    c.right = f;
     
    f.left = g;
    f.right = h;

    preOrderTraversal(a);
    System.out.println();
    postOrderTraversal(a);
    System.out.println();
    inOrderTraversal(a);
    
   }  
}
