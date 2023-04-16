package org.springframework.service.impl;

import org.springframework.service.UserService;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @Author: chenCheng
 * @Date: 2023-04-16 16:29
 */
@Component
public class UserServiceImpl implements UserService {

	@Override
	public void test() {
		System.out.println(this);
		System.out.println("SUCCESS  222");
	}
}
