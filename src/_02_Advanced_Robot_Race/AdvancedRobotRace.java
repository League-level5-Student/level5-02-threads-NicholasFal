package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.

	public static void main(String[] args) {
		Robot robOne = new Robot(200, 800);
		Robot robTwo = new Robot(300, 800);
		Robot robThree = new Robot(400, 800);
		Random ran = new Random();
	Thread r1 = new Thread(() -> { 
	robOne.setSpeed(ran.nextInt(41)+10);
	robOne.move(800);
	if(robOne.getY() < 1) {
		JOptionPane.showMessageDialog(null, "Robot #1 Wins!");
	}
	});
	
	Thread r2 = new Thread(() -> { 
		robTwo.setSpeed(ran.nextInt(41)+10);
		robTwo.move(800);
		if(robTwo.getY() < 1) {
			JOptionPane.showMessageDialog(null, "Robot #2 Wins!");
		} 	
	});
	
	Thread r3 = new Thread(() -> { 
		robThree.setSpeed(ran.nextInt(41)+10);
		robThree.move(800);
		if(robThree.getY() < 1) {
			JOptionPane.showMessageDialog(null, "Robot #3 Wins!");
		}	
	});
	
	r1.start();
	r2.start();
	r3.start();
	
	
}
	}
