package com.znn.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.znn.dao.MyBatisDao;
import com.znn.dao.UserMapper;
import com.znn.vo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User selectByPrimaryKey(int key) {
		return userMapper.selectByPrimaryKey(key);
	}
	@Override
	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}
}
