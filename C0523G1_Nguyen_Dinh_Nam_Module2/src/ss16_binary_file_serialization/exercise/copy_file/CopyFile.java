package ss16_binary_file_serialization.exercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static String SOURCE_FILE_PATH = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\ss16_binary_file_serialization\\exercise\\copy_file\\source_file.dat";
    private static String TARGET_FILE_PATH = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\ss16_binary_file_serialization\\exercise\\copy_file\\target_file.dat";

    public static List<Student> readFile(String scourceFilePath) {
        List<Student> student = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(scourceFilePath);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            student = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return student;
    }

    public static void writeFile(String targetFilePath, List<Student> students) {
        try (FileOutputStream fos = new FileOutputStream(targetFilePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(students);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "A");
        Student student2 = new Student(2, "B");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        //writeFile(SOURCE_FILE_PATH,studentList);
        writeFile(TARGET_FILE_PATH, readFile(SOURCE_FILE_PATH));
        for (Student student : readFile(TARGET_FILE_PATH)) {
            System.out.println(student);
        }
    }


}
