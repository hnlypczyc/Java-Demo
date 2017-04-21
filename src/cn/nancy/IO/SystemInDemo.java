package cn.nancy.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInDemo {

	public static void main(String[] args) throws IOException{
		InputStream is  = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Please input the String data:");
		String line =br.readLine();
		System.out.println(line);
		System.out.println("Please input the int data:");
		line = br.readLine();
		System.out.println(Integer.parseInt(line));
		br.close();
	}

}
