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
		
		
	
		Thread r1 = new Thread(() -> {
			robOne.penDown();
			robOne.setPenColor(Color.BLUE);
			for(int i = 0; i <= 360; i++) {
			robOne.move(1);
			robOne.turn(1);
		} robOne.hide();});
		
		
		Thread r2 = new Thread(() -> {
			robTwo.penDown();
			robTwo.setPenColor(Color.YELLOW);
			for(int i = 0; i <= 360; i++) {
			robTwo.move(1);
			robTwo.turn(1);
			}robTwo.hide();});
		
		Thread r3 = new Thread(() -> {
			robThree.penDown();
			robThree.setPenColor(Color.BLACK);
			for(int i = 0; i <= 360; i++) {
			robThree.move(1);
			robThree.turn(1);
			}robThree.hide();});
		
		Thread r4 = new Thread(() -> {
			robFour.penDown();
			robFour.setPenColor(Color.GREEN);
			for(int i = 0; i <= 360; i++) {
			robFour.move(1);
			robFour.turn(1);
			}robFour.hide();});
		
		Thread r5 = new Thread(() -> {
			robFive.penDown();
			robFive.setPenColor(Color.RED);
			for(int i = 0; i <= 360; i++) {
			robFive.move(1);
			robFive.turn(1);
		}robFive.hide();});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}

