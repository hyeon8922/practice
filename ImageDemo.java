import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

public class ImageDemo extends JFrame{

	

	ImageDemo(){

	setTitle("이미지를 포함한 레이블");

	JLabel image=new JLabel(new ImageIcon());

	add(image);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setSize(400,200);

	setVisible(true);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new ImageDemo();

	}

 

}
