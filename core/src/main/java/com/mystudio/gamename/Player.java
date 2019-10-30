package com.mystudio.gamename;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.engine.geom.CollisionPoint;
import org.mini2Dx.core.graphics.Sprite;
import org.mini2Dx.core.graphics.Graphics;


import java.awt.*;

public  class Player extends Rectangle {
    private boolean leftMove;
    private boolean rightMove;
    private boolean upMove;
    private boolean downMove;
    private CollisionPoint point;
    private  Sprite sprite;

    public Player(Sprite sprite){
        point = new CollisionPoint();
        this.sprite = sprite;
        point.x = 0;
        point.y = 0;
    }


    public void setLeftMove(boolean t) {
        leftMove = t;
    }

    public void setRightMove(boolean t) {
        rightMove = t;
    }

    public void setUpMove(boolean t) {
        upMove = t;
    }

    public void setDownMove(boolean t) {
        downMove = t;
    }


    public void movement(){
        if(leftMove){
            point.set(point.getX() - 4f, point.getY());
        }
        if(!leftMove) {
            point.set(point.getX() , point.getY());
        }
        if(rightMove){
            point.set(point.getX() + 4f, point.getY());
        }
        if(!rightMove){
            point.set(point.getX() , point.getY());
        }
        if(upMove){
            point.set(point.getX() , point.getY() - 4f);
        }
        if(!upMove){
            point.set(point.getX() , point.getY());
        }
        if(downMove){
            point.set(point.getX() , point.getY() + 4f);
        }
        if(!downMove){
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
