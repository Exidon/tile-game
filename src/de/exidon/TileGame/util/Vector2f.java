package de.exidon.TileGame.util;


/**
 * This function can calculate all Vectors in this World
 */
public class Vector2f {

    public float x;
    public float y;

    public static float worldX;     // World Variable X
    public static float worldY;     // World Variable Y

    public Vector2f() {
        x = 0;
        y = 0;
    }

    public Vector2f(Vector2f pos) {
        new Vector2f(pos.x, pos.y);
    }

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // VECTORS
    public void setVector(Vector2f vec){
        this.x = vec.x;
        this.y = vec.y;
    }
    public void setVector(float x, float y){
        this.x = x;
        this.x = y;
    }

    //X AND Y
    public void setX(float f) {
        x = f;
    }

    public void setY(float f) {
        y = f;
    }


    public void addX(float f) {
        x += f;
    }

    public void addY(float f) {
        y += f;
    }

    //WORLD VARIABLES
    public static void setWorldVar(float x, float y) {
        worldX = x;
        worldY = y;
    }

    public Vector2f getWorldVar() {
        return new Vector2f(x - worldX, y - worldY);
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
