package Lottery;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LotoDisplay extends JFrame  {

	private LotoFrame  myLotoFrame;
	
	public LotoDisplay(LotoFrame  myLotoFrame) {
	
		this.myLotoFrame = myLotoFrame;
		// TODO Auto-generated constructor stub
	}

	
	
	public void dispInitialize (){
		this.setTitle("Tolo Bet Result  " );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.CYAN);
		
		
		JLabel myLabel = new JLabel("Result For Last Draw  of     " +  myLotoFrame.newLottery1.getName());
		this.getContentPane().add(myLabel);
		myLabel.setFont(new Font("Verdana", Font.HANGING_BASELINE, 20));
		myLabel.setForeground(Color.MAGENTA);
		myLabel.setVerticalAlignment(SwingConstants.TOP);
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
		myLabel.setBounds(90, 0, 400, 25);
		
		JLabel myLabel1 = new JLabel("Your Choosen Numbers ");
		myLabel1.setFont(new Font("Verdana", Font.ITALIC, 15));
		this.add(myLabel1);
		myLabel1.setBounds(50, 80, 200, 15);
		myLabel1.setForeground(Color.black);
		
		
		
		JLabel myLabel3 = new JLabel(myLotoFrame.textField.getText());
		myLabel3.setFont(new Font("Verdana", Font.ITALIC, 15));
		this.add(myLabel3);
		myLabel3.setBounds(30,110,40,20);
		myLabel3.setForeground(Color.red);
		
		JLabel myLabel4 = new JLabel(myLotoFrame.textField1.getText());
		myLabel4.setFont(new Font("Verdana", Font.ITALIC, 15));
		this.add(myLabel4);
		myLabel4.setBounds(85,110,40,20);
		myLabel4.setForeground(Color.red);
		
		JLabel myLabel5 = new JLabel(myLotoFrame.textField2.getText());
		myLabel5.setFont(new Font("Verdana", Font.ITALIC, 15));
		this.add(myLabel5);
		myLabel5.setBounds(140,110,40,20);
		myLabel5.setForeground(Color.red);
		
		JLabel myLabel6 = new JLabel(myLotoFrame.textField3.getText());
		myLabel6.setFont(new Font("Verdana", Font.ITALIC, 15));
		this.add(myLabel6);
		myLabel6.setBounds(195,110,40,20);
		myLabel6.setForeground(Color.red);
		
		if (myLotoFrame.checkBox.isSelected())
		{
			JLabel myLabel2 = new JLabel("Your Lucky Number ");
			myLabel2.setFont(new Font("Verdana", Font.ITALIC, 15));
			this.add(myLabel2);
			myLabel2.setBounds(350, 80, 200, 15);
			myLabel2.setForeground(Color.black);
			
			
		JLabel myLabel7 = new JLabel(myLotoFrame.textField4.getText());
		myLabel7.setFont(new Font("Verdana", Font.ITALIC, 15));
		this.add(myLabel7);
		myLabel7.setBounds(395,110,40,20);
		myLabel7.setForeground(Color.red);
		
		int luckCheck = myLotoFrame.newLottery1.luckNumberDraw;
		 
		  
		  JLabel myLabel13 = new JLabel(String.valueOf(luckCheck));
			myLabel13.setFont(new Font("Verdana", Font.BOLD, 15));
			this.add(myLabel13);
			myLabel13.setBounds(395,180,40,20);
			myLabel13.setForeground(Color.MAGENTA);	
		}
		
		JLabel myLabel8 = new JLabel("Tolo Drawn Numbers ");
		myLabel8.setFont(new Font("Verdana", Font.BOLD, 15));
		this.add(myLabel8);
		myLabel8.setBounds(50, 150, 200, 15);
		myLabel8.setForeground(Color.black);
	
		ArrayList <Integer> getRandNum = myLotoFrame.newLottery1.randLotteryNum;
		
		
		
		JLabel myLabel9 = new JLabel(getRandNum.get(0).toString());
		myLabel9.setFont(new Font("Verdana", Font.BOLD, 15));
		this.add(myLabel9);
		myLabel9.setBounds(30,180,40,20);
		myLabel9.setForeground(Color.MAGENTA);
		
		JLabel myLabel10 = new JLabel(getRandNum.get(1).toString());
		myLabel10.setFont(new Font("Verdana", Font.BOLD, 15));
		this.add(myLabel10);
		myLabel10.setBounds(85,180,40,20);
		myLabel10.setForeground(Color.MAGENTA);
		
		JLabel myLabel11 = new JLabel(getRandNum.get(2).toString());
		myLabel11.setFont(new Font("Verdana", Font.BOLD, 15));
		this.add(myLabel11);
		myLabel11.setBounds(140,180,40,20);
		myLabel11.setForeground(Color.MAGENTA);
		
		JLabel myLabel12 = new JLabel(getRandNum.get(3).toString());
		myLabel12.setFont(new Font("Verdana", Font.BOLD, 15));
		this.add(myLabel12);
		myLabel12.setBounds(195,180,40,20);
		myLabel12.setForeground(Color.MAGENTA);
		
		
		
		
		JLabel myLabel14 = new JLabel("You Win = " + String.valueOf(myLotoFrame.gain)+"€");
		myLabel14.setFont(new Font("Verdana", Font.ITALIC, 15));
		this.add(myLabel14);
		myLabel14.setBounds(230,230,250, 15);
		myLabel14.setForeground(Color.red);
		
	}
}
