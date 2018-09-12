package cn.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper userMapper;

	//查询所有
	@Override
	public List<User> find() {
		return userMapper.find();
	}

	@Override
	public User findUserById(Integer id) {
		
		return userMapper.findUserById(id);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public void delete(Integer id) {
		userMapper.delete(id);
	}
	
}
