package list;

public class SummationElementsMatrix {
	
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2,3},{2,3,4},{3,4,5}};
		int[][] arr2 = {{1,1,1},{1,1,1},{1,1,1}};
		int[][] arr3 = {{1,2,3},{2,3,4},{3,4,5}};
		int[][] arr4 = {{1,2,3},{2,3,4},{3,4,5}};
		int[][] arr5 = {{1,2,3},{2,3,4},{3,4,5}};

		printMatrix(arr1);
		summedMatrix(arr1);
		printMatrix(arr1);
		revertSummedMatrix(arr1);
		printMatrix(arr1);
		
		System.out.println("\n***\n");
		printMatrix(arr2);
		summedMatrix(arr2);
		printMatrix(arr2);
		revertSummedMatrix(arr2);
		printMatrix(arr2);
		
		System.out.println("\n***\n");
	}
	
	// Given a matrix, update the matrix such that every element is -
	//      sum of all elements in rows less than or equal to the present elements'
	//	+	sum of all elements in columns less than or equal to the present elements'
	//	+	the current element
	public static void summedMatrix ( int[][] baseMatrix) {
		for ( int i = 0 ; i < baseMatrix.length; i++ ) {
			for ( int j = 0 ; j < baseMatrix[i].length; j++ ) {
				if ( i > 0 && j > 0 ) {
					baseMatrix[i][j] = baseMatrix[i-1][j] + baseMatrix[i][j-1] - baseMatrix[i-1][j-1] + baseMatrix[i][j];
				} else if ( i > 0 ) {
					baseMatrix[i][j] = baseMatrix[i-1][j] + baseMatrix[i][j];
				} else if ( j > 0 ) {
					baseMatrix[i][j] = baseMatrix[i][j-1] + baseMatrix[i][j];
				}
			}
		}
	}
	

	// Given a matrix, update the matrix such that every element is -
	//      sum of all elements in rows less than or equal to the present elements'
	//	+	sum of all elements in columns less than or equal to the present elements'
	//	+	the current element
	public static void revertSummedMatrix ( int[][] baseMatrix) {
		for ( int i = baseMatrix.length-1 ; i >=0 ; i-- ) {
//			System.out.println("i is " + i);
			for ( int j = baseMatrix[i].length-1 ; j >= 0 ; j-- ) {
				if( i > 0 && j > 0 ) {
//					System.out.println("j is " + j);
					int value = 0 ; 
					value = value + baseMatrix[i-1][j];
					value = value + baseMatrix[i][j-1];
					value = value - baseMatrix[i-1][j-1];
					baseMatrix[i][j] = baseMatrix[i][j] - value;
				} else if ( i > 0 ) {
					baseMatrix[i][j] = baseMatrix[i][j] - baseMatrix[i-1][j];
				} else if ( j > 0 ){
					baseMatrix[i][j] = baseMatrix[i][j] - baseMatrix[i][j-1];
				}
			}
		}
	}
	

	// Given a matrix, update the matrix such that every element is -
	//      sum of all elements in rows less than or equal to the present elements'
	//	+	sum of all elements in columns less than or equal to the present elements'
	//	+	the current element
	public static void printMatrix ( int[][] baseMatrix) {
		System.out.print("{");
		for ( int i = 0 ; i < baseMatrix.length; i++ ) {
			System.out.print("{");
			for ( int j = 0 ; j < baseMatrix[i].length; j++ ) {
				System.out.print(baseMatrix[i][j]+",");
			}
			System.out.print("},");
		}
		System.out.println("}");
		System.out.println();
	}
	
}
