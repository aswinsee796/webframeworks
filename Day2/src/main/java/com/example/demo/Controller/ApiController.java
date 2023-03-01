package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {
@Value("${message}")
private String name;
@GetMapping("/getnoname")
public String getName() {
	return name;
}

}
