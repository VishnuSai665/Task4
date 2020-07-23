package epam.serial;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="interest” width=450 height=300>
</applet>
*/
//@SuppressWarnings("deprecation")
public class Cost extends Applet implements ActionListener
{
	private static final long serialVersionUID=1L;
	JButton a;
	JTextField t1,t2,t3,t4;
	JLabel p,q,r;
	JPanel panel;
	public void init()
	{
		p=new JLabel("Material Standard ");
		q=new JLabel("Total Area:");
		r=new JLabel("Fully Automated ");
		a=new JButton("Calculate Cost:");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		
		this.setLayout(new GridLayout(4,2));
		this.add(p);
		this.add(t1);
		this.add(q);
		this.add(t2);
		this.add(r);
		this.add(t3);
		this.add(a);
		this.add(t4);
		a.addActionListener(this);
	}
	public void actionPerformed(ActionEvent aEvent)
	{
		String matStandard,automated;
		double area,cost=0.0;
		int conCost;
		matStandard=t1.getText();
		area=Double.parseDouble(t2.getText());
		automated=t3.getText().toLowerCase();
		
		if (aEvent.getSource()==a)
		{
			if(matStandard.equals("standard")) 
			{
				conCost=1200;
				cost=conCost*area;
			}
			else if(matStandard.equals("above standard")) 
			{
				conCost=1500;
				cost=conCost*area;
			}
			else if(matStandard.equals("high standard")) 
			{
				conCost=1800;
				cost=conCost*area;
			}
			else if(matStandard.equals("high standard") && (automated.equals("yes") || automated.equals("true"))) {
				conCost=2500;
				cost=conCost*area;
			}
			t4.setText(Double.toString(cost));
		}
	}
}