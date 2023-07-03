package com.swp.vnhistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.swp.vnhistory.model.Location;
import com.swp.vnhistory.model.Province;
import com.swp.vnhistory.repository.ILocationRepo;

@SpringBootApplication
public class VnHistory1Application {

	
	public static void main(String[] args) {

		SpringApplication.run(VnHistory1Application.class, args);
		

	}

}
