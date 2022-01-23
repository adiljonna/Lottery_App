package Lottery;

import java.util.ArrayList;
import java.util.Random;

public class RandNum {
	
	private int limit1;
	private int limit2;
	private int drawNum;
	
	
	public RandNum(int limit1, int limit2,int drawNum){
		
		this.setLimit1 (limit1);
		this.setLimit2( limit2);
		this.setDrawNum(drawNum);
		
	}
	
	// -------------- setter and getter --------------
	public void setLimit1 (int limit1){
		this.limit1 = limit1;
	}

	public int getLimit1 (){
		return limit1;
	}

	public void setLimit2 (int limit2){
		this.limit2 = limit2;
	}

	public int getLimit2 (){
		return limit2;
	}
	
	public void setDrawNum(int drawNum){
		this.drawNum = drawNum;
	}

	public int getDrawNum (){
		return drawNum;
	}

	

	
	

	//---------------end------

	
	// method for generating integer arraylist in between two limits 
	private ArrayList<Integer> numberList ()
	{
		
		ArrayList <Integer> poolNum = new ArrayList <Integer>();
		
		for (int i = this.getLimit1(); i<=this.getLimit2(); i++)
		{ 
			
			poolNum.add(i);
		}
	
		return poolNum;
		
	}
	
	// method for generating random number one, four or any number in between given limits
	public ArrayList<Integer> drawnNumList () 
	{
		Random randLotScore = new Random();
		ArrayList <Integer> randLotNum = new ArrayList <Integer>();
		ArrayList<Integer> poolNum  =   this.numberList ();
		int randNum;
		
		for(int j =1; j<=this.getDrawNum(); j++ )
		{
			randNum = randLotScore.nextInt(poolNum.size());
			randLotNum.add(poolNum.get(randNum));
			poolNum.remove(randNum);
		}
		
		return randLotNum;
	}
	

	
	//method for testing. Select num of your own choice 
	public ArrayList<Integer> chooseRanNum () 
	{
		ArrayList <Integer> cheatLotNum = new ArrayList <Integer>();
		
		if (this.getDrawNum() ==4)
		{
		cheatLotNum.add(1);
		cheatLotNum.add(7);
		cheatLotNum.add(13);
		cheatLotNum.add(19);
		
		} 
		else if (this.getDrawNum() ==1)
		{
			cheatLotNum.add(5);	
		}
		
		return cheatLotNum;
	}
}
