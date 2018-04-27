package Exam;

public class Attack {
public void attack(int x, int y) {
		
	if(x == 0 & y == 0){  //--------------------------starting point
		if(Player.Paper == 1 & Player.Knowledge2 == 1) {
			Player.Win = 1;
		}
		else if(Player.Paper == 1) {
			Player.Death = 30;
			Player.Stupid = 1;
		}
		else {
			Player.Death = 30;
			Player.Attack =1;
		}
		
	}
	else if(x == 2 & y == 2){ 	//----------------------------------corner 1 witch 
		Player.Death = 30;
		Player.Witch = 1;
	}
	
	else if(x == -2 & y == 2){ 	//----------------------------------corner 2 rock
		System.out.println("You kick the rock and break your toe. Hahahahahahaa");
	}
	
	else if(x == 2 & y == -2){ 	//----------------------------------corner 3 corpse of pas adventurer
		System.out.println("You kick the corpse. You are horrible");
	}
	
	else if(x == -2 & y == -2){ //-----------------------------------corner 4 tree
		System.out.println("You punch the tree and cut your hand. You weakling");
	}
	else{
		System.out.println("There is nothing here to fight");
	}
	}

}
