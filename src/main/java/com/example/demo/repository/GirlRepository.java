package com.example.demo.repository;

//import com.example.*;
import com.example.demo.domain.Girl;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer>{
	
	public List<Girl> findByAge(Integer age);
	
	public List<Girl> findBycupSize(String cupSize);
}