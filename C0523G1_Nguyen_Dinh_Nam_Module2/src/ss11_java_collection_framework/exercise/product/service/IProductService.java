package s11_java_collection_framework.exercise.product.service;

import s11_java_collection_framework.exercise.product.model.Product;

import java.util.List;

public interface IProductService {
    void getDisplay();
    void addProdsuct();
    void updateProduct();
    void removeProduct();
    void searchProduct ();
    void sortPriceAscending();
    void sortPriceDescending();
}
