class Field{


    public fieldPoint(){
        int [] money = {250, -100, 100,-20, 180, 0, -70, 60, -80, -50, 650};
        
    }

    public boolean extraTurn(int []dieArray){
        boolean extraTurn = false;

        
        if(dieArray[2] == 10){
            extraTurn = true;
            
        }
        else{
            extraTurn = false;
        }




        return extraTurn;
    }
    
}

