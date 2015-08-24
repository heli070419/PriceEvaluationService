package com.heli.util.dao;

public interface DBUtilDAO {

	public final static String DELETE = "delete";
	public final static String INSERT = "insert";
	
	public int getTableID(String tableName);
	
	public int updateRecordFromTable(String tableName, String deleteOrInsert);
	
	
}
