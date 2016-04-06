package com.gaurav.spring.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcTemplateDaoImpl extends JdbcDaoSupport{
	
	public int getCircleCount() {
		String circleCountSql = "SELECT COUNT(1) FROM CIRCLE";
		return getJdbcTemplate().queryForObject(circleCountSql, Integer.class);
	}
	
}
