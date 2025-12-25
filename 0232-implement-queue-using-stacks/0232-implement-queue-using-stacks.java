

class MyQueue {

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        inStack.push(x);
    }

    // Removes the element from front of queue
    public int pop() {
        moveIfNeeded();
        return outStack.pop();
    }

    // Get the front element
    public int peek() {
        moveIfNeeded();
        return outStack.peek();
    }

    // Returns true if the queue is empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Helper method
    private void moveIfNeeded() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */