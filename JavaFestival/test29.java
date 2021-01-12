import java.util.Random;

public class test29 {
	
			 public static void main(String[] args) {
				 
				 Random rnum=new Random();
				 int a[][]=new int[8][8];
				 
				 int max = 0;
				 int tempi=0;
				 int tempj=0;
				 
				 for(int i=0; i<8; i++) {
					 for(int j=0; j<8; j++) {
						 a[i][j]=rnum.nextInt(99)+1;
						 System.out.print(a[i][j]+"\t");
						 if(a[i][j]>max) {
							 max=a[i][j];
							 tempi=i+1;
							 tempj=j+1;
						 }
					 }
					 System.out.println();
					
				 }
				 
				 System.out.println("\n최대값>> "+max);
				 System.out.println("행>> "+tempi+"\t열>> "+tempj);
				
				
				
			}
}
