package com.codan.questionsserviceapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    Environment environment;

    @GetMapping("getQuestion")
    public ResponseEntity<String> getQuestion() {
        System.out.println("RUNNING PORT : " + environment.getProperty("local.server.port"));
        return new ResponseEntity<>("What is the main features of JAVA ?", HttpStatus.OK);
    }
}
