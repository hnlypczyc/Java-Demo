package cn.nancy.file;

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;
public class FileDemo {
	public static void main(String[] args) throws IOException{
		//1. Create File instance by path
		File file1 = new File("Dir1");
		//2. Create File instance which have multiple layers.
		File file2 = new File("Dir2\\Dir3");
		//3. Create File instance by another File instance and sub path
		File file3 = new File(file2,"f1.txt");
		
		//Create folder .\Dir1 using mkdir()
		System.out.println("Create folder .\\Dir1: "+ file1.mkdir());
		//Create folder .\Dir2\Dir3 using mkdirs()
		System.out.println("Create folders .\\Dir2\\Dir3: " + file2.mkdirs());
		System.out.println("Create file f1: "+file3.createNewFile());
		
		//Create more files
		for(int i=2; i<=10;i++){
			File file4 = new File(file2,"f"+i+".txt");
			System.out.println("Create file f"+i +": "+file4.createNewFile());
		}
		
		//list all the file names 
		String[] arrFiles= file2.list();
		for(String file: arrFiles){
			System.out.println(file);
		}
		
		//list file information
		File[] arrFiles2 = file2.listFiles();
//		for(File file: arrFiles2){
//			System.out.println("getAbsolutePath: "+file.getAbsolutePath());
//			System.out.println("getPath: "+file.getPath());
//			System.out.println("isDirectory: " +file.isDirectory());
//			System.out.println("isFile: " +file.isFile());
//			System.out.println("isHidden: " +file.isHidden());
//			System.out.println("canRead: " +file.canRead());
//			System.out.println("canWrite: " +file.canWrite());
//			System.out.println("length: " +file.length());
//		}
		
		//rename
		for(int i=0;i<arrFiles2.length;i++){
			String fileName = arrFiles2[i].getName();
			int PointIndex = fileName.indexOf(".");
			String FileIndex = fileName.substring(1,PointIndex);
			File newFile = new File("file"+FileIndex+".txt");
			arrFiles2[i].renameTo(newFile);
			String newFileName = newFile.getName();
			System.out.printf("%s is changed name to %s",fileName,newFileName);
			System.out.println();
		}
		
		//Get the a.jpg file under folder
		File file5 = new File("Dir2\\Dir3\\a.jpg");
		file5.createNewFile();
		File[] arrFileFilter = file2.listFiles( new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				if (pathname.isFile() ){
					String fileName = pathname.getName();
					if(fileName.endsWith(".jpg")){
						return true;
					}
				}
				return false;
			}
			
		});
		for (File file: arrFileFilter){
			System.out.println("Found jpg file: "+ file.getName());
		}
				

	}
}
