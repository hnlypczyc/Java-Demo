package cn.nancy.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		int len;
		char[] chars = new char[1024];
		while((len=br.read(chars))!=-1){
			System.out.print(new String(chars,0,len));
		}
		br.close();
	}

}
