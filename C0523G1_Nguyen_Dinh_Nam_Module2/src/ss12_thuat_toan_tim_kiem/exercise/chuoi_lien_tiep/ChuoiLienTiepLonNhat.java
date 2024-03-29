package ss2_thuat_toan_tim_kiem.exercise.chuoi_lien_tiep;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLienTiepLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bạn muốn: ");
        String str = scanner.nextLine();
        str.split("");
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
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
