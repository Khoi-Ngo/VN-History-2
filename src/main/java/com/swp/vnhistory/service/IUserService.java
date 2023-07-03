package com.swp.vnhistory.service;

import java.util.List;
import java.util.Optional;

import com.swp.vnhistory.model.User;

public interface IUserService {
	Optional<User> findByUsername(String name);//tim kiem co ton tai user trong database hay ko 
	Boolean existByUsername(String username); //check co exist bang user name
	Boolean existByEmail(String email); //check co exist bang email 
	User save(User user); //save users

//	List<User> findAllByUsernameContaining(String keyword);

	
}
