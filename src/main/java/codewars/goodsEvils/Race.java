package goodsEvils;

class Race {

    private String raceName;
    private int raceWorth;

    Race (String raceName, int raceWorth){

        this.raceName = raceName;
        this.raceWorth = raceWorth;
    }

    public String getRaceName() {
        return raceName;
    }

    public int getRaceWorthPoints() {
        return raceWorth;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public void setRaceWorth(int raceWorth) {
        this.raceWorth = raceWorth;
    }
}
