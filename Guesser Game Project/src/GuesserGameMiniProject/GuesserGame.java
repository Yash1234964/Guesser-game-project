// Guesser Game mini project






package GuesserGameMiniProject;

import java.util.Scanner;

class Guesser{
	int n;
	
	int guessNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 1 and 10 inclusive\n");
		n=sc.nextInt();
		if(n<1 || n>10)
		{
			n=-1;
			
		}
		else {
			System.out.println("Number entered successfully");
		}
	
		return n;
	}
	
}
class Player{
	int n;
	
	int guessNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 1 and 10 inclusive");
		n=sc.nextInt();
		if(n<1 || n>10)
		{
			n=-1;
			System.out.println("player Disqualified for not following instructions");
		}
		else {
			System.out.println("Number entered successfully");
		}
		
		return n;
	}
	
}

class PlayGame{
	int n;
	void play() {
	
//	sc.close();
	if(n<0)
		System.out.println("Not enough player to play the game");
	else {
		
		
		System.out.println("Enter number of Players");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		
		int []p=new int[n];
		for(int i=0;i<n;i++) {
			Player a=new Player();
			System.out.println("Player "+(i+1)+" enter your number ");
			p[i]=a.guessNum();
			System.out.println("Player "+(i+1)+" entered "+p[i]+"\n\n");
		}
		System.out.println("All player entered successfully \n\n");
		boolean flag=true;
		Guesser g=new Guesser();
		System.out.println("\nGuesser enter the number\n");
		int g1=g.guessNum();
		
		
		if(g1==-1)
			System.out.println("\nMatch Terminated \n guesser did not follow instruction");
		else {
			for(int i=0;i<n;i++) {
				if(p[i]==g1)
				{
					flag=false;
					System.out.println("\nPlayer "+(i+1)+" won !!!!\n");
				}
			}
			if(flag) System.out.println("\n\nAll players lost \n Better luck next time\n\n");
		}
		
		
	}
	}
}


public class GuesserGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               PlayGame game=new PlayGame();
               game.play();
               
	}

}
