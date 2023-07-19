package s11_java_collection_framework.exercise.product.controller;

import giaithuat.mvc.sevice.ICustomerService;
import s11_java_collection_framework.exercise.product.model.Product;
import s11_java_collection_framework.exercise.product.service.IProductService;
import s11_java_collection_framework.exercise.product.service.ProductService;

import java.util.Scanner;

public class ProductController {


    public static void showMenu(){
        IProductService productService = new ProductService();
        int select=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----- Product Manager ------");
            System.out.println("1. List");
            System.out.println("2. Create");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. AscendingPrice");
            System.out.println("7. DescendingPrice");
            System.out.println("9. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    productService.getDisplay();
                    break;
                case 2:
                    productService.addProdsuct();
                    break;
                case 3:
                    productService.updateProduct();
                    break;
                case 4:
                    productService.removeProduct();
                    break;
                case 5:
                    productService.searchProduct();
                    break;
                case 6:
                    productService.sortPriceAscending();
                    break;
                case 7:
                    productService.sortPriceDescending();
                    break;
                case 9:
                    System.exit(0);
            }
        }while (true);
    }
}
