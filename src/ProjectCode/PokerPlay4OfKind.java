package ProjectCode;

public class PokerPlay4OfKind extends poker_game_Hand implements HandInterface {

	 	public PokerPlay4OfKind(String str) {
	        super(str);
	    }
	    public boolean pokerDrawHandFunction() {
	        boolean b1 ;
	        boolean b2;
	        char [] f_array = this.fn_F() ;
	        if ( f_array.length != 5 ) {
	            return false ;
	        }
	        f_array = this.card_face_based_sorting() ;         
	        b1 = f_array[0] == f_array[1] &&  f_array[1] == f_array[2] && f_array[2] == f_array[3] ;
	        b2 = f_array[1] == f_array[2] && f_array[2] == f_array[3] && f_array[3] == f_array[4] ;
	        return( b1 || b2 );
	    }
	
}
