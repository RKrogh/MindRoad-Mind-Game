package MindRoad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robkr on 2014-09-15.
 */
public class GameRules {

    /*
    Fields
     */
    private int currentNumber;
    private int currentPlayer;
    private int playUntilThisNumber;
    private int dividerToSkip;
    private List<Player> playerlist;

    /*
    Constructor
     */
    public GameRules(int numberOfPlayers, int divider){
        playerlist = new ArrayList<Player>();
        currentNumber=1;
        currentPlayer=3;
        playUntilThisNumber = 100;
        dividerToSkip = divider;
        fillPlayerList(numberOfPlayers);
    }

    public int getTheAnswer() {
        return 42;
    }

    /*
    Returns the number that is about to be "said" by one of the players.
     */
    public int getCurrentNumber() {
        return currentNumber;
    }

    /*
    Increases the number to be said by one.
     */
    public void increaseCurrentNumber() {
        this.currentNumber++;
    }

    /*
    Fills a list of players after the parameters given from the MindRoad.main class.
     */
    private void fillPlayerList(int numberOfPlayers){
        for(int i = 0 ; i < numberOfPlayers ; i++){
            Player p = new Player(this, i+1,dividerToSkip);
            playerlist.add(p);
        }
    }

    /*
    Lets the players take turns to play the game of "Burr", passing
    the turn between players until the playUntilThisNumber is reached.
     */
    public void startGame(){
        while(currentNumber<=playUntilThisNumber){
            System.out.println(playerlist.get(currentPlayer++%playerlist.size()).play());
        }
    }
}
