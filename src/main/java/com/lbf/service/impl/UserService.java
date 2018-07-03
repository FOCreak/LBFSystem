package com.lbf.service.impl;

import javax.annotation.Resource;

import com.lbf.entity.User;
import com.lbf.dao.UserDao;
import com.lbf.service.IUserService;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService implements IUserService {
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

}
