package com.meghanask.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
   @GetMapping("/")
    public String sayHello(){
       return "Hello world!";
   }

   @GetMapping("/workout")
    public String getDailyWorkout(){
       return "Run for 10kms";
   }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Your lucky day is today";
    }
}
