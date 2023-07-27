package ss16_binary_file_serialization.exercise.quanlisanpham.controller;

import ss16_binary_file_serialization.exercise.quanlisanpham.service.IProductService;
import ss16_binary_file_serialization.exercise.quanlisanpham.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void showMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------Product Manager------");
            System.out.println("1. Display");
            System.out.println("2. Creat");
            System.out.println("3. Search");
            System.out.println("4. Remove");
            System.out.println("7. Exit");
            System.out.print("Nhập số bạn muốn: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    productService.removeProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
