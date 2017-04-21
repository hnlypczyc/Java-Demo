package cn.nancy.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * int read() 
          读取单个字符。 
 *int read(char[] cbuf, int offset, int length) 
          将字符读入数组中的某一部分。 

 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("StringDemo.txt"));
		
//		int cha;
//		while((cha = isr.read())!=-1){
//			System.out.print((char)cha);
//		}
		
		char[] chars = new char[1024];
		int len = 0;
		while((len = isr.read(chars))!=-1){
			System.out.print(new String(chars,0, len));
		}
		isr.close();
				
		
	}

}
