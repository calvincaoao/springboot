package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Girl;
import com.example.demo.repository.GirlRepository;

//import com.example.demo.domain.Girl;
//import com.example.demo.repository.GirlRepository;
//import com.example.demo.repository；

import java.util.List;

import javax.validation.Valid;

@RestController
public class GirlController{
	
	@Autowired
	private GirlRepository girlRepository;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping(value="/girls")
	public List<Girl> girls() {
		return girlRepository.findAll();
	}
	
//	@PostMapping(value="/girl")
//	public Girl addGirl(@RequestParam("age") Integer age,
//			            @RequestParam("cupSize") String cupSize) {
//		Girl girl = new Girl();
//		girl.setAge(age);
//		girl.setCupSize(cupSize);
//		
//		return girlRepository.save(girl);
//		// return girl;
//	}
	
	@PostMapping(value="/girl")
	public Object addGirl(@Valid Girl girl, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			System.out.println(bindResult.getFieldError().getDefaultMessage());
			return bindResult.getFieldError().getDefaultMessage();
		}
		girl.setAge(girl.getAge());
		girl.setCupSize(girl.getCupSize());
		
		System.out.println(girl.getAge().toString());
		
		return girlRepository.save(girl);
		// return girl;
	}
	
	@GetMapping(value="/girl/{id}")
	public Girl getGirl(@PathVariable("id") Integer id) {
		return girlRepository.findOne(id);
	}
	
	@PutMapping(value="/girl/{id}")
	public void updateGirl(@PathVariable("id") Integer id,
			              @RequestParam("age") Integer age,
			              @RequestParam("cupSize") String cupSize) {
		  Girl girl = new Girl();
		  girl.setId(id);
		  girl.setAge(age);
		  girl.setCupSize(cupSize);
		  
		  girlRepository.save(girl);
	}
	
	@GetMapping("/girl/cupSize/{cupSize}")
	public List<Girl> getGirlbycupSize(@PathVariable String cupSize){
		return girlRepository.findBycupSize(cupSize);
	}
}
