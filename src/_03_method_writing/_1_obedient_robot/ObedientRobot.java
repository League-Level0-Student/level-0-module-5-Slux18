package _03_method_writing._1_obedient_robot;

import java.security.PublicKey;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot rob = new Robot();	
public static void main(String[] args) {
	
drawSquare();
drawTriangle();
}
public static void drawSquare() {
	Robot rob = new Robot();	
	rob.setSpeed(255);
	rob.penDown();
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

	rob.setSpeed(255);
	rob.penDown();
	for(int i=0;i<3;i++) {
		rob.turn(-90);
		rob.move(200);
		rob.move(-45);
	}
}
}
