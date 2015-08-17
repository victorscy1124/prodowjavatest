package com.prodow.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prodow.model.Foo;

@Repository
@Transactional
public class FooRepository {
	
	@Autowired
    protected JdbcTemplate jdbc;
	
	public void save(Foo foo){
		jdbc.update("INSERT INTO foo (`name`) VALUES (?)", 
				new Object[]{foo.getName()});
	}
	
	public List<Map<String,Object>> findAll(){
		String sql = "SELECT * from foo";
		return jdbc.queryForList(sql);
	}

}
