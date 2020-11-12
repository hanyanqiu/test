package 十进制的算术运算和二进制表示;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class DecimalJFrame extends JFrame implements ActionListener
{
	private JTextField texts1[],texts2[];
	private Button button_char;  
	public  JComboBox combox_operation1,combox_operation2;
	private static String operation[]={"+","-","*","/"},{"+","-","*","/"};
	public DecimalJFrame()
	{
		super("十进制的算术运算");
		this.setBounds(300,240,280,90);
		this.setResizable(false);
		this.setBackground(Color.lightGray);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4,3));
		this.add(new Label("");
		this.Label(new GridLayout(1,1));
		this.add(this.combox_operation1=new JComboBox<String>(DecimalJFrame.operation1));
		this.combox_operation1(new GridLayout(2,1));
		this.add(this.combox_operation2=new JComboBox<String>(DecimalJFrame.operation2));
		this.combox_operation2(new GridLayout(3,1));
		this.combox_operation1.addActionListener(this);
		this.combox_operation2.addActionListener(this);
		button_char=new Button("=");
		this.add(button_char);
		this.button_char(new GridLayout(4,1));
		button_char.addActionListener(this);
		String str[]={"","","",""};
		this.texts1=new JtextField[str[0].length]; 
		for( int i=0;i<thistexts.length;i++)
		{
			texts1[i]=new JTextField(32);
			texts1[i].setEditable(false);
			this.texts1(new GridLayout(i,2));
		}
		String str[]={"","","",""};
		this.texts2=new JtextField[str[0].length]; 
		for(int j=0;j<this.texts2.length;j++)
		{
			texts2[j]=new JTextField(20);
			texts2[4].setEditable(false);
			this.texts2(new GridLayout(j,3));
		}
		this.addWindowListener(new WinClose());
		this.setVisible(true);
	}
	private void button_charActionPerformed(ActionEvent evt) 
	 {
		 { 
			 String s1 = this.text1[1].getText();
	         String s3 = this.text2[2].getText();
	         String s2 = (String )(this.jComboBoxoperation1.getSelectedItem());
	         char c =  s2.charAt(0);
	         Double d1= Double.valueOf(s1);
	         Double d2 = Double.valueOf(s3); 
	         Double re =0.0;
	         switch (c)  
	         {
	             case '+' : {re = d1+d2; break;}
	             case '-' : {re = d1-d2; break;}  
	             case '*' : {re = d1*d2; break;}
	             case '/' : {re = d1/d2; break;}
	         }	
	         return re;    
		 }
		 {
		     String s4 = re;
	         String s5 = this.text2[3].getText();
	         String s6 = (String )(this.jComboBoxoperation2.getSelectedItem());
	         char c =  s5.charAt(0);
	         Double d3= Double.valueOf(s4);
	         Double d4 = Double.valueOf(s3); 
	         Double sum =0.0;
	         switch (c)  
	         {
	              case '+' : {sum = d3+d4; break;}
	              case '-' : {sum = d3-d4; break;}  
	              case '*' : {sum = d3*d4; break;}
	              case '/' : {sum = d3/d4; break;}
	          }
	         this.texts1[4].setText(sum.toString());
	 }	 	
	 public static void main(String arg[])
	 {
		  new DecimalJFrame();
	 }
}
	
