package Exam;

public class PickUp {
public void pickUp(int x, int y) {
		
	if(x == 0 & y == 0){  //--------------------------starting point
		System.out.println("Before you is Dwayne The Rock Johnson. He is absolutely still and staring through you as if you don't exist. However as you move around him his head follows you, creaking all the way around. You are unnerved.");
		
	}
	if(x == 2 & y == 2){ 	//----------------------------------corner 1 witch 
		System.out.println("there is a witch");
	}
	
	if(x == -2 & y == 2){ 	//----------------------------------corner 2 rock
		System.out.println("there is a rock");
	}
	
	if(x == 2 & y == -2){ 	//----------------------------------corner 3 corpse of pas adventurer
		System.out.println("there is a corpse");
	}
	
	if(x == -2 & y == -2){ //-----------------------------------corner 4 tree
		System.out.println("there is a tree");
	}
	else{
		System.out.println("Just more god damn swamp");
	}
	}

}
