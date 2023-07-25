package ss15_io_text_file.exercise.nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    //tạo 1 hăng số chưa link file
    private static final String FILE_PATH = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\ss15_io_text_file\\exercise\\nation\\nation.csv";
    //tạo 1 method để đọc file
    public static List<Nation> readCSV() {
        //tạo mảng chứa thông tin của file
        List<Nation> nationList = new ArrayList<>();
        //đọc file theo đường dẫn
        try (FileReader fileReader = new FileReader(FILE_PATH);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            String temp[];
            Nation nation;
            //đọc file theo từng dòng
            while ((line = bufferedReader.readLine()) != null) {
                //lấy các từ qua dấu ","
                temp = line.split(",");
                // lấy thông tin của phần tử
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                //tạo 1 đối tượng
                nation = new Nation(id, code, name);
                //thêm đối tượng vào mảng
                nationList.add(nation);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nationList;
    }

    //    public static void writer(Nation nation) {
//        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true);
//             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        ) {
//            bufferedWriter.write("\n"+nation.getId()+","+nation.getCode()+","+nation.getName());
//            bufferedWriter.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public static void main(String[] args) {
        for (Nation nation : readCSV()) {
            System.out.println(nation);
        }
//        writer(new Nation(1,"Bac","NM"));
    }
}
