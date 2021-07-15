package example;

import java.util.Stack;

public class StackExample {

    private static void testing() {

        Stack stack = new Stack();

        stack.push(0);
        stack.push("Hello world");
        stack.push("Honda Jazz");


        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.push("new item");
        stack.push(3);

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }


    public static void main(String[] args) {
        testing();

    }

}
