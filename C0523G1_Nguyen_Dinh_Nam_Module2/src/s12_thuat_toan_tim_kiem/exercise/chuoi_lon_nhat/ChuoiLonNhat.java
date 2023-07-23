package s12_thuat_toan_tim_kiem.exercise.chuoi_lon_nhat;

import java.util.*;

public class ChuoiLonNhat {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi bạn muốn kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        //tạo chuỗi
        String str = scanner.nextLine();
        //tạo LinkedList chứa các ký tự tăng dần theo bảng chữ cái ASCII
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            //tạo List chứa ký tự tăng theo từng trường hợp i
            LinkedList<Character> myList = new LinkedList<>();
            //thêm ký tự i vào myList
            myList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                //kiểm tra ký tự j có lớn hơn giá trị cuối cùng trong myList
                if (str.charAt(j) > myList.getLast()) {
                    //thêm ký tự j vào
                    myList.add(str.charAt(j));
                }
            }
            //so sánh mảng myList vs mảng max
            if (myList.size() > max.size()) {
                //xóa hết phần tử trong max
                max.clear();
                //thêm tất cả phần tủ của myLiss vao max
                max.addAll(myList);
            }
            //xóa hết phần từ trong myList để bắt đầu vòng lặp mới
            myList.clear();
        }
        System.out.println(max);
    }
}
