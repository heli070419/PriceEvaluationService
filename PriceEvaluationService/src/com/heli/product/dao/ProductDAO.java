package com.heli.product.dao;



import com.heli.product.Product;

public interface ProductDAO {
	
	public int saveProduct(Product product);
	
	public void updateProduct(Product product);
	
	public Product getProduct(int productID);

}
