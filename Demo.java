 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

 

public class Demo extends JFrame{

	Demo(){

		setTitle("안녕, 스윙!");

		JPanel p=new JPanel();

		JLabel l=new JLabel("안녕, 스윙!");

		JButton b=new JButton("버튼");

		p.add(l);

		p.add(b);

		add(p);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(300,100);

		setVisible(true);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new Demo();

	}

 

}
