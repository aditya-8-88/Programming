package com.example.demo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Alien;

@Repository
public class AlienRepo {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Alien alien) {
//		System.out.println("Added");
		
		String sqlString = "insert into alien (id,name,tech) values (?,?,?)";
		int rows = jdbcTemplate.update(sqlString,alien.getId(),alien.getName(),alien.getTech());
		System.out.println(rows);
		
	}
	
	public List<Alien> fetch(){
		
		String sqlString="select * from alien;";
		
		RowMapper<Alien> mapper = new RowMapper<Alien>() {
			
			@Override
			public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Alien alien = new Alien();
				alien.setId(rs.getInt(1));
				alien.setName(rs.getString(2));
				alien.setTech(rs.getString(3));
				return alien;
			}
		};
		List<Alien> aliens = jdbcTemplate.query(sqlString, mapper);
		
		return aliens;
	}
}
