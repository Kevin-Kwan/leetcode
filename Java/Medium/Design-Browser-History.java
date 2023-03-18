class BrowserHistory {

    private List<String> history;
    private String current;
    private int index;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        index = 0;
    }
    
    public void visit(String url) {
        while (history.size()-1 > index) {
            history.remove(history.size()-1);
        }
        history.add(url);
        index++;
    }
    
    public String back(int steps) {
        System.out.println(history.toString());
        index = index - steps;
        if (index < 0) {
            index = 0;
        }
        return history.get(index);
    }
    
    public String forward(int steps) {
        index = index + steps;
        if (index > history.size()-1) {
            index = history.size()-1;
        }
        return history.get(index);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
