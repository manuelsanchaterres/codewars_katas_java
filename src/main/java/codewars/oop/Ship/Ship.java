package codewars.oop.Ship;
public class Ship {

    private final int draft;
    private final int crew;
    public Ship(int draft, int crew){

        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt(){

        return draft - (1.5 * crew) > 20 && crew > 0;
    }
}
