package application;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class activate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("kys");
		if(scan.nextLine() == "w")
		{
			try {
				 
	            Robot robot = new Robot();
	            robot.mouseMove(300, 500);
	            robot.mousePress(InputEvent.BUTTON1_MASK);
	            robot.mouseRelease(InputEvent.BUTTON1_MASK);
	 
	        } catch (Exception d) {
	            d.printStackTrace();
	        }
		}
		scan.close();
			

	}
	
	
	
	
	
	
	
	public void keyTyped(KeyEvent e) {
		try {
			 
            Robot robot = new Robot();
            robot.mouseMove(250, 500);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
 
        } catch (Exception d) {
            d.printStackTrace();
        }
    }

}
