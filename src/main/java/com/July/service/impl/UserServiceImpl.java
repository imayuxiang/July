package com.July.service.impl;

import com.July.dao.UserMapper;
import com.July.model.User;
import com.July.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
//		List<User> userList = userMapper.getAll();
//		return userList.get(0);
	}

	public void saveUser(User user) {
		userMapper.insert(user);
//		抛出运行时异常，sql会自动rollback
//		throw new RuntimeException();
	}

}
