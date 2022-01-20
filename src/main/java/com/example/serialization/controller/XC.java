package com.example.serialization.controller;

import com.example.serialization.model.X;
import com.example.serialization.service.XS;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
public class XC {
    private XS xs;
    @PostMapping("/encode")
    public ResponseEntity<?> encode(@RequestBody X x) {
        xs.encode(x);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @SneakyThrows
    @PostMapping("/decode")
    public ResponseEntity<X> decode(@RequestParam("file") MultipartFile file) {
        return new ResponseEntity<>(xs.decode(file), HttpStatus.OK);
    }
}
