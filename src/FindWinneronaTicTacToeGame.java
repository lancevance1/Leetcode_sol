public class FindWinneronaTicTacToeGame {
    public String tictactoe(int[][] moves) {
        String res ="Pending";
        if(moves.length<5)return res;
        if (moves.length==9)res="Draw";
        for (int i = 0; i < moves.length-4; i++) {
            for (int j = i+2; j < moves.length-2; j++) {
                for (int k = j+2; k < moves.length; k++) {
                    if(moves[i][0]+moves[j][0]+moves[k][0]==3&&moves[i][1]+moves[j][1]+moves[k][1]==3){
                        if ((moves[i][0]==1&&moves[i][1]==1)||(moves[j][0]==1&&moves[j][1]==1)||(moves[k][0]==1&&moves[k][1]==1)){
                            res="A";
                        }
                    }else if (moves[i][0]+moves[j][0]+moves[k][0]==3){
                        if (moves[i][1]+moves[j][1]+moves[k][1]==3||moves[i][1]+moves[j][1]+moves[k][1]==6||moves[i][1]+moves[j][1]+moves[k][1]==0)
                        res="A";
                    }else if (moves[i][1]+moves[j][1]+moves[k][1]==3){
                        if (moves[i][0]+moves[j][0]+moves[k][0]==3||moves[i][0]+moves[j][0]+moves[k][0]==6||moves[i][0]+moves[j][0]+moves[k][0]==0)
                            res="A";
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        for (int i = 1; i < moves.length-4; i++) {
            for (int j = i+2; j < moves.length-2; j++) {
                for (int k = j+2; k < moves.length; k++) {
                    if(moves[i][0]+moves[j][0]+moves[k][0]==3&&moves[i][1]+moves[j][1]+moves[k][1]==3){
                        if ((moves[i][0]==1&&moves[i][1]==1)||(moves[j][0]==1&&moves[j][1]==1)||(moves[k][0]==1&&moves[k][1]==1)){
                            res="B";
                        }
                    }else if (moves[i][0]+moves[j][0]+moves[k][0]==3){
                        if (moves[i][1]+moves[j][1]+moves[k][1]==3||moves[i][1]+moves[j][1]+moves[k][1]==6||moves[i][1]+moves[j][1]+moves[k][1]==0)
                            res="B";
                    }else if (moves[i][1]+moves[j][1]+moves[k][1]==3){
                        if (moves[i][0]+moves[j][0]+moves[k][0]==3||moves[i][0]+moves[j][0]+moves[k][0]==6||moves[i][0]+moves[j][0]+moves[k][0]==0)
                            res="B";
                    }
                    k++;
                }
                j++;
            }
            i++;
        }

        return res;
    }
}
