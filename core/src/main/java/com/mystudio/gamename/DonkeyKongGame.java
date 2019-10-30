package com.mystudio.gamename;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.game.ApplicationListener;
import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;


public class DonkeyKongGame extends BasicGame  {
	public static final String GAME_IDENTIFIER = "com.mystudio.gamename";

	private Texture texture;
	private Sprite sprite;
	private Texture graphic;
	private  Player Kong;


	
	@Override
    public void initialise() {
       graphic = new Texture("Kong1.png");
        sprite = new Sprite(graphic);
        Kong = new Player(sprite);
        MyInputProcessor inputProcessor = new MyInputProcessor(Kong);
        Gdx.input.setInputProcessor(inputProcessor);


    }
    
    @Override
    public void update(float delta) {
        Kong.update();
        Kong.Movement();

    }
    
    @Override
    public void interpolate(float alpha) {
        Kong.interpolate(alpha);
    }

    @Override
    public void render(Graphics g) {
        g.setBackgroundColor(Color.WHITE);
        g.drawSprite(sprite);
        Kong.render(g);

    }
}
