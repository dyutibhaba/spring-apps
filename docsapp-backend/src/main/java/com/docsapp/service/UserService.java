/**
 * 
 */
package com.docsapp.service;

import com.docsapp.dto.UserDto;
import com.docsapp.responses.UserResponse;

/**
 * @author Bhabadyuti Bal
 *
 */
public interface UserService {
	
	UserResponse getAllUsers();
	
	UserResponse getAllManagers();
	
	UserDto getUserByName(final String name);
	
	UserDto getManagerDetailsByUsername(final String name);
	

}
