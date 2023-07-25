package ss15_io_text_file.exercise.copy_file1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<String> readCSV(String linkReaded) {
        List<String> stringList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(linkReaded);
             BufferedReader buff = new BufferedReader(fileReader);
        ) {
            String line;
            while ((line = buff.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (Exception e) {
            System.out.println("Lỗi chưa xác định.");
        }
        return stringList;
    }

    public void writerCSV(String linkReaded, String linkWriter) {
        try {
            File file = new File(linkWriter);
            if (file.exists()) {
                System.out.println("File đã tồn tại!");
                return;
            }
            FileWriter fileWriter = new FileWriter(linkWriter, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : readCSV(linkReaded)) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("File không tồn tại ");
        }
    }
}
