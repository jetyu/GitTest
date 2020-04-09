package demo1;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {

	public static void main(String[] args) {

		FileInputStream fisFileInputStream = null;

		try {
			fisFileInputStream = new FileInputStream("a.txt");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			System.exit(1); 
			
			
		} finally {
			if (fisFileInputStream != null) {
				try {
					fisFileInputStream.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
		System.out.println("执行finally块的资源回收");

	}
}
