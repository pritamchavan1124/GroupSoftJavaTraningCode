package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Users;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public String addNewUser(Users users) {
		userRepo.save(users);
		return "Successfully new user is added!!!!";
		
	}

	@Override
	public List<Users> getAllUsers() {
		List<Users> users=userRepo.findAll();
		return users;
	}

	@Override
	public Optional<Users> getUserById(Long userId) {
		Optional<Users> user=userRepo.findById(userId); 
			return user;
				
	}

	@Override
	public String updateUsersData(Users users,Long id) {
		String msg="User details successfully updated!!";
		Optional<Users> user=userRepo.findById(id);
		if(user.isPresent()) {
			user.get().setCustFirstName(users.getCustFirstName());
			user.get().setCustLastName(users.getCustLastName());
			user.get().setCity(users.getCity());
			user.get().setCustEmail(users.getCustEmail());
			user.get().setCustMobileNo(users.getCustMobileNo());
			user.get().setCustAge(users.getCustAge());
			user.get().setGender(users.getGender());
			user.get().setPassword(users.getPassword());
			Users userObj=userRepo.save(user.get());
		}else
		return "User id is not present in database";
		return msg;
	}

	@Override
	public String deleteUsersData(Long userId) {
		userRepo.deleteById(userId);
		return "User details deleted!!!!!";
	}

}
