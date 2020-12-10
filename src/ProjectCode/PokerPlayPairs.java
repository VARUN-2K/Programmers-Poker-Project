package ProjectCode;

public class PokerPlayPairs extends poker_game_Hand implements HandInterface {

	public PokerPlayPairs(String str) {
        super(str);
    }
    public boolean pokerDrawHandFunction() {
        return this.pokerPairFunction() ; 
    }
	
}
