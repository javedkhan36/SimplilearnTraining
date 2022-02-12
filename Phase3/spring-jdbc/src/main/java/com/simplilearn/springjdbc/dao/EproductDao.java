package com.simplilearn.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.springjdbc.model.Eproduct;

@Repository
public class EproductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Eproduct> getProducts() {
		
		return jdbcTemplate.query("select * from product", new RowMapper<Eproduct>() {

			@Override
			public Eproduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Eproduct ep = new Eproduct();
				ep.setId(rs.getInt(1));
				ep.setName(rs.getString(2));
				ep.setPrice(rs.getDouble(3));
				
				return ep;
			}
			
		});
	}

}
