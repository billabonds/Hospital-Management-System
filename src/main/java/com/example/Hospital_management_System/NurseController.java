package com.example.Hospital_management_System;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    NurseService nurseService = new NurseService();

    @PostMapping("/add")
    public String addNurse(@RequestBody Nurse nurse){

        String ans = nurseService.addNurse(nurse);

        return ans;
    }

    @GetMapping("/getByAge")
    public List<Nurse> getNurseGreaterThanAge(@RequestParam("age")Integer age){

        List<Nurse> nurseList = nurseService.getList(age);

        return nurseList;
    }

    @GetMapping("/getByQualification")
    public List<Nurse> getNursesByQualification(@RequestParam("qualification")String qualification){

        List<Nurse> nurses = nurseService.getNursesWithQualifiaction(qualification);

        return nurses;
    }
}
