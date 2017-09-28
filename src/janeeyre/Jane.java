package janeeyre;
import java.util.Scanner; 

public class Jane {
private static Scanner input;
private static boolean inputloop;
 public static void main(String[] args) throws InterruptedException {
input = new Scanner(System.in);
inputloop = true; 
	intro();
	begining();
}
public static void intro() throws InterruptedException {
	System.out.println("/________/\\/_______/\\ /__/\\ /__/\\ /_______/\\     /_____/\\ /_/\\/_/\\ /_____/\\  /_____/\\     ");
	Thread.sleep(500);
	System.out.println("\\__.::.__\\/\\::: _  \\ \\\\::\\_\\\\  \\ \\\\::: _  \\ \\    \\::::_\\/_\\ \\ \\ \\ \\\\:::_ \\ \\ \\::::_\\/_    ");
	Thread.sleep(500);
	System.out.println("  /_\\::\\ \\  \\::(_)  \\ \\\\:. `-\\  \\ \\\\::(_)  \\ \\    \\:\\/___/\\\\:\\_\\ \\ \\\\:(_) ) )_\\:\\/___/\\   ");
	Thread.sleep(500);
	System.out.println("  \\:.\\::\\ \\  \\:: __  \\ \\\\:. _    \\ \\\\:: __  \\ \\    \\::___\\/_\\::::_\\/ \\: __ `\\ \\\\::___\\/_  ");
	Thread.sleep(500);
	System.out.println("   \\: \\  \\ \\  \\:.\\ \\  \\ \\\\. \\`-\\  \\ \\\\:.\\ \\  \\ \\    \\:\\____/\\ \\::\\ \\  \\ \\ `\\ \\ \\\\:\\____/\\ ");
	Thread.sleep(500);
	System.out.println("    \\_____\\/   \\__\\/\\__\\/ \\__\\/ \\__\\/ \\__\\/\\__\\/     \\_____\\/  \\__\\/   \\_\\/ \\_\\/ \\_____\\/ ");
start(); 
}
public static void start() {
	System.out.println("Type 'start' to begin!");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("START")) {
			begining();
			break;
		}
		}
	 
}
public static void begining() {
	System.out.printf("You’re a young orphan living with your aunt who hates you with a passion. "
			+ "\nYour cousins hates you and you'll have nothing left after your aunt dies. "
			+ "You have the option to go to school at Lowood. Your aunt has told the headmaster about "
			+ "\nhow you lie "
			+ "\nDo you GO or STAY with your family?");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("Go")) {
			lowood();
			break;
			}
		else if (command.equalsIgnoreCase("stay")) {
			deathone();
			break;
		}
	}
}
private static void deathone() {
	System.out.println("Your treatment at your aunt household does not improve, and as you get older, "
			+ "your mental state gets worst, eventually resulting in \nyou hanging yourself in the "
			+ "room your uncle died in");
	System.out.println("You lose! Try Again!, Type 'RESTART' ");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("restart")) {
			begining();
			break;
		}
	}
}
private static void lowood() {
	System.out.println("Your time at lowood is harsh, the headmaster hates you, winter is in full force  "
			+ "\nand there is little food left, you could try and escape to the next town, or stick it out, "
			+ "\naltertivly, you could try and steal the little food that is left for your own");
	System.out.println("Do you ESCAPE, STEAL, or HOLD OUT");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("escape")) {
			escape();
			break;
		}
		else if (command.equalsIgnoreCase("steal")) {
			steal();
			break;
		}
		else if (command.equalsIgnoreCase("hold out")) {
			holdout();
			break;
		}
	}
	
}
private static void holdout() {
	System.out.println("You somehow are alble to make it out of winter alive, but the same can't be said for "
			+ "\nyour friend, who dies following her illness. Without her, Lowood becomes even more loney,"
			+ "\nYou could escape to the next town, or stay and finish your education" );
	System.out.println("Do you ESCAPE or STAY");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("escape")) {
			escape();
			break;
		}
		else if (command.equalsIgnoreCase("stay")) {
			stay();
			break; 
		}	
			
	}
	
}

private static void steal() {
	System.out.println("\nYou sneek into the cupboard where the last bit of bread is kept. Stealing a half loaf,"
			+ "\nyou try and make your way back to your bed. Unforuntally, you're caught by the headmaster. Not less"
			+ "\nthan an hour later, you're out on your own. With nowhere left to go, you start walking to the next"
			+ "\ntown in the dead of night");
	System.out.println("Type GO to move on");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("go")) {
			escape();
			break;
		}
	}
	
}

private static void escape() {
	System.out.println("Leaving Lowood at night, you arrive in the next town. With no jobs, "
			+ "\nyou become nothing more then a common begger, eventually becoming a low level prostitute");
	System.out.println("You lose! Try Again! Type 'Restart'");
	while (inputloop == true) {
		String command= input.nextLine();
		if (command.equalsIgnoreCase("restart")) {
			begining();
			break;
		}
	}
}

private static void stay() {
	System.out.println("You finish your education at Lowood. Folowing your graduation, you stay as a "
			+ "\nteacher, before eventually leaving for a teaching positon at a manor called Lowood."
			+ "\nMeeting a man called Rochester, you can't help but think he's an odd fellow. One night "
			+ "\nyou awaken to screams of a fire. You could rush out of the house, or get some water to "
			+ "\ndouse the flames.");
	System.out.println("Do you LEAVE or DOUSE?");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("leave")) {
			leave();
			break;
		}
		else if (command.equalsIgnoreCase("douse")) {
			douse();
			break;
		}
	}
}
private static void douse() {
	System.out.println("You fill a bucket of water and throw it on the flames, saving Rochester life. "
			+ "\nSometime later Rochester asks you to marry him, you can't question your love of him, but"
			+ "\nsomthing seems off" );
	System.out.println("Do you say YES or NO?");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("Yes")) {
			yes();
			break;
		}
		else if (command.equalsIgnoreCase("no")) {
			no();
			break;
		}
	}
		
}
private static void no() {
	System.out.println("While Rochester insists, you hold your ground. Eventually he gives up! You move on "
			+ "\nwith your life");
	System.out.println("CONGRATS YOU WON, PARTLY CUZ I CANT STAY UP PROGRAMMING ANY MORE, THIS WAS WAY HARDER THEN "
			+ " \nI THOUGHT" );
	
	
	
}
private static void yes() {
	System.out.println("You say yes, you're optimistic about your future,but your marriage stops before it even begins"
			+ "\nupon finding out Rochester is still married to another women. Sadden about your lost, you leave Thornwoo");
	System.out.println("You lose! Try Again! Type 'RESTART'" );
	while (inputloop == true) {
		String command =input.nextLine();
		if (command.equalsIgnoreCase("restart")) {
			begining();
			break;
		}
	}
}
private static void leave() {
	System.out.println("The house burns down, killing everyone inside");
	System.out.println("You lose! Try Again!, Type 'RESTART'");
	while (inputloop == true) {
		String command = input.nextLine();
		if (command.equalsIgnoreCase("restart")) {
			begining();
			break;
		}
	}
}
} 



