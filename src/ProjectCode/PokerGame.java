package ProjectCode;

import java.util.Scanner;

public class PokerGame {
	
	static int NUM_OF_CARDs = 5 ;
	
	
	 public void gamePlayAutomatic() {
		 
	        cardDeck deck = new cardDeck();
	        deck.pokerPrintCards(NUM_OF_CARDs) ;
	        deck.pokerprintGameDeck();
	        
			poker_game_Hand p_new = new poker_game_Hand(deck, NUM_OF_CARDs);
	        
	        if (p_new.pokerFlushFunction()){
	            System.out.println("It is Flush");
	        }
	        if (p_new.pokerStraightFunction()){
	            System.out.println("It is Straight");
	        }
	        if (p_new.pokerPairFunction()) {
	            System.out.println("It is Pairs");
	        }
	        if (p_new.pokerTwoPairFunction()) {
	            System.out.println("It is Two Pair");
	        }
	        if (p_new.pokerThreeOfAKindFunction())  {
	            System.out.println("It is Three of a Kind");
	        }
	        if (p_new.pokerFourOfAKindFunction())  {
	            System.out.println("It is Four of a Kind");
	        }
	        if (p_new.pokerFullHouseFunction()) {
	            System.out.println("It is Full House");
	        }
	    }
	 
	 public void gamePlaymanually()
	    {
	        
	        System.out.print("You have to manually set:  ");
	 
	        Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        
	        PokerPlay_flush f = new PokerPlay_flush(input);
	        if (f.pokerDrawHandFunction()) {
	            System.out.println("Flush");
	        }
	        PokerPlay_Straight s = new PokerPlay_Straight(input);
	        if (s.pokerDrawHandFunction()){
	            System.out.println("It is Straight");
	        }
	        PokerPlayPairs p = new PokerPlayPairs(input);
	        if (p.pokerDrawHandFunction()) {
	            System.out.println("It is Pair");
	        }
	        PokerPlayTwoPairs tP = new PokerPlayTwoPairs(input);
	        if (tP.pokerDrawHandFunction())   {
	            System.out.println("It is Two Pair");
	        }
	        PokerPlay3OfKind tK = new PokerPlay3OfKind(input);
	        if (tK.pokerDrawHandFunction())  {
	            System.out.println("It is Three of a Kind");
	        }
	        PokerPlay4OfKind fK = new PokerPlay4OfKind(input);
	        if (fK.pokerDrawHandFunction()) {
	            System.out.println("It is Four of a Kind");
	        }
	        PokerPlayFullHouse fH = new PokerPlayFullHouse(input);
	        if (fH.pokerDrawHandFunction())  {
	            System.out.println("It is Full House");
	        }
	    }

}
