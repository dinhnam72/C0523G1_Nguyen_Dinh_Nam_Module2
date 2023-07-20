package s12_thuat_toan_tim_kiem.exercise.chuoi_lien_tiep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChuoiLienTiepLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bạn muốn: ");
        String input = scanner.nextLine();
        input.split("");
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) > list.getLast()) {
                    list.add(input.charAt(j));
                } else
                    break;
            }
            if (max.size() < list.size()) {
                max.clear();
                max.addAll(list);
                list.clear();
            }
        }
        System.out.print("Chuỗi liên tiếp lớn nhất: ");
        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }
    }
}
