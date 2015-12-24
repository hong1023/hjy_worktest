/**
 * 
 */
/**
 * @author 홍지연
 *
 */
package com.spring.web.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Repository
public class SpringDao{
	@Autowired
	private SqlSession sql;
	
	@SuppressWarnings("unchecked")
	public List<String> queryTest() throws SQLException {
		return (List)sql.selectList("common.sql.testView");
	}
}
