/**
 * 
 */
package com.docsapp.responses;

import java.util.ArrayList;
import java.util.List;

import com.docsapp.dto.UserDto;
import com.docsapp.dto.xml.User;

/**
 * @author Bhabadyuti Bal
 *
 */
//@XmlRootElement (name="users")
public class UserResponse {
	
	private List<UserDto> users = new ArrayList<>();	
	
	public UserResponse() {
	}
	
	public UserResponse(List<UserDto> users) {
		this.users = users;
	}

	public List<UserDto> getUsers() {
		return users;
	}

	public void setUsers(List<UserDto> users) {
		this.users = users;
	}
	
	

}
