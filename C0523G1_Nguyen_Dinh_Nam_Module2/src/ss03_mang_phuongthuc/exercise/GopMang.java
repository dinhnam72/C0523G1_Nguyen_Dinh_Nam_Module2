package ss03_mang_phuongthuc.exercise;

public class GopMang {
    public static void main(String[] args) {
        int arr1[] = {3, 4, 5, 1, 5};
        int arr2[] = {5, 4, 5, 10, 5, 7, 3};
        System.out.print("Mảng một: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Mảng hai: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int newArr[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        System.out.print("Mảng mới: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
