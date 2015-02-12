import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand extends Deck{

     private static List<Card> cardsList = new ArrayList<Card>();
    
    
    private int maxSize; 

	public Hand(int maxSize)
	{
		cardsList = new ArrayList<Card>();
        this.maxSize = maxSize;
	}
    
    
    public void clear() {
        cardsList.clear();
    }

    
    public void removeCard(Card c) {
        
            cardsList.remove(c);
        
    }
    
   
    public void addCard(Card c) {
        
            cardsList.add(c);
        
        
    }
    
    
    public void removeCard(int position) {
        cardsList.remove(position);
    }
    
    
    public static int getCardCount() {
        return cardsList.size();
    }
    
   
    public Card getCard(int position) {
            return cardsList.get(position);
    }
    
   
    public void sortBySuit() {
        Collections.sort(cardsList, new CSCompare());
    }
    public int getMaxSize(){
        return maxSize;
    }
    
    public void sortByValue() {
        Collections.sort(cardsList, new CVCompare());
    }
}