package com.heli.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heli.product.Product;
import com.heli.product.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;

	@Autowired
	public ProductServiceImpl(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public int saveOrUpdateProduct(Product product) {
		int success = 0;

		if (product.getProductId() > 0) {
			// update
		} else {
			success = productDAO.saveProduct(product);
		}

		return success;
	}

	@Override
	public Product getProduct(int productid) {
		return productDAO.getProduct(productid);
	}

}
