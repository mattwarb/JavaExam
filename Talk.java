package Exam;

public class Talk {
	public void talk(int x, int y) {
		if(x == 0 & y == 0){  //--------------------------starting point
			System.out.println("Dwayne The Rock Johnson: To the four corners of this earth you must travel if you want to make it out of here alive little one.");
			
		}
		else if(x == 2 & y == 2){ 	//----------------------------------corner 1 witch 
			System.out.println("Witch: I'll give you the knowledge you need if you... y'know... service me...");
		}
		
		else if(x == -2 & y == 2){ 	//----------------------------------corner 2 rock
			System.out.println("The rock ignores you.");
		}
		
		else if(x == 2 & y == -2){ 	//----------------------------------corner 3 corpse of pas adventurer
			System.out.println("The corpse is not much of a talker.");
		}
		
		else if(x == -2 & y == -2){ //-----------------------------------corner 4 tree
			System.out.println("The tree is unresponsive at best.");
		}
		else{
			Player.Death = 30;
			Player.Chatty = 1;
		}
	}

}
