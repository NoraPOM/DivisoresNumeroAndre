package com.example.divisoresDeNumero.controller;

import com.example.divisoresDeNumero.service.DivisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/divisors" )

public class DivisorController {
    private final DivisorService divisorService;

    public DivisorController(@Autowired DivisorService divisorService) {
        this.divisorService = divisorService;
    }
    @GetMapping("/{id}") //carga desde el load un cliente por id
    @ResponseBody
    public ResponseEntity<List<List<Integer>>> calcular(@PathVariable Integer id) {
        return ResponseEntity.ok(divisorService.generarDivisores(id));
    }
}
