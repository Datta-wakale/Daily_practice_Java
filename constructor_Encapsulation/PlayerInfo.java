package com.chetan.constructor_incapsulation;

import java.util.Scanner;

class Player {
	private String name;
	private int runs;
	private int balls;
	private int innings;
	private int timesOut;
	public Player(String name, int runs, int balls, int innings, int timesOut) {
		super();
		this.name = name;
		this.runs = runs;
		this.balls = balls;
		this.innings = innings;
		this.timesOut = timesOut;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public int getTimesOut() {
		return timesOut;
	}
	public void setTimesOut(int timesOut) {
		this.timesOut = timesOut;
	}
	public String calculateAvrage() {
		if(timesOut == 0) {
			return "Infinity";
		}
		double Average = (double)runs /timesOut;
		return String.format("%.2f", Average);
	}
	public double calculateStrikeRate() {
		if(balls == 0) {
			return 0.0;
		}
		double strikeRate = ((double) runs/balls)*100;
		return strikeRate;
	}
	public String performanceCategory() {
        double sr = calculateStrikeRate();
        if (sr >= 150)
            return "Explosive";
        else if (sr >= 100)
            return "Good";
        else
            return "Needs Improvement";
    }

	@Override
	public String toString() {
		return "Player Performance Summary : \n"+ 
	           " Player Name  :" + name + 
	           "\n Total Runs  :" + runs + 
	           "\n Balls Faced  :" + balls + 
	           "\n Innings=" + innings + 
	           "\n Times Out  :" + timesOut + 
				"\n Batting Avg  :"+calculateAvrage()+
				"\n Strike Rate  :"+String.format("%.2f",calculateStrikeRate())+
				"\n Performance  :"+ performanceCategory();
	}
	
}
public class PlayerInfo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int run = sc.nextInt();
        int ball = sc.nextInt();
        int innings = sc.nextInt();
        int timesOut = sc.nextInt();
        
        Player p1 = new Player(name, run, ball, innings, timesOut);
        
        System.out.println(p1);
        sc.close();
	}

}
