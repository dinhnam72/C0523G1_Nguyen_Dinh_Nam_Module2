package ss10_stack_queue.exercise.dau_ngoac;

import java.util.Stack;

public class KTDauNgoac {
    public void ktDauNgoac(String str) {
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightSack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                leftStack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                rightSack.push(str.charAt(i));
            }
        }
        if (leftStack.size() == rightSack.size()) {
            System.out.println("Well");
        } else {
            System.out.println("No");
        }
    }
}
