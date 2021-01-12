import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
	System.out.println(reverseStr("ZAbcdVefEg"));
		

	}
	
	public static String reverseStr(String alpabet) {
		char temp;//순서를 저장하기 위한 공간
		alpabet = alpabet.replace(" ", "");//입력받은 문자배열에서 " "공백을 >>"" 공백없음으로 치환해준다
		
		char[] albabetArray=alpabet.toCharArray(); //char 형태의 알바펫 배열 생성
		
		
		//아스키 코드로 소문자들은(a~z: 97~122) 대문자들은(A~Z: 65 ~0), 소문자>대문자 
		for(int i=0; i<albabetArray.length; i++) {     
			for(int j=0; j<albabetArray.length; j++) { 
				if(albabetArray[i]<albabetArray[j]) {  //  *원래순서(1(인덱스i)<2(인덱스j))배열간의 비교진행  i,j 
					temp=albabetArray[i];              //  temp에 작은값을 저장(temp=1)
					albabetArray[i]=albabetArray[j];   //  i값에 큰값넣고 (i=2)
					albabetArray[j]=temp;              //  j값에 다시 temp 작은값 저장(j=temp(1))  
					                                   //  이후 *변경된순서(i>j) 서로 값이 치환된거임 j,i
			}                                            
		}
		}
		String sort = "";           // 문자열로 리턴해야되니 그냥 스트링 공백으로 기본값 생성
		for(int i=0; i<albabetArray.length; i++) {
			sort+=albabetArray[i];            //공백에 예쁘게 순서대로 출력해
		}
		
		return sort; //공백값 변수 sort 예쁘게 반환해
		
		
	}

}
