 public static int precedence(char ch){
        if(ch=='+'|| ch=='-') return 1;
        else if(ch=='*'||ch=='/') return 2;
      return 0;
    }
    
    public static String infixToPostfix(String exp){
        Stack<Character> st = new Stack<>();
         String postfixExp = "";
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch>='a' && ch<='z'){
                postfixExp += ch;
            }else if(ch==')'){
                while( st.peek()!='('){
                    postfixExp +=st.pop();
                }
                st.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(st.size()>0 && precedence(ch)<=precedence(st.peek()) ){
                    postfixExp += st.pop();
                }
                st.push(ch);
            }
        }
        while(st.size()>0){
            postfixExp += st.pop();
        }
        return postfixExp;
    }
