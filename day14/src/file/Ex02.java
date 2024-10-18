package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws IOException{
		File path = new File("E:\\Choi\\test/test1.txt"); // 생성하고 싶은 파일의 위치. 동일 이름의 파일 있으면 같은 이름으로 새롭게 만듬(덮어쓰기)
		String sPath = "E:\\Choi\\test";
		
		FileOutputStream fos = new FileOutputStream(path); //파일 경로 연결
		
		Scanner input = new Scanner(System.in);
		String word = null;
		System.out.print("문자열 입력 : ");
		word = input.next();
		
		fos.write(word.getBytes());
		System.out.println("저장 완료");
		fos.close();
		
	}
}
