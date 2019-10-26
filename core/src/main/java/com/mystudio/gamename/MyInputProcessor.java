package com.mystudio.gamename;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public class MyInputProcessor implements InputProcessor {
    private Player player;

    public MyInputProcessor(Player player) {
        this.player = player;
    }


    public boolean keyDown (int keycode) {
        switch (keycode)
        {
            case Input.Keys.D:
                player.setRightMove(true);
                break;
            case Input.Keys.A:
                player.setLeftMove(true);
                break;
            case Input.Keys.W:
                player.setUpMove(true);
                break;
            case Input.Keys.S:
                player.setDownMove(true);
                break;
        }
        return true;
    }

    public boolean keyUp (int keycode) {
        switch (keycode)
        {
            case Input.Keys.D:
                player.setRightMove(false);
                break;
            case Input.Keys.A:
                player.setLeftMove(false);
                break;
            case Input.Keys.W:
                player.setUpMove(false);
                break;
            case Input.Keys.S:
                player.setDownMove(false);
                break;
        }
        return true;
    }

    public boolean keyTyped (char character) {
        return false;
    }

    public boolean touchDown (int x, int y, int pointer, int button) {
        return false;
    }

    public boolean touchUp (int x, int y, int pointer, int button) {
        return false;
    }

    public boolean touchDragged (int x, int y, int pointer) {
        return false;
    }

    public boolean mouseMoved (int x, int y) {
        return false;
    }

    public boolean scrolled (int amount) {
        return false;
    }
}

