
/**
 * 
 */
package com.docsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docsapp.dto.UserDto;
import com.docsapp.responses.UserResponse;
import com.docsapp.service.UserService;

/**
 * @author Bhabadyuti Bal
 *
 */
@RestController
@RequestMapping("/docsapp")
public class UsersController {
	
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/getusers")
	public ResponseEntity<UserResponse> getAllUsers(){
		UserResponse users = userService.getAllUsers();
		return new ResponseEntity<UserResponse>(users, HttpStatus.OK);
	}
	
	@GetMapping("/getuser/{name}")
	public ResponseEntity<UserDto> getUserByName(@PathVariable String name){
		UserDto user = userService.getUserByName(name);
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
	}
	
	

}
