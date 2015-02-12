import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

  

public class Deck {
    
    private final int deckSize = 52;
    private final ArrayList<Card> deckOfCards = new ArrayList<Card>(deckSize);
    private Card card;
    
    
    public Deck() {
        for(int suit = 0; suit <4; suit++) {
            for(int value=1; value<14; value++) {
                deckOfCards.add(new Card(value, suit));
            }
        }
        Collections.shuffle(deckOfCards);
        
    }
    
    
    public void shuffle() {
        Collections.shuffle(deckOfCards);
    }
    
    
    public int size() {
        return deckOfCards.size();
    }
    
    public Card getCard(int position) {
        return deckOfCards.get(position);
}
    public boolean isEmpty() {
        return deckOfCards.isEmpty();
    }
    
   
    public Card dealCard() {
        if(!deckOfCards.isEmpty()) {
            Iterator deckIterator = deckOfCards.iterator();
                while(deckIterator.hasNext()) {
                    card = (Card) deckIterator.next();
                }
            deckOfCards.remove(card);
        }
        return card;
    }
}