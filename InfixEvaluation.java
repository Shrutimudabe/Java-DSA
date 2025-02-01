public class Solution {
     public static int operation(int a,int b, char ch){
         if(ch=='/')return b/a;
         else if(ch=='*') return b*a;
         else if(ch=='+') return b+a;
         else return b-a;
    }
    public static int precedence(char ch){
          if(ch=='/' || ch=='*'){
              return 2;
          }else if(ch=='+'||ch=='-'){
              return 1;
          }
       return 0;    
    }
    public static int infixEval(String exp){
        Stack<Integer>st1 = new Stack<>();// storing operands
        Stack<Character> st2 = new Stack<>();//storing operators
         
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch=='('){
                st2.push(ch);
            }else if(ch>='0' && ch<='9'){
                st1.push(ch-'0');
            }else if(ch=='+'|| ch=='-'|| ch=='*'|| ch=='/'){
               while(st2.size()>0 && precedence(ch)<=precedence(st2.peek())){
                    int op1 = st1.pop();
                    int op2 = st1.pop();
                    char opr = st2.pop();
                    st1.push(operation(op1,op2,opr));
                 }
                 st2.push(ch);
            }else if(ch==')'){
                while(st2.peek()!='('){
                     int op1 = st1.pop();
                    int op2 = st1.pop();
                     char opr = st2.pop();
                    st1.push(operation(op1,op2,opr));
                }
                 st2.pop();
            }
        }
        while(st2.size()>0){
             int op1 = st1.pop();
             int op2 = st1.pop();
             char opr = st2.pop();
           st1.push(operation(op1,op2,opr));
        }
      return st1.pop();  
    }
