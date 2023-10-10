class Field{
    public int [] money = {250, -100, 100,-20, 180, 0, -70, 60, -80, -50, 650};
    int tempDieValue;

    public boolean extraTurn(int tempDieValue){
        boolean extraTurn = false;

        var dieValue = tempDieValue;
        if(dieValue == 10){
            extraTurn = true;
            
        }
        else{
            extraTurn = false;
        }




        return extraTurn;
    }
    
}

