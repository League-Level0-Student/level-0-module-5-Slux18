package _03_method_writing._1_obedient_robot;

import java.awt.Color;
import java.security.PublicKey;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
static	Robot rob = new Robot();

public static void main(String[] args) {
	rob.miniaturize();
rob.penDown();
rob.setSpeed(255);


String favColor = JOptionPane.showInputDialog("what color do you want your shape to be?(choose colors in the rainbow or your gay)");
if(favColor.equals("blue")) {
	rob.setPenColor(Color.blue);
}
if(favColor.equals("red")) {
	rob.setPenColor(Color.red);
}
if(favColor.equals("green")) {
	rob.setPenColor(Color.green);
}
if(favColor.equals("purple")) {
	rob.setPenColor(160, 32, 240);
}
if(favColor.equals("yellow")) {
	rob.setPenColor(Color.yellow);
}
if(favColor.equals("orange")) {
	rob.setPenColor(Color.orange);


}
String userResponse=JOptionPane.showInputDialog("what shape should rob draw??");
if(userResponse.equals("circle")){
	drawCircle();
}
if(userResponse.equals("triangle")) {
drawTriangle();
}
if(userResponse.equals("square")) {
drawSquare();
}
}
public static void drawSquare() {
	

	rob.turn(90);
	rob.move(200);
	rob.turn(-90);
	rob.move(200);
	rob.turn(-90);
	rob.move(200);
	rob.turn(-90);
	rob.move(200);
	rob.turn(-90);
	rob.move(200);
	rob.penUp();
}
public static void drawTriangle() {

	

	rob.move(220);
	rob.turn(-127);
	rob.move(220);
	rob.turn(-115);
	rob.move(200);
	
}
public static void drawCircle() {
	
	
	
	
	for(int i =0;i<360;i++) {
		rob.penDown();
		rob.turn(1);
		rob.move(2);
	}
}
}
