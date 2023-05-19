package application;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 1 for macro mode, and 2 for writing mode.");
		if(scan.nextLine().equals("1")) {
    	DataMGR d= new DataMGR();
		ArrayList<Macro> m= d.getMacros();
		//m.get(0).initiateMacro();
		m.get(2).initiateMacro();
		}else{
		
		while(true)
		{
			Point p = MouseInfo.getPointerInfo().getLocation();
			int x = p.x;
			int y = p.y;
			System.out.println(x + ", " + y);
		}
		}
		scan.close();
	}
}
