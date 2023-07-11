package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		
	
	SkillPractice skills = new SkillPractice();
    skills.skill1();
    skills.skill2();
    skills.skill3();
    skills.skill4();
    skills.skill5();

	}
void skill1() {
//Use pop-ups for the following.
//Ask the user how many dimes they have

String dimes = JOptionPane.showInputDialog("how many dimes do you have");


//Tell them how many cents they have (hint multiply by 10)

String cents = JOptionPane.showInputDialog("how many cents do u have?");
int cent10 = Integer.parseInt(cents);
int money = cent10 * 10;


//Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("how tall are you?");



//If they are shorter than 36 inches, tell them to eat their Wheaties
int userHeight = Integer.parseInt(height);
if(userHeight<36) {
	JOptionPane.showMessageDialog(null, "eat your wheaties");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console

for(int i = 1;i<30;i+=3) {
	System.out.println(i);
}





}

void skill3() { // Get a random number that is less than 20 and print it to the console
//int count = 
 Random rand = new Random();
 int randNum = rand.nextInt(20);
System.out.println(randNum);

//Get another random number that is less than 10 and print it to the console
Random randd = new Random();
int Randnum = randd.nextInt(10);
System.out.println(Randnum);

//Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
JOptionPane.showMessageDialog(null, randNum - Randnum);


}

void skill4() { // In a pop-up, ask the user for the city they live in

String userCity  = JOptionPane.showInputDialog("what city do u live in");

//If they answered "San Diego", tell them they live in America's Finest City

//if(userCity = "San Diego"{
//		JOptionPane.showMessageDialog(null, "u live in amercias finest city")
//})

//Otherwise, tell them to move to San Diego



//Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."



//If there is 1 car, use a pop-up to display the make/model of the car



//If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



}

void skill5() { // In a pop-up, ask the user for the name of their school



//In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



}
}


