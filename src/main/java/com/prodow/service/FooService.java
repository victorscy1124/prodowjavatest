package com.prodow.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodow.model.Foo;
import com.prodow.repository.FooRepository;


@Service("fooService")
public class FooService {

	@Autowired
	private FooRepository fooRepository;
	
	public void save(Foo foo){
		fooRepository.save(foo);
	}
	
	public List<Map<String,Object>> findAll(){
		return fooRepository.findAll();
	}
}
