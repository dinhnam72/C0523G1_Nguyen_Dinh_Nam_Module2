package s11_java_collection_framework.exercise.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bạn muốn: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toUpperCase();
        String arr[] = str.split(" ");
        Map<String, Integer> myMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!myMap.containsKey(arr[i])) {
                myMap.put(arr[i], 1);
            } else {
                int value = myMap.get(arr[i]) + 1;
                myMap.put(arr[i], value);
            }
        }
        System.out.println(myMap);
    }
}
