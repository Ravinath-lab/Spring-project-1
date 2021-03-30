package com.codefest.day3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefest.day3.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findAllByName(String name);
	List<User> findAllByMobile(String mobile);
	List<User> findAllByEmail(String email);

}
