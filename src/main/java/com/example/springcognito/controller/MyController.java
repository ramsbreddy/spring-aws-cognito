package com.example.springcognito.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {
    @RequestMapping(value = "home",method = RequestMethod.POST)
    public ResponseEntity sendTestOrder() {
       log.info("UUUUUUUUUUUUU DID ITTTTTTTTTTTTTTTTT");
        return new ResponseEntity(HttpStatus.OK);
    }
}
