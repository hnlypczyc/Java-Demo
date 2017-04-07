package cn.nancy.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Copy the file from source folder to destination folder.
 * 1. Use FileInputStream/FileOutPutStream to read/writer byte by byte(read(int byte))
 * 2. Use FileInputStream/FileOutputStream to read/writer byte array by byte array(read(byte[]) 
 * 3. Use BufferedInputStream/BufferedOutputStream to read/writer byte by byte(read(int byte))
 * 4. Use BufferedInputStream/BufferedOutputStream to read/writer byte array by byte array(read(byte[]) 
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException{
		String srcPath = "C:\\Wildlife.wmv";
		String desPath = "CopyVideo.wmv";
		
		long start = System.currentTimeMillis();
//		method1(srcPath, desPath);//Copy time is: 1204289
//		method2(srcPath, desPath); //Copy time is: 1208
//		method3(srcPath, desPath); //Copy time is: 2014
		method4(srcPath, desPath); //Copy time is: 246
		long end = System.currentTimeMillis();
		System.out.println("Copy time is: " + (end - start));
	}
	
	public static void method1(String srcPath, String desPath) throws IOException{
		FileInputStream fis = new FileInputStream(srcPath);
		FileOutputStream fos = new FileOutputStream(desPath);
		int by = 0;
		while ((by = fis.read())!=-1){
			fos.write(by);
		}
		fos.close();
		fis.close();
	}
	
	public static void method2(String srcPath, String desPath) throws IOException {
		FileInputStream fis = new FileInputStream(srcPath);
		FileOutputStream fos = new FileOutputStream(desPath);
		int len = 0;
		byte[] bys = new byte[1024];
		while ((len = fis.read(bys))!=-1){
			fos.write(bys,0,len);
		}
		fos.close();
		fis.close();
	}
	
	public static void method3(String srcPath, String desPath) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desPath));
		int by = 0;
		while((by = bis.read())!=-1){
			bos.write(by);
			
		}
		bos.close();
		bis.close();
	}
	
	public static void method4(String srcPath, String desPath) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desPath));
		int len = 0;
		byte[] bys = new byte[1024];
		while ((len = bis.read(bys))!=-1){
			bos.write(bys);
		}
		bos.close();
		bis.close();
	}
}
