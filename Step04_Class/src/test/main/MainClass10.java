package test.main;
import test.emp.EmpDto;

public class MainClass10 {
	
	public static void main(String[] args) {
		EmpDto emp2=new EmpDto();
		
		EmpDto emp=new EmpDto(7839,"KING","PRESIDENT",5000);
		System.out.println(emp.getEmpno());
		System.out.println(emp.getEname());
		System.out.println(emp.getJob());
		System.out.println(emp.getSal());
	}
}
