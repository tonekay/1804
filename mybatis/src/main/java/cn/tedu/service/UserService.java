package cn.tedu.service;

import java.util.List;

import cn.tedu.pojo.User;

public interface UserService {
	
	List<User> find();
	
	User findUserById(Integer id);
	
	void insert(User user);
	
	void update(User user);
	
	void delete(Integer id);
}
