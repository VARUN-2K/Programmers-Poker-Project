package ProjectCode;

public class PokerPlay3OfKind extends poker_game_Hand implements HandInterface {
	
	public PokerPlay3OfKind(String str)  {
        super(str);
    }
    public boolean pokerDrawHandFunction()  {
        return this.pokerThreeOfAKindFunction();
    }
	
}
