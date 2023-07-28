package case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFromCSV(String filePath) {
        File file = new File(filePath);
        List<String> stringList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi");
            ;
        }
        return stringList;
    }

    public static void writeToCSV(String filePath, List<String> strings, boolean append) {
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (String string : strings) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Lỗi");
        }
    }
}
