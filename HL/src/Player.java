public class Player {
    public final static int MAX_CARD = 5;
    private Card cards[];
   
    public Player() {
        cards = new Card[MAX_CARD];
    }
    
    public Card[] getCards() {
        return cards;
    }
    
    public Card getCard(int index) {
        if (index >= 0 && index < MAX_CARD)
            return cards[index];
        else
            return null;
    }
   
    public void setCard(Card c, int index) {
        if(index >= 0 && index < MAX_CARD)
            cards[index] = c;
    }
    
    public int countPair() {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getValue()==(cards[j].getValue())){
                    count++;
                }
            }
        }
        return count;
    }

    
    public boolean isFlush() {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getSuit()==(cards[j].getSuit())) {
                    count++;
                }
            }
        }
        if(count == 5)
            return true;
        else
            return false;
    }    
}