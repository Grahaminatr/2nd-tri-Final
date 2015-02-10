import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainScreen extends JPanel 
	{
	static int type; 
	static JFrame frame = new JFrame();

			
	public static void welcomeUser()
		{
		JOptionPane.showMessageDialog(frame, "Let's Play Cards!",
				"Hello",
				JOptionPane.QUESTION_MESSAGE);	
			
		
		}
	public static void makeMainScreen()
		{
		Object[] optionOne = {"HighLow" , "BlackJack" , "War"};
				
		
	switch(type)
	{
	
	case 0: 
		{
		HighLow();
		makeMainScreen();	
		break;
		}
	case 1:
		{
		
		makeMainScreen();	
		break;
		}
	case 2: 
		{
		
		makeMainScreen();	
		break;
		}
	case 3:
		{
		makeMainScreen();
		break;
		}
	}
		}
	}