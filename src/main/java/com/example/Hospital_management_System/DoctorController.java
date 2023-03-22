package com.example.Hospital_management_System;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    HashMap<Integer,Doctor> doctorDb = new HashMap<>();

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor){

        int doctorId = doctor.getDoctorId();

        doctorDb.put(doctorId,doctor);

        return "Doctor added successfully";
    }

}
