import java.util.ArrayList;
import java.util.Scanner;

public class test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� �Է�
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");

		// 2���� ������ �迭 ����
		ArrayList<Integer> num_array = new ArrayList<Integer>();

		// while ���� ����
		boolean set = true;

		// 2���� ��ȯ�Ͽ� �迭�� ����
		while (set) {
			// 2�� ���� �������� �迭�� �Է�
			if (num % 2 == 0) {
				num_array.add(0);
			} else {
				num_array.add(1);
			}

			// ���̻� 2�� �������� �ʴ� ����
			if (num / 2 == 1) {
				num_array.add(1);
				set = false;
			} else if (num / 2 == 0) {
				num_array.add(0);
				set = false;
			}
			num /= 2;
		} // end for

		// 2���� ���
		for (int i = num_array.size() - 1; i >= 0; i--) {
			System.out.print(num_array.get(i) + " ");
		}
		
	}
}
