package com.znn.service;

import java.io.Serializable;
import java.util.List;

import com.znn.vo.User;

public interface UserService {

	public abstract User selectByPrimaryKey(int key);
	public abstract List<User> selectAllUser();
}