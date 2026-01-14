package com.sham.Arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {

	private Integer productNumber;
	private String productName;
	private Double productPrice;

	public Product(Integer productNumber, String productName, Double productPrice) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public Product() {}
	
	public Integer getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public int compareTo(Product p) {
		return this.getProductName().compareTo(p.getProductName());
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
}

public class ArrayListComparable {
	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(101, "D", 40000.0));
		products.add(new Product(102, "B", 30000.0));
		products.add(new Product(103, "C", 20000.0));
		products.add(new Product(104, "A", 20000.0));

//		products.sort((p1,p2)->p1.getProductName().compareTo(p2.getProductName()));
//		products.forEach(System.out::println);
//		Collections.sort(products);
//		products.forEach(System.out::println);
//		products.sort(null);

		List<Product> sortedByName = products.stream()
				.sorted(Comparator.comparing(Product::getProductName))
				.toList();

//		List<Product> sortedByPriceDesc = products.stream().sorted(Comparator.comparing(Product::getPrice).reversed())
//				.toList();

		System.out.println(sortedByName);
//		System.out.println(sortedByPriceDesc);

	}
}
