package de.exidon.TileGame.states;

import java.awt.*;

public class PlayState extends GameState{
    public PlayState(GameStateManager gsm) {
        super(gsm);



        // Hier kommt der ganze scheiß rein der während des Spiels passiert.
        // Die Graphiken, der SPieler wird erzeugt, alles was initialisiert werden muss im im PlayState
        // Nachdem der render aber noch nicht geschrieben ist, müssen wir noch ein wenig tricksen ^^
        // als nächsten würde ich mit der Map anfangen,
        // wenn du möchtetst kannst du dich gerne mal einlesen, ich hab so weit alles kommentiert. ich hoffe das reicht dir
        // um die essenziellen sachen zu verstehen. sonst bin ich natürlich da.


    }

    @Override
    public void update() {

    }

    @Override
    public void input() {

    }

    @Override
    public void render(Graphics2D g) {

    }
}
