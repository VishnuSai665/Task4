package epam.serial;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Intrest extends Applet implements ActionListener
{
	private static final long serialVersionUID=1L;
	JButton a,b;
	JTextField t1,t2,t3,t4,t5;
	JLabel l1,l2,l3;
	JPanel panel;
	public void init()
	{
	// TODO start asynchronous download of heavy resources

	l1=new JLabel("Principle amount");
	l2=new JLabel("Time period:");
	l3=new JLabel("Rate of interest: ");
	a=new JButton("Simple Interest:");
	b=new JButton("Compund Interest:");

	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();

	this.setLayout(new GridLayout(5,2));
	this.add(l1);
	this.add(t1);
	this.add(l2);
	this.add(t2);
	this.add(l3);
	this.add(t3);
	this.add(a);
	this.add(t4);
	this.add(b);
	this.add(t4);
	a.addActionListener(this);
	b.addActionListener(this);

	}
	public void actionPerformed(ActionEvent aEvent)
	{
		double amount,period,rate,simpleInterest,cInterest;
		amount=Double.parseDouble(t1.getText());
		period=Double.parseDouble(t2.getText());
		rate=Double.parseDouble(t3.getText());
		if (aEvent.getSource()==a)
		{
			simpleInterest=(period*rate*amount)/100.0;
			t4.setText(String.valueOf(simpleInterest));
		}
		else if (aEvent.getSource()==b)
		{
			cInterest=(amount)*(Math.pow(1+(rate/100.0),period));
			t5.setText(String.valueOf(cInterest));
		}
	}
}