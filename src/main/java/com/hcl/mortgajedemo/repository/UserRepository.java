package com.hcl.mortgajedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.mortgajedemo.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{

}
