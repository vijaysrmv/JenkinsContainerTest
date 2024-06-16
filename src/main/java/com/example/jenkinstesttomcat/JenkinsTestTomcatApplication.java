package com.example.jenkinstesttomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsTestTomcatApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestTomcatApplication.class, args);
    }

}


@RestController
class HomeController{

    @GetMapping("/getData")
    public String getData()
    {
        return "Done";
    }

}
