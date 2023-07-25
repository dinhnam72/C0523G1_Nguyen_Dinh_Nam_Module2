package ss15_io_text_file.exercise.copy_file1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên file: ");
        String fileWrite = scanner.nextLine();
        final String LINK_READED = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\ss15_io_text_file\\exercise\\copy_file1\\fileReader";
        final String LINK_WRITER ="D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\ss15_io_text_file\\exercise\\copy_file1\\" + fileWrite;
        CopyFile copyFile = new CopyFile();
        copyFile.readCSV(LINK_READED);
        copyFile.writerCSV(LINK_READED,LINK_WRITER);
    }
}
