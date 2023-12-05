package practice;

import java.io.*;
import java.util.*;

public class Chapter08Num14 {
	public static void listDirectory(File dir) {
		System.out.println("   ["+dir.getPath()+"]");
		File[] subFiles = dir.listFiles();
		for(int i=0;i<subFiles.length;i++) {
			File file = subFiles[i];
			String res="";
			if(file.isDirectory()) res = "file";
			else res = "dir";
			System.out.println(res+"\t"+file.length()+"바이트\t"+file.getName());
		}
	}
		
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("파일 탐색기입니다.");
		String dest = "c:\\temp";
		File f = new File(dest);
		listDirectory(f);
		for(;;) {
			System.out.print(">>");
			try {
			String order = scanner.nextLine();
				if(order.equals("그만")) return;
				else if(order.equals("..")) {
					dest = new File(dest).getParent();
					listDirectory(new File(dest));
				}
		else {
			StringTokenizer st = new StringTokenizer(order, " ");
			int n = st.countTokens();
			if (n==1) {
				dest += "\\"+order;
				listDirectory(new File(dest));
			}
			else {
				if(st.nextToken().equals("mkdir")) {
					String token = st.nextToken();
					File f2 = new File(dest+"\\"+token);
					f2.mkdir();
					System.out.println(token+" 디렉터리를 생성하였습니다.");
					listDirectory(new File(dest));
				}
				else {
					String before = st.nextToken();
					String after = st.nextToken();
					File f3 = new File(dest+"\\"+before);
					f3.renameTo(new File(dest+"\\"+after));
					System.out.println(before+"를 "+after+"로 이름 변경하였습니다.");
					listDirectory(new File(dest));
				}
				
			}
		}
		} catch(NoSuchElementException e) {
			System.out.println("두 개의 파일명이 주어지지 않았습니다.!");
			continue; //오류 알려주고 다시 프로그램 돌려야 하니까 try-catch를 for;;문 안에 넣어버림
		}
		}
	}
}
