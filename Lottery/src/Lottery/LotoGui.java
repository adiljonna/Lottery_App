package Lottery;

public class LotoGui {

	public LotoGui () {
		
		Tolo newLottery1 = new Tolo("Paris Loto"); 
		LotoFrame myLoto = new LotoFrame (newLottery1);
		myLoto.setLayout(null);
		myLoto.initialize();
		myLoto.setSize(600, 320);
		myLoto.setVisible(true);
		myLoto.setResizable(false);
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LotoGui window = new LotoGui () ;
	
	}
	
	



}
