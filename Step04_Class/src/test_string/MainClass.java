package test_string;

public class MainClass {
	// 문자열만을 비교할때는 .equals
	// 참조값을 비교할 때는 == 
	 String name6="Tyler";
	public static void main(String[] args) {
		String name1="김구라";
		String name2="김구라";
		String name3=new String("김구라");
		String name4=new String("김구라");
		

		
		System.out.println(name1);
		System.out.println(name3);
		
		boolean result3 = name1.equals(name2); // true
		boolean result4 = name1.equals(name3); // true
		boolean result5 = name1.equals(name4); // true
		boolean result6 = "김구라".equals(name2);// true 
		boolean result7 = name1.equals("김구라");// true
	}
}
