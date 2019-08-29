/**
 * 
 */
package com.docsapp.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.docsapp.entity.User;

/**
 * @author Bhabadyuti Bal
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class UserJpaDaoTest {

	//Spring provides this for teting purpose
	
	@Autowired
	private TestEntityManager entityManager; 
	@Autowired
	private UserJpaDao userJpaDao;
	
	@Test
	public void testSaveUser() {
		User user = getUser();
		User savedUser = entityManager.persist(user);
		
		Optional<User> userById = this.userJpaDao.findById(savedUser.getUserId());
		System.out.println("2nd================"+userById.get().getUsername());
		assertThat(userById.get()).isEqualTo(savedUser);
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
