package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.myFirst;

public interface firstRepo extends JpaRepository<myFirst,Integer>{

}
