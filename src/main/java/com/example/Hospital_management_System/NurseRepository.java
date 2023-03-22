package com.example.Hospital_management_System;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepository {

    //this is class that will contain the database (HashMap,MySql)

    HashMap<Integer,Nurse> nurseDb = new HashMap<>();

    public String addNurse(Nurse nurse){

        int key = nurse.getNurseId();
        nurseDb.put(key,nurse);

        return "Nurse added Successfully";
    }

    public List<Nurse> getAllNurses(){

        return nurseDb.values().stream().toList();
    }
}
