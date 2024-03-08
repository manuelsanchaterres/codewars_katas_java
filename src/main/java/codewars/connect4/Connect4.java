package connect4;

import java.util.Arrays;

class Connect4 {

    private int currentPlayer;
    private int movesCounter;
    public static int[][] grid;
    private static int lastPlayedGridIndex;
    Connect4(int currentPlayer, int movesCounter,int[][] grid){

        this.currentPlayer = currentPlayer;
        this.movesCounter = movesCounter;
        this.grid = grid;
    }

    String play(int column) {

        if (checkColumnFull(grid,column)){
            return "Column full!";
        }else {
            grid = insertDisc(currentPlayer,grid, column);
            /* if minimum movements is 7 then you can check for winning conditions 
            as player1 will already have played 4 discs*/
            if (movesCounter>= 7 && checkWin(grid,column,currentPlayer,lastPlayedGridIndex)){
                System.out.println("Player" + currentPlayer + "wins");
                return "Game has finished!";
    
            }else {
    
                return "Player" + currentPlayer + " has a turn";
            }
            
        }


    }
    static boolean checkColumnFull(int[][] grid,int column){
        boolean isColumFull = true;

        for (int i = 5; i >=0; i--) {
            
            if (grid[i][column] == 0){

                isColumFull = false;
                break;
            }
        }
        return isColumFull;
    }

    static int[][] insertDisc(int currentPlayer,int[][] grid, int column){

        for (int i = 5; i >=0; i--) {
            
            if (grid[i][column] == 0){
                lastPlayedGridIndex = i;
                grid[i][column] = currentPlayer;
                break;
            }
        }
        return grid;
    }

    static boolean checkWin(int[][] grid, int column, int currentPlayer, int lastPlayedGridIndex){

        boolean isWin = false;

        if (checkHorizontal(grid,column, lastPlayedGridIndex) || checkVertical(grid,column, lastPlayedGridIndex)){

            isWin = true;
        }
        
        return isWin;
    }


    static boolean checkVertical(int[][] grid, int column, int lastPlayedGridIndex){

        boolean vertical = true;
        /*to check vertically, grid row index must be lower o equal to 2 to avoid row
         * loop out of bounce.
        */

        if (lastPlayedGridIndex <=2){

            for (int i = lastPlayedGridIndex +1; i <= lastPlayedGridIndex +3; i++) {
            
                if (grid[i][column] != grid[lastPlayedGridIndex][column]){
    
                    vertical = false;
    
                }
            }
        }

        return vertical;
    }

    static boolean checkHorizontal(int[][] grid, int column,int lastPlayedGridIndex){

        boolean horizontal = false;
        // counting the current inserted disc as the first matching disc
        int consecutiveDiscs = 1;
        if (lastPlayedGridIndex == 0){

            consecutiveDiscs = checkRightHorizontalSide(grid,lastPlayedGridIndex, column);

        }else if (lastPlayedGridIndex == 6){
            consecutiveDiscs = checkLeftHorizontalSide(grid,lastPlayedGridIndex, column);
        }
        else{

            checkBothHorizontalSides(grid,lastPlayedGridIndex, column);

        }

        if (consecutiveDiscs == 4){

            horizontal = true;
        }

        return horizontal;
    }

    static int checkLeftHorizontalSide(int[][] grid, int lastPlayedGridIndex, int column){
        int consecutiveDiscs = 1;
        for (int i = lastPlayedGridIndex+ 1; i <= lastPlayedGridIndex +3; i--) {
            
            if (grid[lastPlayedGridIndex][i] == grid[lastPlayedGridIndex][column]){

                consecutiveDiscs++;
            }
        }

        return consecutiveDiscs;
    }
    static int checkBothHorizontalSides(int[][] grid, int lastPlayedGridIndex, int column){
        int consecutiveDiscs = 1;
        int [] currentRow = grid[lastPlayedGridIndex];
        int [] subStringLeft = Arrays.copyOfRange(currentRow, 0, grid[lastPlayedGridIndex][column+1]);
        
        // check left current player disc side

        for (int i = subStringLeft.length-1; i > 0; i--) {
            
            if (subStringLeft[i] == subStringLeft[i-1]){

                consecutiveDiscs++;
            }
        }

        return consecutiveDiscs;
    }

    static int checkRightHorizontalSide(int[][] grid, int lastPlayedGridIndex, int column){
        int consecutiveDiscs = 1;
        for (int i = lastPlayedGridIndex- 1; i <= lastPlayedGridIndex -3; i--) {
            
            if (grid[lastPlayedGridIndex][i] == grid[lastPlayedGridIndex][column]){

                consecutiveDiscs++;
            }
        }

        return consecutiveDiscs;
    }










      
}
