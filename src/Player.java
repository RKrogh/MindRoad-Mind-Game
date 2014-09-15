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

    public void play() {
        if(rules.getCurrentNumber()%dividerToSkip==0){
            System.out.println("Player " + playerNumber + ": Cowabunga");
        }
        else {
            System.out.println("Player " + playerNumber + ": " +rules.getCurrentNumber());
        }
        rules.increaseCurrentNumber();
    }
}
