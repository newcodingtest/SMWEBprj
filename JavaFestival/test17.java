import java.util.Scanner;

public class test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// ���� �Է�
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		System.out.println("�ݺ� Ƚ�� : " + collatzNumber(num));

		sc.close();
	}

	public static int collatzNumber(int num) {
// while ���� �˻��
		boolean set = true;

// Ƚ�� ������
		int count = 0;

// ���ǹ� �ݺ� �˻�
		while (set) {

// System.out.print(num + " \t");
			if (num == 1) {
				break;
			} else if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			count++;
		}
// Ƚ�� ���
		return count;

	}
}
