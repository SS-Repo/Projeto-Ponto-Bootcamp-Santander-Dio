package com.dio.live.service;

import com.dio.live.model.WorkingDay;
import com.dio.live.repository.WorkingDayRespository;
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

    public Optional<WorkingDay> getFromIdWorkingDay(Long idWorkingDay){
        return workingDayRespository.findById(idWorkingDay);
    }

    public WorkingDay updateWorkingDay(WorkingDay workingDay){
        return workingDayRespository.save(workingDay);
    }

    public void deleteWorkingDay(Long Id){
        workingDayRespository.deleteById(Id);
    }
}
