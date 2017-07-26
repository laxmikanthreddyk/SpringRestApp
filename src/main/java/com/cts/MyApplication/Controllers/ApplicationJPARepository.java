package com.cts.MyApplication.Controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cts.MyApplication.Model.Application;

@Component
public interface ApplicationJPARepository extends JpaRepository<Application, Long>
{
	
}
