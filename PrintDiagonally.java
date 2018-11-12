package ex;

public class PrintDiagonally {

	public static void main(String[] args) {
		int[][] matrix = { {1, 2, 3},
                		   {4, 5, 6},
                           {7, 8, 9} };
		printDiagonally(matrix);
	}
	public static void printDiagonally(int[][] matrix){
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		
		for(int i = 0; i < colLen; i++){
			int row = 0, col = i; 
	        while (row < colLen && col >= 0) {
	        	System.out.print(matrix[row][col] + "  ");
	            row++; col--; 
	        } 
		}
		for(int i = 1; i < rowLen; i++){
			int row = i, col = colLen-1; 
	        while (row < rowLen && row >= 0) {
	        	System.out.print(matrix[row][col] + "  ");
	            row++; col--; 
	        } 
		}
	}
}
