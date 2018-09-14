package com.carlocappellini;


import java.util.Stack;

public class StackPractice<E> {

    private Stack<String> stack;
    private boolean last = true;

    public StackPractice() {
        this.stack = new Stack<String>();
    }

    public Stack getStack() {
        return stack;
    }


    boolean isEmpty() {
        return stack == null;
    }


    boolean pushItem(String item) {
        if (isEmpty()) {
            stack.push(item);
            return true;
        } else {
            return false;
        }
    }


    public String peekItem() {


        return this.stack.peek();

    }

    public static void main(String[] args) {

        Stack<Soccer> stack = new Stack<>();

        Soccer soccer = new Soccer("player");
        stack.push(soccer);


    }


}
