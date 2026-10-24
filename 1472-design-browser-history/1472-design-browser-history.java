class BrowserHistory {
    Deque<String> currHistory;
    Deque<String> forHistory;

    public BrowserHistory(String homepage) {
        currHistory = new ArrayDeque<>();
        forHistory = new ArrayDeque<>();
        currHistory.push(homepage);
    }
    
    public void visit(String url) {
        currHistory.push(url);
        // while(!forHistory.isEmpty()
        // {
        //   forHistory.pop();
        // }
              
              //u can also do
      forHistory = new ArrayDeque<>();
    }
    
    public String back(int steps) {
        while(steps > 0)
        {
            if(currHistory.size()>1)
            {
                String top = currHistory.pop();
                forHistory.push(top);
            }
            else{
                //sirf homepage h currHistory stack me
                break;
            }
            steps --;
        }
        return currHistory.peek();
    }
    
    public String forward(int steps) {
        while(steps > 0)
        {
            if(forHistory.size()>0)
            {
                String top = forHistory.pop();
                currHistory.push(top);
            }
            else{
                //forHistory stack khali hai
                break;
            }
            steps --;
        }
        return currHistory.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */