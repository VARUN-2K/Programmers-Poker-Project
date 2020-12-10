package ProjectCode;

import java.util.Random;

public class Card implements CardInterface {
	
    private static final String[] STRARR_SUITS = {
            "H", "D", "C", "S"
        };
        private static final String[] STRARR_RANKS = {
            "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
        };
        
        private String current_card = "";
        
        public Card() {
            Random random = new Random();
            this.pokerSetCardFunction(this.pokerGetCard(random.nextInt(13), random.nextInt(3)));
        }
        
        public Card(int cardRank_constructor, int cardSuit_constructor){
            this.pokerSetCardFunction(this.pokerGetCard(cardRank_constructor, cardSuit_constructor));
        }
        
        public String pokerGetCard(int cardRank_constructor, int cardSuit_constructor) {
            return Card.STRARR_RANKS[cardRank_constructor] + Card.STRARR_SUITS[cardSuit_constructor];
        }
        
        public void pokerSetCardFunction(String cardVariablee){
            this.current_card = cardVariablee;      
        }
        
        public String convertToString() {
            return this.current_card;
        }
        @Override
        public void pokerPrintCard()  {
           System.out.print(this.toString() + " ");         
        }
        

}
