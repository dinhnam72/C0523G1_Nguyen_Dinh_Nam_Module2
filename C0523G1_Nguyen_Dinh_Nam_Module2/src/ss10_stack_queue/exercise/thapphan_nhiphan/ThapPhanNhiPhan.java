package ss10_stack_queue.exercise.thapphan_nhiphan;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ thập phân bạn muốn chuyển đổi: ");
        int number = scanner.nextInt();
        int nhiPhan;

        Stack<Integer> dsNhiPhan = new Stack<>();
        do {
            nhiPhan = number % 2;
            number = number / 2;
            dsNhiPhan.push(nhiPhan);
        } while (number != 0);
        int size = dsNhiPhan.size();
        System.out.print("Tập hợp các số nhị phân được chuyển đổi: ");
        for (int i = 0; i < size; i++) {
            System.out.print(dsNhiPhan.pop());
        }

    }
}
