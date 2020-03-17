package com.example.controller;

import com.example.model.Staff;
import com.example.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String display(){
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "staffs")
    public List<Staff> getStaffs(){
        return staffService.getStaffs();
    }

    @RequestMapping(value = "staffs/{name}")
    public Staff getStaff(@PathVariable("name") String name){
        return staffService.getStaff(name);
    }

}
