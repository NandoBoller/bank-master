package edu.mum.cs.cs425.labs.bank.service;

import edu.mum.cs.cs425.labs.bank.dto.UserRegistrationDto;
import edu.mum.cs.cs425.labs.bank.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
