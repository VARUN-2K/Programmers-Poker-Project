package ProjectCode;

public class PokerPlay_flush extends poker_game_Hand implements HandInterface {

	public PokerPlay_flush(String str) {
        super(str);
    }
    
    public boolean pokerDrawHandFunction() {
        if ( variable_stackArray1.length != 5 ) {
        	return (false);
        }
        char [] s_array = this.card_suit_based_sorting(); 
        return( s_array[0] == s_array[4] );   
    }
	
}
