package practice;

import java.util.*;
import java.io.*;

public class Chapter08Num06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FileInputStream input1 = null;
        FileInputStream input2 = null;
        FileOutputStream out = null;
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");

        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String src = scanner.nextLine();

        System.out.print("두번째 파일 이름을 입력하세요>>");
        String dst = scanner.nextLine();

        System.out.println(src + "와 " + dst + "를 비교합니다.");
        try{
            input1 = new FileInputStream(src);
            input2 = new FileInputStream(dst);
            out = new FileOutputStream("c:\\temp\\appended.txt");
            int c;

            while((c = input1.read()) != -1){
                out.write((char)c);
            }
            while((c = input2.read()) != -1){
                out.write((char)c);
            }

            if(input1 != null) input1.close();
            if(input2 != null) input2.close();
            // 경로를 없애면 프로젝트 파일 밑에 생성됩니다.
            System.out.println("c:\\temp\\ 밑에 appended.txt 파일에 저장하였습니다.");
            out.close();
            scanner.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        scanner.close();
    }
}
