package com.cts;

import java.util.List;
import java.util.Scanner;

import com.cts.model.Product;
import com.cts.service.ProductService;
import com.cts.service.ProductServiceImpl;

public class App {
	static ProductService service = new ProductServiceImpl();

	public static void main(String[] args) {
		int productId;
		String productName;
		int productPrice;
		String productCategory;
		int productQuantity;
		System.out.println("***********Product Management App**********");
		while (true) {
			System.out.println("1.Save Product");
			System.out.println("2.Update Product");
			System.out.println("3.Delete Product By Id");
			System.out.println("4.Get Product By Id");
			System.out.println("5.Get All Products");
			System.out.println("6.Get All Products Between Prices");
			System.out.println("7.Get All Products Category");
			System.out.println("8.Exit");
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Product Details To Save");
				System.out.println("Enter the productname");
				productName = scanner.next();
				System.out.println("Enter the product price");
				productPrice = scanner.nextInt();
				System.out.println("Enter the product category");
				productCategory = scanner.next();
				System.out.println("Enter the product quantity");
				productQuantity = scanner.nextInt();
				Product product = new Product(productName, productPrice, productCategory, productQuantity);
				System.out.println(service.saveProduct(product));
				break;
			case 2:
				System.out.println("Enter Product Details To Update");
				System.out.println("Enter the existing product id");
				productId = scanner.nextInt();
				System.out.println("Enter the productname");
				productName = scanner.next();
				System.out.println("Enter the product price");
				productPrice = scanner.nextInt();
				System.out.println("Enter the product category");
				productCategory = scanner.next();
				System.out.println("Enter the product quantity");
				productQuantity = scanner.nextInt();
				product = new Product(productName, productPrice, productCategory, productQuantity);
				product.setProductId(productId);
				System.out.println(service.updateProduct(product));
				break;
			case 3:
				System.out.println("Enter the existing product id");
				productId = scanner.nextInt();
				System.out.println(service.removeProduct(productId));
				break;
			case 4:
				System.out.println("Enter the existing product id");
				productId = scanner.nextInt();
				System.out.println(service.getProduct(productId));
				break;
			case 5:
				List<Product> products = service.getAllProducts();
				for (Product pro : products) {
					System.out.println(pro);
				}

				break;
			case 6:
				System.out.println("Enter the product intial price");
				int intialPrice = scanner.nextInt();
				System.out.println("Enter the product final price");
				int finalPrice = scanner.nextInt();
				products = service.getAllProductsBetween(intialPrice, finalPrice);
				for (Product pro : products) {
					System.out.println(pro);
				}
				break;
			case 7:
				System.out.println("Enter the product category");
				productCategory = scanner.next();
				products = service.getAllProductsByCategory(productCategory);
				for (Product pro : products) {
					System.out.println(pro);
				}
				break;
			case 8:
				System.out.println("Thank You !!!!");
				System.exit(1);
				break;

			default:
				break;
			}
		}
	}
}
