package file;

import java.io.File;
import java.io.FileOutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		File path = new File("E:\\Choi\\test/test.txt");
		String sPath = "E:\\Choi\\test";
		
		FileOutputStream fos = new FileOutputStream(path);
		
		fos.write( 97 );
		fos.write( 'A' );
		fos.write("test".getBytes()); // Byte형식으로 변환하여 저장
		
		fos.close();
		
	}
}
