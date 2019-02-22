package model;

public class heightDTO
{
	private int height_id;
	private String height;

	//height_idのセッターは
	public int getHeightId()
	{
		return this.height_id;
	}

	public String getHeight()
	{
		return this.height;
	}

	public void setHeight(String ht)
	{
		this.height = ht;
	}

}