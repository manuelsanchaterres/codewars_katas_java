package connect4;

public class Main {
    
    public static void main(String[] args) {
        Player player1 = new Player(1, 0);
        Player player2 = new Player(2, 0);
        // moves combination for player1 to vertically win
        // int[] moves = { 0, 1, 0, 1, 0, 1, 0};
        // moves combination for player2 to horizontally win
        int[] moves = { 0, 1, 0, 2, 0, 3, 1, 4};
        String[] responses = new String[moves.length];
        int currentPlayer = 1;
        int movesCounter = 1;
        int[][] grid = {

            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0},
        };
        for (int i = 0; i < moves.length; i++) {
            
            responses[i] = new Connect4(currentPlayer,movesCounter,grid).play(moves[i]);

            if (responses[i].equals("Column full!")){
                int temp = currentPlayer;
                currentPlayer = temp;
            }else if (responses[i].equals("Game has finished!")){
                for (int j = i+1; j < responses.length; j++) {
                    responses[j] = "Game has finished!";

                }
            }else {
                // valid moves counter, excluding column full movements
                movesCounter++;
                Connect4 game = new Connect4(currentPlayer, movesCounter, grid);
                grid = Connect4.grid;
                if (currentPlayer == 1){

                    player1.setTotalPlayerMoves(player1.getTotalPlayerMoves()+1);
                } else  if (currentPlayer == 2){
    
                    player2.setTotalPlayerMoves(player2.getTotalPlayerMoves()+1);
                }

                // next player number
                currentPlayer = 3-currentPlayer;
            }

        }
        // if total moves is lower than 7 or 42 means that no player won the game
        if ((player1.getTotalPlayerMoves() + player2.getTotalPlayerMoves()< 7) || (player1.getTotalPlayerMoves() + player2.getTotalPlayerMoves()== 42)){

            System.out.println("Draw Game, no Player Wins");
        }

    }
}
