package stack;

import java.util.Stack;

public class Histogram {

    public static int[] nextSmallerLeft(int[]height){
        int[] nsl = new int[height.length];
        Stack<Integer>st = new Stack<>();
        st.push(0);
        nsl[0] = -1;

         for(int i=1;i<height.length;i++){
            while(!st.empty() && height[st.peek()] >= height[i]) {
                st.pop();
            } 
             if(st.empty()) {
               nsl[i] = -1;
            } else{
                nsl[i] = st.peek();
            }
            st.push(i);
         }
         return nsl;
    }

    public static int[]  nextSmallerRight(int[] height){
        int n = height.length;
        int[] nsr = new int[n];
        Stack<Integer>st = new Stack<>();
        st.push(n-1);
        nsr[n-1] = 6;

        for(int i=n-1;i>=0;i--){
            while(!st.empty() && height[st.peek()] >= height[i]){
                st.pop();
            }

            if(st.empty()){
                nsr[i] = n;
            }else{
                nsr[i] = st.peek();
            }

            st.push(i);
        }
        return  nsr;
    }

    public static int maxRectangleArea(int[] height){
        int maxArea = 0;

        int[] nsl = nextSmallerLeft(height);
        int[] nsr = nextSmallerRight(height);

        for(int i=0;i<height.length;i++){
             int  width = nsr[i] - nsl[i] - 1;
             int area = height[i] * width;

             if(area > maxArea){
                maxArea = area;
             }
        }
       return maxArea;  
    }
    public static void main(String[] args){
        int[] height = {2,1,5,6,2,3};
    
     System.out.println(maxRectangleArea(height));
        
    }
    
}
