package connect4;

class Player {

    private int playerNumber;
    private int totalPlayerMoves;
    Player(int playerNumber, int totalPlayerMoves){

        this.playerNumber = playerNumber;
        this.totalPlayerMoves = totalPlayerMoves;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
    public int getTotalPlayerMoves() {
        return totalPlayerMoves;
    }
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    public void setTotalPlayerMoves(int totalPlayerMoves) {
        this.totalPlayerMoves = totalPlayerMoves;
    }

}
