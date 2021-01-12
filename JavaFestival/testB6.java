
public class testB6 {
	
	public static void main(String[] main) {
		
		char[][] arr = new char [6][6];
		
		int center = (arr.length-1)/2 + 1;
		char ch = 'A';
		int start = 0;
		int end = 5;
		
		for (int a = 1; a <= 5; a++) {
			
			if (a <= center) {
				start = a;
				end = 6 - a;
			} else {
				start = 6 - a;
				end = a;
			}
			
			for (int b = start; b <= end; b++) {
				arr[a][b] = ch;
				ch += 1;
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j< arr[i].length; j++) {
				if (arr[i][j]==0) {
					System.out.print("\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}