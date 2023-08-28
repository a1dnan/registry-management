package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.DepartementDto;
import com.a1dnan.gbo.entities.Departement;
import com.a1dnan.gbo.services.DepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departements")
public class DepartementController {

    private final DepartementService departementService;

    @PostMapping
    public ResponseEntity<DepartementDto> addDepartement(@RequestBody DepartementDto departement){

        return ResponseEntity.ok(departementService.addDepartement(departement));
    }
    @GetMapping("/{id}")
    public ResponseEntity<DepartementDto> getDepartement(@PathVariable Long id){
        return ResponseEntity.ok(departementService.getDepartement(id));
    }
    @GetMapping
    public ResponseEntity<List<DepartementDto>> findAll(){
        return ResponseEntity.ok(departementService.findAll());
    }
}
