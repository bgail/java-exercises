package ex;

public class MaxSubMatrix {

	public static void main(String[] args) {
		int m[][] = {{0, 1, 1, 0, 1},  
                {1, 1, 0, 1, 0},  
                {0, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 1}, 
                {0, 0, 0, 0, 0}}; 
		System.out.println("Square submatrix size: " + maxSubMatrixSize(m));
	}
	public static int maxSubMatrixSize(int[][] matrix){
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		int max = 0;
		int[][] subMatrix = new int[rowLen][colLen];
		
		// copy matrix first row
		for(int i=0; i< colLen; i++){
			subMatrix[0][i] = matrix[0][i];
		}
		// copy matrix first column
		for(int i=0; i< rowLen; i++){
			subMatrix[i][0] = matrix[i][0];
		}
		
		// iterate through each item other than above
		for(int i=1; i<rowLen; i++){
			for(int j=1; j<colLen; j++){
				if( matrix[i][j] != 0 ){
					subMatrix[i][j] = Math.min(subMatrix[i][j-1], 
							Math.min(subMatrix[i-1][j], subMatrix[i-1][j-1]) 
							) +1;
				}
				else {
					subMatrix[i][j] = 0;
				}
			}
		}
		// get the max num is S matrix
		for(int i = 0; i< rowLen; i++){
			for(int j=0; j<colLen; j++){
				if(max < subMatrix[i][j]){
					max = subMatrix[i][j];
				}
			}
		}
		return max * max;
	}

}
