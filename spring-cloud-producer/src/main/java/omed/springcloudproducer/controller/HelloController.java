package omed.springcloudproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("")
    public String index() {
        return "producer is running";
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
    
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name;
    }
    
    @GetMapping("/hi")
    public String hi(String name) {
        return "hi," + name;
    }
}
