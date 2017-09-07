package de.exidon.TileGame.states;

import java.awt.*;

public abstract class GameState {

    private GameStateManager gsm;

    public GameState(GameStateManager gsm) {
        this.gsm = gsm;
    }

    public abstract void update();
    public abstract void input();       //mouse and Key Handler is coming soon
    public abstract void render(Graphics2D g);

}
