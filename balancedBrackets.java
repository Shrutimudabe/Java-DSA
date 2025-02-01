public static boolean balancedBrackets(String exp){
          Stack<Character> st = new Stack<>();
        
        for(int  i=0; i<exp.length(); i++){
             char ch = exp.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }else if(ch==')'||ch==']'||ch=='}'){
                  if(st.size()==0){
                      return false;
                  }else if(ch==')' && st.peek()=='('){
                       st.pop();
                  }else if(ch==']' && st.peek()=='['){
                       st.pop();
                  }else if(ch=='}' && st.peek()=='{'){
                      st.pop();
                  }else {
                      return false;
                  }
            }
        }
          if(st.size()==0){
              return true;
          }
        return false;
    }
