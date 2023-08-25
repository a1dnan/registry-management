package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.EmployeDto;
import com.a1dnan.gbo.services.EmployeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employes")
@RequiredArgsConstructor
public class EmployeController {

    private final EmployeService employeService;

    @PostMapping
    public EmployeDto addEmp(@RequestBody EmployeDto employeDto){
        return employeService.addEmp(employeDto);
    }

    @GetMapping("/{id}")
    public EmployeDto getEmp(@PathVariable Long id){
        return employeService.getEmp(id);
    }

}
