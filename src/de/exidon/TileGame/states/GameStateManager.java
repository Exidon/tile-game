package de.exidon.TileGame.states;


import de.exidon.TileGame.GamePanel;
import de.exidon.TileGame.util.Vector2f;

import java.util.ArrayList;

/**
 * This Manager Manages all States of the Game
 * it handles all States
 */
public class GameStateManager {

    private ArrayList<GameState> states;

    public static Vector2f map;

    /**
     * Here are the States of the Game
     */
    public static final int PLAY = 1;
    public static final int MENU = 2;
    public static final int PAUSE = 3;
    public static final int GAMEOVER = 4;

    public GameStateManager(){
        map = new Vector2f(GamePanel.width, GamePanel.height); // this is our map with x and y
        Vector2f.setWorldVar(map.x, map.y);                    // this set our WorldVariables

        states = new ArrayList<GameState>();
        states.add(new PlayState(this));                         //this add at the beginning a new PlayState
    }

    /**
     * this adds an state to the states     // werden wir erst später brauchen. ist jetzt nur schonmal impl. (wir arbeiten nur am Playstate)
     * @param state is the actual state of the game.
     */
    public void add(int state){
        if(state == PLAY){
            states.add(new PlayState(this));
        }
        if(state == MENU){
            states.add(new MenuState(this));
        }
        if(state == PAUSE){
            states.add(new PauseState(this));
        }
        if(state == GAMEOVER){
            states.add(new GameOverState(this));
        }
    }

}
