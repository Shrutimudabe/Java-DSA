 public static boolean duplicateBrackets(String exp){
         Stack<Character> st = new Stack<>();
         
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch!=')'){
                st.push(ch);
            }else{
                if(st.peek()=='('){
                    return true;
                }
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }
        }
        return false;
    }
