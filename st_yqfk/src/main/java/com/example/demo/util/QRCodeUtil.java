package com.example.demo.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import lombok.extern.slf4j.Slf4j;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;

/**
 * 功能描述:
 *
 * @author zz
 * @version 1.0
 * @date 2019/5/30 18:59
 */
@Slf4j
public class QRCodeUtil {

    /**
     * 功能描述: 生成二维码 BufferedImage.
     *
     * @param content
     * @param qrWidth
     * @param qrHeight
     * @return java.awt.image.BufferedImage
     * @author zz
     * @date 2019/5/31 9:13
     */
    public static BufferedImage getBufferImage(String content, int qrWidth, int qrHeight) throws Exception {
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hints.put(EncodeHintType.MARGIN, 1);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, qrWidth, qrHeight, hints);
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        BufferedImage image = new BufferedImage(qrWidth, qrHeight, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
            }
        }
        log.debug("执行生成二维码 BufferedImage操作");
        return image;
    }

    /**
     * 功能描述:  生成base64格式二维码.
     *
     * @param content  content
     * @param qrWidth  qrWidth
     * @param qrHeight qrHeight
     * @return string
     * @author zz
     * @date 2019/5/31 9:18
     */
    public static String getBase64(String content, int qrWidth, int qrHeight) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedImage image = getBufferImage(content, qrWidth, qrHeight);
            //转换成png格式的IO流
            ImageIO.write(image, "png", byteArrayOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte[] bytes = byteArrayOutputStream.toByteArray();
        BASE64Encoder encoder = new BASE64Encoder();
        String base64 = encoder.encodeBuffer(bytes).trim();
        base64 = "data:image/png;base64," + base64;
        log.debug("执行生成base64格式二维码操作");
        return base64;
    }

    /**
     * 功能描述:  test.
     *
     * @param
     * @return
     * @author zz
     * @date 2019/5/30 19:27
     */
    public static void main(String[] args) throws Exception {
        //  ImageIO.write(getBufferImage("4545454545", 500, 500), "jpg", new File("c:\\qrCode.jpg"));
        System.out.println("--base64--" + getBase64("4545454545", 500, 500));
    }
}


