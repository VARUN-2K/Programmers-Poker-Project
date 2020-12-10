package ProjectCode;

public class poker_game_Hand {
	
	String variable_stack1;
    String[] variable_stackArray1;
    
    public poker_game_Hand(String str)  {
       variable_stack1 = str;
       variable_stackArray1 = variable_stack1.split("\\s*,\\s*"); 
    }
    
    public poker_game_Hand(cardDeck deck, int sizeVar)  {
    	variable_stack1 = deck.pokerGetCardsFunction(sizeVar) ;
    	variable_stackArray1 = variable_stack1.split("\\s*,\\s*");
    }
    
    public char [] card_suit_based_sorting() {
        char [] charArr = this.fn_S();
        char helpVariable;
        for (int p = 0; p < charArr.length; p++){
            int min_q = p;   

            for (int q = p+1 ; q < charArr.length; q++ )               
            {
               if ( charArr[q] < charArr[min_q] )
               {
                  min_q = q;  
               }
               
            }
            helpVariable = charArr[p];
            charArr[p] = charArr[min_q];
            charArr[min_q] = helpVariable; 
        }
        return charArr;
    }
    
    public char [] card_face_based_sorting() {
        char [] charArr = this.fn_F();
        char helpVariable;
        for (int p = 0; p < charArr.length; p++){
            int min_q = p;  
            for (int q = p+1 ; q < charArr.length; q++ ) {
               if ( charArr[q] < charArr[min_q] ) {
                  min_q = q;  
               }
            }
            helpVariable = charArr[p];
            charArr[p] = charArr[min_q];
            charArr[min_q] = helpVariable; 
        }
        return charArr;
    }
    
    public char [] fn_F()  {   
        char [] f_array = new char[variable_stackArray1.length];
        for(int j = 0; j < variable_stackArray1.length; j++) {
            f_array[j] = variable_stackArray1[j].charAt(0);
        }
        return f_array;
    }
    
    public char [] fn_S(){
        char [] s_array = new char[variable_stackArray1.length];
        for(int j = 0; j < variable_stackArray1.length; j++)  {
            s_array[j] = variable_stackArray1[j].charAt(variable_stackArray1[j].length() - 1);
        }
        return s_array;
    }
    
    public boolean pokerPairFunction() {
        boolean b1, b2, b3, b4;
        char [] f_array = this.fn_F();
        if ( f_array.length != 5 ) {
           return false;
        }
        if ( this.pokerFourOfAKindFunction() || this.pokerFullHouseFunction() || this.pokerThreeOfAKindFunction() || this.pokerTwoPairFunction() ) {
           return false;            
        }
        this.card_face_based_sorting() ; 
                           
        b1 = f_array[0] == f_array[1] ;
        b2 = f_array[1] == f_array[2] ;

        b3 = f_array[2] == f_array[3] ;

        b4 = f_array[3] == f_array[4] ;

        return( b1 || b2 || b3 || b4 );
    }
    
    public boolean pokerTwoPairFunction()  {
        boolean b1, b2, b3;
        char [] f_array = this.fn_F();

        if ( f_array.length != 5 ) {
           return false;
        }
        if ( this.pokerFourOfAKindFunction() || this.pokerFullHouseFunction() || this.pokerThreeOfAKindFunction() ) {
            return(false);          
        }
        f_array = this.card_face_based_sorting() ; 

      b1 = f_array[0] == f_array[1] && f_array[2] == f_array[3] ;  
      b2 = f_array[0] == f_array[1] &&  f_array[3] == f_array[4];
      b3 = f_array[1] == f_array[2] && f_array[3] == f_array[4] ;

      return( b1 || b2 || b3 );
    }
    
    public boolean pokerThreeOfAKindFunction()  {
    	boolean b1, b2, b3;
        char [] f_array = this.fn_F();
        if ( f_array .length != 5 ) {
           return false ;
        }
        f_array  = this.card_face_based_sorting() ;         
        b1 = f_array[0] == f_array[1] && f_array[1] == f_array[2] && f_array[3] != f_array[0] && f_array[4] != f_array[0] && f_array[3] != f_array[4] ;
  
        b2 = f_array[1] == f_array[2] &&  f_array[2] == f_array[3] &&  f_array[0] != f_array[1] && f_array[4] != f_array[1] &&  f_array[0] != f_array[4] ;
  
      b3 = f_array[2] == f_array[3] && f_array[3] == f_array[4] && f_array[0] != f_array[2] && f_array[1] != f_array[2] && f_array[0] != f_array[1] ;

      return( b1 || b2 || b3 );
    }
   
    public boolean pokerFourOfAKindFunction() {
        boolean b1, b2;
        char [] f_array = this.fn_F();
        if ( f_array.length != 5 ) {
            return false;
        }
        f_array = this.card_face_based_sorting() ;          
        b1 = f_array[0] == f_array[1] &&   f_array[1] == f_array[2] &&  f_array[2] == f_array[3] ; 
        b2 = f_array[1] == f_array[2] && f_array[2] == f_array[3] && f_array[3] == f_array[4] ;

        return( b1 || b2 );
    }
    
    public boolean pokerFullHouseFunction(){
        boolean b1, b2;
        
        char [] f_array = this.fn_F();

        if ( variable_stackArray1.length != 5 ) {
           return false;
        }
        f_array = this.card_face_based_sorting();      

      
        b1 = f_array[0] == f_array[1] && f_array[1] == f_array[2] && f_array[3] == f_array[4];

  
        b2 = f_array[0] == f_array[1] && f_array[2] == f_array[3] && f_array[3] == f_array[4];

        return( b1 || b2 );
        
    }
    
    public boolean pokerStraightFunction()  {
        int j, tFaceVariable;
        char [] f_array;
        if ( variable_stackArray1.length != 5 ) {
            return false;
        }
        f_array = this.card_face_based_sorting() ;          
        if ( f_array[4] == 13 ){
           boolean p = f_array[0] == 2 && f_array[1] == 3 &&  f_array[2] == 4 && f_array[3] == 5 ;
           boolean q = f_array[0] == 10 && f_array[1] == 11 && f_array[2] == 12 && f_array[3] == 13 ;
           return ( p || q );
        }
        else {
           tFaceVariable = f_array[0] + 1;
           for ( j = 1; j < 5; j++ )
           {
              if ( f_array[j] != tFaceVariable ) {
                 return false ;       
              }
              tFaceVariable++;   
           }
           return true;       
        }
    }
    
    public boolean pokerFlushFunction()  {
        if ( variable_stackArray1.length != 5 ) {
           return false;   
        }
        char [] s_array = this.card_suit_based_sorting();
        return( s_array[0] == s_array[4] );   
    } 
	
}

