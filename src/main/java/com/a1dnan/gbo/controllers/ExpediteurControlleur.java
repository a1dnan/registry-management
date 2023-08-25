package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.ExpediteurDto;
import com.a1dnan.gbo.entities.Expediteur;
import com.a1dnan.gbo.services.ExpediteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expediteurs")
@RequiredArgsConstructor
public class ExpediteurControlleur {

    private final ExpediteurService expediteurService;

    @PostMapping
    public ExpediteurDto addExp(@RequestBody ExpediteurDto expediteur){
        return expediteurService.addExpediteur(expediteur);
    }

    @GetMapping("/{id}")
    public ExpediteurDto getExp(@PathVariable Long id){
        return expediteurService.getExp(id);
    }
}
