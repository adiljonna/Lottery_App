package Lottery;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LotoFrame extends JFrame implements ActionListener, KeyListener {
    
	protected Tolo newLottery1  ;
	protected JTextField textField;
	protected JTextField textField1;
	protected JTextField textField2;
	protected JTextField textField3;
	protected JTextField textField4;
	protected JTextField textField5;
	protected JCheckBox checkBox;
	private JButton firstButtton;
	private ArrayList <Integer> storeInt = new ArrayList <Integer> ();
	protected double gain;
	
	
	 public LotoFrame (Tolo newLottery1){
		
		this.newLottery1 = newLottery1;
		
		
		
	}
	 // frame settings
		public void initialize (){
			
			this.setTitle("Tolo Bet  " );
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.getContentPane().setBackground(Color.CYAN);
			
			
			JLabel myLabel = new JLabel("Welcome to Tolo Bet       " +   newLottery1.getName());
			this.getContentPane().add(myLabel);
			myLabel.setFont(new Font("Verdana", Font.HANGING_BASELINE, 20));
			myLabel.setForeground(Color.MAGENTA);
			myLabel.setVerticalAlignment(SwingConstants.TOP);
			myLabel.setHorizontalAlignment(SwingConstants.CENTER);
			myLabel.setBounds(90, 0, 400, 25);
			
		
		
			
			JLabel myLabel1 = new JLabel("Choose Your Numbers ");
			myLabel1.setFont(new Font("Verdana", Font.ITALIC, 15));
			this.add(myLabel1);
			myLabel1.setBounds(50, 80, 200, 15);
			myLabel1.setForeground(Color.black);
			
			JLabel myLabel2 = new JLabel("Extra Number For Super Bet ");
			myLabel2.setFont(new Font("Verdana", Font.BOLD, 13));
			this.add(myLabel2);
			myLabel2.setBounds(330, 80, 250, 15);
			myLabel2.setForeground(Color.black);
			
			textField = new JTextField();
			textField.setBounds(30,110,40,20);
			this.add(textField);
			//storeInt.add(Integer.parseInt(textField.getText()));
			textField.addKeyListener(this);
			
			textField1 = new JTextField();
			textField1.setBounds(85,110,40,20);
			this.add(textField1);
			textField1.addKeyListener(this);
			
			textField2 = new JTextField();
			textField2.setBounds(140,110,40,20);
			this.add(textField2);
			textField2.addKeyListener(this);
			
			textField3 = new JTextField();
			textField3.setBounds(195,110,40,20);
			this.add(textField3);
			textField3.addKeyListener(this);
			
			
			textField4 = new JTextField(); 
			textField4.setBounds(395,110,40,20);
			this.add(textField4);
			textField4.setEditable(false);
			
			textField4.addKeyListener(this);
			
			 checkBox = new JCheckBox();
			checkBox.setBounds(30,160,20,20);
			checkBox.setBackground(Color.red);
			this.add(checkBox);
			checkBox.addActionListener(this);
			
			JLabel myLabel3 = new JLabel("Super Bet ");
			myLabel3.setFont(new Font("Verdana", Font.BOLD, 13));
			this.add(myLabel3);
			myLabel3.setBounds(55,163,250, 15);
			myLabel3.setForeground(Color.black);
			
		
			JLabel myLabel4 = new JLabel("Bet  = ");
			myLabel4.setFont(new Font("Verdana", Font.ITALIC, 15));
			this.add(myLabel4);
			myLabel4.setBounds(35,203,250, 15);
			myLabel4.setForeground(Color.black);
			
			
			textField5 = new JTextField();
			textField5.setBounds(95,203,70,20);
			this.add(textField5);
			textField5.addKeyListener(this);
			
			
			JLabel myLabel5 = new JLabel("€");
			myLabel5.setFont(new Font("Verdana", Font.ITALIC, 15));
			this.add(myLabel5);
			myLabel5.setBounds(175,203,250, 15);
			myLabel5.setForeground(Color.black);
			
			
			firstButtton = new JButton ();
			firstButtton.setBounds(375,233,100, 25);
			firstButtton.addActionListener(this);
			firstButtton.setText("Draw Tolo");
			firstButtton.setFocusable(false);
			firstButtton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
			this.add(firstButtton);
		
			
			
		
			
			
			
		}
		
		
		
		// to check if entered numbeer are not equal
		public void checkEqual (ArrayList<Integer> s, int n)
		{
			if (!s.contains(n))
			{s.add(n);}
			else{
				JOptionPane.showMessageDialog(null, "Please enter un equal  numbers ",
						"Error Message", JOptionPane.ERROR_MESSAGE);
			}
			
		}
	
		// to check if selected number are not in betweenn 1 and 20 inclusive
		public boolean checkInput (ArrayList<Integer> s)
	{
		int checkIn = 0;
		
			for (int a: s){
				
		if  (!( a>=1 && a<=20 ))
		{
			JOptionPane.showMessageDialog(null, "Please enter valid number in between 1  and 20 ", "Error Message", JOptionPane.ERROR_MESSAGE);
			checkIn += 1;
		}
		}
			
			if (checkIn ==0)
			{
			return true;}
			return false;
	}
	
		// to check if text fields are not empty and converting them into integer
	public boolean checkAll()
	{
		if (textField.getText().isEmpty() || textField1.getText().isEmpty()  ||
				textField2.getText().isEmpty() || textField3.getText().isEmpty() 	)
		{
			JOptionPane.showMessageDialog(null, "Please enter all  numbers ",
					"Error Message", JOptionPane.ERROR_MESSAGE);
		}else {
			
		checkEqual(storeInt,Integer.parseInt(textField.getText()));
		checkEqual(storeInt,Integer.parseInt(textField1.getText()));
		checkEqual(storeInt,Integer.parseInt(textField2.getText()));
		checkEqual(storeInt,Integer.parseInt(textField3.getText()));
		if (checkInput(storeInt))
		{
			
		
		return true;
		}
		}
		return false;
	}
	
	// to check bet amount is not empty and grater than zero
	public boolean betCalc()
	{
		storeInt.clear();
		
		if (this.checkAll() && storeInt.size() ==4 )
			
		{
			System.out.println("here"+storeInt);
			
			if (!textField5.getText().isEmpty() && Integer.parseInt(textField5.getText())>0)
			{
			return true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Please enter valid bet amount ");
				return false;
			}
		}
		return false;
	}
	
	// to check valid lucky number  
	public boolean checkLuckInput (int s)
	{
		
				
		if  (!( s>=1 && s<=10 ))
		{
			JOptionPane.showMessageDialog(null, "Please enter valid number in between 1  and 10 ", "Error Message", JOptionPane.ERROR_MESSAGE);
		return false;
		}
		
			return true;
	}
	// display result frame
	public void dispLotoDisplay ()
	{
		LotoDisplay myLoto1 = new LotoDisplay (this);
		myLoto1.setLayout(null);
		myLoto1.dispInitialize();
		myLoto1.setSize(600, 320);
		myLoto1.setVisible(true);
		myLoto1.setResizable(false);		
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		//for super bet
		if (!checkBox.isSelected())
		{
			textField4.setEditable(false);
		}
				
		if (checkBox.isSelected())
		{
			textField4.setEditable(true);
				
			if (e.getSource()== firstButtton )
			{	storeInt.clear();
			if (!textField4.getText().isEmpty())
			{
				if (this.betCalc() && checkLuckInput(Integer.parseInt(textField4.getText())))
				{
					 gain = newLottery1.getSuperGain(storeInt.get(0), storeInt.get(1), storeInt.get(2),
							storeInt.get(3), Integer.parseInt(textField4.getText()) ,Integer.parseInt(textField5.getText()));
					System.out.println(gain);
					this.dispose();
					this.dispLotoDisplay();
				}
			
		}
			else {
				JOptionPane.showMessageDialog(null, "Please enter luck number ");
			}
		}
			
		}
		
		// for simple bet
		if (e.getSource()== firstButtton  && !checkBox.isSelected() )
		{
			
			
			if (this.betCalc())
			{
				 gain = newLottery1.getGain(storeInt.get(0), storeInt.get(1), storeInt.get(2),
						storeInt.get(3), Integer.parseInt(textField5.getText()));
				System.out.println(gain);
				this.dispose();
				this.dispLotoDisplay();
			}
			
		}
		
		
	
	}

	// key checker to only allow integers
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char k = e.getKeyChar();
		if (  !( (Character.isDigit(k)) || (k ==KeyEvent.VK_BACK_SPACE) || (k == KeyEvent.VK_DELETE)) )
		{
			e.consume();
		}
		
	
	}

}
