package s12_thuat_toan_tim_kiem.exercise.tim_kiem_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        //B1: Tạo mảng có phần tử bé đến lớn
        Scanner scanner = new Scanner(System.in);
        //Tạo chiều dài mảng
        System.out.print("Nhập chiều dài mảng: ");
        int size = scanner.nextInt();
        //Tạo mảng
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            int number = scanner.nextInt();
            arrayList.add(number);
        }


        //Sắp xếp pần tử
        arrayList.sort((o1, o2) -> o1 - o2);
        System.out.print("Giá trị của mảng: ");
        System.out.println(arrayList);
        System.out.print("Nhập giá trị cần tìm kiếm trong mảng: ");
        //B2: Tạo các thông tin cần thiết của phương thức binarySearch
        //Khai báo giá trị cần kiểm tra vị trí
        int value = scanner.nextInt();
        //Khai báo vị trí trái
        int left = 0;
        //Khai báo vị trí phải
        int right = arrayList.size() - 1;
        //Chạy để kiểm tra vị trí của giá trị value
        System.out.println(binarySearch(arrayList, left, right, value));
    }

    //B3: Tạo 1 thương thức để kiểm tra vị trí
    public static int binarySearch(List<Integer> arrayList, int left, int right, int value) {
        //Khai báo giá trị ở giữa mảng
        int mid = (left + right) / 2;
        //So sánh giá trị tại vị trí mid = value thì return vị trí mid
        if (arrayList.get(mid) == value) {
            return mid;
            //giá trị ại mid <value thì gán lại giá trị right
        } else if (arrayList.get(mid) > value) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        if (left <= right) {
            return binarySearch(arrayList, left, right, value);
        }
        //nếu mảng không có giá trị cần tìm thì return -1
        return -1;
    }
}
