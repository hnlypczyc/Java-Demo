package cn.nancy.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		File srcFolder = new File("c:\\test");
		File desFolder = new File("c:\\test1");
		if (!desFolder.exists()){
			desFolder.mkdir();
		}
		
		File[] files = srcFolder.listFiles();
		for(File subFile: files){
			String fileName = subFile.getName();
			File desFile = new File(desFolder,fileName);
			CopyFile(subFile,desFile);
		}
		
		
	}
	public static void CopyFile(File srcFile, File desFile) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFile));
		int len =0;
		byte[] bytes = new byte[1024];
		while((len = bis.read(bytes))!=-1){
			bos.write(bytes, 0, len);
		}
		bos.flush();
		bos.close();
	}
}
