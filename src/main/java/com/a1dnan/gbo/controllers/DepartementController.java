package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.DepartementDto;
import com.a1dnan.gbo.entities.Departement;
import com.a1dnan.gbo.services.DepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departements")
public class DepartementController {

    private final DepartementService departementService;

    @PostMapping
    public DepartementDto addDepartement(@RequestBody DepartementDto departement){

        return departementService.addDepartement(departement);
    }
    @GetMapping("/{id}")
    public DepartementDto getDepartement(@PathVariable Long id){
        return departementService.getDepartement(id);
    }
}
