/**
 * Created by robkr on 2014-09-15.
 */
public class Player {

    private GameRules rules;
    private int dividerToSkip;
    private int playerNumber;

    public Player(GameRules r, int playerNr, int divider){
        rules = r;
        dividerToSkip = divider;
        playerNumber = playerNr;
    }

    public String play() {
        String s;
        if(rules.getCurrentNumber()%dividerToSkip==0){
            s= "Player " + playerNumber + ": Cowabunga";
        }
        else {
            s= "Player " + playerNumber + ": " +rules.getCurrentNumber();
        }
        rules.increaseCurrentNumber();
        return s;
    }
}
