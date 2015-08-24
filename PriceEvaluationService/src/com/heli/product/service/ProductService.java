package com.heli.product.service;


import com.heli.product.Product;

public interface ProductService {

	public int saveOrUpdateProduct(Product product);
	
	public Product getProduct(int productid);
	
}
