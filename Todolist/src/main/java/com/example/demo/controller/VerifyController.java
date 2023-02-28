package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.VerifyRepository;
import com.example.demo.service.VerifyService;
import com.example.demo.verify.Verify;

@RestController
public class VerifyController 
{
	  @Autowired
	  VerifyRepository servicerepository;
	  @Autowired
	  VerifyService  service;
	  
	  @GetMapping("/get1")
	  List<Verify> getList(){
		  return servicerepository.findAll();
	  }
	  @PostMapping("/post1")
	  public Verify create(@RequestBody Verify st) {
		  return servicerepository.save(st);
	  }
	  @DeleteMapping("/delete1")
	  public String delete(@RequestParam int id)
	 {
		  return service.deleteDetails(id);	  
	}
}
