package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력:");
		//숫자를 문자열 형식으로 입력 받는다. "10" "20"  "10.1"  "10.2" ...
		String inputNum=scan.nextLine();
		//1. try 블럭을 실행하다가 
		try {
			//입력한 숫자를 실제 숫자로 바꾸기
		double num=Double.parseDouble(inputNum);
		double result=num+100;
		System.out.println("입력한 숫자+100 : "+result);
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			nfe.printStackTrace();
			System.out.println("오잉?");
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}






