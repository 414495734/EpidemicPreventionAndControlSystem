package com.example.demo.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FastByteArrayOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

@Controller
public class WeiXinImgController {


    /*返回图片qxky01*/
    @ResponseBody
    @RequestMapping("/WXImgQxkyOne")
    public String WXImgQxkyOne(){
        BufferedImage bufferedImage=null;
        FastByteArrayOutputStream os = new FastByteArrayOutputStream();
        ClassPathResource classPathResource = new ClassPathResource("static/css/img/qxky01.png");
        File file=null;
        try {
           file = classPathResource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedImage = ImageIO.read(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ImageIO.write(bufferedImage, "png", os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //如果二维码要在前端显示需要转成Base64
        String base64 = "data:image/png;base64,";
        String encode = Base64.getEncoder().encodeToString(os.toByteArray());

        return base64+encode;
    }

    /*返回图片*/
    @ResponseBody
    @RequestMapping("/WXImgQxkyTwo")
    public String WXImgQxkyTwo(){
        BufferedImage bufferedImage=null;
        FastByteArrayOutputStream os = new FastByteArrayOutputStream();
        ClassPathResource classPathResource = new ClassPathResource("static/css/img/qxky02.png");
        File file=null;
        try {
            file = classPathResource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedImage = ImageIO.read(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ImageIO.write(bufferedImage, "png", os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //如果二维码要在前端显示需要转成Base64
        String base64 = "data:image/png;base64,";
        String encode = Base64.getEncoder().encodeToString(os.toByteArray());

        return base64+encode;
    }
}
