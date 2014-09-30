package MindRoad;


/**
 * Created by robkr on 2014-09-15.
 */
public class main {
    /*
    Starting up the game.
    MindRoad.GameRules is taking two parameters: Number of players and the divider.
    StarGame launches the players to play "Burr".
     */
    public static void main(String[] args){
        StartGame game = new StartGame();
        game.start();
    }
}
