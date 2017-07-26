package com.cts.MyApplication.Controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cts.MyApplication.Model.AppSubList;



	@Component
	public interface AppSubListJPARepository extends JpaRepository<AppSubList, Long>
	{
		
	}
	

