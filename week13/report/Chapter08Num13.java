package practice;

import java.io.File;
import java.util.Scanner;

public class Chapter08Num13 {
	private File currentDir = null;
	private File subFiles [] = null;
	
	public FileExplorer(String dirName) {
		currentDir = new File(dirName);
	}

	private void showSubDirtories() {
		System.out.println("\t[" + currentDir.getPath() + "]");
		subFiles = currentDir.listFiles();
		for(File f : subFiles) {
			System.out.print(((f.isFile())?"file":"dir"));
			System.out.printf("%-15s", "\t\t" + f.length() + "바이트");
			System.out.println("\t\t" + f.getName());
		}		
	}
	
	private boolean contains(String filename) {
		for(File f : subFiles) {
			if(f.getName().equalsIgnoreCase(filename))
				return true;
		}
		return false;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("파일 탐색기입니다.");
		showSubDirtories();
		
		while(true) {
			System.out.print(">>");
			String command = scanner.nextLine().trim();
			if(command.equals("그만"))
				break; // 프로그램 종료
			if(command.equals("..")) {
				String s = currentDir.getParent();
				if(s == null) 
					continue;
				else { 					
					currentDir = new File(currentDir.getParent());
					showSubDirtories();
				}

			}
			else {
				if(contains(command)) {
					if(new File(currentDir, command).isDirectory()) {
						currentDir = new File(currentDir, command);
						showSubDirtories();
					}
					else {
						System.out.println("\t디렉토리가 아닙니다.!");
					}
				}
			}
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		FileExplorer fe = new FileExplorer("c:\\");
		fe.run();
	}

}
