package application;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Macro {

	private ArrayList<String> macro = new ArrayList<String>();
	private int numSteps;
	
	public Macro(String text)
	{
		//numSteps = Integer.parseInt(text.substring(0,2));
		String[] data = text.split("\\\t");
		numSteps = Integer.parseInt(data[0]);
		
		
		for(int i = 1; i < numSteps+1; i++)
			macro.add(data[i]);
		
	}
	
	
	public ArrayList<String> getLoot()
	{
		return macro;
	}
	
	public String getStep(int step)
	{
		return macro.get(step);
	}
	
	public int getNumStep()
	{
		return numSteps;
	}
	
	
	public void initiateMacro() throws Exception
	{
		Robot robot = new Robot();
		
		for(String z: macro)
		{
			
			if(z.substring(0,2).equals("mM"))
				robot.mouseMove(Integer.parseInt(z.substring(5,9)), Integer.parseInt(z.substring(9,13)));
			if(z.substring(0,2).equals("mP"))
				robot.mousePress(InputEvent.BUTTON1_MASK);
			if(z.substring(0,2).equals("mR"))
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
			if(z.substring(0,2).equals("wa"))
				TimeUnit.MILLISECONDS.sleep(Integer.parseInt(z.substring(4,8)) * 10);
			
			
				
				
		}
	}
	
	
	
	
	
	public String toString()
	{
		String s = "";
		for(String d: macro)
			s+= d;
		return s;
	}
	
	
}
