package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex04 implements CommonPath{
	public static void main(String[] args) throws Exception {
		System.out.println(CommonPath.PATH);
		System.out.println(PATH); //상속을 받으면 그냥 PATH만 써도 된다.
	
		Scanner input = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String fileName = input.next();
		
		File file = new File(PATH + fileName + ".txt");
		if(file.exists()) {
			System.out.println("존재하는 파일입니다. 수정으로 가세요");
		}else {
			FileOutputStream fos = new FileOutputStream(file);
			System.out.print("출력할 내용 작성 : ");
			String msg = input.next();
			fos.write(msg.getBytes());
			System.out.println("저장되었습니다.");
			fos.close();
		}
		
		System.out.print("확인할 파일명 입력 : ");
		fileName = input.next();
		File inputFile = new File(PATH + fileName + ".txt");
		if(inputFile.exists()) { //해당파일에 접근 가능
			FileInputStream fis = new FileInputStream(inputFile); //해당하는 위치의 파일을 불러온다.
			while(true) {
				int res = fis.read();
				if(res == -1) {
					System.out.println("res => " + res);
					break;
				}
				System.out.println("res: " + (char)res); //파일에 내용을 추가하면 -1이 자동저장된다.
			}
			
			 
		}else {
			System.out.println("해달 파일은 없음!!!");
		}
	}
}
