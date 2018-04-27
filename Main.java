package Exam;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int quit = 0;
	
		
		Rules welcome = new Rules();
		
		Descriptor what = new Descriptor();
		
		
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		//Player.Death = 0;
		//Player.Win = 0;
		
		Grid where = new Grid();
		Fornicate ew = new Fornicate();
		Talk chat = new Talk();
		Cry weep = new Cry();
		Attack hit = new Attack();
		
		while( Player.Death <30 & Player.Win != 1) {
			System.out.println("What will you do Adventurer?");
			String command = sc.nextLine();
			switch(command) {
			case "go east": x++; Player.Death++; where.map(x, y);break;
			case "go west": x--; Player.Death++; where.map(x, y); break;
			case "go north": y ++; Player.Death++; where.map(x, y); break;
			case "go south": y--; Player.Death++; where.map(x, y); break;
			case "look around": what.description(x, y); break;
			case "fornicate": ew.fornicate(x, y); break;
			case "talk": chat.talk(x,y); break;
			case "cry": weep.cry(); break;
			case "attack": hit.attack(x, y); break;
			
			}
			//System.out.println(Player.Death);
			//System.out.println(Player.Depravity);
			
		if(Player.Win == 1) {
			System.out.println("You take out your paper, Dwayne The Rock Johnson's eyes are filled with panic. He is powerless against you. You smother him with the sheet of A4, his eyes bulge and his skin turns purple.");
			System.out.println("He writhes and kicks and spasms as the paper engulfs him. He crumbles to dust inside the wrapping. Paper beats rock. The paper shrinks furth still. The paper becomes a rock.");
			System.out.println("You are paper. Knowing what you must do you you stand as he did and wait. Your muscles grow and your hair falls out.");
			System.out.println("Paper bcomes Rock. You are now Dwayne The Rock Johnson. An adventurer appears lying before you and opens their eyes.");
			System.out.println("YOU WIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIN");
		}
			
		if(Player.Death >= 30 & (x ==3 | x ==-3 | y == 3 | y == -3)) {
			System.out.println("You strayed too far from the light of Dwayne The Rock Johnson and died.");
			System.out.println("Why would you stray too far away from Dwayne The Rock Johnson? Restart and try again idiot.");
			
			
		}
		
		else if(Player.Death >= 30 & Player.Fornicate == 1) {
			System.out.println("You attermpt to have sex with Dwayne The Rock Johnson. You die in the attempt.");
			System.out.println("Why would you try to do the sex with Dwayne The Rock Johnson? Restart and try again idiot");
			
		}
		
		else if(Player.Death >= 30 & Player.Depravity == 1) {
			System.out.println("You are disgusting. god himself descends from heaven and kills you");
			System.out.println("WHY. TRY AGAIN YOU DISGUSTING PERSON");
		}
		else if(Player.Death >= 30 & Player.Chatty == 1) {
			System.out.println("Dwayne The Rock Johnson, paranoid as he is, thinks you are tyalking about him behind his back and kills you");
			System.out.println("Shhhhhhhhhhhhhhhhhhhhhhh. Try again");
		}
		else if(Player.Death >= 30 & Player.Cry ==1){
			System.out.println("Dwayne the Rock Johnson hears your wails, and letting out a single tear himself, throws a moon at you. you are dead.");
			System.out.println("You big baby. Don't cry and try again.");
		}
		else if(Player.Death >= 30 & Player.Rock == 1) {
			System.out.println("You attempt to have sex with the rock. It crushes you. You die");
			System.out.println("You are weird. Restart and try again");
		}
		else if(Player.Death>=30 & Player.Witch == 1) {
			System.out.println("Turns out she was a witch. She turns you in to a newt and stamps on you. You are dead.");
			System.out.println("You can't just attack strange women like that you don't know if they're magic or not. Try again.");
		}
		else if(Player.Death>=30 & Player.Stupid == 1) {
			System.out.println("You take out your paper, Dwayne The Rock Johnson's eyes are filled with panic. But you don't know what to do. You throw the paper at him.");
			System.out.println("It gently wafts to the floor. Dwayne The Rock Johnson smiles and sets you alight with lasers. You are dead.");
			System.out.println("What was that going to do? Try again idiot.");
		}
		else if(Player.Death>=30 & Player.Attack == 1) {
			System.out.println("You run towards Dwayne The Rock Johnson and are about to attack him, but he uses his telekenisis to stop you mid strike, and throws you in to the sun. You are dead.");
			System.out.println("You are a fool to attack Him. Try again");
			
		}
		else if(Player.Death >= 30) {
			System.out.println("Your dillydallying and timewasting angers Dwayne The Rock Johnson, who with a snap of his fingers, turns you to ash");
			System.out.println("Why would you anger Dwayne The Rock Johnson like that? Restart and try again idiot.");
		}
		
			
			
			
		
		}
		
		
		
	
		
	}

}
