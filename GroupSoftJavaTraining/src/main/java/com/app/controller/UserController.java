package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Users;
import com.app.service.UserServiceInterface;

import antlr.collections.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserServiceInterface userService;
	
	//UserServiceInterface userService=new UserServiceInterface();
	@PostMapping("/newUser")
	public ResponseEntity<?> addNewUser(@RequestBody Users users) {
		String msg=userService.addNewUser(users);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<?> getAllUsers(){
		java.util.List<Users> users=userService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	//http://localhost:8080/api/user/getById/{userId}?userId=2
	@GetMapping("/getById/{userId}")
	public ResponseEntity<?> getUserById(Long userId){
		Optional<Users> users=userService.getUserById(userId);
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<?> updateUserDetails(@RequestBody Users users,Long id){
		//Long id=users.getId();
		String msg=userService.updateUsersData(users,id);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<?> deleteUserDetails(Long userId){
		String msg=userService.deleteUsersData(userId);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
}
