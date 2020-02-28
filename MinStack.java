class MinStack {
    
    class Node{
        
        int val;
        int min;
        Node next;
        
        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
        
    }

    /** initialize your data structure here. */
    
    Node top;
    int cur_min;
    
    public MinStack() {
        top = null;
        cur_min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x < cur_min) cur_min = x;
        if(top == null)
            top = new Node(x, cur_min, top);
        else
            top = new Node(x, cur_min, top);
    }
    
    public void pop() {
        if(top != null)
            top = top.next;
        if(top == null)
            cur_min = Integer.MAX_VALUE;
        else
            cur_min = top.min;
    }
    
    public int top() {
        if(top != null)
            return top.val;
        return -1;
    }
    
    public int getMin() {
        if(top != null)
            return top.min;
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
