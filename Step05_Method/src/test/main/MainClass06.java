package test.main;

import java.util.Random;

public class MainClass06 {
	public static void main(String[] args) {
		Random ran=new Random();
		System.out.println(ran.nextInt(45)+1);
		System.out.println(Math.round(ran.nextDouble()*45));
	}
}
