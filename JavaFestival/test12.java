import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ ���ϴ� ������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();

		// ���԰�
		int count = 1;

		// 2���� �迭 ����
		int[][] array = new int[num][num];

		// �迭�� ���� �ִ� for��
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = count++;
			}
		}

		// ����ϴ� for��
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
