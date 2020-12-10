package ProjectCode;

public class PokerPlayFullHouse extends poker_game_Hand implements HandInterface {

	public PokerPlayFullHouse(String str) {
		super(str) ; 
	}
    public boolean pokerDrawHandFunction() {
        boolean b1, b2;
        char [] f_array = this.fn_F() ; 
        if ( variable_stackArray1.length != 5 ) {
           return false;
        }
        f_array = this.card_face_based_sorting() ;     
        b1 = f_array[0] == f_array[1] && f_array[1] == f_array[2] && f_array[3] == f_array[4];
        b2 = f_array[0] == f_array[1] && f_array[2] == f_array[3] && f_array[3] == f_array[4];
        return( b1 || b2 );
    }
	
}
