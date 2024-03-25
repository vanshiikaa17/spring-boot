package com.springboot.rest.Helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component

public class FileUploadHelper {
public final String DIR="D:\\DATA RECOVERED\\D\\Coding\\Springboot\\rest\\src\\main\\resources\\static\\images" ;

public boolean uploadSuccess(MultipartFile mFile){
    boolean upload=false;

    try {
        Files.copy(mFile.getInputStream(), Paths.get(DIR+File.separator+mFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return upload;
}
}
