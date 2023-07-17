package ss10_stack_queue.exercise.dau_ngoac;

import java.util.Stack;

public class KTDauNgoac {
    public void ktDauNgoac(String str) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push(str.charAt(i));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    System.out.println("Sai");
                    break;
                } else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
    }
}
