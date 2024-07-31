
package com.example.springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootProjectApplication {
		
	@GetMapping("/msg")
	public String show() {
		return "welcome to jenkis session";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

}
//package com.example.springboot_project;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//@RestController
//public class SpringbootProjectApplication {
//
//    @GetMapping("/add")
//    public String add(@RequestParam double a, @RequestParam double b) {
//        return "Result: " + (a + b);
//    }
//
//    @GetMapping("/subtract")
//    public String subtract(@RequestParam double a, @RequestParam double b) {
//        return "Result: " + (a - b);
//    }
//
//    @GetMapping("/multiply")
//    public String multiply(@RequestParam double a, @RequestParam double b) {
//        return "Result: " + (a * b);
//    }
//
//    @GetMapping("/divide")
//    public String divide(@RequestParam double a, @RequestParam double b) {
//        if (b == 0) {
//            return "Division by zero is not allowed.";
//        }
//        return "Result: " + (a / b);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringbootProjectApplication.class, args);
//    }
//}
//
//
