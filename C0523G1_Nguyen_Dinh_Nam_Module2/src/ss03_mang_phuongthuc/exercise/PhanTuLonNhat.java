package ss03_mang_phuongthuc.exercise;

public class PhanTuLonNhat {
    public static void main(String[] args) {
        double arr[][] = {{56.2, 5.9, 6}, {3.8, 2, 8.7}, {2.7, 14.5, 20.4}};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử dòng " + (i + 1) + " : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        double max = arr[0][0];
        int hang = 0;
        int cot = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    hang = i;
                    cot = j;
                }
            }
        }
        System.out.print("Giá trị lớn nhất của mảng: " + max + " có vị trí là " + "[" + hang + "]" + "[" + cot + "]");

    }
}
