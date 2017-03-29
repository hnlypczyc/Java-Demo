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
			if (arrFiles2[i].isFile()){
				String fileName = arrFiles2[i].getName();
				int PointIndex = fileName.indexOf(".");
				String FileIndex = fileName.substring(1,PointIndex);
				File newFile = new File("Dir2\\Dir3","file"+FileIndex+".txt");
				arrFiles2[i].renameTo(newFile);
				String newFileName = newFile.getName();
				System.out.printf("%s is changed name to %s",fileName,newFileName);
				System.out.println();				
			}
			
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
				
		//delete the folder and files under Dir2
		File file7 = new File("Dir2\\Dir3\\dir5");
		File file8 = new File("Dir2\\Dir3\\dir5\\dir5file.txt");
		File file9 = new File("Dir2\\Dir3\\dir4");
		File file10 = new File("Dir2\\Dir3\\dir4\\dir4file.txt");
		File file11 = new File("Dir2\\Dir3\\dir4\\dir6");
		File file12 = new File("Dir2\\Dir3\\dir4\\dir6\\dir6file.txt");
		File file13 = new File("Dir2\\Dir3\\dir4\\dir6\\dir7");
		File file14 = new File("Dir2\\Dir3\\dir4\\dir6\\dir7\\dir7file.txt");
		file7.mkdir();
		file9.mkdir();
		file11.mkdir();
		file13.mkdir();
		file8.createNewFile();
		file10.createNewFile();
		file12.createNewFile();
		file14.createNewFile();

		deleteFile(file2);


	}
	
	/*
	 * 传入一个pathName
	 * 1.如果是文件夹，删除文件夹下的所有文件
	 * 2.如果是文件，直接删除
	 * Dir2\Dir3 (f1.txt, f2.txt,Dir4)
	 */
	public static void deleteFile(File file) {
		//判断文件是否存在
		if(file.exists()){
			//判断是否为文件，或者是否为空文件夹，如果是就直接删除
			if (file.isFile()||file.list().length==0){
				System.out.println(file.getName()+" is deleted!-->"+file.delete());
			}else{
				//获取文件夹下的所有的文件或是目录
				File[] files = file.listFiles();
				for(File f: files){
					// 递归调用deleteFile函数删除f下的所有的文件或是目录
					deleteFile(f);
				}

			}
			//如果文件是文件夹并且为空，直接删除
			if(file.isDirectory()&&file.list().length==0){
			//最后删除file空目录
			System.out.println(file.getName()+" is deleted!-->"+file.delete());
			}
		}else{
			System.out.println("The path or file is not exist!");
		}
		
		
//		if (file.list().length==0){
//			System.out.println(file.getName()+" is deleted!-->"+file.delete());
//
//		}
		
	}
	
}
