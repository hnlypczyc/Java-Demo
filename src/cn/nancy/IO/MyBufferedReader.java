package cn.nancy.IO;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {

	private Reader r;
	public MyBufferedReader(Reader r){
		this.r = r;
	}
	
	public String readline() throws IOException{
		StringBuilder  sb = new StringBuilder();
		int cha=0;
		while ((cha=r.read())!=-1){
			if(cha=='\r'){
				continue;
			}
			if(cha=='\n'){
				return sb.toString();
			}else{
				sb.append((char)cha);
			}
		}
		return null;
	}
	
	public void close() throws IOException{
		r.close();
	}

}
