import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class HighLow {
	static int hl;
	static JFrame frame = new JFrame();
    static Scanner keyboard = new Scanner(System.in);
    static String guess;
    
    public static void Instuctions() {
    	
    	JOptionPane.showMessageDialog(frame,"Before we start I'll explain how we play.\n First I will deal you a random card from the deck and you have to guess whether the next card will be Higher(H) or Lower(L).\n Your score in the game is the number of correct predictions you make before you guess wrong. ");
        
        
        
    
    }
    
   
    public static int play() {
        
        Deck deck = new Deck();
        
        
        Card currentCard;
       
        Card nextCard;
        
        
        int correctGuesses;
        
        
        
        
        deck.shuffle();
        
        correctGuesses = 0;
        currentCard = deck.dealCard();
        JOptionPane.showMessageDialog(frame,"The first card is the " + currentCard);
        
        
        while(true) {
            
        	Object[] options = {"Higher", "Lower"};
    		hl = JOptionPane.showOptionDialog(frame, "What class would you like to be?",
    				"Your Vocation",
    				JOptionPane.YES_NO_CANCEL_OPTION,
    				JOptionPane.QUESTION_MESSAGE,
    				null, options, options[1]);
  
            nextCard = deck.dealCard();
            
            JOptionPane.showMessageDialog(frame,"The next card is: " + nextCard);
            
            
            if(nextCard.getValue() == currentCard.getValue()) {
            	JOptionPane.showMessageDialog(frame,"The value is the same as the previous card. \n You lose because they tied, sorry.");
               
                break; 
            } else switch(hl)
            {
            case 0:
			{
				if(nextCard.getValue() > currentCard.getValue()) {
					JOptionPane.showMessageDialog(frame,"Your guess is correct!");
					correctGuesses++;
				}else{
					JOptionPane.showMessageDialog(frame,"Your guess was incorrect!");	
					JOptionPane.showMessageDialog(frame,"The game is over!");
			        JOptionPane.showMessageDialog(frame,"You made " + correctGuesses
			                                            + " correct predictions.");
			       
			        return correctGuesses;
					
				}
			break;
			}
		case 1:
			{
				if(nextCard.getValue() < currentCard.getValue()) {
					JOptionPane.showMessageDialog(frame,"Your guess is correct!");
					correctGuesses++;
				}else{
					JOptionPane.showMessageDialog(frame,"Your guess was incorrect!");
					JOptionPane.showMessageDialog(frame,"The game is over!");
			        JOptionPane.showMessageDialog(frame,"You made " + correctGuesses
			                                            + " correct predictions.");
			       
			        return correctGuesses;
				}
			break;
			}

            }
            
            
            currentCard = nextCard;
           
            JOptionPane.showMessageDialog(frame,"The card is " + currentCard);
        } 
        
        
        JOptionPane.showMessageDialog(frame,"The game is over!");
        JOptionPane.showMessageDialog(frame,"You made " + correctGuesses
                                            + " correct predictions.");
       
        return correctGuesses;
    } 
    }

