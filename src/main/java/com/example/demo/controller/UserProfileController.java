package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserProfileDAO;
import com.example.demo.model.UserProfile;

@RestController
@RequestMapping("/api/get_user_profile")
public class UserProfileController {
	
	@Autowired
	private UserProfileDAO userProfileDao;
	
	@PostMapping("/createUserProfile")
	public String create(@RequestBody UserProfile userProfile) {
		userProfileDao.create(userProfile);
		return "success";
	}
	
	@GetMapping("/getAll")
	public List<UserProfile> getAllPerSons(){
		return userProfileDao.readAll();
	}
	

}
