package Exam;

public class Descriptor {
	
	public void description(int x, int y) {
		
		if(x == 0 & y == 0){  //--------------------------starting point
			System.out.println("Before you is Dwayne The Rock Johnson. He is absolutely still and staring through you as if you don't exist. However as you move around him his head follows you, creaking all the way around. You are unnerved.");
			
		}
		else if(x == 2 & y == 2){ 	//----------------------------------corner 1 witch 
			System.out.println("there is a beautful witch before you. At least you think she's a witch. She's got that silly witch hat on but could be normal I suppose.");
		}
		
		else if(x == -2 & y == 2){ 	//----------------------------------corner 2 rock
			System.out.println("There is a rock, not as big as Dwayne The Rock Johnson, but still rather large");
		}
		
		else if(x == 2 & y == -2){ 	//----------------------------------corner 3 corpse of pas adventurer
			System.out.println("There is a corpse on the ground before you. It is holding a pair of scissors. 'rock beats scissors' you think to yourself");
			Player.Knowledge2 = 1;
		}
		
		else if(x == -2 & y == -2){ //-----------------------------------corner 4 tree
			System.out.println("There is a tree");
		}
		else{
			System.out.println("Just more god damn swamp");
		}
	
		
	}

}
