import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Component;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextArea calculatorBox; 
	public double Num;
	private JButton btnAdd;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnTimes;
    public int CalcDecider;
	private JButton btnEquals;
	public int decDecider = 0; 
	private JLabel binaryNum;
	private JLabel hexNum;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 352);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setBackground(new Color(211, 211, 211));
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("7");
			}
		});
		btnNum7.setBounds(21, 121, 42, 34);
		contentPane.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setBackground(new Color(211, 211, 211));
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("8");
			}
		});
		btnNum8.setBounds(70, 121, 42, 34);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setBackground(new Color(211, 211, 211));
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("9");
			}
		});
		btnNum9.setBounds(119, 121, 42, 34);
		contentPane.add(btnNum9);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setBackground(new Color(211, 211, 211));
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("4"); 
				//
			}
		});
		btnNum4.setBounds(21, 166, 42, 34);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setBackground(new Color(211, 211, 211));
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("5");
			}
		});
		btnNum5.setBounds(70, 166, 42, 34);
		contentPane.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setBackground(new Color(211, 211, 211));
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("6");
			}
		});
		btnNum6.setBounds(119, 166, 42, 34);
		contentPane.add(btnNum6);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setBackground(new Color(211, 211, 211));
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				calculatorBox.append("1");
			}
		});
		btnNum1.setBounds(21, 211, 42, 34);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setBackground(new Color(211, 211, 211));
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				calculatorBox.append("2");
			}
		});
		btnNum2.setBounds(70, 211, 42, 34);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setBackground(new Color(211, 211, 211));
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("3");
			}
		});
		btnNum3.setBounds(119, 211, 42, 34);
		contentPane.add(btnNum3);
		
		JButton btnReset = new JButton("R");
		btnReset.setBackground(new Color(211, 211, 211));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   CalcDecider = 0;
			    decDecider= 0; 
				Num = 0; 
				 binaryNum.setText("...");
				 hexNum.setText("...");
				calculatorBox.setText(null);
				 
			}
		});
		btnReset.setToolTipText("Resets calculation");
		btnReset.setBounds(21, 256, 42, 34);
		contentPane.add(btnReset);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setBackground(new Color(211, 211, 211));
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				calculatorBox.append("0");
			}
		});
		btnNum0.setBounds(70, 256, 42, 34);
		contentPane.add(btnNum0);
		
		JButton btnC = new JButton("C");
		btnC.setToolTipText("Clears current values on the screen");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   decDecider = 0;
				calculatorBox.setText(null);
				
				
				
			}
		});
		btnC.setBackground(new Color(211, 211, 211));
		btnC.setBounds(119, 256, 42, 34);
		contentPane.add(btnC);
		
	    btnEquals = new JButton("=");
		btnEquals.setBackground(new Color(211, 211, 211));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{  
				
				String calcNum2 = calculatorBox.getText(); 
				double toDouble = Double.parseDouble(calcNum2);
			    if(CalcDecider == 1)
			    {
			    	Num += toDouble; 
			    } 
			    else if(CalcDecider == 2)
			    {
			    	Num -= toDouble; 
			    }
			    else if(CalcDecider == 3)
			    {
			    	Num *= toDouble; 
			    }
			    else if(CalcDecider == 4)
			    {
			    	Num /= toDouble; 
			    }
			    else
			    {
			    	
			    }
			    
			    if(decDecider == 1)
			    {
			    	String result2 = Double.toString(Num); 
			    	calculatorBox.setText(result2);
			    }
			    else if(decDecider == 0)
			    {
			    	int roundedNum = (int) Math.round(Num);
			    	String result = Integer.toString(roundedNum); 
					calculatorBox.setText(result);
			    }
			    int roundedNum2 = (int) Math.round(Num); 
			    String hex = Integer.toHexString(roundedNum2);
			    String bin = Integer.toBinaryString(roundedNum2); 
			    binaryNum.setText(bin);
			    hexNum.setText(hex);
				Num = 0;
			}
		});
		btnEquals.setBounds(181, 256, 94, 34);
		contentPane.add(btnEquals);
		
	    btnAdd = new JButton("+");
	    btnAdd.setBackground(new Color(211, 211, 211));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{    
				CalcDecider = 1;
				 String calcNum = calculatorBox.getText(); 
				double toDouble = Double.parseDouble(calcNum);
				if(Num == 0)
				{
					Num += toDouble;
				}
				else
				{
					Num += toDouble; 
				}
				  calculatorBox.setText(null);
			}
		});
		btnAdd.setBounds(181, 121, 42, 34);
		contentPane.add(btnAdd);
		
		btnMinus = new JButton("-");
		btnMinus.setBackground(new Color(211, 211, 211));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{    
				CalcDecider = 2;
				 String calcNum = calculatorBox.getText(); 
					double toDouble = Double.parseDouble(calcNum);
					if(Num == 0)
					{
						Num += toDouble;
					}
					else
					{
						Num -= toDouble; 
					}
					  calculatorBox.setText(null);
			}
		});
		btnMinus.setBounds(233, 121, 42, 34);
		contentPane.add(btnMinus);
		
		btnTimes = new JButton("x");
		btnTimes.setBackground(new Color(211, 211, 211));
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   
				CalcDecider = 3;
				String calcNum = calculatorBox.getText(); 
				double toDouble = Double.parseDouble(calcNum);
				if(Num == 0)
				{
					Num += toDouble;
				}
				else
				{
					Num *= toDouble; 
				}
				  
				  calculatorBox.setText(null);
			}
		});
		btnTimes.setBounds(181, 166, 42, 34);
		contentPane.add(btnTimes);
		
		btnDivide = new JButton("\u00F7");
		btnDivide.setBackground(new Color(211, 211, 211));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   
				CalcDecider = 4;
				String calcNum = calculatorBox.getText(); 
				double toDouble = Double.parseDouble(calcNum);
				 
					if(Num == 0)
					{
						Num += toDouble;
					}
					else
					{
						Num /= toDouble; 
					}
			  calculatorBox.setText(null);
			}
		});
		btnDivide.setBounds(233, 166, 42, 34);
		contentPane.add(btnDivide);
		
		calculatorBox = new JTextArea();
		calculatorBox.setText("");
		calculatorBox.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		calculatorBox.setAutoscrolls(false);
		calculatorBox.setRows(1);
		calculatorBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		calculatorBox.setEditable(false);
		calculatorBox.setBounds(21, 23, 254, 34);
		calculatorBox.setAlignmentX(RIGHT_ALIGNMENT);
		contentPane.add(calculatorBox);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   
				decDecider = 1;
				calculatorBox.append(".");
			}
		});
		btnDecimal.setBackground(new Color(211, 211, 211));
		btnDecimal.setBounds(181, 211, 42, 34);
		contentPane.add(btnDecimal);
		
		JButton btnSquared = new JButton("\u00B2 ");
		btnSquared.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String calcNum = calculatorBox.getText(); 
				double toDouble = Double.parseDouble(calcNum); 
				
				double squared = toDouble*toDouble; 
				String strSquared = Double.toString(squared);
				calculatorBox.setText(strSquared);
			}
		});
		btnSquared.setBackground(new Color(211, 211, 211));
		btnSquared.setBounds(233, 211, 42, 34);
		contentPane.add(btnSquared);
		
		JLabel lblBin = new JLabel("BIN:");
		lblBin.setToolTipText("To generate a binary number, enter the number you want + 0.");
		lblBin.setBounds(21, 96, 31, 14);
		contentPane.add(lblBin);
		
	    binaryNum = new JLabel("...");
		binaryNum.setBounds(48, 96, 227, 14);
		contentPane.add(binaryNum);
		
		JLabel lblHex = new JLabel("HEX:");
		lblHex.setToolTipText("To generate a binary number, enter the number you want + 0.");
		lblHex.setBounds(21, 79, 31, 14);
		contentPane.add(lblHex);
		
		JLabel hexNum = new JLabel("...");
		hexNum.setBounds(48, 79, 227, 14);
		contentPane.add(hexNum);
	}
}
