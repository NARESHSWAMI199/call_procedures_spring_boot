package com.useProcedure.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.useProcedure.entity.Blog;

@Repository
public class UsersDao {

	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Blog> getUsersInfo(int input){
		return em.createNamedStoredProcedureQuery("firstProcedure").setParameter("user_id",input).getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Blog> getUsersInfoById(int input){
		return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("user_id",input).getResultList();
	}
	
	
}
