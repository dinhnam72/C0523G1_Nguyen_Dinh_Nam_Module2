package ss03_mang_phuongthuc.exercise;

public class TongDuongCheo {
    public static void main(String[] args) {
        double arr[][] = {{56.2, 5.9, 6, 2.4}, {3.8, 2, 8.7, 4.8}, {2.7, 14.5, 20.4, 1.9},{2.4,10.4,5.1,4.6}};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử dòng " + (i + 1) + " : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.printf("Tổng các phần tủ đường chéo chính: %.2f", sum);
    }
}
