package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.EmployeDto;
import com.a1dnan.gbo.services.EmployeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employes")
@RequiredArgsConstructor
public class EmployeController {

    private final EmployeService employeService;

    @PostMapping
    public ResponseEntity<EmployeDto> addEmp(@RequestBody EmployeDto employeDto){
        return ResponseEntity.ok(employeService.addEmp(employeDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeDto> getEmp(@PathVariable Long id){
        return ResponseEntity.ok(employeService.getEmp(id));
    }

    @GetMapping
    public ResponseEntity<List<EmployeDto>> findAll(){
        return ResponseEntity.ok(employeService.findAll());
    }

}
