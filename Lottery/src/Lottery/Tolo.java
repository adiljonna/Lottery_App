package Lottery;

import java.util.ArrayList;

public class Tolo {
	
	 private  String name;
	 protected RandNum randi = new RandNum (1,20,4);
	 protected RandNum randiSup = new RandNum (1,10,1);
	 protected ArrayList <Integer> randLotteryNum = randi.drawnNumList();
	//ArrayList <Integer> randLotteryNum = randi.chooseRanNum();
	 //protected int luckNumberDraw = randiSup.chooseRanNum().get(0);
	 protected int luckNumberDraw = randiSup.drawnNumList().get(0);
	 private Bet beti ;
	 private SuperBet superBeti;


	// constructor
	public Tolo (String name)
	
	{
		this.setName( name);
	
	};
	public Tolo ()
	
	{
	};
	
	//------- setters and getter------------
	public void setName(String name) {this.name = name;}
	public String getName(){return this.name;}
	
	
	
	public double getGain (int n1, int n2, int n3, int n4, int betMoney)
	
	{
		beti = new Bet (n1,n2, n3, n4, betMoney);
		
		return beti.computeGain();
	}
	
	public double getSuperGain (int n1, int n2, int n3, int n4,int lucykNum, int betMoney)
	
	{
		superBeti = new SuperBet (n1,n2, n3, n4, lucykNum, betMoney);
		
		return superBeti.computeGain();
	}

	
}
