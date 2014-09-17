import java.util.ArrayList;
import java.util.List;

/**
 * Created by robkr on 2014-09-15.
 */
public class GameRules {

    private int currentNumber;
    private int currentPlayer;
    private int playUntilThisNumber;
    private int dividerToSkip;
    private List<Player> playerlist;

    public GameRules(int numberOfPlayers, int divider){
        playerlist = new ArrayList<Player>();
        currentNumber=1;
        currentPlayer=3;
        playUntilThisNumber = 100;
        dividerToSkip = divider;
        fillPlayerList(numberOfPlayers);
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void increaseCurrentNumber() {
        this.currentNumber++;
    }

    private void fillPlayerList(int numberOfPlayers){
        for(int i = 0 ; i < numberOfPlayers ; i++){
            Player p = new Player(this, i+1,dividerToSkip);
            playerlist.add(p);
        }
    }

    public void startGame(){
        while(currentNumber<=playUntilThisNumber){
            System.out.println(playerlist.get(currentPlayer++%playerlist.size()).play());
        }
    }
}
