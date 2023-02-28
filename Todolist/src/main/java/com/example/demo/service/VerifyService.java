package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VerifyRepository;

@Service
public class VerifyService {
	@Autowired
	VerifyRepository serviceRepository;
	public String deleteDetails(int id)
	{
		serviceRepository.deleteById(id);
		return "deleted";
	}
}
