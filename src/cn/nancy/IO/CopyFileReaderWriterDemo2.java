package cn.nancy.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileReaderWriterDemo2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("b.txt");
		FileReader fr = new FileReader("c:\\a.txt");
		int len;
		char[] chars = new char[1024];
		while((len = fr.read(chars))!=-1){
			fw.write(chars, 0, len);
			fw.flush();
		}
		fw.close();
		fr.close();
	}

}
