package JAVA2_2018_06_19CRIS;
import javax.swing.*;
public class p1_Button_1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame(); //creating instance of JFrame
		
		JButton b = new JButton("click"); //creating instance of JButton
		b.setBounds(130,100,100,40);
		f.add(b); //adding button in JFrame
		f.setSize(400,500); //400width,500height
		f.setLayout(null); //using no layout managers
		f.setVisible(true); //making the frame visible
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //모든 프로세스를 종료할 수 있다.
	}

}
