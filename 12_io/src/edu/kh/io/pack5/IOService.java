package edu.kh.io.pack5;


import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOService{

	public void output1(){

		
	FileOutputStream fos = null;
	BufferedOutputStream bos = null; // 보조 스트림 참조변수 선언
	
try {

fos = new FileOutputStream("tes.txt");


StringBuilder sb = new StringBuilder();

sb.append("안녕하세요");

//StringBuilder -> String 변환 -> charAt() -> char로 변환
String content = sb.toString();



	
		} catch (IOException e) {
			
			e.printStackTrace();
	
	
} finally {
	try {
		if (fos != null)fos.close();{
			fos.close();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
}
}
}

}
