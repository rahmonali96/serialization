package com.example.serialization.service;

import com.example.serialization.model.X;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class XS {
    @SneakyThrows
    public void encode(X x){
        String name = x.getName().concat(".ser");
        FileOutputStream outputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(x);
    }

    @SneakyThrows
    public X decode(MultipartFile file) {
        InputStream inputStream = file.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return (X) objectInputStream.readObject();
    }
}
