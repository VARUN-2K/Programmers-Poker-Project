package ProjectCode;

public class PokerPlayTwoPairs extends poker_game_Hand implements HandInterface {

	public PokerPlayTwoPairs(String str) {
        super(str);
    }
    public boolean pokerDrawHandFunction() {
        return this.pokerTwoPairFunction();
    }
	
}
