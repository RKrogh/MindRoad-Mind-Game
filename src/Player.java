/**
 * Created by robkr on 2014-09-15.
 */
public class Player {

    /*
    Fields
     */
    private GameRules rules;
    private int dividerToSkip;
    private int playerNumber;

    /*
    Constructor
     */
    public Player(GameRules r, int playerNr, int divider){
        rules = r;
        dividerToSkip = divider;
        playerNumber = playerNr;
    }

    /*
    Checks the GameRule class for info on the game's state
    and returns a string depending on the circumstances.
     */
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
