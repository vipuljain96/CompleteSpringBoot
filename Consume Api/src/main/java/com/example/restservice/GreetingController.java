//package com.example.restservice;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.concurrent.atomic.AtomicLong;
//
//@RestController
//public class GreetingController {
//
//    private final AtomicLong counter = new AtomicLong();
//
//    @GetMapping(path = "/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
//        return new Greeting((int) counter.incrementAndGet(),String.format("hello %s",name));
//    }
//
//}
