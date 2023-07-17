package ss10_stack_queue.exercise.dao_nguoc_phan_tu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>(5);
        myArray.add(5);
        myArray.add(10);
        myArray.add(3);
        myArray.add(9);
        myArray.add(14);
        System.out.print("Mảng trước khi đảo phần tử: ");
        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(myArray.get(i) + "\t");
        }
        Stack<Integer> mySack = new Stack<>();
        for (int i = 0; i < myArray.size(); i++) {
            mySack.push(myArray.get(i));
        }

        System.out.println();
        System.out.print("Mang rsau khi đảo phần tử: ");
        for (int i = 0; i < myArray.size(); i++) {
            myArray.set(i, mySack.pop());
            System.out.print(myArray.get(i) + "\t");
        }

    }
}
