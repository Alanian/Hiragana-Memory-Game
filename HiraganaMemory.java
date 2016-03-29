package com.anime_sekai;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HiraganaMemory extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture backgroundImage;
	
	private Random random = new Random(); 
	private MemoryCard[] cards;

	@Override
	public void create() {
		batch = new SpriteBatch();
		backgroundImage = new Texture("background.png");
		
		cards = new MemoryCard[20];
		cards[0] = new MemoryCard(40,460, "tiles/chi-hiragana.png");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(backgroundImage, 0, 0);
		batch.draw(cards[0].getTexture(), cards[0].getPositionX(), cards[0].getPositionY());
		batch.end();
	}
	
	public void fillPositions(){
		cards[0] = new MemoryCard(Ressources.positionsX[0], Ressources.positionsX[0], Ressources.hiragana_tiles[random.nextInt(5)]);
	}
}
