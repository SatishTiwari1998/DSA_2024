package pepcoding_Recursion_Backtracking_1;

import java.util.*;

public class Get_Maze_Paths {

	public static void main(String[] args) {
		
		int row=3;
		int column=5;
		Random rnd = new Random();
		char maze[][]=new char[row][column];
		
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				maze[i][j]=(char) ('A' + rnd.nextInt(26));
			}
		}
		System.out.println("Maze matrix: ");
		System.out.println();
		
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Paths: " + getMP(maze,0,0,row,column));
		System.out.println("Paths with Jump: " + getMP_with_jump(maze,0,0,row,column));	
	}

	public static ArrayList<String> getMP(char matrix[][],int R_start,int C_start,int R_end,int C_end){
		
		if(R_start==R_end-1 && C_start==C_end-1) {
			
			ArrayList<String> list = new ArrayList<>();
			list.add(""+matrix[R_start][C_start]);
			return list;
		}
		
		ArrayList<String> horizontal=new ArrayList<>();
		ArrayList<String> vertical=new ArrayList<>();
		
		// vertical paths
		if(R_start < R_end) {
			vertical=getMP(matrix,R_start+1,C_start,R_end,C_end);
		}
		
		// horizontal paths
		if(C_start< C_end) {
			horizontal=getMP(matrix,R_start,C_start+1,R_end,C_end);
		}
		
		
		ArrayList<String> paths=new ArrayList<>();
		
		for(String hpath:horizontal) {
			
			paths.add(matrix[R_start][C_start]+hpath);	
		}
		
		for(String vpath:vertical) {
			paths.add(matrix[R_start][C_start]+vpath);
		}
		
		return paths;
		

		
	}
	
	public static ArrayList<String> getMP_with_jump(char matrix[][],int rowstart,int columnstart,int rowend,int columnend){
		
		if(rowstart==rowend-1 && columnstart==columnend-1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(""+matrix[rowstart][columnstart]);
			return list;
		}
		
		ArrayList<String> paths=new ArrayList<>();
		
		// Horizontal moves
		
		for(int moveSize=1; moveSize< columnend-columnstart; moveSize++) {
			ArrayList<String> h_paths=getMP_with_jump(matrix,rowstart,columnstart+moveSize,rowend,columnend);
			for(String h :h_paths) {
				paths.add(matrix[rowstart][columnstart]+h);
			}	
		}
		
		// Vertical Moves
		
		for(int moveSize=1; moveSize< rowend-rowstart; moveSize++) {
			ArrayList<String> v_paths=getMP_with_jump(matrix,rowstart+moveSize,columnstart,rowend,columnend);
			for(String v :v_paths) {
				paths.add(matrix[rowstart][columnstart]+v);
			}	
		}
		
		// Diagonal Moves
		for(int moveSize=1; moveSize< rowend-rowstart && moveSize<columnend-columnstart; moveSize++) {
			ArrayList<String> d_paths=getMP_with_jump(matrix,rowstart+moveSize,columnstart+moveSize,rowend,columnend);
			for(String d :d_paths) {
				paths.add(matrix[rowstart][columnstart]+d);
			}		
		}
		return paths;	
	}
}
