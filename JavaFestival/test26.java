
public class test26 {

	public static void main(String[] args) {

	System.out.println(change124(10));
	}
	
	public static String change124(int num) {
	
	String OneTwoFour="";
	
	while(num>0) {
		if(num%3==0) {
			OneTwoFour="4"+OneTwoFour;
			num=num/3-1;
		}else {
			OneTwoFour=Integer.toString(num%3)+OneTwoFour;
			num=num/3;
		}
	}
	
	
	
	return OneTwoFour;
	
	}
}