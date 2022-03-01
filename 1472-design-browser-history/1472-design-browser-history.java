class BrowserHistory {

    Stack<String> forward, backward;
    public BrowserHistory(String homepage) {
        forward = new Stack<>();
        backward = new Stack<>();
        backward.push(homepage);
    }
    
    public void visit(String url) {
        backward.push(url);
        forward.clear();
    }
    
    public String back(int steps) {
        int st = 0;
        while(backward.size() > 1 && steps-- > 0){
            forward.push(backward.pop());
        }
        return backward.peek();
    }
    
    public String forward(int steps) {
        int st = 0;
        while(forward.size() > 0 && steps-- > 0){
            backward.push(forward.pop());
        }
        return backward.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */