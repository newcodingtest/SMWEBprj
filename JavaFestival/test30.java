
public class test30{

		public static void main(String[] args) {
			int[][] a = new int[7][7];

			int start=3; //ї­
			int end=3; //За
			int num=1;
			
			for(int i=0; i<a.length; i++) {
				for(int j=start; j<=end; j++ ) {
					a[j][i]=num++;
					
				}
				if(i<3) {
					start--;
					end++;
				   }else {
				      start++;
				      end--;
				   }
				}
			
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					 System.out.print(a[i][j]+"\t");
			}
			System.out.println();
			}
}
		}