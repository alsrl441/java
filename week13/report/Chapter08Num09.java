package practice;

import java.io.File;

public class Chapter08Num09 {
	public static void main(String[] args) {
		File f = new File("c:\\temp\\");
		File[] file = f.listFiles();
		System.out.println(f.getPath() + " 디렉토리의 .txt 파일을 모두 삭제합니다....");
		int count = 0;

		for (int i = 0; i < file.length; i++) {
			if (!file[i].isFile()) 
				continue;

			String name = file[i].getName();
			int index = name.lastIndexOf(".txt");
			if (index == -1)
				continue;

			System.out.println(file[i].getName() + " 삭제");
			file[i].delete();

			count++;
		}
		System.out.println("총 : " + count + "개의 .txt 파일 삭제함");

	}

}
