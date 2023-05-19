package application;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataMGR {

	private ArrayList<Macro> macros = new ArrayList<Macro>();
	private double width;
	private double height;
	
	public DataMGR()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	width = screenSize.getWidth();
    	height = screenSize.getHeight();
    	
    	System.out.println("Your screen's resolution is " + width + " x " + height);
    	System.out.println("Aspect Ratio " + (width/height));
    	
		File macroFile = new File("macros.txt");
		try {
			Scanner scan = new Scanner(macroFile);
			
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				Macro macro = new Macro(line);	
				macros.add(macro);
				
			}
			scan.close();
		}
			catch(FileNotFoundException e) {
				System.out.print("oof");
				e.printStackTrace();
			}
		macros.toString();
		
	}
	public ArrayList<Macro> getMacros()
	{
		return macros;
	}
	
	
}
