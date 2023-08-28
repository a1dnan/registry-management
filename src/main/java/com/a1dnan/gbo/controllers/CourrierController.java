package com.a1dnan.gbo.controllers;

import com.a1dnan.gbo.dtos.CourrierDto;
import com.a1dnan.gbo.entities.enums.TypeCourrier;
import com.a1dnan.gbo.services.CourrierService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courriers")
@RequiredArgsConstructor
public class CourrierController {

    private final CourrierService courrierService;

    @PostMapping
    public ResponseEntity<CourrierDto> addCourrier(@RequestBody CourrierDto courrierDto){
        return ResponseEntity.ok(courrierService.add(courrierDto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<CourrierDto> getCourrier(@PathVariable Long id){
        return ResponseEntity.ok(courrierService.getCourrier(id));
    }
    @GetMapping
    public ResponseEntity<List<CourrierDto>> findAll(){
        return ResponseEntity.ok(courrierService.findAll());
    }
    @GetMapping("/employe")
    public ResponseEntity<List<CourrierDto>> findCourrierByEmployeName(@RequestParam("nom") String nom){
        return ResponseEntity.ok(courrierService.findCourrierByEmployeNom(nom));
    }
    @GetMapping("/type")
    public ResponseEntity<List<CourrierDto>> findCourrierByType(@RequestParam("type") TypeCourrier type){
        return ResponseEntity.ok(courrierService.findAllCourrierByType(type));
    }
}
