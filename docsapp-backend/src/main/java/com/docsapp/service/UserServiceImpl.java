/**
 * 
 */
package com.docsapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.docsapp.dao.UserJpaDao;
import com.docsapp.dto.UserDto;
import com.docsapp.entity.User;
import com.docsapp.responses.UserResponse;

/**
 * @author Bhabadyuti Bal
 *
 */
@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserJpaDao userJpaDao;

	@Override
	public UserResponse getAllUsers() {
		List<User> userEntities = userJpaDao.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		userEntities.forEach(user -> {
			userDtos.add(userEntityToDto(user));
		});
		UserResponse response = new UserResponse(userDtos);
		return response;
	}

	@Override
	public UserResponse getAllManagers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserByName(String name) {
		User user = userJpaDao.findByUsername(name);
		UserDto userDto = userEntityToDto(user);
		return userDto;
	}

	@Override
	public com.docsapp.dto.UserDto getManagerDetailsByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public UserDto userEntityToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setEmailId(user.getEmailId());
		userDto.setFullName(user.getFullName());
		userDto.setManager(user.getManager());
		userDto.setStatus(user.getStatus());
		userDto.setUername(user.getUsername());
		return userDto;
	}

}
