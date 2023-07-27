package ss16_binary_file_serialization.exercise.quanlisanpham.repository;

import ss16_binary_file_serialization.exercise.quanlisanpham.model.Product;
import ss16_binary_file_serialization.exercise.quanlisanpham.util.ReadAndWriterFile;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    final String FILE_PATH = "D:\\Codegym\\Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\C0523G1_Nguyen_Dinh_Nam_Module2\\src\\ss16_binary_file_serialization\\exercise\\quanlisanpham\\data\\product.csv";

    @Override
    public List<Product> productList() {
        List<Product> productList = new ArrayList<>();
        List<String> stringList = ReadAndWriterFile.readFromCSV(FILE_PATH);
        String[] array;
        Product product;
        for (String str : stringList) {
            array = str.split(",");
            int id = Integer.parseInt(array[0]);
            String name = array[1];
            double price = Double.parseDouble(array[2]);
            String manufacturer = array[3];
            String describe = array[4];
            product = new Product(id, name, price, manufacturer, describe);
            productList.add(product);
        }
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<String> stringList = new ArrayList<>();
        // kết nối DataByte hoặc ghi file
        stringList.add(product.getInfoToCSV());
        ReadAndWriterFile.writeToCSV(FILE_PATH, stringList, true);
    }

    @Override
    public void searchProduct(String name) {
        List<Product> productList = productList();
//        List<Product> searchProduct = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                System.out.println(productList.get(i));
            } else {
                System.out.println("k có");
            }
        }
    }

    @Override
    public void removeProduct(int id) {
        List<Product> productList = productList();
        int index = productList.indexOf(new Product(id));
        if (index != -1) {
            productList.remove(index);
        }
        List<String> stringList = new ArrayList<>();
        for (Product product : productList) {
            stringList.add(product.getInfoToCSV());
        }
        ReadAndWriterFile.writeToCSV(FILE_PATH, stringList, false);
    }
}
