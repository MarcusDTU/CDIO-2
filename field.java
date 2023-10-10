class Field{


    public static int fieldPoint(int [] dieArray){
        int balanceChange; 
        int [] money = {250, -100, 100,-20, 180, 0, -70, 60, -80, -50, 650};
        balanceChange = money[dieArray[2]];
        return balanceChange;
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

    public static void main(String [] args){
        int [] dieArray = {0,0,0};
        dieArray[2] = Integer.parseInt(args[0]);
        var msg = fieldPoint(dieArray);
        System.out.println(msg);
    }
    
}

