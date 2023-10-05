package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Users;

public interface UserServiceInterface {

	String addNewUser(Users users);
	
	List<Users> getAllUsers();

	Optional<Users> getUserById(Long userId);

	String updateUsersData(Users users,Long id);

	String deleteUsersData(Long userId);

}
