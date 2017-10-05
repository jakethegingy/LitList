package lit.model;

public class Donut 
{
	//These are all of my variables    boolean is used if the question is (isSomething or hasSomething)
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int temperature;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.temperature = 100;
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor;
	}
	
	public String toString()
	{
		String description = "This donut is a " + flavor + " donut";
		
		return description;
	}
	
	public String getShape()
	{
		return shape;
	}
	
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
}
