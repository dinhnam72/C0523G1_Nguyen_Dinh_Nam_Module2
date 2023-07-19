package s11_java_collection_framework.exercise.product.repository;

import s11_java_collection_framework.exercise.product.controller.ProductController;
import s11_java_collection_framework.exercise.product.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Sting", 10000));
        productList.add(new Product(2, "RedBull", 15000));
        productList.add(new Product(3, "Nước Suối", 5000));
    }

    @Override
    public List<Product> getDisplay() {
        return productList;
    }

    @Override
    public void addProdsuct(Product product) {
        productList.add(product);
    }

    //tạo thương thức để tìm kiếm sản phâm dựa vào id
    public Product findByID(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
            // thay đối tượng đã sửa thông tin tại vị trí index
                productList.set(i, product);
            }
        }
    }

    @Override
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public void searchProduct(String name) {
        boolean flag = true;
        for (int i = 0; i < productList.size(); i++) {
            // kiểm tra name có trùng không
            if(productList.get(i).getName().contains(name)){
                System.out.println( productList.get(i));
                flag = false;
            }
        }
        //nếu name k có thì hiện thông báo lên.
        if (flag){
            System.out.println("Tên sản phẩm không có trong hệ thống");
        }
    }

    @Override
    public List<Product> sortPriceAscending() {
        //Dùng Collections.sort() để xét giá trị tăng của sản phẩm
        Collections.sort(productList);
        return productList;
    }

    @Override
    public List<Product> sortPriceDescending() {
        //Dùng Collections.reverse() để đaảo ngược nhằm sắp xếp giá giảm cảu sản phẩm
        Collections.reverse(sortPriceAscending());
        return productList;
    }


}
