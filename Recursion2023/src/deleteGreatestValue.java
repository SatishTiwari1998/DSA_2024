import java.util.*;
public class deleteGreatestValue {

	public static void main(String[] args) {
		int grid[][]=genMatrix(3,3);
		System.out.println("INPUT GRID:");
		printMatrix(grid);
	    System.out.println("The Sum Obtained: "+ deleteGreatestValue(grid));
	    System.out.println("Diagonal Sum: "+diagonalSum(grid));

	}
	
	public static int[][] genMatrix(int row,int col) {
		
		int matrix[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=(int)(Math.random() * 88 + 11);
			}
			
		}
		
		return matrix;
		
	}
	
	
	  public static int deleteGreatestValue(int[][] grid) {
	    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	    int sum=0;
	    int columns=grid[0].length;
	    int row_index=0;
	    int col_index=0;

	    while(columns>0){
	        for(int i=0;i<grid.length;i++){
	            int rowMax=0;
	            for(int j=0;j<grid[i].length;j++){
	                if(grid[i][j]>rowMax){
	                    rowMax=grid[i][j];
	                    row_index=i;
	                    col_index=j;
	                }
	            }
	            pq.add(rowMax);
	            grid[row_index][col_index]=0;
	        }
	        sum+=pq.poll();
	        pq.clear();
	        columns--;
	    }
	    return sum;
	    
	    }
	  
	  
	  public static void printMatrix(int matrix[][]) {
		  for(int i=0;i<matrix.length;i++) {
			  for(int j=0;j<matrix[i].length;j++) {
				  
				  System.out.print(matrix[i][j]+" ");
				  
			  }
			  System.out.println();
		  }
	  }
	  
	  public static int diagonalSum(int matrix[][]) {
		  int sum=0;
		  for(int i=0;i<matrix.length;i++) {
			  sum= sum+ matrix[i][i];
			  System.out.println(sum);
		  }
		  
		  return sum;
	  }
	  
}
