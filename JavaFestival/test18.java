import java.util.Scanner;

public class test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� �Է�
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		int[][] num_list = new int[num][num];

		// ������ ���� ����
		int count = 1;

		// �迭�� ����
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				//¦����° ���� �տ��� ���� ����
				for (int j = 0; j < num_list[i].length; j++) {
					num_list[i][j] = count++;
				}
			} else {
				//Ȧ����° ���� �ڿ��� ���� ����
				for (int j = num_list[i].length - 1; j >= 0; j--) {
					num_list[i][j] = count++;
				}
			} // end if
		} // end for i

		//�迭 ���
		for (int i = 0; i < num_list.length; i++) {
			for (int j = 0; j < num_list[i].length; j++) {
				System.out.print(num_list[i][j] + "\t");

			}//end for j
			System.out.println();
		}//end for i
	}
}
