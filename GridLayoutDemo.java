import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{

	GridLayoutDemo(){

		setTitle("그리드 레이아웃!");

		setLayout(new GridLayout(2,2));

		add(new JButton("B 1"));

		add(new JButton("버튼 2"));

		add(new JButton("Button 3"));

		add(new JButton("Button four"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(350,110);

		setVisible(true);

		

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new GridLayoutDemo();

	}

 

}
