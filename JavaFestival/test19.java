import java.util.Scanner;

public class test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� �Է�
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");

		// ���
		int count = 2;

		// while����
		boolean while_set = true;

		while (while_set) {

			if (num % count == 0) {
				num = num / count;
				System.out.print(count);

				if (num <= 1) {
					while_set = false;
				} else {
					System.out.print(" * ");
				}
				
			} else {
				count++;
			}
		}//end while
		
	}
}
