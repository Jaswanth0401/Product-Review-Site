import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Minimum_Knight_moves {
	
	public static void minimum_moves(int x, int y) {
		int[][] directions = {{1,2},{2,1},{1,-2},{2,-1},{-1,-2},{-2,-1},{-2,1},{-1,2}};//These are all the moves that knight makes.
		
		boolean[][] visited = new boolean[601][601];
		visited[300][300] = true;
		
		int moves = 0;
		Queue<int[]> q = new ArrayDeque<>();
		
		
	}
	public static void main(String args[]) {
		
	}
}
