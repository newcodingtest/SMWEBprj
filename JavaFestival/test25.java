import java.util.Scanner;

public class test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �迭�� �� ���ڸ��� �ʿ��� ���'_'������ ���� ����
		// 0���� 9���� ������� �����
		int[] num_count = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		// ���� ������ �Է�
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String key_input = sc.next();

		// ��°�
		int sum = 0;

		// for���� swich���� �̿��Ͽ� ī��Ʈ
		for (int i = 0; i < key_input.length(); i++) {
			// charAt(index) > ���ڿ����� �ε����� �ش��ϴ� ���ڸ� char������ ��ȯ
			// char�� �ƽ�Ű�ڵ�� �ٲٰ� �Ǹ� 0 = 48 �̴� ��������
			int val = key_input.charAt(i) - 48;
			for (int j = 0; j < 10; j++) {
				if (val == j) {
					sum += num_count[j];
				}
			} // end for
		} // end for
		System.out.println("���'_'�� �� �� >> " + sum);
	}
}
