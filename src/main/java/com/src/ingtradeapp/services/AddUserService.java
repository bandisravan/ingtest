package com.src.ingtradeapp.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.repo.AddUserRepo;
import com.src.ingtradeapp.response.JSONResponse;

@Service
public class AddUserService {
	
	@Autowired
	AddUserRepo userRepo;
	
	@Autowired
	JSONResponse response;
	
	public JSONResponse addUser(Users user) throws AddFailException {
		Random random = new Random();
		String acctNumber = String.format("%09d", random.nextInt(1000000000));
		user.setAccountNumber(acctNumber);
		user.setPassword(user.getAccountNumber());
		user.setRole("USER");
		userRepo.save(user);
		response.setMsg("User Created Succesfully with account #"+acctNumber);
		response.setStatus(true);
		return response;
	}
}
