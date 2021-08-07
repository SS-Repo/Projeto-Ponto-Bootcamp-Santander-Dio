package com.dio.live.controller;

import com.dio.live.model.WorkingDay;
import com.dio.live.service.WorkingDayService;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RequestMapping("/api/v1/working-day")
@RestController
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<WorkingDay> createWorkingDay(@Valid @RequestBody WorkingDay workingDay){
        return ResponseEntity.ok(workingDayService.saveWorkingDay(workingDay));
    }

    @GetMapping
    public ResponseEntity<List<WorkingDay>> getAllWorkingDay(){
        return ResponseEntity.ok(workingDayService.getAllWorkingDay());
    }

   @GetMapping("/{id}")
    public ResponseEntity<WorkingDay> getFromIdWorkingDay(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(workingDayService.getFromIdWorkingDay(id)
                .orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
    @PutMapping
    public ResponseEntity<WorkingDay> updateWorkingDay(@Valid @RequestBody WorkingDay workingDay){
        return ResponseEntity.ok(workingDayService.updateWorkingDay(workingDay));
    }

    @DeleteMapping("/{id}")
    public void deleteFromIdWorkingDay(@PathVariable Long id) throws Exception {
        try {
            workingDayService.deleteWorkingDay(id);
        }catch (Exception ex){
            ResponseEntity.internalServerError();
        }
    }
}
