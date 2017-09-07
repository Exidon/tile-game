package de.exidon.TileGame.graphics;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Sprite {

    public BufferedImage SPRITESHEET = null;    // The Spritesheet loader
    private BufferedImage[][] spriteArray;      // The Array for the Sprites
    private final int TILE_SIZE = 32;   // The pixel of one tile
    public int w;                       // The pixel of one tile in width
    public int h;                       // The pixel of one tile in height
    private int wSprite;                // the number of sprites in width
    private int hSprite;                // the number of sprites in height

    //CONSTRUCTOR

    /**
     * This class cuts a Spritesheet in Sprites
     *
     * @param file is the path of the Spritesheet
     */
    public Sprite(String file) {
        w = TILE_SIZE;
        h = TILE_SIZE;

        System.out.println("loading " + file + "...");
        SPRITESHEET = loadSprite(file);     // loading the file in the SPRITESHEET

        wSprite = SPRITESHEET.getWidth() / w;   // calculating how much sprites are in one line
        hSprite = SPRITESHEET.getHeight() / h;  // calculating how much sprites are in one column

        loadSpriteArray();      // fill the array with our sprites
    }

    /**
     * load the SpriteArray and take the Sprites in an Array
     */
    private void loadSpriteArray() {
        spriteArray = new BufferedImage[hSprite][wSprite]; // take size of our spriteArray

        for (int y = 0; y < hSprite; y++) {
            for (int x = 0; x < wSprite; x++) {
                spriteArray[y][x] = getSprite(x, y); // take the Sprite in the Array
            }
        }
    }

    /**
     * load the Spritesheet
     *
     * @param file is the path of the Spritesheet
     * @return
     */
    private BufferedImage loadSprite(String file) {
        BufferedImage sprite = null;
        try {
            sprite = ImageIO.read(getClass().getClassLoader().getResourceAsStream(file));
        } catch (Exception e) {
            System.out.println("ERROR: could not load " + file);
        }
        return sprite;
    }

    /**
     * return one Sprite
     *
     * @param x the pixel for cutting at the width
     * @param y the pixel for cutting at the height;
     * @return get the Sprite at position (X, Y)
     */
    public BufferedImage getSprite(int x, int y) {
        return SPRITESHEET.getSubimage(x * w, y * h, w, h);     // return one Sprite
    }

    /**
     * @param i the number of the Sprite
     * @return the Sprite at i
     */
    public BufferedImage[] getSpriteArray(int i) {
        return spriteArray[i];
    }


}
