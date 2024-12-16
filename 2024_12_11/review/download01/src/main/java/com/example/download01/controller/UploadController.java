package com.example.download01.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class UploadController {

    @RequestMapping("/upload_form")
    public String upload_form() {
        return "upload_form";
    }

    @RequestMapping("/upload_ok")
    public String upload_ok(MultipartFile upload, Model model) {
        String file = null;
        // 업로드된 파일이 있는 경우 처리
        if (upload != null) {
            try {
                // 업로드된 파일의 원래 이름 출력
                System.out.println(upload.getOriginalFilename());

                // 파일 이름과 확장자를 분리
                String filename = upload.getOriginalFilename().substring(0, upload.getOriginalFilename().lastIndexOf("."));
                String extension = upload.getOriginalFilename().substring(upload.getOriginalFilename().lastIndexOf("."));

                // 파일 이름에 시스템 시간 추가하여 고유한 이름 생성
                file = filename + "_" + System.nanoTime() + extension;

                // 지정된 경로에 파일 저장
                upload.transferTo(new File("C:\\Java\\upload2\\" + file));

            } catch (IOException e) {
                System.out.println("[에러] " + e.getMessage());
            }
            model.addAttribute("file", file);
        } else {
            System.out.println("업로드 없음");
        }

        return "list";
    }

    @RequestMapping("/download")
    public ResponseEntity download(@RequestParam("file") String strFile) throws IOException {
        // 다운로드할 파일의 경로 설정
        String path = "C:/java/upload2/" + strFile;

        // 파일 경로로부터 Resource 객체 생성
        Path filePath = Paths.get(path);
        Resource resource = new InputStreamResource(Files.newInputStream(filePath));

        // 파일 객체 생성
        File file = new File(path);

        // 다운로드 응답 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDisposition(ContentDisposition.builder("attachment").filename(file.getName()).build());

        // ResponseEntity로 파일과 헤더를 함께 반환
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);

    }
}
