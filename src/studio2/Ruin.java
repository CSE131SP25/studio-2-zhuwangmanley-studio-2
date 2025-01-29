package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Start Amount:");
		Scanner in = new Scanner (System.in);
		int startAmount = in.nextInt();
		
		System.out.println ("Win Chance:");
		double winChance = in.nextDouble();
		
		System.out.println ("Win Limit:");
		double winLimit = in.nextDouble();
		
		System.out.println("Simulations:");
		int simulations = in.nextInt ();
		
		int gpd = 0;
		for (int u=0; u<simulations ; u++)
		{int i=startAmount;
		while (i>0 && i<winLimit){
			double odds =Math.random ();
			if (odds>winChance) 
			{i--;
				gpd++;
			}
			
			} 
			else 
			{i++; gpd++;
			
		}
			if (i<0)
			System.out.println("simulation" + u + ":" + gpd +"lose");
			if (i>winLimit)
				System.out.println("simulation" + u + ":" + gpd +"win");
		}
		
		
			
		
		
	}

}
