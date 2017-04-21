package cn.nancy.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		bw.write("hello world");
		bw.write("Java");
		bw.flush();
		bw.close();
	}

}
