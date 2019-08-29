/**
 * 
 */

package com.docsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docsapp.entity.User;


/**
 * @author Bhabadyuti Bal
 *
 */
public interface UserJpaDao extends JpaRepository<User, String> {
	
	User findByUsername(String name);

}
