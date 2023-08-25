package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.CourrierDto;
import com.a1dnan.gbo.services.CourrierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courriers")
@RequiredArgsConstructor
public class CourrierController {

    private final CourrierService courrierService;

    @PostMapping
    public CourrierDto addCourrier(@RequestBody CourrierDto courrierDto){
        return courrierService.add(courrierDto);
    }
    @GetMapping("/{id}")
    public CourrierDto getCourrier(@PathVariable Long id){
        return courrierService.getCourrier(id);
    }
}
