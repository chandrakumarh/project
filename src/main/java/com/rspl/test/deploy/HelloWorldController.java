package com.rspl.test.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
public class HelloWorldController
{
    @GetMapping
    public String getMessage()
    {
        return "Hello From Test Server";
    }
}
