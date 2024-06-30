package Hanoi;

public class HanoiTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 3; 
	        towerOfHanoi(n, 'A', 'C', 'B');
	}

	static void towerOfHanoi(int n, char source, char destination, char auxiliary ) {
	     if (n == 1) {
	            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
	            return;
	     }
	     towerOfHanoi(n - 1, source, auxiliary , destination);
	     System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
	     towerOfHanoi(n - 1, auxiliary , destination, source);
	}
	
}
