package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter if a values of matriz[n][v]:");
		int n = sc.nextInt();
		int v = sc.nextInt();
		int[][] mat = new int[n][v];

		System.out.println("Inform the numbers of matriz:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Inform the value of verific in the matriz:");
		int value = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == value) {
					System.out.println("Position:" + i + ", " + j);
					if (j > 0) {
						System.out.printf("Left:%d\n", mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.printf("Right:%d\n", mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.printf("Up:%d\n", mat[i - 1][j]);
					}
					if (i < mat.length) {
						System.out.printf("Down:%d\n", mat[i + 1][j]);
					}
				}
			}
		}
	}

}
