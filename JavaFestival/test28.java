
public class test28 {

	public static void main(String[] args) {

		String str="01001101";
		//01001101(2) =77(10)
		System.out.print(str+"(2) = ");
		
		
		//���ڿ��� �ϳ��� ��� �迭���·� �����ִ� �޼���
		//�Ű�����-> � �������� ���ڿ��� �����ٰ���
		String[] arr= str.split("");
		
		int multi=1;
		int result=0;
		for(int i=arr.length-1; i>=0; i--) {
			//Integer.parseInt(String)-->���ڿ��� ���ڷ� �� ��ȯ
			result+=Integer.parseInt(arr[i])*multi;
			multi*=2;
		}
		System.out.print(result+"(10)");
	}

}
