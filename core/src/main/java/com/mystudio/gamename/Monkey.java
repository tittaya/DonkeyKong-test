package com.mystudio.gamename;

import org.mini2Dx.core.engine.geom.CollisionPoint;
import org.mini2Dx.core.graphics.Sprite;
import org.mini2Dx.core.graphics.Graphics;
import java.awt.*;

public  class Monkey extends Rectangle {
    private boolean A_Pressed;
    private boolean D_Pressed;
    private boolean W_Pressed;
    private boolean S_Pressed;
    private CollisionPoint point;
    private  Sprite sprite;

    public Monkey(Sprite sprite){
        point = new CollisionPoint();
        this.sprite = sprite;
//        point.x = 0;
//        point.y = 0;
        point.set(0,0);
    }


    public void setA_Pressed(boolean t) {
        A_Pressed = t;
    }

    public void setD_Pressed(boolean t) {
        D_Pressed = t;
    }

    public void setW_Pressed(boolean t) {
        W_Pressed = t;
    }

    public void setS_Pressed(boolean t) {
        S_Pressed = t;
    }


    public void monkeyMove(){
        if(A_Pressed){
            point.set(point.getX() - 5f, point.getY());
        }
        if(!A_Pressed) {
            point.set(point.getX() , point.getY());
        }
        if(D_Pressed){
            point.set(point.getX() + 5f, point.getY());
        }
        if(!D_Pressed){
            point.set(point.getX() , point.getY());
        }
        if(W_Pressed){
            point.set(point.getX() , point.getY() - 5f);
        }
        if(!W_Pressed){
            point.set(point.getX() , point.getY());
        }
        if(S_Pressed){
            point.set(point.getX() , point.getY() + 5f);
        }
        if(!S_Pressed){
            point.set(point.getX() , point.getY());
        }
    }


    public void update() {
        point.preUpdate();
    }

    public void interpolate(float alpha) {
        point.interpolate(null, alpha);

    }

    public void render(Graphics g) {
        g.drawSprite(sprite, point.getRenderX(), point.getRenderY());
    }


}
