package com.test.rest.restwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.restwebservices.model.HelloBean;

@RestController
public class HelloWorldController {

	// GET
	// POST
	// RequestMapping/GetMapping/PostMapping)

	/*
	 * @RequestMapping(method = RequestMethod.GET, path = "/hello") public String
	 * helloWorld() { return "hii world";
	 * 
	 * }
	 */

	// using bean/model object
	@GetMapping(path = "/hello-world-bean")
	public HelloBean getBean() {
		return new HelloBean("hello world");
	}
	
	
	@GetMapping(path = "/hello-world/{name}")
	public HelloBean getBean( @PathVariable String name) {
		return new HelloBean(String.format("hello world, %s", name));
	}

	

}
