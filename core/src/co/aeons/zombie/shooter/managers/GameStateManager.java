package co.aeons.zombie.shooter.managers;

import co.aeons.zombie.shooter.gamestates.GameOverState;
import co.aeons.zombie.shooter.gamestates.GameState;
import co.aeons.zombie.shooter.gamestates.HighscoreState;
import co.aeons.zombie.shooter.gamestates.MenuState;
import co.aeons.zombie.shooter.gamestates.PlayState;
import co.aeons.zombie.shooter.gamestates.SplashState;

public class GameStateManager {

    // current game state
    private GameState gameState;

    public static final int MENU = 0;
    public static final int PLAY = 893746;
    public static final int HIGHSCORE = 3847;
    public static final int GAMEOVER = 928478;
    public static final int SPLASH = 3465283;

    public GameStateManager() {
        setState(SPLASH);
    }

    public void setState(int state) {
        if (gameState != null) gameState.dispose();
        if (state == SPLASH) {
            gameState = new SplashState(this);
        }
        if (state == MENU) {
            gameState = new MenuState(this);
        }
        if (state == PLAY) {
            gameState = new PlayState(this);
        }
        if (state == HIGHSCORE) {
            gameState = new HighscoreState(this);
        }
        if (state == GAMEOVER) {
            gameState = new GameOverState(this);
        }
    }

    public void update(float dt) {
        gameState.update(dt);
    }

    public void draw() {
        gameState.draw();
    }

}











