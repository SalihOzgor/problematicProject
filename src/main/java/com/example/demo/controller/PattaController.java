package com.example.demo.controller;

import com.example.demo.service.PattaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patta")
@AllArgsConstructor
public class PattaController {

    private PattaService pattaService;

    public ResponseEntity<String> patta() {
        return ResponseEntity.ok(pattaService.getPattaName());
    }

}
