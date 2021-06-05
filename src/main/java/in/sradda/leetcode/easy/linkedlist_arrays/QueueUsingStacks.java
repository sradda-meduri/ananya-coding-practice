package in.sradda.leetcode.easy.linkedlist_arrays;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main( String[] args ) {
        QueueUsingStacks obj = new QueueUsingStacks();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public QueueUsingStacks() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty())
                outStack.push(inStack.pop());
        }
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty())
                outStack.push(inStack.pop());
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(outStack.isEmpty() && inStack.isEmpty())
            return true;
        return false;
    }
}

