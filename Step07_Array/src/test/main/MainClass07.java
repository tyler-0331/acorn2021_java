package test.main;
import  test.mypac.Friend;
/*
 * 	 친구 한명의 정보를 객체로 생성해서 담으려고 한다. 
 * 	친구정보는 총4개의 정보로 이루어져 있습니다.
 * 	번호, 이름, 전화번호, 성별 
 * 	클래스명, 필드명은 자유 
 * 	Dto 작성 규약에 맞게 클래스를 작성
 */
public class MainClass07 {
	public static void main(String[] args) {
		Friend test1=new Friend(1,"tyler","010-XXXX-XXXX","남자");
		Friend test2=new Friend(1,"jamie","010-XXXX-XXXX","여자");
		Friend test3=new Friend(1,"jay","010-XXXX-XXXX","남자");
		
		Friend[] friends= new Friend[3];
		friends[0]=test1;
		friends[1]=test2;
		friends[2]=test3;
		
	}
}
