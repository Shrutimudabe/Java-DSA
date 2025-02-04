 public static int precedence(char ch){
        if(ch=='+'|| ch=='-') return 1;
        else if(ch=='*'||ch=='/') return 2;
      return 0;
    }
    public static void infixConversions(String exp) {
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character>operator = new Stack<>();
        
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            
            if(ch=='('){
                operator.push(ch);
            }else if(ch>='a' && ch<='z'){
                postfix.push(ch+"");
                prefix.push(ch+"");
            }else if(ch==')'){
                while(operator.peek()!='('){
                    String op1 = postfix.pop();
                    String op2 = postfix.pop();
                    char opr = operator.pop();
                     postfix.push(op2 + op1 +opr);
                    
                    op1 = prefix.pop();
                    op2 = prefix.pop();
                    prefix.push(opr+op2 +op1);
                }
                operator.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(operator.size()>0 && precedence(ch)<=precedence(operator.peek())){
                     String op1 = postfix.pop();
                     String op2 = postfix.pop();
                     char opr = operator.pop();
                    postfix.push(op2+op1+opr);
                    
                    op1 = prefix.pop();
                    op2 = prefix.pop();
                    prefix.push(opr+op2+op1);
                }
                operator.push(ch);
            }
        }
        while(operator.size()>0){
                   
                     String op1 = postfix.pop();
                     String op2 = postfix.pop();
                     char opr = operator.pop();
                    postfix.push(op2+op1+opr);
                    
                    op1 = prefix.pop();
                    op2 = prefix.pop();
                    prefix.push(opr+op2+op1);      
        }
        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }
