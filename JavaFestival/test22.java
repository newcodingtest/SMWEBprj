import java.util.Scanner;

public class test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� �Է�
		int num_list[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "��° �� �Է� :");
			num_list[i] = sc.nextInt();
		}

		// ��� ���� �������� ���ο� �Ÿ����� ���
		for (int i = 0; i < num_list.length; i++) {
			for (int j = i; j < num_list.length; j++) {
				if (num_list[i] > num_list[j]) {
					int val = num_list[i];
					num_list[i] = num_list[j];
					num_list[j] = val;
				}
			} // end for
			System.out.print(num_list[i] + "\t");
		} // end for
	}
}
