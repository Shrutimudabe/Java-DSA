 public static int[] nextGreaterToLeft(int[] arr,int n){
          Stack<Integer> st = new Stack<>();
          int[] ans = new int[n];
            ans[0] = -1;
           st.push(arr[0]);
        for(int i=1; i<n; i++){
           while(st.size()>0 && arr[i]>st.peek()) {
               st.pop();
           }
            if(st.size()==0){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
             st.push(arr[i]);
        }
        return ans;
    }
