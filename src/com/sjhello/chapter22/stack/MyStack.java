package com.sjhello.chapter22.stack;

import java.util.Arrays;

public class MyStack implements StackInterface {
    private int [] array;
    private int size;
    private int top;

    MyStack(int size) {
        this.top = -1;
        this.size = size;       // array.length
        array = new int[size];
    }

    @Override
    public int pop() {
        int data;
        this.top = this.size - 1;       // length = 0, top = -1
        data = this.array[this.top];   // pop() 될 데이터

        if (isEmpty()) {
            System.out.println("stack is empty");
            return 0;
        } else {
            int [] copyArray = new int[top];
            System.arraycopy(this.array, 0, copyArray, 0, top);
            this.array = copyArray;

            return data;
        }
    }

    @Override
    public void push(int data) {
        if (isFull()) {
            System.out.println("stack is full");
        } else {
            this.array[++this.top] = data;
        }
    }

    public boolean isFull() {
        return (this.top == this.size -1);
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }


    public void printStack() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(4);


        int popData = myStack.pop();
        System.out.println(popData);
//
//        System.out.println();
//        myStack.printStack();
    }
}
