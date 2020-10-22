package golfClubsLab;
import java.util.Scanner;

public class GolfClub
{
	private String name;
	private int distance;
	
	public GolfClub(String name, int distance)
	{
		this.name = name;
		this.distance = distance;
	}
	
	public GolfClub(String s)
	{
		String[] parts = s.split(":");
		this.name = parts[0];
		this.distance = Integer.parseInt(parts[1]);
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getDistance()
	{
		return distance;
	}

	public void setDistance(int distance)
	{
		this.distance = distance;
	}
	
	public void display()
	{
		System.out.println(this.name + ": can hit up to " + this.distance + " yards");
	}
}