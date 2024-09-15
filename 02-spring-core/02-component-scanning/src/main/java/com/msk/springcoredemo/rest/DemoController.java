package com.msk.springcoredemo.rest;

import com.meghanask.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define private field for dependency
    private Coach myCoach;

    // define constructor for dependency injection
    @Autowired
    public DemoController(Coach thecoach){
        myCoach = thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyworkout();
    }
}
