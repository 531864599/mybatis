package com.gao.main;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gao.entity.User;
import com.gao.mapper.UserMapper;

/**
 * mybatis_source
 * 
 * @author gaoxuxu
 * @Date 2018年12月25日 上午9:23:26
 * @function SourceTest.java
 *
 */
public class SourceTest {
	public static void main(String[] args) throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.getUserById(1L);
		System.out.println("getMapper:" + user);
		User user2 = sqlSession.selectOne("com.gao.mapper.UserMapper.getUserById", 2L);
		System.out.println("select one:" + user2);
	}

}
