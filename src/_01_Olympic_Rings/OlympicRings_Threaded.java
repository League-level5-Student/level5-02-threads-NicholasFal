package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.


	public static void main(String[] args) {
		Robot robOne = new Robot(400, 400);
		Robot robTwo = new Robot(450, 450);
		Robot robThree = new Robot(500, 400);
		Robot robFour = new Robot(550, 450);
		Robot robFive = new Robot(600, 400);
		robOne.setSpeed(20);
		robTwo.setSpeed(20);
		robThree.setSpeed(20);
		robFour.setSpeed(20);
		robFive.setSpeed(20);
		
		robOne.setPenColor(0, 0, 255);
		robTwo.setPenColor(255, 255, 0);
		robThree.setPenColor(0, 0, 0);
		robFour.setPenColor(0, 255, 0);
		robFive.setPenColor(255, 0, 0);
	
		robOne.penDown();
		Thread r1 = new Thread(() -> {
			for(int i = 0; i <= 360; i++) {
			robOne.move(1);
			robOne.turn(1);
		}});
		
		
		robTwo.penDown();
		for(int i = 0; i <= 360; i++) {
			robTwo.move(1);
			robTwo.turn(1);
		}
		
		robThree.penDown();
		for(int i = 0; i <= 360; i++) {
			robThree.move(1);
			robThree.turn(1);
		}
		
		robFour.penDown();
		for(int i = 0; i <= 360; i++) {
			robFour.move(1);
			robFour.turn(1);
		}
		
		robFive.penDown();
		for(int i = 0; i <= 360; i++) {
			robFive.move(1);
			robFive.turn(1);
		}
	}
}

