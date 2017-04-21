package cn.nancy.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		osw.write('a');
		osw.write(97);
		osw.write("bcde");
		char[] cha = {'h','e','l','l','o'};
		osw.write(cha);
		osw.write(cha, 1, 3);
		osw.write("java", 0, 2);
		osw.flush();
		osw.close();
	}
}
