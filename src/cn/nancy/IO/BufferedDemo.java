package cn.nancy.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		for (int x=0;x<10;x++){
			bw.write("hello"+x);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
		String line=null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
	
}
