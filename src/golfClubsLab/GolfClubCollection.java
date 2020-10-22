package golfClubsLab;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import golfClubsLab.GolfClub;

public class GolfClubCollection
{
	private ArrayList<GolfClub> theClubs;
	
	public GolfClubCollection()
	{
		this.theClubs = new ArrayList<GolfClub>();
	}
	
	public GolfClubCollection(String filename)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/golfClubsLab/" + filename));
			while(input.hasNext())
			{
				this.theClubs.add(new GolfClub(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}

	public void addGolfClub(GolfClub c)
	{
		this.theClubs.add(c);
	}

	public void addGolfClub(String colonDelimitedData)
	{
		this.theClubs.add(new GolfClub(colonDelimitedData));
	}
	
	public void clubChooser()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This function will return the club you should use based on desired distance.");
		System.out.println("Please enter the distance you would like to hit as an integer in yards: ");
		int input = keyboard.nextInt();
		for (int i = 0; i < this.theClubs.size()-1; i++)
		{
			if(input <= this.theClubs.get(i).getDistance())
			{
				System.out.println("You should use the '" + this.theClubs.get(i).getName() + "' which can hit up to " + this.theClubs.get(i).getDistance() + " yards");
				return;
			}
		}
	}
	
	public void display()
	{
		for(GolfClub c : this.theClubs)
		{
			c.display();
		}
	}
}