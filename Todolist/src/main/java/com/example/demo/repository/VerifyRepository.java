package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.verify.Verify;

@Repository
public interface VerifyRepository extends JpaRepository<Verify,Integer>
{
    
}
