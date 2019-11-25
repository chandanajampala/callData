package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Data")
public class GetUsers {
	 @GetMapping("/getUsers")
	    public List<userEntity> getUserFromRegService() {
	    	RestTemplate restTemplate = new RestTemplate();
	    	EntityList response = restTemplate.getForObject(
	    			  "http://localhost:8084/regForm/grtUsers",
	    			  EntityList.class);
	    			List<userEntity> users = response.getUsers();
	    			return users;
	    }
}
