package cn.nancy.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class FileToArrayList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> list = new ArrayList<String> ();
		String s=null;
		while((s=br.readLine())!=null){
			list.add(s);
		}
		for(String ss: list){
			System.out.println(ss);
		}
		Random rd = new Random();
		int i = rd.nextInt(list.size());
		System.out.println(list.get(i));
		br.close();
		br.close();
	}

}
