package Lottery;

public class LotoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int firstNum = 1;
		int secondNum = 7;
		int thirdNum = 13;
		int fourthNum = 19;
		int amountbet = 50;
		int luckNum = 5;
		
		Tolo newLottery = new Tolo("Paris Lottery"); 
		RandNum rand4 = new RandNum(1,20,4);
		RandNum rand1 = new RandNum(1,10,1);
		//System.out.println(rand4.drawnNumList());
		//System.out.println(rand1.drawnNumList());
		System.out.println(rand4.chooseRanNum());
		System.out.println(rand1.chooseRanNum());
		
		System.out.println("amountWin:" + newLottery.getGain(firstNum,secondNum,thirdNum, fourthNum, amountbet ));
		System.out.println("SuperamountWin:" + newLottery.getSuperGain(firstNum,secondNum,thirdNum, fourthNum,luckNum, amountbet ));
	}

}
