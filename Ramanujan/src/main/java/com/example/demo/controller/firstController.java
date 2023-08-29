package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.myFirst;
import com.example.demo.repositry.firstRepo;
import com.example.demo.service.firstService;

@RestController
public class firstController {
	@Autowired
	firstService firstSer;
	
	@Autowired
	firstRepo repo;
	
	@RequestMapping("/add")
	public myFirst addUser(@RequestBody myFirst first) {
		
	
		return firstSer.addNewUser(first);
	}
	@RequestMapping("/getAll")
	public List<myFirst> getAll(myFirst first){
		
		
		return firstSer.getAllUser(first);
		
	}
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
	 firstSer.deleteUser(id);
		return "user deleted successfully";
	}
	
	@PutMapping("/update/{id}")  
	public myFirst update(@RequestBody myFirst my,@PathVariable Integer id)   
	{  
		
		myFirst my1=firstSer.update(my,id);  
	return my1;  
	}  
}
