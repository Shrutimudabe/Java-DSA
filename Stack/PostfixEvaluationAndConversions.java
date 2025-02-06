  public static int precedence(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }else if(ch=='*'||ch=='/'){
            return 2;
        }else return 0;
    
    }
    
    public static int operation(int op1,int op2,char opr){
        if(opr=='+') return op1+op2;
        else if(opr=='-') return op1-op2;
        else if(opr=='*') return op1*op2;
        else return op1/op2;
    }
    public static void postfixEvalConversion(String exp){
        Stack<Integer> st = new Stack<>();
        Stack<String> infix = new  Stack<>();
        Stack<String> prefix = new Stack<>();
         for(int i=0; i<exp.length(); i++){
             char ch = exp.charAt(i);
             if(ch>='0' && ch<='9'){
                 st.push(ch-'0');
                 infix.push(ch+"");
                 prefix.push(ch+"");
                     
             }else {
                 int op2 = st.pop();
                 int op1 = st.pop();
                 st.push(operation(op1,op2,ch));
                 
                 String opp2 = infix.pop();
                 String opp1 = infix.pop();
                 infix.push("("+opp1+ch+opp2+")");
                 
                 opp2 = prefix.pop();
                 opp1 = prefix.pop();
                 prefix.push(ch+opp1+opp2);
             }
             
         }
        System.out.println(st.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
     
    }
