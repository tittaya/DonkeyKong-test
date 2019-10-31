package com.mystudio.gamename;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.graphics.Graphics;
import org.mini2Dx.core.graphics.Sprite;


public class DonkeyKongGame extends BasicGame  {
	public static final String GAME_IDENTIFIER = "com.mystudio.gamename";

	private Texture texture;
	private Sprite kongSprite, manSprite;
	private Texture kongGraphic, manGraphic;
	private Monkey Kong;
	private Man man;



	
	@Override
    public void initialise() {
        kongGraphic = new Texture("Monkey.png");
        kongSprite = new Sprite(kongGraphic);
        Kong = new Monkey(kongSprite);
        manGraphic = new Texture("man_run_right_ wiht_ham_down.png");
        manSprite = new Sprite(manGraphic);
        man = new Man(manSprite);


        MyInputProcessor inputProcessor = new MyInputProcessor(Kong, man);
        Gdx.input.setInputProcessor(inputProcessor);


    }
    
    @Override
    public void update(float delta) {
        Kong.update();
        man.update();
        Kong.monkeyMove();
        man.manMove();


    }
    
    @Override
    public void interpolate(float alpha) {
        Kong.interpolate(alpha);
        man.interpolate(alpha);
    }

    @Override
    public void render(Graphics g) {
        g.setBackgroundColor(Color.WHITE);
        Kong.render(g);
        man.render(g);

    }
}
