package com.codefest.day3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codefest.day3.entity.User;
import com.codefest.day3.service.UserService;

@RestController
@RequestMapping(path="/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(path = "/getUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@GetMapping(path = "/getUniqueUser/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}
	@GetMapping(path = "/searchUser")
	public List<User> searchUsers() {
		return null;
	}
	
	@GetMapping(path = "/findUserByName/{name}")
	public List<User> searchUsersByName(@PathVariable String name) {
		return userService.getUsersByName(name);
	}
	@GetMapping(path = "/findUserByEmail/{email}")
	public List<User> searchUsersByEmail(@PathVariable String email) {
		return userService.getUsersByEmail(email);
	}
	@GetMapping(path = "/findUserByMobile/{mobile}")
	public List<User> searchUsersByMobile(@PathVariable String mobile) {
		return userService.getUsersByMobile(mobile);
	}
	
	
	@DeleteMapping(path = "/deleteAllUsers")
	public void deletAllUsers() {
		userService.deleteAllUsers();
	}
	@DeleteMapping(path = "/deleteUser/{id}")
	public String deletUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
	
	
	@PutMapping(path = "/updateUser")
	public void updateUser(@RequestBody User u) {
		userService.updateUser(u);
	}
	
	@PostMapping(path = "/saveUser")
	public User saveUser(@RequestBody User u) {
		return userService.saveUser(u);
	}
	
}
