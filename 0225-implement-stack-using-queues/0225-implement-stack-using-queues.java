// class MyStack {
//     Queue<Integer> q1;
//     Queue<Integer> q2;

//     public MyStack() {
//         q1 = new LinkedList<>();
//         q2 =new LinkedList<>();
//     }
    
//     public void push(int x) {
//         //step-1 add
//         q2.offer(x);
//         //delete 
//         while(!q1.isEmpty())
//         {
//             q2.offer(q1.poll());
//         }
//         //swap
//         Queue<Integer> temp =q1;
//         q1=q2;
//         q2 = temp;
        
//     }
    
//     public int pop() {
//         return q1.poll();
//     }
    
//     public int top() {
//         return q1.peek();
//     }
    
//     public boolean empty() {
//         return q1.isEmpty();
//     }
// }

     //we can also implement stack using queue
 class MyStack {
    Queue<Integer> q1;

    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        //step-1 add
        q1.offer(x);
        int n=q1.size()-1;
        //delete 
      for(int i=0 ; i<n ;i++)
        {
            int temp=q1.poll();
            q1.offer(temp);
        }
        
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
    