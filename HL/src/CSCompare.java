import java.util.Comparator;


public class CSCompare implements Comparator<Card>{

    @Override
    public int compare(Card c1, Card c2) {
        return c1.getSuit() - c2.getSuit();
    }
    
}
  