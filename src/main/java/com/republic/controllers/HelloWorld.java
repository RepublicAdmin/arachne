package com.republic.controllers;

import com.republic.models.HelloResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sample", produces = "application/json;charset=UTF-8")
public class HelloWorld {

    @RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
    public HelloResponse process() {
        return new HelloResponse();
    }


}
