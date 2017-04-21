package cn.nancy.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Copy the file from source folder to destination folder;
 */
public class CopyFileReaderWriterDemo {

	public static void main(String[] args) throws IOException{
		InputStreamReader  isr = new InputStreamReader(new FileInputStream("c:\\a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
		int len=0;
		char[] chars = new char[1024];
		while((len = isr.read(chars))!=-1){
			osw.write(chars, 0, len);
			osw.flush();
		}
		isr.close();
		osw.close();
		

	}

}
