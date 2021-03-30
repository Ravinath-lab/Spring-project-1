package com.codefest.day3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefest.day3.entity.User;
import com.codefest.day3.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public User saveUser(User u) {
		return userRepo.save(u);
	}
	
	public List<User> saveUserList(List<User> userList) {
		return userRepo.saveAll(userList);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User updateUser(User u) {
		User avbUser = userRepo.findById(u.getId()).orElse(null);
		if(avbUser != null) {
			avbUser.setEmail(u.getEmail());
			avbUser.setName(u.getName());
			avbUser.setMobile(u.getMobile());
			avbUser.setPassword(u.getPassword());
			userRepo.save(avbUser);
		}
		return null;
	}
	
	public String deleteUser(int id) {
		User avbUser = userRepo.findById(id).orElse(null);
		if(avbUser != null) {
			userRepo.delete(avbUser);
			return "Delete user "+ id;
		}else {
			return "User not found for id "+ id;
		}
		
	}
	
	public void deleteAllUsers() {
		userRepo.deleteAll();
	}
	
	public User getUserById(int id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public List<User> getUsersByName(String name){
		return userRepo.findAllByName(name);
	}
	public List<User> getUsersByEmail(String email){
		return userRepo.findAllByEmail(email);
	}
	public List<User> getUsersByMobile(String mobile){
		return userRepo.findAllByMobile(mobile);
	}
	
}
