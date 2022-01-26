package test.main;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("나눌수 입력:");
		String inputNum1=scan.nextLine();
		System.out.println("나누어 지는수 입력:");
		String inputNum2=scan.nextLine();
	
		try {
			Double num1 =Double.parseDouble(inputNum1);
			Double num2 =Double.parseDouble(inputNum2);
			
			Double result = num1/num2;
			Double remain = num1%num2;
			
			System.out.println(num1+" 를"+num2+ "으로 나눈 몫은 "+result);
			System.out.println(num1+" 를"+num2+ "으로 나눈 나머지는 "+remain);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("숫자형식을 확인하고 나눌 정수를 넣어주세요");
		}
		System.out.println("main 종료!");
	}
}