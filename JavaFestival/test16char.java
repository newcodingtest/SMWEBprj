import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
	System.out.println(reverseStr("ZAbcdVefEg"));
		

	}
	
	public static String reverseStr(String alpabet) {
		char temp;//������ �����ϱ� ���� ����
		alpabet = alpabet.replace(" ", "");//�Է¹��� ���ڹ迭���� " "������ >>"" ����������� ġȯ���ش�
		
		char[] albabetArray=alpabet.toCharArray(); //char ������ �˹��� �迭 ����
		
		
		//�ƽ�Ű �ڵ�� �ҹ��ڵ���(a~z: 97~122) �빮�ڵ���(A~Z: 65 ~0), �ҹ���>�빮�� 
		for(int i=0; i<albabetArray.length; i++) {     
			for(int j=0; j<albabetArray.length; j++) { 
				if(albabetArray[i]<albabetArray[j]) {  //  *��������(1(�ε���i)<2(�ε���j))�迭���� ������  i,j 
					temp=albabetArray[i];              //  temp�� �������� ����(temp=1)
					albabetArray[i]=albabetArray[j];   //  i���� ū���ְ� (i=2)
					albabetArray[j]=temp;              //  j���� �ٽ� temp ������ ����(j=temp(1))  
					                                   //  ���� *����ȼ���(i>j) ���� ���� ġȯ�Ȱ��� j,i
			}                                            
		}
		}
		String sort = "";           // ���ڿ��� �����ؾߵǴ� �׳� ��Ʈ�� �������� �⺻�� ����
		for(int i=0; i<albabetArray.length; i++) {
			sort+=albabetArray[i];            //���鿡 ���ڰ� ������� �����
		}
		
		return sort; //���鰪 ���� sort ���ڰ� ��ȯ��
		
		
	}

}
