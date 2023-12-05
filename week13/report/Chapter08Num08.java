package practice;

import java.io.File;

public class Chapter08Num08 {

	public static void main(String[] args) {
		File f = new File("c://");
		File[] file = f.listFiles();
		long biggest = 0;
		File bigFile = null;
		for (int i = 0; i < file.length; i++) {
			File ff = file[i];
			if (!ff.isFile())
				continue;
			long size = ff.length();
			if (biggest < size) {
				biggest = size;
				bigFile = ff;
			}
		}

		if (bigFile == null) {
			System.out.println("파일 없음");
		} else
			System.out.println("가장 큰 파일은 : " + bigFile.getName() + " " + biggest + " 바이트");

	}
}
