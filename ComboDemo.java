import java.awt.*;

import javax.swing.*;

public class ComboDemo extends JFrame{

	ComboDemo(){

			setTitle("색상 선택기");

			setLayout(new GridLayout(3,0));

			JPanel p1=new JPanel();

			JPanel p2=new JPanel();

			JPanel p3=new JPanel();

			String[] color= {"빨간색","초록색","파란색"};

			JComboBox<String> com=new JComboBox<>(color);

			p1.add(com);

			p2.add(new JCheckBox("배경색"));

			p2.add(new JCheckBox("전경색"));

			p3.add(new JButton("예"));

			p3.add(new JButton("아니오"));

		

			add(p1);

			add(p2);

			add(p3);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setSize(400,200);

			setVisible(true);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new ComboDemo();

	}

 

}

