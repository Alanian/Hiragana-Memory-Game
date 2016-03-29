package com.anime_sekai;

import com.badlogic.gdx.graphics.Texture;

public class MemoryCard {
	private TilePosition position;
	private Texture image;
	
	MemoryCard(int positionX, int positionY, String imagePath){
		this.position = new TilePosition(positionX, positionY);
		this.image = new Texture(imagePath);
	}
	
	public int getPositionX() {
		return this.position.getPositionX();
	}

	public int getPositionY() {
		return this.position.getPositionY();
	}
	
	public Texture getTexture() {
		return this.image;
	}
}
