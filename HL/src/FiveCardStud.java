
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FiveCardStud {
	private Player[] players;
    private Deck deck;
    static JFrame frame = new JFrame();
    public FiveCardStud() {
        deck = new Deck();
        players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
       
        deck.shuffle();
    }

    public void dealCards() {
        int count = 0;
        for (int i = 0; i < players[0].getCards().length; i++) {
            for (int j = 0; j < players.length; j++) {
                players[j].setCard(deck.getCard(count++), i);
            }
        }
    }

    public void showCards() {
        for (int i = 0; i < players.length; i++) {
        	JOptionPane.showMessageDialog(frame,"Player " + (i + 1) + " got ");
            for (int j = 0; j < players[0].getCards().length; j++) {
            	JOptionPane.showMessageDialog(frame,"{" + players[i].getCard(j).toString()+"} ");
            }
            if(players[i].countPair()> 0)
            	JOptionPane.showMessageDialog(frame,"PAIR(S):" + players[i].countPair()+ "! ");
            if(players[i].isFlush())
            	JOptionPane.showMessageDialog(frame,"FLUSH!!");
            

        }
    }
    public void CompareCards(){
    if(players[0].countPair()>players[1].countPair() )
    {
    	JOptionPane.showMessageDialog(frame,"Congradulations You beat me with "+players[0].countPair()+" pairs.");
    }
    else if(players[0].countPair()<players[1].countPair())
    {
    	JOptionPane.showMessageDialog(frame,"Sorry, I beat you with "+players[1].countPair()+" pairs.");
    }
    else {
    	JOptionPane.showMessageDialog(frame,"We tied with the same pairs. Let's play again!");
    	FiveCardStud game = new FiveCardStud();
        game.dealCards();
        game.showCards();
        game.CompareCards();
    }
    }

	
}