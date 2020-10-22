package golfClubsLab;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver
{
	public static void main(String[] args)
	{
		GolfClubCollection myGolfBag = new GolfClubCollection("input.dat");
		try
		{	
			myGolfBag.clubChooser();
		}
		catch(Exception e)
		{
			System.out.println("No Club Found");
		}
	}
}