package com.docsapp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;

import com.docsapp.dto.xml.User;
import com.docsapp.service.UserServiceImpl;



public class DocsappServiceMockTest {
	
	@Mock
	UserServiceImpl userService;

	
	@Test
	public void testGetUsers() {
		String str1 = "aaa";
		String str2 = "aaa";
		assertEquals(str1, str2);
	}
}
