package Lottery;

import java.util.ArrayList;

public class Bet {
	
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	private int betmoney;
	private int betchecker;
	protected Tolo t = new Tolo ();
	
	
	
	public Bet(int n1,int n2,int n3,int n4,int betmoney){
		
		this. setNum1 ( n1);
		this. setNum2 ( n2);
		this. setNum3 ( n3);
		this. setNum4 ( n4);
		this. setBetMoney ( betmoney);
		this. setBetChecker ( betchecker);
		
	}
	
	// -------------- setter and getter --------------
	public void setNum1 (int n1){
		this.n1 = n1;
	}

	public int getNum1 (){
		return n1;
	}

	public void setNum2 (int n2){
		this.n2 = n2;
	}

	public int getNum2 (){
		return n2;
	}
	
	public void setNum3 (int n3){
		this.n3 = n3;
	}

	public int getNum3 (){
		return n3;
	}
	
	public void setNum4 (int n4){
		this.n4 = n4;
	}

	public int getNum4 (){
		return n4;
	}
	
	public void setBetMoney (int betmoney){
		this.betmoney = betmoney;
	}

	public int getbetmoney (){
		return betmoney;
	}
	
	public void setBetChecker (int betchecker){
		this.betchecker = betchecker;
	}

	public int getBetChecker (){
		return betchecker;
	}
	

	//---------------end------

	public int betCheck()
	{
		this.setBetChecker(0);
		ArrayList <Integer> selectedNum = new ArrayList<Integer> ();
		selectedNum.add(this.getNum1());
		selectedNum.add(this.getNum2());
		selectedNum.add(this.getNum3());
		selectedNum.add(this.getNum4());
		ArrayList <Integer> randLotteryNum = t.randLotteryNum;
		for (int k:selectedNum)
		{
			if (randLotteryNum.contains(k))
			{
				betchecker+=1;
			
			}
		}
	
		return this.getBetChecker();
		
	}
	
	public double computeGain()
	{
		int betk = this.betCheck();
		if ( betk == 3){
		   this.setBetMoney( 5*this.getbetmoney());
			return this.getbetmoney();	
		}
		else if (betk== 4){
			this.setBetMoney( 50*this.getbetmoney());
			return this.getbetmoney();	
		}
		else {
		return 0;
		}
	}
}





	
	
	



