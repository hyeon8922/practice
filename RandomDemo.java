import java.util.Random;

 

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

public class RandomDemo extends JFrame{

	

	RandomDemo(){

	setTitle("난수 알파벳");

	JPanel p=new JPanel();

	p.setLayout(null);

	JLabel a=new JLabel("a");

	JLabel b=new JLabel("b");

	JLabel c=new JLabel("c");

	Random r=new Random();

	

	a.setBounds(r.nextInt(50),r.nextInt(50),r.nextInt(50),r.nextInt(50));

	b.setBounds(r.nextInt(50),r.nextInt(50),r.nextInt(50),r.nextInt(50));

	c.setBounds(r.nextInt(50),r.nextInt(50),r.nextInt(50),r.nextInt(50));

	p.add(a);

	p.add(b);

	p.add(c);

	add(p);

	

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setSize(300,200);

	setVisible(true);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new RandomDemo();

	}

 

}
