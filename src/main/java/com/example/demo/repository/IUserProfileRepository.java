package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.UserProfile;

public interface IUserProfileRepository extends CrudRepository<UserProfile, Integer> {


}
