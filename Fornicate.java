package Exam;

public class Fornicate {



	public void fornicate(int x, int y) {
			
			if(x == 0 & y == 0){  //--------------------------starting point
				Player.Death = 30;
				Player.Fornicate = 1;
				
			}
			
			else if(x == 2 & y == 2){ 	//----------------------------------corner 1 WITCH
				System.out.println("You service the witch as best you can. she tells you that the key to beating Thano-er-Dwayne The Rock Johnson is to");
				System.out.println("have sex with a tree...");
				Player.Knowledge = 1;
			}
			
			else if(x == -2 & y == 2){ 	//----------------------------------corner 2 ROCK
				Player.Death = 30;
				Player.Rock = 1;
			}
			
			else if(x == 2 & y == -2){ 	//----------------------------------corner 3 corpse
				
				Player.Death = 30;
				Player.Depravity = 1;
			}
			
			else if(x == -2 & y == -2){ //-----------------------------------corner 4 TREE
				if(Player.Knowledge == 1) {
					System.out.println("You think about what the witch told you, close your eyes, go to a happy place, and fornicate with the tree.");
					System.out.println("After what feels like an age, the tree begins to glow incredibly bright.");
					System.out.println("You shield your eyes and when the glowing stops, the tree is replaced with a piece of paper. A weapon? You pick it up and put it in your pocket.");
					Player.Paper= 1;
				}
				else {
					System.out.println("Why would you have sex with a tree you weirdo");
				}
				
			}
			else{
				System.out.println("there is nothing to have sex with here");
			}
			
		
		
		
		

	}
	}


