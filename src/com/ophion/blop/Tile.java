package com.ophion.blop;

import com.ophion.framework.Image;

public class Tile {
	//Sets the width and height of the tiles + instantiates some variables
	private int tileX, tileY, tileWidth = 40, tileHeight = 40, speedX, type;
	public Image tileImage;
	
	private Background bg = GameScreen.getBg1();
	
	public Tile (int x, int y, int typeInt){
		tileX = x*tileWidth;
		tileY = y*tileHeight;
		type = typeInt;
		
		if(type == 5){
			tileImage = GameScreen.tileCenter;
		} else if (type == 2){
			tileImage = GameScreen.tileFloor;
		} else if (type == 4){
			tileImage = GameScreen.tileLeft;
		} else if (type == 6){
			tileImage = GameScreen.tileRight;
		} else if (type == 8){
			tileImage = GameScreen.tileCeiling;
		}
	}
	
	public void update(){
		speedX = bg.speedX;
		tileX += speedX;
	}

	public int getTileX() {
		return tileX;
	}

	public void setTileX(int tileX) {
		this.tileX = tileX;
	}

	public int getTileY() {
		return tileY;
	}

	public void setTileY(int tileY) {
		this.tileY = tileY;
	}

	public int getTileWidth() {
		return tileWidth;
	}

	public void setTileWidth(int tileWidth) {
		this.tileWidth = tileWidth;
	}

	public int getTileHeight() {
		return tileHeight;
	}

	public void setTileHeight(int tileHeight) {
		this.tileHeight = tileHeight;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Image getTileImage() {
		return tileImage;
	}

	public void setTileImage(Image tileImage) {
		this.tileImage = tileImage;
	}	
}
