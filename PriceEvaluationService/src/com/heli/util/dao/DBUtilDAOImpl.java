package com.heli.util.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBUtilDAOImpl implements DBUtilDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	private final static String PRODUCT_TABLE_NAME = "table.product";

	String query_select = "SELECT primary_key FROM TableKey WHERE table_name = ?";
	
	String query_update = "UPDATE TableKey SET primary_key = ? WHERE table_name = ?";
			
	/**
	 * we use constructor here to instantiate datasource and jdbcTemplate in spring
	 * @param datasource
	 */
	public DBUtilDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public int getTableID(String tableName) {
		int success = jdbcTemplate.queryForInt(query_select,tableName);
		return success;
	}

	@Override
	public int updateRecordFromTable(String tableName, String deleteOrInsert) {
		int primary_key = getTableID(tableName);
		if(primary_key > 0 && DBUtilDAO.DELETE.equals(deleteOrInsert)){
			primary_key--;
		}else if(primary_key > 0 && DBUtilDAO.INSERT.equals(deleteOrInsert)){
			primary_key++;
		}
		
		int success = jdbcTemplate.update(query_update, primary_key,tableName);
		
		return success;
	}


}
