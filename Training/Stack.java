package training;

import java.util.Scanner;

class StackNode {
    char data;
    StackNode next;

    StackNode(char data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    StackNode head;

    public void push(char data) {
        StackNode newnode = new StackNode(data);
        newnode.next = head;
        head = newnode;
    }

    public void pop() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public char peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();

        System.out.print("Enter The Parenthesis String:-");
        char[] cr = sc.nextLine().trim().toCharArray();

        boolean isValid = true;

        for (int i = 0; i < cr.length; i++) {
            char c = cr[i];

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                if (st.isEmpty()) {
                    isValid = false;
                    break;
                }

                char top = st.peek();

                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    st.pop();
                } else {
                    break;
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("Valid Parenthesis");
        }

        else {
            System.out.println("Invalid Parenthesis");
        }
    }
}