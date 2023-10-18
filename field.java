class Field{
    


    public static int fieldPoint(int rolls){
        /*check which field the player rolled and return the money cooresponding to the dice sum */
        int balanceChange; 
        int [] money = {250, -100, 100,-20, 180, 0, -70, 60, -80, -50, 650};
        balanceChange = money[rolls];
        return balanceChange;
    }

    public boolean extraTurn(int rolls){
        /*Checks if the dice sum is 10 and then return a true value */
        boolean extraTurn = false;

        
        if(rolls == 10){
            extraTurn = true;
            
        }
        else{
            extraTurn = false;
        }
       




        return extraTurn;
    }

    
}

