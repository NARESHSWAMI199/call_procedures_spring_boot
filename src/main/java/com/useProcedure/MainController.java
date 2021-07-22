package com.useProcedure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.useProcedure.dao.UsersDao;
import com.useProcedure.entity.Blog;

@RestController
public class MainController {

	@Autowired
	UsersDao usersDao;
	
	@GetMapping("/first/{user_id}")
	public List<Blog> findBlog(@PathVariable("user_id") int user_id){
		return usersDao.getUsersInfo(user_id);
	}
	
	@RequestMapping("/secound/{user_id}")
	public List<Blog> findUsersByID(@PathVariable("user_id") int user_id){
		return usersDao.getUsersInfoById(user_id);
	}
	
}
