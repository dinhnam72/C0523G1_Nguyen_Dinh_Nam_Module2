package ss10_stack_queue.exercise.dao_nguoc_phan_tu;

import java.util.ArrayList;
import java.util.Stack;

public class DaoNguocTu {
    public static void main(String[] args) {
        String str = "you love I";
        System.out.println("Chuỗi ban đầu: " + str);
        String[] mWord = str.split(" ");

        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        String result = "";
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
            result += mWord[i] + " ";
        }
        System.out.println("Chuỗi sau khi đảo: " + result);

    }
}
