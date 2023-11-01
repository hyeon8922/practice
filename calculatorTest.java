import java.awt.*;

import javax.swing.*;

public class CalculatorTest extends JFrame{

	CalculatorTest(){

		setTitle("계산기");

		setLayout(new BorderLayout());

		showNorth();

		showCenter();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(250,300);

		setVisible(true);

	}

	void showNorth() {

		JPanel p1=new JPanel();

		JPanel panel=new JPanel();

		JTextField t1=new JTextField(10);

		p1.add(t1);

		panel.add(p1);

		add(panel, BorderLayout.NORTH);

	}

	void showCenter() {

		JPanel p1=new JPanel();

		JPanel p2=new JPanel(new GridLayout(4,4));

	

		JPanel panel=new JPanel();

		JButton on=new JButton("ON");

		JButton off=new JButton("OFF");

		p1.add(on);

		p1.add(off);

		p2.add(new JButton("7"));

		p2.add(new JButton("8"));

		p2.add(new JButton("9"));

		p2.add(new JButton("+"));

		p2.add(new JButton("4"));

		p2.add(new JButton("5"));

		p2.add(new JButton("6"));

		p2.add(new JButton("-"));

		p2.add(new JButton("1"));

		p2.add(new JButton("2"));

		p2.add(new JButton("3"));

		p2.add(new JButton("x"));

		p2.add(new JButton("0"));

		p2.add(new JButton("."));

		p2.add(new JButton("="));

		p2.add(new JButton("/"));

		

		panel.add(p1);

		panel.add(p2);

 

		add(panel,BorderLayout.CENTER);

		

	}

	public static void main(String[] args) {

		new CalculatorTest();

	}

}
