package ss16_binary_file_serialization.exercise.quanlisanpham.service;

import ss16_binary_file_serialization.exercise.quanlisanpham.model.Product;
import ss16_binary_file_serialization.exercise.quanlisanpham.repository.IProductRepository;
import ss16_binary_file_serialization.exercise.quanlisanpham.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService{
    private IProductRepository productRepository =new ProductRepository();
    @Override
    public void display() {
        for(Product product: productRepository.productList()){
            System.out.println(product);
        }
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addProduct() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String describe = scanner.nextLine();
        Product product = new Product(id,name,price,manufacturer,describe);
        productRepository.addProduct(product);
    }

    @Override
    public void searchProduct() {
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = scanner.nextLine();
        productRepository.searchProduct(name);
    }

    @Override
    public void removeProduct() {
        System.out.print("Nhập id chứa sản phẩm bạn muốn xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        productRepository.removeProduct(idRemove);
    }
}
