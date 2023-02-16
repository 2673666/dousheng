package com.douSheng.util;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * @author zhiyuan
 * @date 2023/2/14 -0:05
 */
public abstract class GetCoverUtil {
    /**
     * 获取指定视频的帧并保存为图片
     * @param file  源视频文件地址
     * @param framefile  截取帧的图片存放地址
     * @throws Exception
     */
    public static void fetchPic(File file, String framefile) throws Exception{
        FFmpegFrameGrabber ff = new FFmpegFrameGrabber(file);
        ff.start();
        int lenght = ff.getLengthInFrames();
        new File(framefile).createNewFile();
        File targetFile = new File(framefile);
        int i = 0;
        Frame frame = null;
        while (i < lenght) {
            // 过滤前5帧，避免出现全黑的图片，依自己情况而定

            frame = ff.grabFrame();

            if ((i > 5) && (frame.image != null)) {
                break;
            }
            i++;
        }

        String imgSuffix = "jpg";
        if(framefile.indexOf('.') != -1){
            String[] arr = framefile.split("\\.");
            if(arr.length>=2){
                imgSuffix = arr[1];
            }
        }

        Java2DFrameConverter converter =new Java2DFrameConverter();
        BufferedImage srcBi =converter.getBufferedImage(frame);
        int owidth = srcBi.getWidth();
        int oheight = srcBi.getHeight();
        // 对截取的帧进行等比例缩放
        int width = 800;
        int height = (int) (((double) width / owidth) * oheight);
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        bi.getGraphics().drawImage(srcBi.getScaledInstance(width, height, Image.SCALE_SMOOTH),0, 0, null);
        try {
            ImageIO.write(bi, imgSuffix, targetFile);
        }catch (Exception e) {
            e.printStackTrace();
        }
        ff.stop();
    }




}
