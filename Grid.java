package Exam;
import java.math.*;

public class Grid {
	
	public void map(int x, int y) {
		
		if(x == 0 & y == 0){  //--------------------------starting point
			System.out.println("You are in the presence of Dwayne the Rock Johnson.");
		}
		else if(x==3 | x == -3 | y ==3 | y == -3) {
			Player.Death = 30;
		}
		else{
			double D = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			System.out.println("You are " +  D + "km away from Dwayne The Rock Johnson");
			
		}
		
		
	}

}
