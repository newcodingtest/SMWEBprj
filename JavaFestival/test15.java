import java.util.Scanner;

public class test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		// ��°�
		int sum = 1;
		
		// ������ ����
		int count = 0;
		
		// num���� �ݺ�
		for (int i = 0; i < num; i++) {
			System.out.print((sum += count++) + " ");
		}
	}
}
