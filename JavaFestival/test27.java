import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class test27 {

	public static void main(String[] args) {
		int array[][] = new int[5][5];
		char ch = 'A';

		for (int i = 0; i <= 4; i++) {
			if (i <= 2) {
				for (int j = i; j <= 4-i; j++) {
					array[i][j] = ch++;
				}
			} else {
				for (int j=4-i; j<=i; j++) {
					array[i][j] = ch++;
				}
			}

		}

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.printf("%c", array[i][j]);
			}
			System.out.println();
		}
	}

}
