class MinStack {

Stack<Integer> s;

public MinStack() {
    s = new Stack<>(); 
}

public void push(int val) {
    s.push(val);
}
    
public void pop() {
    s.pop();
    
}

public int top() {
    if(s.empty())
        return -1;
    
    return s.peek();
}

public int getMin() {
    int min = Integer.MAX_VALUE;
    for(int i : s){
        if(i < min){
            min = i;
        }
    }
    return min;
}
}
