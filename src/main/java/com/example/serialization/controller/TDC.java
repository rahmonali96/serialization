package com.example.serialization.controller;

import com.example.serialization.model.A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/today")
public class TDC {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static
    class A{
        @Value("Some name")
        private String name;
    }
    @GetMapping(produces = "application/xml")
    public A today() {
        return new A();
    }

}
