package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.myFirst;
import com.example.demo.repositry.firstRepo;
@Service
public class firstService {

	
	@Autowired
	private firstRepo repo;
public myFirst addNewUser(myFirst first) {
	myFirst my=repo.save(first);
	
	return my;
}
public List<myFirst> getAllUser(myFirst first){
	return repo.findAll();
	
}
public void deleteUser(Integer id) {
	repo.deleteById(id);
	return;

}

//updating a record  
public myFirst update(myFirst first, Integer id)   
{  
	first.setId(id);
myFirst my=repo.save(first);
	
	return my; 
}

}
