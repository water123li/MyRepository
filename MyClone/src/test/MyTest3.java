package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class MyTest3 {

	public static void main(String[] args) {

		File file1 = new File("src/clone/Student.java");
		File file2 = new File("src/excel/ss.txt");
		try {
			FileUtils.copyFile(file1, file2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
