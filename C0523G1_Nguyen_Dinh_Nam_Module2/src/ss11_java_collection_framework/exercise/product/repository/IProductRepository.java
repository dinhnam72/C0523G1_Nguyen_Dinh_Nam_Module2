package s11_java_collection_framework.exercise.product.repository;

import s11_java_collection_framework.exercise.product.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    List<Product> getDisplay();
    public Product findByID (int id);
    void addProdsuct(Product product);
    void updateProduct(Product product);
    void removeProduct(Product product);
    void searchProduct (String name);
    List<Product> sortPriceAscending();
    List<Product> sortPriceDescending();
}
