package com.cts.MyApplication.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class ApplicationDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List GetAppList()
	{
		List l = em.createQuery("SELECT a.applicationId, a.applicationName, a.description, b.subname FROM Application a, AppSubList b WHERE a.applicationId = b.applicationId").getResultList();
		return l;
	}

}
