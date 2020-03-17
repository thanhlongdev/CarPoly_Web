package com.example.service;

import com.example.model.Staff;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class StaffService {
    private List<Staff> list = Arrays.asList(
            new Staff("xPeter", 20, "peter@gmail.com"),
            new Staff("xPeter1", 21, "peter1@gmail.com"),
            new Staff("xPeter2", 22, "peter2@gmail.com"),
            new Staff("xPeter3", 23, "peter3@gmail.com"),
            new Staff("xPeter4", 24, "peter4@gmail.com")
    );

    public List<Staff> getStaffs() {
        return list;
    }


    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public Staff getStaff(String name) {
        return list.stream().filter(staff -> staff.getName().equalsIgnoreCase(name)).findFirst().get();
    }
}
