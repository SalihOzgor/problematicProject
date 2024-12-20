package com.example.demo.service;

import com.example.demo.model.Patta;
import org.springframework.stereotype.Service;

@Service
public class PattaService {
    public String getPattaName() {
        return new Patta("ali").getName();
    }
}
