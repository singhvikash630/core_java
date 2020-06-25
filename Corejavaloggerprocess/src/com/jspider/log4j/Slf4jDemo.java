package com.jspider.log4j;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Slf4jDemo {
	 public void test() {
		 log.debug("Json response for /authorize/users is :: {}", jsonString);                                                                                                                                
 
	}
	public static void main(String[] args) {
		

	}

}
