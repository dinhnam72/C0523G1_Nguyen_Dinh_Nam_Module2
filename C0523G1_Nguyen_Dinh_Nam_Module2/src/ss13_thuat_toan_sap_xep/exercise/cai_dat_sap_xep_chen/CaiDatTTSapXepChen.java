package s13_thuat_toan_sap_xep.exercise.cai_dat_sap_xep_chen;

public class CaiDatTTSapXepChen {
    public static void main(String[] args) {
        int list[] = {3, 6, 7, 1, 3};
        insertionSort(list);
    }

    static void insertionSort(int list[]) {
        int temp;
        int pos;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            pos = i;
            while (pos > 0 && temp < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = temp;
        }
        for (int list1 : list) {
            System.out.print(list1);
        }
    }
}
