
public class test23 {
	public static void main(String[] args) {

		// ���� �迭
		int num_list[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		// 90�� ȸ���Ͽ� ����� �迭
		int result_list[][] = new int[num_list.length][num_list[0].length];

		for (int i = 0; i < result_list.length; i++) {
			for (int j = 0; j < result_list[i].length; j++) {
				result_list[i][j] = num_list[j][(result_list.length - 1) - i];

			} // end for
		} // end for
		
		System.out.println("����");
		//////////// ���� Ȯ�ο� ///////////////
		for (int i = 0; i < num_list.length; i++) {
			for (int j = 0; j < num_list.length; j++) {
				System.out.print(num_list[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("90�� ȸ��");
		// /////////////��ȯ�� �迭 //////////////////
		for (int i = 0; i < result_list.length; i++) {
			for (int j = 0; j < result_list.length; j++) {
				System.out.print(result_list[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
