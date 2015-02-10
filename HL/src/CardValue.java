public enum CardValue {

    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
    NINE, TEN, JACK, QUEEN, KING;
    
    
    public int blackJackValue() {
        if(this == JACK || this == QUEEN || this == KING)
            return 10;
        else
            return 1 + ordinal();
    }
    
    
    @Override
    public String toString() {
        switch(this) { 
            case ACE: 
                return "Ace";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                int numericValue = 1 + ordinal();
                return "" + numericValue;
        }
    }
}