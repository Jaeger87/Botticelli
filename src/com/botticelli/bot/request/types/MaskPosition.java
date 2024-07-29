package com.botticelli.bot.request.types;

public class MaskPosition {

	private FacePart point;
	private float x_shift;
	private float y_shift;
	private float scale;
	
	
	public FacePart getPoint() 
	{
		return point;
	}
	
	public void setPoint(FacePart point) 
	{
		this.point = point;
	}
	
	public float getX_shift() 
	{
		return x_shift;
	}
	
	public void setX_shift(float x_shift) 
	{
		this.x_shift = x_shift;
	}
	
	public float getY_shift() 
	{
		return y_shift;
	}
	
	public void setY_shift(float y_shift) 
	{
		this.y_shift = y_shift;
	}
	
	public float getScale() 
	{
		return scale;
	}
	
	public void setScale(float scale) 
	{
		this.scale = scale;
	}
}
