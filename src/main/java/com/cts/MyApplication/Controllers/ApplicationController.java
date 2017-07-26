package com.cts.MyApplication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MyApplication.Dao.ApplicationDao;
import com.cts.MyApplication.Model.Application;

@RestController
@RequestMapping("/application")
public class ApplicationController {
	
	@Autowired
	private ApplicationDao appdao;
	
	public void setAppdao(ApplicationDao appdao) {
		this.appdao = appdao;
	}

	@Autowired
	private ApplicationJPARepository applicationJPARepository;
	

	@RequestMapping(value = "/all", method=RequestMethod.GET)
	public List<Application> findAll()
	{
		return applicationJPARepository.findAll();
		
	}
	
	@RequestMapping(value = "/appall", method=RequestMethod.GET)
	public List findAppAll()
	{
		return appdao.GetAppList();
		
	}
	
}

