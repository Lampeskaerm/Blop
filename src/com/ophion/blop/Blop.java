package com.ophion.blop;

import android.graphics.Point;

public class Blop{
	Point pos = new Point();
	final int JUMPSPEED = -15;
	final int MOVESPEED = 5;
	
	private final Point startPos = new Point(200,600);
	private String name;
	private boolean isJumping = false;
	private boolean isMovingLeft = false;
	private boolean isMovingRight = false;
	
	private int speedX = 0;
	private int speedY = 0;
	private int maxX = 1000;
	private int minX = 200;
	
	public void update(){
		if(pos.x >= maxX && speedX > 0) {
			GameScreen.setBackgroundSpeed(speedX);
		} else if(pos.x <= minX && speedX < 0) { 
			speedX = 0;
		} else {
			pos.x += speedX;
			GameScreen.setBackgroundSpeed(0);
		}
	}
	
	public void moveRight(){
		speedX = MOVESPEED;
		setMovingRight(true);
	}
	
	public void moveLeft(){
		speedX = (-MOVESPEED);
		setMovingLeft(true);
	}
	
	public void stopRight(){
		setMovingRight(false);
		stop();
	}
	
	public void stopLeft(){
		setMovingLeft(false);
		stop();
	}

	private void stop() {
		if(!isMovingLeft() && !isMovingRight()){
			speedX = 0;
		} else if(!isMovingLeft()&& isMovingRight()){
			moveRight();
		} else if(isMovingLeft() && !isMovingRight()){
			moveLeft();
		}
	}
	
	public void jump(){
		if(!isJumping){
			setSpeedY(JUMPSPEED);
			setJumping(true);
		}
	}
	
	public Point getPos(){
		return pos;
	}
	
	public void setPos(Point pos){
		this.pos = pos;
	}
	
	public Point getStartPos() {
		return startPos;
	}
	
	public void setInitPos(){
		this.pos = startPos;
	}

	public boolean isJumping() {
		return isJumping;
	}

	public void setJumping(boolean isJumping) {
		this.isJumping = isJumping;
	}

	public boolean isMovingLeft() {
		return isMovingLeft;
	}

	public void setMovingLeft(boolean isMovingLeft) {
		this.isMovingLeft = isMovingLeft;
	}

	public boolean isMovingRight() {
		return isMovingRight;
	}

	public void setMovingRight(boolean isMovingRight) {
		this.isMovingRight = isMovingRight;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	
	public int getSpeedX(){
		return speedX;
	}
	
	public void setSpeedX(int speedX){
		this.speedX = speedX;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
