package ss16_binary_file_serialization.exercise.quanlisanpham.repository;

import ss16_binary_file_serialization.exercise.quanlisanpham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> productList();
    void addProduct(Product product);
    void searchProduct(String name);
    void removeProduct(int id);

}
