package com.znn.dao;

import java.util.List;

import com.znn.vo.User;

public interface UserMapper {
	public User selectByPrimaryKey(int key);
	public List<User> selectAllUser();
}
