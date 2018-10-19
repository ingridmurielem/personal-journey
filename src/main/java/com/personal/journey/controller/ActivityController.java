package com.personal.journey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ActivityController {


    @GetMapping(path = "/activities")
    public List<String> getAllActivities() {
        return Arrays.asList("AfroPython", "TWU");
    }
}
