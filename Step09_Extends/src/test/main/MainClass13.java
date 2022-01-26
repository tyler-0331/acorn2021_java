package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass13 {
	public static void main(String[] args) {
		// 다형성
		SmartPhone p1=new SmartPhone();
		
		HandPhone p2=new SmartPhone();
		
		Phone p3=new SmartPhone();
		
		Object p4=new SmartPhone();
		
		// type casting(형변환)
		SmartPhone p5 = (SmartPhone)p4;
		
		
	}
}
