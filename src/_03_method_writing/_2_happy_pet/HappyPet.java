package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
String userResponse = JOptionPane.showInputDialog("what pet do u want to buy");	
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		
int task1 = JOptionPane.showOptionDialog(null, "how do u want to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			int task2 = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "walk", "groom", "clean up poop" }, null);
			if(task1 == 0) {
				cuddle();
			}
			if(task1==1) {
				food();
			}
			if(task1==2) {
				water();
			}
			if(task2==0) {
				walk();
			}
			if(task2==1) {
				groom();
			}
			if(task2==2) {
				poop();
			}
			}
	

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "thanks for the cuddle!");
	}
	public static void food() {
		JOptionPane.showMessageDialog(null, "that was bussin bussin!");
	}
	public static void water() {
		JOptionPane.showMessageDialog(null, "i was about to die of thirst thanks!");
	}
	public static void walk() {
		JOptionPane.showMessageDialog(null, "wow i need a nap after that one!");
	}
	public static void groom() {
		JOptionPane.showMessageDialog(null, "thanks for the groom i look very spicy!");
	}
	public static void poop() {
		JOptionPane.showMessageDialog(null, "thanks for the cleanup u u risked alot there!");
	}
	
	
	
	
}