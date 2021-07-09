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
@RequestMapping("/")
@RestController
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @RequestMapping(value = "/WorkingDay/{Object}",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping
    public ResponseEntity<WorkingDay> createWorkingDay(@Valid @RequestBody WorkingDay workingDay){
        return ResponseEntity.ok(workingDayService.saveWorkingDay(workingDay));
    }

    @RequestMapping(value = "/WorkingDayGetAll",
            method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping
    public ResponseEntity<List<WorkingDay>> getAllWorkingDay(){
        return ResponseEntity.ok(workingDayService.getAllWorkingDay());
    }

    @RequestMapping(value = "/WorkingDay/{ID}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/{idWorkingDay}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkingDay> getFromIdWorkingDay(@PathVariable Long idWorkingDay) throws Exception {
        return ResponseEntity.ok(workingDayService.getFromIdWorkingDay(idWorkingDay)
                .orElseThrow(() -> new NoSuchElementException("Not found!")));
    }
    @RequestMapping(value = "/WorkingDayPut/{Object}",method = RequestMethod.PUT)
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkingDay> updateWorkingDay(@Valid @RequestBody WorkingDay workingDay){
        return ResponseEntity.ok(workingDayService.updateWorkingDay(workingDay));
    }

    @RequestMapping(value = "/WorkingDayDelete/{ID}", method = RequestMethod.DELETE)
    @DeleteMapping(value = "/{idWorkingDay}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteFromIdWorkingDay(@PathVariable Long idWorkingDay) throws Exception {
        try {
            workingDayService.deleteWorkingDay(idWorkingDay);
        }catch (Exception ex){
            ResponseEntity.internalServerError();
        }
    }
}
