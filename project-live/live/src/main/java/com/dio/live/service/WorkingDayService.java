package com.dio.live.service;

import com.dio.live.model.WorkingDay;
import com.dio.live.repository.WorkingDayRespository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {

    WorkingDayRespository workingDayRespository;

    @Autowired
    public WorkingDayService(WorkingDayRespository workingDayRespository){
        this.workingDayRespository = workingDayRespository;
    }

    public WorkingDay saveWorkingDay(WorkingDay workingDay){
        return workingDayRespository.save(workingDay);
    }

    public List<WorkingDay> getAllWorkingDay(){
        return workingDayRespository.findAll();
    }

    public Optional<WorkingDay> getFromIdWorkingDay(Long id){
        return workingDayRespository.findById(id);
    }

    public WorkingDay updateWorkingDay(WorkingDay workingDay){
        return workingDayRespository.save(workingDay);
    }


    public void deleteWorkingDay(Long id){
        workingDayRespository.deleteById(id);
    }
}
