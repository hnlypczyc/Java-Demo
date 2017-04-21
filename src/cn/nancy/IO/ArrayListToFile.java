package cn.nancy.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFile {

	public static void main(String[] args) throws IOException {
		ArrayList <String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Java");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		for(String s: list){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	

}
