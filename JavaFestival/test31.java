
public class test31 {// 1~15���� ���� 15�� ������ �������μ� ī���� �ϱ�
	//12345, //456 //78 //15
	public int expressions(int num) {
		int cnt=0;
		int temp=1;
		while(temp<=num) {
			int sum=0;
			for(int i=temp; i<=num; i++) {
				sum+=i;
				if(sum==num) {
					cnt++;
					break;
				}
			}
			temp++;
		}
		return cnt;
		
		
}
}