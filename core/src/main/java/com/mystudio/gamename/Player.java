package com.mystudio.gamename;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.engine.geom.CollisionPoint;
import org.mini2Dx.core.graphics.Sprite;
import org.mini2Dx.core.graphics.Graphics;


import java.awt.*;

public  class Player extends Rectangle implements InputProcessor {
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
    @Override
    public boolean keyDown (int keycode) {
//        switch (keycode)
//        {
//            case Input.Keys.D:
//                setRightMove(true);
//                break;
//            case Input.Keys.A:
//                setLeftMove(true);
//                break;
//            case Input.Keys.W:
//            setUpMove(true);
//            break;
//            case Input.Keys.S:
//                setDownMove(true);
//                break;
//        }
        return true;
    }

    public boolean keyUp (int keycode) {
//        switch (keycode)
//        {
//            case Input.Keys.D:
//                setRightMove(false);
//                break;
//            case Input.Keys.A:
//                setLeftMove(false);
//                break;
//            case Input.Keys.W:
//                setUpMove(false);
//                break;
//            case Input.Keys.S:
//                setDownMove(false);
//                break;
//        }
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
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


//    public void Movement(){
//        if(leftMove == true){
//            point.x += 1;
//        }
//        if(leftMove == false) {
//            point.x += 0;
//        }
//        if(rightMove == true){
//            point.x -= 1;
//        }
//        if(rightMove == false){
//            point.x -= 0;
//        }
//        if(upMove == true){
//            point.y += 1;
//        }
//        if(upMove == false){
//            point.y += 0;
//        }
//        if(downMove == true){
//            point.y -= 1;
//        }
//        if(downMove == false){
//            point.y -= 0;
//        }
//
//
//    }


    public void update() {
        point.preUpdate();
        if(leftMove){ point.x += 1* Gdx.graphics.getDeltaTime(); }
        if(!leftMove) { point.x += 0* Gdx.graphics.getDeltaTime(); }
        if(rightMove){ point.x -= 1* Gdx.graphics.getDeltaTime(); }
        if(!rightMove){ point.x -= 0* Gdx.graphics.getDeltaTime(); }
        if(upMove){ point.y += 1* Gdx.graphics.getDeltaTime(); }
        if(!upMove){ point.y += 0* Gdx.graphics.getDeltaTime(); }
        if(downMove){ point.y -= 1* Gdx.graphics.getDeltaTime(); }
        if(!downMove){ point.y -= 0* Gdx.graphics.getDeltaTime(); }

    }

    public void interpolate(float alpha) {
        point.interpolate(null, alpha);

    }

    public void render(Graphics g) {
        g.drawSprite(sprite, point.getRenderX(), point.getRenderY());

    }


}
