package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		File path = new File("E:\\Choi/abcd"); // 없는 위치 입력시 생성시 확장자 없는 파일 자동생성
		
		System.out.println(path.exists());//파일에 접근가능한지 확인
		if(path.exists() == false) { //존재하지 않는 파일이면 파일 생성
			path.mkdir();
		}
		
		FileOutputStream fos = new FileOutputStream(path + "/test.txt");

		path.delete(); // 폴더 안에 파일이 있으면 삭제 안됨.
		
		String[] list = path.list();
		System.out.println(list[0]);
		for(String s : list) {
			System.out.println(s); //파일 목록 출력
			if(!s.equals("test.txt")) {
				File delete = new File(path.toString()+"/"+s); 
				delete.delete();
			}
		}
		
	}
}
