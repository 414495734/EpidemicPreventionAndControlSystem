package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Pupil;


import com.example.demo.util.QRCodeUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

   /*     //存放在二维码里的内容
        String text="123";
        //要嵌入二维码的图片路径
        String imgPath="D:/mei.jpg";
        //生成的二维码的路径和名称
        String destPath="D:/01.jpg";
        //生成二维码
        try {
            QRCodeUtil.encode(text,imgPath,destPath,true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //解析二维码里的内容
        String decode = null;
        try {
            decode = QRCodeUtil.decode(destPath);
        } catch (Exception e) {
            e.printStackTrace();
        }

        URL url=null;
        try {
            url = new URL("D:/01.jpg");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/

    }

}
