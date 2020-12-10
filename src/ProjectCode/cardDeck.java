package ProjectCode;

import java.util.Arrays;
import java.util.Random;

public class cardDeck implements DeckInterface {
	
	private static final int NUM_SUIT = 4;
    private static final int NUM_FACE = 13;
    Card [][] card = new Card[NUM_FACE][NUM_SUIT];
    
    public cardDeck() {
    	for (int i = 0; i < cardDeck.NUM_SUIT; i++) {
            for (int j = 0; j < cardDeck.NUM_FACE; j++) {
                card[i][j] = new Card(i, j);
            }
        }
    }
    
    @Override
    public void pokerShuffleCardGame() {
        for (int i = 0; i < cardDeck.NUM_SUIT; i++) {
            for (int j = 0; j < cardDeck.NUM_FACE; j++)
            {
                card[j][i] = new Card(j, i);
                Random random = new Random();
                int r1 = random.nextInt(j + 1);
                int r2 = random.nextInt(i + 1);
                Card temp = card[j][i];
                card[j][i] = card[r1][r2];
                card[r1][r2] = temp;
            }
        }
    }
    
    public Card [] pokerDealGameCards(int sizeVar)  {
        Card [] currentDeal = new Card[sizeVar];
        int k = 0;
        this.pokerShuffleCardGame() ;
        for (int i = 0; i < cardDeck.NUM_SUIT; i++)  {
            for (int j = 0; j < cardDeck.NUM_FACE; j++)  {
                if (k > sizeVar - 1) {
                    break;
                } 
                else {
                    currentDeal[k] = card[j][i];
                    ++k;
                }
            }
        }
        return currentDeal;
    }
    
   
    public String pokerGetCardsFunction(int sizeVar) {
        return Arrays.toString(this.pokerDealGameCards(sizeVar));
    }
    
    
    public void pokerPrintCards(int sizeVar)  {
        System.out.println(this.pokerGetCardsFunction(sizeVar));
    }
    
    
    public void pokerprintGameDeck() {
        for (int i = 0; i < cardDeck.NUM_SUIT; i++) {
            for (int j = 0; j < cardDeck.NUM_FACE; j++) {
                this.card[j][i].pokerPrintCard();
            }
        }
        System.out.println("");
    }

    public int PokerGameSizeOfPlay(){
        return cardDeck.NUM_FACE * cardDeck.NUM_SUIT;
    }
    

}
