package com.heli.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.heli.product.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	private JdbcTemplate jdbcTemplate;
	

	private String query_select = "SELECT * FROM Product WHERE product_id = ?";
	
	private String query_insert = "INSERT INTO Product(product_id, product_name, original_price, mail_price, list_price, second_sale_price, product_weight, product_desc)"
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	
	private String query_update = " ";

	/**
	 * we use constructor here to instantiate datasource and jdbcTemplate in spring
	 * @param datasource
	 */
	public ProductDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int saveProduct(Product product) {
		int success = jdbcTemplate.update(
				query_insert,
				new Object[] { product.getProductId(),
						product.getProductName(), product.getOriginalPrice(),
						product.getMailPrice(), product.getListPrice(),
						product.getSecondSalesPrice(),
						product.getProductWeight(), product.getProductDesc() });
		return success;
	}

	@Override
	public void updateProduct(Product product) {

	}

	/**
	 * GetProduct() Get specific product by passing product id
	 * Get 
	 * @param productID the product id for specific product
	 * @return the product object
	 */
	@SuppressWarnings("unchecked")
	public Product getProduct(int productID) {
		Product product = (Product) jdbcTemplate.queryForObject(query_select, new Object[]{productID}, new RowMapper<Object>(){
			
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setOriginalPrice(rs.getDouble("original_price"));
				product.setMailPrice(rs.getDouble("list_price"));
				product.setListPrice(rs.getDouble("mail_price"));
				product.setSecondSalesPrice(rs.getDouble("second_sale_price"));
				product.setProductWeight(rs.getDouble("product_weight"));
				product.setProductDesc(rs.getString("product_desc"));
				return product;
			}
			
		});
		return product;
	}
	

	

}
