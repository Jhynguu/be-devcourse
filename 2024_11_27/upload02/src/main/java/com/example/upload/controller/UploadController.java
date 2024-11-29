package com.example.upload.controller;

import com.example.upload.dto.UploadTO;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String uploadFrom() {
        return "upload";
    }

    /*@RequestMapping("/upload_ok")
    public String uploadOk(
            MultipartFile image,
            Model model
    ) {
        String imagename = image.getOriginalFilename();
        if (!image.isEmpty()) {
            try {
                String name = imagename.substring(0, imagename.lastIndexOf("."));
                String ext = imagename.substring(imagename.lastIndexOf("."));

                imagename = name + "_" + System.nanoTime() + ext;

                image.transferTo(new File("C:\\java\\2024_11_27\\upload02\\src\\main\\resources\\static\\upload", imagename));
            } catch (IOException e) {
                System.out.println("[에러] " + e.getMessage());
            }
        } else {
            System.out.println("업로드 파일 없음");
        }

        model.addAttribute("imagename", imagename);

        return "upload_ok";
    }*/

    // 이미지를 출력하는 Controller
    @ResponseBody
    @GetMapping("/image/{imagename}")
    // @PathVariabale => get 경로값에 넣을 값
    // import org.springframework.core.io.Resource;
    public Resource image(@PathVariable String imagename) throws MalformedURLException {
        return new UrlResource("file:" + "C:\\java\\2024_11_27\\upload02\\src\\main\\resources\\static\\upload\\" + imagename);
    }

    @RequestMapping("/upload_ok")
    public String uploadOk(
            @ModelAttribute UploadTO to,
            Model model
    ) {
        String imagename = to.getImage().getOriginalFilename();
        System.out.println(imagename);

        model.addAttribute("imagename", "12_841926338603000.jpg");

        return "upload_ok";
    }

}
