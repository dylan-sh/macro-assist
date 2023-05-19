package application;

import java.awt.MouseInfo;
import java.awt.Point;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class SampleController implements Initializable, NativeKeyListener{
	
	
	public static ArrayList<String> hotkeys = new ArrayList<String>(8);
	public static ArrayList<Integer> macros = new ArrayList<Integer>();
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*Timer trent = new Timer();
		{
			Point p = MouseInfo.getPointerInfo().getLocation();
			int x = p.x;
			int y = p.y;
			cursorLoc.setText("Current Cursor Location: " + x + ", " + y + ".");
		}*/
		
		
		
		
		hotkeys.add("0");
		hotkeys.add("1");
		hotkeys.add("2");
		hotkeys.add("3");
		hotkeys.add("4");
		hotkeys.add("5");
		hotkeys.add("6");
		hotkeys.add("7");
		macros.add(null);
		macros.add(null);
		macros.add(null);
		macros.add(null);
		macros.add(null);
		macros.add(null);
		macros.add(null);
		macros.add(null);
		DataMGR d= new DataMGR();
		ArrayList<Macro> z= d.getMacros();
		m = z;
		System.out.println("Macros loaded: " + z.size());
		
		
		
		
		
		try {
			
			
			
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		GlobalScreen.addNativeKeyListener(new SampleController());
		
		
		
		
		
		
		
		
		
		
		final Timeline timeline = new Timeline(
		    new KeyFrame(
		        Duration.millis( .1 ),
		        event -> {
		        	Point p = MouseInfo.getPointerInfo().getLocation();
					int x = p.x;
					int y = p.y;
					cursorLoc.setText("Current Cursor Location: " + x + ", " + y);
		           
		        }
		    )
		);
		timeline.setCycleCount( Animation.INDEFINITE );
		timeline.play();
		
	}
	public static ArrayList<Macro> m = new ArrayList<Macro>();
	public boolean button0;
	public boolean button1;
	public boolean button2;
	public boolean button3;
	public boolean button4;
	public boolean button5;
	public boolean button6;
	public boolean button7;
	
	
	
	@FXML
	public void toggle0()
	{
		if(button0 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b0.setStyle("-fx-background-color: #e67e22;");
			button0 = true;
			System.out.println("true");
			hotkeys.set(0, t0.getText().substring(2));
			macros.set(0, Integer.parseInt(t0.getText().substring(0, 1)));
			System.out.println(t0.getText().substring(2));
		}
		else
		{
			macros.set(0, null);
			hotkeys.set(0,null);
			b0.setStyle("-fx-background-color: #95a5a6;");
			button0 = false;
			System.out.println("false");
		}
	}
	@FXML
	public void toggle1()
	{
		if(button1 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b1.setStyle("-fx-background-color: #e67e22;");
			button1 = true;
			System.out.println("true");
			hotkeys.set(1, t1.getText().substring(2));
			macros.set(1, Integer.parseInt(t1.getText().substring(0, 1)));
			System.out.println(t1.getText().substring(2));
		}
		else
		{
			b1.setStyle("-fx-background-color: #95a5a6;");
			button1 = false;
			System.out.println("false");
			macros.set(1, null);
			hotkeys.set(1,null);
		}
	}
	public void toggle2()
	{
		if(button2 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b2.setStyle("-fx-background-color: #e67e22;");
			button2 = true;
			System.out.println("true");
			hotkeys.set(2, t2.getText().substring(2));
			macros.set(2, Integer.parseInt(t2.getText().substring(0, 1)));
			System.out.println(t2.getText().substring(2));
		}
		else
		{
			b2.setStyle("-fx-background-color: #95a5a6;");
			button2 = false;
			System.out.println("false");
			macros.set(2, null);
			hotkeys.set(2,null);
		}
	}
	public void toggle3()
	{
		if(button3 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b3.setStyle("-fx-background-color: #e67e22;");
			button3 = true;
			System.out.println("true");
			hotkeys.set(3, t3.getText().substring(2));
			macros.set(3, Integer.parseInt(t3.getText().substring(0, 1)));
			System.out.println(t3.getText().substring(2));
		}
		else
		{
			b3.setStyle("-fx-background-color: #95a5a6;");
			button3 = false;
			System.out.println("false");
			macros.set(3, null);
			hotkeys.set(3,null);
		}
	}
	public void toggle4()
	{
		if(button4 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b4.setStyle("-fx-background-color: #e67e22;");
			button4 = true;
			System.out.println("true");
			hotkeys.set(4, t4.getText().substring(2));
			macros.set(4, Integer.parseInt(t4.getText().substring(0, 1)));
			System.out.println(t4.getText().substring(2));
		}
		else
		{
			b4.setStyle("-fx-background-color: #95a5a6;");
			button4 = false;
			System.out.println("false");
			macros.set(4, null);
			hotkeys.set(4,null);
		
		
		}
	}
	public void toggle5()
	{
		if(button5 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b5.setStyle("-fx-background-color: #e67e22;");
			button5 = true;
			System.out.println("true");
			hotkeys.set(5, t5.getText().substring(2));
			macros.set(5, Integer.parseInt(t5.getText().substring(0, 1)));
			System.out.println(t5.getText().substring(2));
		}
		else
		{
			b5.setStyle("-fx-background-color: #95a5a6;");
			button5 = false;
			System.out.println("false");
			macros.set(5, null);
			hotkeys.set(5,null);
		}
	}
	public void toggle6()
	{
		if(button6 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b6.setStyle("-fx-background-color: #e67e22;");
			button6 = true;
			System.out.println("true");
			hotkeys.set(6, t6.getText().substring(2));
			macros.set(6, Integer.parseInt(t6.getText().substring(0, 1)));
			System.out.println(t6.getText().substring(2));
		}
		else
		{
			b6.setStyle("-fx-background-color: #95a5a6;");
			button6 = false;
			System.out.println("false");
			macros.set(6, null);
			hotkeys.set(6,null);
		}
	}
	public void toggle7()
	{
		if(button7 == false)
		{
			System.out.println("Hotkeys Size: " + hotkeys.size());
			System.out.println("Macros Size: " + macros.size());
			b7.setStyle("-fx-background-color: #e67e22;");
			button7 = true;
			System.out.println("true");
			hotkeys.set(7, t7.getText().substring(2));
			macros.set(7, Integer.parseInt(t7.getText().substring(0, 1)));
			System.out.println(t7.getText().substring(2));
		}
		else
		{
			b7.setStyle("-fx-background-color: #95a5a6;");
			button7 = false;
			System.out.println("false");
			macros.set(7, null);
			hotkeys.set(7,null);
		}
	}
	
	//77,374 4:46
	//73,792 5:43
	
	
	@FXML
	private Label cursorLoc;
	@FXML
	private Button b0;
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;
	@FXML
	private Button b6;
	@FXML
	private Button b7;
	@FXML
	private TextField t0;
	@FXML
	private TextField t1;
	@FXML
	private TextField t2;
	@FXML
	private TextField t3;
	@FXML
	private TextField t4;
	@FXML
	private TextField t5;
	@FXML
	private TextField t6;
	@FXML
	private TextField t7;

	@Override
	public void nativeKeyPressed(NativeKeyEvent nke) {
		
		System.out.println(nke.getKeyCode());
		System.out.println("Hotkeys Size: " + hotkeys.size());
		System.out.println("Macros Size: " + macros.size());
		for(int i = 0; i < hotkeys.size(); i++) {
			System.out.println("attempt");
			System.out.println(Integer.parseInt(hotkeys.get(i)));
			if(nke.getKeyCode() == Integer.parseInt(hotkeys.get(i)))
			{
				System.out.println("yes");
				try {
					System.out.println(macros.get(i));
					m.get(macros.get(i)).initiateMacro();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		System.out.println("dog");		
		
	}
	
	
	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
