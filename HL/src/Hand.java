import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand {

    final private List<Card> cardsList = new ArrayList<Card>();
    
    
    public Hand() {
    }
    
    
    public void clear() {
        cardsList.clear();
    }

    
    public void removeCard(Card c) {
        if ((null==c)&&(!(c instanceof  Card))) {
            System.out.println("Error: No card to be removed!");
        } else {
            cardsList.remove(c);
        }
    }
    
   
    public void addCard(Card c) {
        if((null==c)&&(!(c instanceof  Card))) {
            System.out.println("Error: No card to be removed!");
        } else {
            cardsList.add(c);
        }
        
    }
    
    
    public void removeCard(int position) {
        cardsList.remove(position);
    }
    
    
    public int getCardCount() {
        return cardsList.size();
    }
    
   
    public Card getCard(int position) {
            return cardsList.get(position);
    }
    
   
    public void sortBySuit() {
        Collections.sort(cardsList, new CSCompare());
    }
    
    
    public void sortByValue() {
        Collections.sort(cardsList, new CVCompare());
    }
}