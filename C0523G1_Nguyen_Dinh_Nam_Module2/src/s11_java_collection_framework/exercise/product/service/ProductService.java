package s11_java_collection_framework.exercise.product.service;

import s11_java_collection_framework.exercise.product.model.Product;
import s11_java_collection_framework.exercise.product.repository.IProductRepository;
import s11_java_collection_framework.exercise.product.repository.ProductRepository;
import s11_java_collection_framework.exercise.quan_ly_san_pham.model.SanPham;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void getDisplay() {
        for (Product product : productRepository.getDisplay()) {
            System.out.println(product);
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProdsuct() {
        System.out.print("Input Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product1 = new Product(id, name, price);
        productRepository.addProdsuct(product1);
    }

    @Override
    public void updateProduct() {
        System.out.print("Nhập id sản phẩm muốn sửa thông tin: ");
        //Nhập id cần tìm
        int id = Integer.parseInt(scanner.nextLine());
        //Tìm kiệm sản phẩm dựa vào id cần nhập
        Product product = productRepository.findByID(id);
        //kiểm tra đối tượng chứa id
        if (product != null) {
            //nhập thông tin cần sửa của sản phẩm
            System.out.print("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            int price = Integer.parseInt(scanner.nextLine());
            //thay đổi thông tin của đối tượng
            product.setName(name);
            product.setPrice(price);
            //cập nhật product đã sửa thông tin
            productRepository.updateProduct(product);
        } else {
            System.out.println("Id bạn nhập không có trong danh sách.");
        }
    }

    @Override
    public void removeProduct() {
        System.out.print("Nhập id sản phẩm bạn muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = productRepository.findByID(id);
        if (product != null) {
            //cập nhập đối tượng cần remove
            productRepository.removeProduct(product);
        } else {
            System.out.println("Id bạn nhập không có trong danh sách.");
        }
    }

    @Override
    public void searchProduct() {
        System.out.print("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        String name = scanner.nextLine();
        //cập nhật name cần search
        productRepository.searchProduct(name);
    }

    @Override
    public void sortPriceAscending() {
        for (Product product : productRepository.sortPriceAscending()) {
            System.out.println(product);
        }
    }

    @Override
    public void sortPriceDescending() {
        for (Product product : productRepository.sortPriceDescending()) {
            System.out.println(product);
        }
    }

}
