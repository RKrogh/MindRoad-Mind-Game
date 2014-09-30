package MindRoad;

/**
 * Created by robkr on 2014-09-30.
 */
public class StartGame {
    public static void start() {
        GameRules gr = new GameRules(3,5);
        gr.startGame();
    }
}
