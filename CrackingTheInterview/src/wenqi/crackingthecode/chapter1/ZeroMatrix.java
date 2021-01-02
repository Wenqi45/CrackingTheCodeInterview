package wenqi.crackingthecode.chapter1;
/**
 * 
 * @author Wenqi.Wang
 * Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column are set to O.
 * Dec. 28th, 2020
 *
 */
public class ZeroMatrix {

	public static void printMatrix(int[][] matrix) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		System.out.println("row = " + m + ":" + "clolumn = " + n);
		for (int i= 0; i < m; i++) {
			System.out.println();
			for (int j= 0; j < n; j++)
				System.out.printf("%6d", matrix[i][j]);
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M = 3;
		int N = 4;
		//int[][] testMatrix = new int[M][N];
		int[][] testMatrix = {{12,3,4,1},{4,0,2,117},{3,1,0,9}};
		printMatrix(testMatrix);
		
		boolean[] zeroRows = new boolean[M];
		boolean[] zeroColumns = new boolean[N];
		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				if (testMatrix[i][j] == 0) {
					zeroRows[i] = true;
					zeroColumns[j] = true;
				}
		
		for (int i = 0; i < M; i++)
			if (zeroRows[i]) {
				for (int j = 0; j < N; j++)
					testMatrix[i][j] = 0;
			}
		
		for(int j = 0; j < N; j++)
			if (zeroColumns[j])
				for (int i = 0; i < M; i++)
					testMatrix[i][j] = 0;
		printMatrix(testMatrix);
		
	}

}
