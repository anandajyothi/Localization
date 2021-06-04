package com.spring.setplex.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.MessageSource;
//mark class as Controller  
@RestController  
public class UserController {
	@Autowired
	private MessageSource messageSource; 

	@GetMapping("/user")  
	private ResponseEntity<String> getUserAccess()   
	{  
	  String welcome_onboard = messageSource.getMessage("welcome.Onboard.message", null,LocaleContextHolder.getLocale());
	  String returnData = welcome_onboard;
	  return ResponseEntity.status(HttpStatus.OK).body(returnData);
	}  

}
