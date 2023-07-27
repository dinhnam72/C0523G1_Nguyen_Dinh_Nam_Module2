package s13_thuat_toan_sap_xep.exercise.minh_hoa_sap_xep_chen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinhHoaTTSapXepChen {
    public static void main(String[] args) {
        System.out.print("Nhập size của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int list[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            list[i] = number;
        }
        System.out.print("Mảng chưa được sắp xếp: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        insertionSort(list);
    }

    public static void insertionSort(int list[]) {
        int temp;
        int pos;
        for (int i = 1; i < list.length; i++) {
            //gán temp = giá trị tại vị trí i
            temp = list[i];
            //gán pos = vị trí i
            pos = i;
            //nếu pos >0 và temp < giá trị trước nó
            while (pos > 0 && temp < list[pos - 1]) {
                //gán giá trị tại vị trí pos = giá trị vị trí trước nó
                list[pos] = list[pos - 1];
                //trả pos về vị trí pos-1
                pos--;
            }
            //gán giá tri tại vị trí pos = teamp.
            list[pos] = temp;
            //Cứ lặp lại như vậy cho đến khi sắp xếp tăng dần
        }
        System.out.print("\nMảng đã được sắp xếp: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
