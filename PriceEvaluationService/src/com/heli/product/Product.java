package com.heli.product;

public class Product {

	private int productId;
	private String productName;
	private double originalPrice;
	private double mailPrice;
	private double listPrice;
	private double secondSalesPrice;
	private double productWeight;
	private String productDesc;

	public Product(int productId, String productName, double originalPrice,
			double mailPrice, double listPrice, double secondSalesPrice,
			double productWeight, String productDesc) {
		this.productId = productId;
		this.productName = productName;
		this.originalPrice = originalPrice;
		this.mailPrice = mailPrice;
		this.listPrice = listPrice;
		this.secondSalesPrice = secondSalesPrice;
		this.productWeight = productWeight;
		this.productDesc = productDesc;
	}
	
	public Product() {
		this(0,"",0.00,0.00,0.00,0.00,0.00,"");
	}
	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getMailPrice() {
		return mailPrice;
	}

	public void setMailPrice(double mailPrice) {
		this.mailPrice = mailPrice;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getSecondSalesPrice() {
		return secondSalesPrice;
	}

	public void setSecondSalesPrice(double secondSalesPrice) {
		this.secondSalesPrice = secondSalesPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

}
