package _03_method_writing._1_obedient_robot;

import java.security.PublicKey;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
static	Robot rob = new Robot();	
public static void main(String[] args) {
	
drawSquare();
drawTriangle();
}
public static void drawSquare() {
	
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
	rob.turn(-115);
	rob.move(220);
	rob.turn(-127);
	rob.move(220);
	rob.turn(-115);
	rob.move(200);
	
}
public static void drawCircle() {
	rob.penDown();

}
}
