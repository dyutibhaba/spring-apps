/**
 * 
 */
package com.docsapp.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.docsapp.dao.UserJpaDao;
import com.docsapp.entity.User;

/**
 * @author Bhabadyuti Bal
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	UserService userService;
	
	@MockBean
	UserJpaDao userJpaDao;
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	/*
	 * @Test public void getAllUsersTest() {
	 * when(userService.getAllUsers()).thenReturn(userService.getAllUsers()); }
	 */
	@Test
	public void getAllUsersTest() {
		List<User> users = new ArrayList<>();
		users.add(getUser());
		users.add(getUser());
		
		Mockito.when(userJpaDao.findAll()).thenReturn(users);
		assertThat(userService.getAllUsers()).isEqualTo(users);
	}
	
	
	private User getUser() {
		User user = new User();
		String uuid = UUID.randomUUID().toString();
		System.out.println("1st============="+uuid);
		user.setUserId(uuid);
		user.setUsername("ravikumar");
		user.setFullName("Ravi Kumar Bonthala");
		user.setManager("Raghavendra Pooncha");
		user.setStatus("ACTIVE");
		return user;
	}

}
