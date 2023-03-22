package com.example.Hospital_management_System;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NurseService {

    NurseRepository nurseRepository = new NurseRepository();

    public String addNurse(Nurse  nurse){

        //We should write some logic code:

        if(nurse.getNurseId() > 0)
            return "Enter a valid nurseId";

        if(nurse.getName().equals(null))
            return "Nurse Name should not be null";

        //Saving it to be database
        String ans = nurseRepository.addNurse(nurse);

        return ans;
    }

    public List<Nurse> getList(int age){

        //Calling all the nurses from database

        List<Nurse> nurses = nurseRepository.getAllNurses();

        //now I am writing the logic to extract required

        List<Nurse> finalList = new ArrayList<>();

        for(Nurse nurse : nurses){

            if(nurse.getAge() > age){
                finalList.add(nurse);
            }
        }

        return finalList;
    }

    public List<Nurse> getNursesWithQualifiaction(String qualifiaction){

        List<Nurse> nurseList = nurseRepository.getAllNurses();

        List<Nurse> nurses = new ArrayList<>();

        // Logic to filter based on qualification

        for(Nurse nurse : nurseList){
            if(nurse.getQualification().equals(qualifiaction)){
                nurses.add(nurse);
            }
        }
        return nurses;
    }
}
