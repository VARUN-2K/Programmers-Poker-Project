package ProjectCode;

public class PokerPlay_Straight extends poker_game_Hand implements HandInterface {

	public PokerPlay_Straight(String str) {
        super(str);
    }
    public boolean pokerDrawHandFunction() {
        return this.pokerStraightFunction();
    }
	
}
