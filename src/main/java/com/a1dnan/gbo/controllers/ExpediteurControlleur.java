package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.ExpediteurDto;
import com.a1dnan.gbo.services.ExpediteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/expediteurs")
@RequiredArgsConstructor
public class ExpediteurControlleur {

    private final ExpediteurService expediteurService;

    @PostMapping
    public ResponseEntity<ExpediteurDto> addExp(@RequestBody ExpediteurDto expediteur){
        return ResponseEntity.ok(expediteurService.addExpediteur(expediteur));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ExpediteurDto> getExp(@PathVariable Long id){
        return ResponseEntity.ok(expediteurService.getExp(id));
    }
    @GetMapping
    public ResponseEntity<List<ExpediteurDto>> findAll(){
        return ResponseEntity.ok(expediteurService.findAll());
    }
}
