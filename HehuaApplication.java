package com.hehua.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HehuaApplication {

    @Value("${test.text.hello}")
    private String sayText;

	@RequestMapping("/")
	public String methodOne(){
	    return "I'm here : methodOne!!!"+sayText+"乱码！cdcdcd";
	}
	public static void main(String[] args) {
		SpringApplication.run(HehuaApplication.class, args);
	}
}
