package com.example.upload.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class UploadTO {
    private MultipartFile image;

    public UploadTO() {
    }
}
