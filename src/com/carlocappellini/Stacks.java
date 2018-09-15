package com.carlocappellini;


import java.util.Stack;


class Stacks {

    private Stack<String> stack;
    private int size;


    public Stacks() {
        this.stack = new Stack();
    }


    public boolean addItem(String string) {

        if (string != null && !stack.contains(string)) {
            stack.push(string);
            size++;
            System.out.println(string + " was added");
            return true;

        }
        return false;
    }

    public boolean peek() {

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return false;
        } else {
            System.out.println(stack.peek());
            return true;
        }

    }

    public boolean pop() {
        if (stack.isEmpty() && stack.peek() == null) {
            System.out.println("Stack is empty");
            return false;
        } else {
            System.out.println(stack.peek() + " was deleted");
            size--;
            stack.pop();
            return true;

        }


    }


    public static void main(String[] args) {

        Stacks stack = new Stacks();

        stack.addItem("Sienita I Love You <3");
        stack.addItem("Sienita, my baby  <3");
        stack.peek();

        stack.pop();

        stack.peek();
        System.out.println(stack.size);
        stack.pop();
        stack.peek();
        System.out.println(stack.size);

    }
}




