import java.util.Scanner;

public class test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		// �Ǻ���ġ ���� ��
		int back = 0;
		int front = 1;
		
		// num���� �ݺ�
		for (int i = 0; i < num; i++) {
			if (i == 1 ) {
				front = 1;
			}else {
				front += back;
				back = front - back;
			}
			System.out.println(front);
		}
	}
}
