
public class test11 {
	public static void main(String[] args) {
		// �־��� ����
		String score = "A,A,B,C,D,A,C,D,D,D,F";

		// �迭�� �����켭 A���� F���� ī��Ʈ ���� ���
		int[] count = new int[6];
		char[] fine_char = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// charAt()�� �̿��ؼ� �迭�� �ϳ��� �˻�
		for (int i = 0; i < score.length(); i++) {
			for (int j = 0; j < fine_char.length; j++) {
				if (fine_char[j] == score.charAt(i)) {
					count[j]++;
				}

			}
		}
		for (int t = 0; t < fine_char.length; t++) {
			System.out.println(fine_char[t] + " : " + count[t] + "��");
		}
	}

}
