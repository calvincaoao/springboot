package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.properties.GirlProperties;

@RestController
public class HelloController{
	
//	@Value("${cupSize}")
//	private String cupSize;
//	
//	@Value("${age}")
//	private Integer age;
//	
//	@Value("${content}")
//	private String content;
	
	@Autowired
	private GirlProperties girlProperties;
	
	@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
	public String say(@PathVariable("id") Integer id) {
//		return "hello spring boot;";
//		return girlProperties.getCupSize() + girlProperties.getAge();
//		return content;
//		return girlProperties.getContent();
		return "id:" + id;
	}
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String tell(@RequestParam(value="id",required=false,defaultValue="0") Integer myId) {
//		return "hello spring boot;";
//		return girlProperties.getCupSize() + girlProperties.getAge();
//		return content;
//		return girlProperties.getContent();
		return "myId:" + myId;
	}
}