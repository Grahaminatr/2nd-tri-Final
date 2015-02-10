import java.util.Scanner;

public class HighLow {

    
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        System.out.println("This program lets you play a simple HighLow,");
        System.out.println("card game. A card is dealt from a deck of cards");
        System.out.println("You have to guess whether the next card will be");
        System.out.println("Higher or Lower. Your score in the game is the");
        System.out.println("number of correct predictions you make before");
        System.out.println("you guess wrong. ");
        System.out.println("");
        
        
        int gamesPlayed = 0;
        
        int sumOfScores = 0;
        
        double averageScore;
        
        boolean playAgain;
        
        do {
            int scoreThisGame;
            scoreThisGame = play();
            sumOfScores += scoreThisGame;
            gamesPlayed++;
            System.out.println(" Play again? ");
            playAgain = keyboard.nextBoolean();
        } while(playAgain);
        
        averageScore = ((double)sumOfScores) / gamesPlayed;
        
        System.out.println();
        System.out.println("You played "+ gamesPlayed + " games");
        System.out.printf("Your average score was %1.3f .\n", averageScore);
        
    }
    
   
    private static int play() {
        
        Deck deck = new Deck();
        
        
        Card currentCard;
       
        Card nextCard;
        
        
        int correctGuesses;
        
        
        char guess;
        
        deck.shuffle();
        
        correctGuesses = 0;
        currentCard = deck.dealCard();
        System.out.println("The first card is the " + currentCard);
        
        
        while(true) {
            
            
            System.out.print("Will the next card be higher(H) or lower(L)? ");
            do {
                guess = keyboard.next().charAt(0);
                guess = Character.toUpperCase(guess);
                if(guess != 'H' && guess != 'L')
                    System.out.println("Pleas respond with H or L: ");
            } while (guess != 'H' && guess != 'L');
            
            
            nextCard = deck.dealCard();
            
            System.out.println("The next card is: " + nextCard);
            
            
            if(nextCard.getValue() == currentCard.getValue()) {
                System.out.println("The value is the same as the previous card. ");
                System.out.println("You lose on ties. Sorry!");
                break; 
            } else if(nextCard.getValue() > currentCard.getValue()) {
                if (guess == 'H') {
                    System.out.println("Your guess is correct!");
                    correctGuesses++;
                } else {
                    System.out.println("Your guess was incorrect!");
                    break;
                }
            } else {
                if(guess == 'L') {
                    System.out.println("Your guess is correct!");
                    correctGuesses++;
                } else {
                    System.out.println("Your guess was incorrect!");
                    break;
                }
            }
            
            
            currentCard = nextCard;
            System.out.println();
            System.out.println("The card is " + currentCard);
        } 
        
        System.out.println();
        System.out.println("The game is over!");
        System.out.println("You made " + correctGuesses
                                            + " correct predictions.");
        System.out.println();
        return correctGuesses;
    } 
}