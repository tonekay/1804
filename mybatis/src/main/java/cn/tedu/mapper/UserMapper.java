package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;
/**
 * Spring 框架和mybatis框架整合,spring启动时去找mybatis,
 * 根据配置mapper目录,进行包扫描,扫描到所有的mapper接口,创建他的实例
 */
public interface UserMapper {

	List<User> find();
	
	@Select(value="select id,name,birthday,address from user where id=#{id}")
	User findUserById(Integer id);
	
	@Insert(value="INSERT INTO user(ID,NAME,BIRTHDAY,ADDRESS) VALUES (null,#{name},#{birthday},#{address})")
	void insert(User user);
	
	@Update(value="update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	void update(User user);
	
	@Delete(value="delete from user where id=#{id}")
	void delete(Integer id);
}
