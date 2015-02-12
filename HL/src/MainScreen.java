import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainScreen extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	  
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
		name = JOptionPane.showInputDialog("Welcome to the Casino? I'm the dealer. What's your Name?");  
		
		
		Object[] options = {"Don't wanna play","HighLow", "Five Card Stud"};
		className = JOptionPane.showOptionDialog(frame, "Hi, "+name+". What game would you like to play?",
				"Game Preference",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "Alright Come again.");
				
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Cool, Let's play a few rounds of HighLow");
				HighLow.Instuctions();
				HighLow.play();
				
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "Awesome, we came play Five Card Stud.");
				JOptionPane.showMessageDialog(frame, "So for five Card Stud we will each recieve 5 cards. \n With the cards we will keep dealing until one of us get  more pairs then the other or get a flush. ");
				JOptionPane.showMessageDialog(frame, "Are you ready?.");
				JOptionPane.showMessageDialog(frame, "Ok let's play.");
				FiveCardStud game = new FiveCardStud();
		        game.dealCards();
		        game.showCards();
		        game.CompareCards();
				break;
				}
			}
	    }
	}