package com.Griaffe.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Common {

	public static String setImagePath(String path) {
		String[] paths = path.split("\\\\");
		return paths[paths.length-1];
	}
	
	public static String fileUp(MultipartFile file) {
		if (file!=null) {
			String filename = file.getOriginalFilename();
			System.out.println("filename:"+filename);
			System.out.println("filename.length():"+filename.length());
			if (filename!=null&&filename.length()!=0) {
				int index = filename.indexOf(".");
				String filename2 = filename.substring(0,index)+System.currentTimeMillis()+filename.substring(index);
				String path = "D:\\Griaffe\\post_image\\";
				File f = new File(path, filename2);
				try {
					file.transferTo(f);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return filename2;
			}
			
			
		}
		
		return null;
	}
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
	}
	
	public static String getDate() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		return f.format(date);
	}
	
}
