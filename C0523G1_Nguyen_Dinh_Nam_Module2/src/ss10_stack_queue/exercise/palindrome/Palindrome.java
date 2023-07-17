package ss10_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        Stack<Character> myStack = new Stack<>();
        Queue<Character> myQueue = new LinkedList<>();
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            myStack.push(input.charAt(i));
            myQueue.add(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (myStack.pop() != myQueue.remove()) {
                flag = false;
                System.out.println("Không phải chuỗi Palindrome");
                break;
            }
        }
        if (flag) {
            System.out.println("Đây là chuỗi Palindrome");
        }
    }
}
