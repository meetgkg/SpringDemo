package com.gaurav.spring.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	Connection conn = null;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Circle getCircle(int circleId) {
		
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int getCircleCount() {
		String circleCountSql = "SELECT COUNT(1) FROM CIRCLE";
		return jdbcTemplate.queryForObject(circleCountSql, Integer.class);
	}
	
	public String getCircleName(int circleId) {
		String circleNameSql = "SELECT NAME FROM CIRCLE WHERE ID = ?";
		return jdbcTemplate.queryForObject(circleNameSql , new Object[] {circleId}, String.class);
	}
	
	public Circle getCircleForId(int circleId){
		String circleNameSql = "SELECT * FROM CIRCLE WHERE ID = ?";
		return jdbcTemplate.queryForObject(circleNameSql, new Object[] {circleId}, new CircleMapper());
	}
	
	private static final class CircleMapper implements RowMapper<Circle>{
		public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(rs.getInt("ID"));
			circle.setName(rs.getString("NAME"));
			return circle;
		}
	}
	
	
	public List<Circle> getAllCircles(){
		String allCircle = "SELECT * FROM CIRCLE";
		return jdbcTemplate.query(allCircle, new CircleMapper());
	}
	
	
	public void insertCircle(Circle circle){
		String insertCircle = "INSERT INTO CIRCLE (ID, NAME) VALUES(? ,?)";
		jdbcTemplate.update(insertCircle, new Object[]{circle.getId(), circle.getName()});
	}
	
	public void insertCircleNamedParam(Circle circle){
		String insertCircle = "INSERT INTO CIRCLE (ID, NAME) VALUES(:ID ,:NAME)";
		SqlParameterSource namedParam = new MapSqlParameterSource().addValue("ID", circle.getId()).addValue("NAME", circle.getName());
		namedParameterJdbcTemplate.update(insertCircle, namedParam);
	}
	
}
