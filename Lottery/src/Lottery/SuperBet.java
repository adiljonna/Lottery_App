package Lottery;


public class SuperBet extends Bet {
	
	private int luckyNum;
	
	
	public SuperBet(int n1, int n2, int n3, int n4,int lucykNum , int betmoney) {
		super(n1, n2, n3, n4, betmoney);
		super.computeGain();
		this.setLuckNum(lucykNum);
		// TODO Auto-generated constructor stub
	}
	
	// -------------- setter and getter --------------
		public void setLuckNum (int luckyNum){
			this.luckyNum = luckyNum;
		}

		public int getLuckNum (){
			return luckyNum;
		}
	//................... end.......................
		
		public Boolean betSuperCheck()
		{
			 
			int betSuperK = super.betCheck();
			if ((betSuperK==3 || betSuperK ==4)    )
			{
			return true;
			}
			return false;
			}
		
		
		@Override
		public double computeGain()
		{	
			if (this.betSuperCheck())
			{
			
				if (this.getLuckNum() == t.luckNumberDraw){
			
				return super.getbetmoney() * 5;
			}
			else {
				return super.getbetmoney()/2;
			}
			} else return 0.0;
		}
}
