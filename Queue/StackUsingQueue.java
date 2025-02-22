class MyStack {
     Queue<Integer> q1;
     Queue<Integer> q2;

    public MyStack() {
       q1 = new LinkedList<>();
       q2 = new LinkedList<>(); 
    }
    
    public void push(int x) {
        while(q1.size()>0){
            q2.add(q1.poll());
        }
        q1.add(x);

        while(q2.size()>0){
            q1.add(q2.poll());
        }
    }
    
    public int pop() {
     return q1.poll();
    }
    
    public int top() {
       while(q1.size()>0){
        q2.add(q1.poll());
       }  
       int ans = q2.peek();

       while(q2.size()>0){
        q1.add(q2.poll());
       }
       return ans;
    }
    
    public boolean empty() {
       if(q1.size()==0) return true;
       else return false;  
    }
}
