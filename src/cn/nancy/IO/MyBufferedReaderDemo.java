package cn.nancy.IO;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("b.txt");
		MyBufferedReader my = new MyBufferedReader(fr);
		String s;
		while((s=my.readline())!=null){
			System.out.println(s);
		}
			
	}

}
