package JAVA2_2018_06_29CRIS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.transform.Source;

//Font f1 = new Font("Arial",Font.BOLD,14);
//t1.setFont(f1)
public class Hotel extends Frame implements ActionListener {
	Font f1 = new Font("Arial", Font.BOLD, 20);
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
	JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12;
	JButton b, b1;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23,
			l24;
	String p;
	JTextArea ta;
	public static int WIDTH = 1200;
	public static int HEIGHT = 900;
	public static String TITLE = "Kwak's Hotel";
	JTabbedPane tabbedPane = new JTabbedPane();
	JPanel mainPanel = new JPanel();
	JPanel appetizerPanel = new JPanel();
	JPanel maincoursePanel = new JPanel();
	JPanel billPanel = new JPanel();
	JPanel[] panels = { mainPanel, appetizerPanel, maincoursePanel, billPanel };
	Icon worldIcon = new ImageIcon("C:\\Users\\user\\Downloads\\m.png");
	Icon mainIcon = new ImageIcon("C:/Users\\user\\Downloads\\pray.png");

	JProgressBar progressBar = new JProgressBar();
	String[] columns = { "Food", "Qty", "Price" };
	Object[][] cells = { columns, { "zvga-1234", "Video Card", "$50" }, { "56m-11", "56K Modem", "$315" },
			{ "dc-10", "Net Card", "$499" } };
	JTable table = new JTable(cells, columns);

	public Hotel() {
		super(TITLE);
		addWindowListener(new WindowHandler());
		buildGUI();
		setSize(WIDTH, HEIGHT);
		setBackground(Color.white);
		show();
	}

	void buildGUI() {
		String[] tabs = { "Main", "Appetizer", "Maincourse", "Bill" };
		String[] tabTips = { "Welcome to Kwak's Hotel", "Please check the Appetizer", "Please chek the Maincourse",
				"Here is Bill", "An Icon List" };
		for (int i = 0; i < tabs.length; ++i) {
			panels[i].setBackground(Color.white);
			panels[i].setBorder(new TitledBorder(tabTips[i]));
			tabbedPane.addTab(tabs[i], null, panels[i], tabTips[i]);
		}
		addComponentsToTabs();
		add("Center", tabbedPane);
	}

	void addComponentsToTabs() {
		mainPanel();
		appetizerPanel();
		maincoursePanel();
		billPanel();
	}

	void mainPanel() {
		mainPanel.setLayout(null);
		Icon india = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\m.png");
		Icon india1 = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\g.png");
		Icon india2 = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\h.png");//
		JLabel in = new JLabel(india);
		JLabel in1 = new JLabel(india1);
		JLabel in2 = new JLabel(india2);
		in.setBounds(10, 10, 850, 500);
		in1.setBounds(10, 10, 1450, 500);
		in2.setBounds(10, 10, 1100, 1000);
		mainPanel.add(in);
		mainPanel.add(in1);
		mainPanel.add(in2);
	}

	void appetizerPanel() {
		appetizerPanel.setLayout(null);
		Icon s = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\Assignment\\\\s.jpg");
		Icon sandwich = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\Assignment\\\\sandwich.jpg");
		Icon bread = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\Assignment\\\\bread.jpg");//
		Icon potato = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\Assignment\\\\potato.jpg");
		Icon coffe = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\Assignment\\\\coffe.jpg");
		Icon beer = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\Assignment\\\\beer.jpg");//
		JLabel in = new JLabel(s);
		JLabel in1 = new JLabel(sandwich);
		JLabel in2 = new JLabel(bread);
		JLabel in3 = new JLabel(potato);
		JLabel in4 = new JLabel(coffe);
		JLabel in5 = new JLabel(beer);
		in.setBounds(10, 10, 700, 400);
		in1.setBounds(10, 10, 1200, 400);
		in2.setBounds(10, 10, 1700, 400);
		in3.setBounds(10, 10, 700, 1020);
		in4.setBounds(10, 10, 1200, 1020);
		in5.setBounds(10, 10, 1700, 1020);
		appetizerPanel.add(in);
		appetizerPanel.add(in1);
		appetizerPanel.add(in2);
		appetizerPanel.add(in3);
		appetizerPanel.add(in4);
		appetizerPanel.add(in5);
		cb1 = new JCheckBox("Snack");
		cb1.setBounds(320, 310, 100, 30);
		cb1.setBackground(Color.white);
		cb2 = new JCheckBox("Sandwich");
		cb2.setBounds(550, 310, 130, 30);
		cb2.setBackground(Color.white);
		cb3 = new JCheckBox("Bread");
		cb3.setBounds(820, 310, 100, 30);
		cb3.setBackground(Color.white);

		cb4 = new JCheckBox("Potato");
		cb4.setBounds(320, 620, 100, 30);
		cb4.setBackground(Color.white);
		cb5 = new JCheckBox("Shake");
		cb5.setBounds(550, 620, 100, 30);
		cb5.setBackground(Color.white);
		cb6 = new JCheckBox("Beer");
		cb6.setBounds(820, 620, 100, 30);
		cb6.setBackground(Color.white);

		l1 = new JLabel("Price  :  200");
		l1.setBounds(320, 350, 150, 30);
		l2 = new JLabel("Qty  :  ");
		l2.setBounds(320, 390, 100, 30);
		l3 = new JLabel("Price  :  250");
		l3.setBounds(550, 350, 150, 30);
		l4 = new JLabel("Qty  :  ");
		l4.setBounds(550, 390, 100, 30);
		l5 = new JLabel("Price  :  250");
		l5.setBounds(820, 350, 150, 30);
		l6 = new JLabel("Qty  :  ");
		l6.setBounds(820, 390, 100, 30);

		l7 = new JLabel("Price  :  300");
		l7.setBounds(320, 660, 150, 30);
		l8 = new JLabel("Qty  :  ");
		l8.setBounds(320, 700, 100, 30);
		l9 = new JLabel("Price  :  250");
		l9.setBounds(550, 660, 150, 30);
		l10 = new JLabel("Qty  :  ");
		l10.setBounds(550, 700, 100, 30);
		l11 = new JLabel("Price  :  250");
		l11.setBounds(820, 660, 150, 30);
		l12 = new JLabel("Qty  :  ");
		l12.setBounds(820, 700, 100, 30);
		t1 = new JTextField();
		t1.setBounds(390, 390, 30, 30);
		t2 = new JTextField();
		t2.setBounds(620, 390, 30, 30);
		t3 = new JTextField();
		t3.setBounds(890, 390, 30, 30);
		t4 = new JTextField();
		t4.setBounds(390, 700, 30, 30);
		t5 = new JTextField();
		t5.setBounds(620, 700, 30, 30);
		t6 = new JTextField();
		t6.setBounds(890, 700, 30, 30);
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		l11.setFont(f1);
		l12.setFont(f1);
		cb1.setFont(f1);
		cb2.setFont(f1);
		cb3.setFont(f1);
		cb4.setFont(f1);
		cb5.setFont(f1);
		cb6.setFont(f1);

		appetizerPanel.add(t1);
		appetizerPanel.add(t2);
		appetizerPanel.add(t3);
		appetizerPanel.add(t4);
		appetizerPanel.add(t5);
		appetizerPanel.add(t6);
		appetizerPanel.add(l1);
		appetizerPanel.add(l2);
		appetizerPanel.add(l3);
		appetizerPanel.add(l4);
		appetizerPanel.add(l5);
		appetizerPanel.add(l6);
		appetizerPanel.add(l7);
		appetizerPanel.add(l8);
		appetizerPanel.add(l9);
		appetizerPanel.add(l10);
		appetizerPanel.add(l11);
		appetizerPanel.add(l12);
		appetizerPanel.add(cb1);
		appetizerPanel.add(cb2);
		appetizerPanel.add(cb3);
		appetizerPanel.add(cb4);
		appetizerPanel.add(cb5);
		appetizerPanel.add(cb6);
	}

	void maincoursePanel() {
		maincoursePanel.setLayout(null);
		Icon p = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\pizza.jpg");
		Icon b = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\beef.jpg");
		Icon c = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\chicken.jpg");//
		Icon h = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\hamburger.jpg");
		Icon f = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\fish.jpg");
		Icon s = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\salad.jpg");//
		JLabel in = new JLabel(p);
		JLabel in1 = new JLabel(b);
		JLabel in2 = new JLabel(c);
		JLabel in3 = new JLabel(h);
		JLabel in4 = new JLabel(f);
		JLabel in5 = new JLabel(s);
		in.setBounds(10, 10, 700, 400);
		in1.setBounds(10, 10, 1200, 400);
		in2.setBounds(10, 10, 1700, 400);
		in3.setBounds(10, 10, 700, 1020);
		in4.setBounds(10, 10, 1200, 1020);
		in5.setBounds(10, 10, 1700, 1020);
		maincoursePanel.add(in);
		maincoursePanel.add(in1);
		maincoursePanel.add(in2);
		maincoursePanel.add(in3);
		maincoursePanel.add(in4);
		maincoursePanel.add(in5);
		cb7 = new JCheckBox("Pizza");
		cb7.setBounds(320, 310, 100, 30);
		cb7.setBackground(Color.white);
		cb8 = new JCheckBox("Beef");
		cb8.setBounds(550, 310, 130, 30);
		cb8.setBackground(Color.white);
		cb9 = new JCheckBox("Chicken");
		cb9.setBounds(820, 310, 110, 30);
		cb9.setBackground(Color.white);

		cb10 = new JCheckBox("Hambergur");
		cb10.setBounds(320, 620, 130, 30);
		cb10.setBackground(Color.white);
		cb11 = new JCheckBox("Fish");
		cb11.setBounds(550, 620, 100, 30);
		cb11.setBackground(Color.white);
		cb12 = new JCheckBox("Salad");
		cb12.setBounds(820, 620, 100, 30);
		cb12.setBackground(Color.white);

		l13 = new JLabel("Price  :  500");
		l13.setBounds(320, 350, 150, 30);
		l14 = new JLabel("Qty  :  ");
		l14.setBounds(320, 390, 100, 30);
		l15 = new JLabel("Price  :  550");
		l15.setBounds(550, 350, 150, 30);
		l16 = new JLabel("Qty  :  ");
		l16.setBounds(550, 390, 100, 30);
		l17 = new JLabel("Price  :  450");
		l17.setBounds(820, 350, 150, 30);
		l18 = new JLabel("Qty  :  ");
		l18.setBounds(820, 390, 100, 30);

		l19 = new JLabel("Price  :  450");
		l19.setBounds(320, 660, 150, 30);
		l20 = new JLabel("Qty  :  ");
		l20.setBounds(320, 700, 100, 30);
		l21 = new JLabel("Price  :  400");
		l21.setBounds(550, 660, 150, 30);
		l22 = new JLabel("Qty  :  ");
		l22.setBounds(550, 700, 100, 30);
		l23 = new JLabel("Price  :  350");
		l23.setBounds(820, 660, 150, 30);
		l24 = new JLabel("Qty  :  ");
		l24.setBounds(820, 700, 100, 30);
		t7 = new JTextField();
		t7.setBounds(390, 390, 30, 30);
		t8 = new JTextField();
		t8.setBounds(620, 390, 30, 30);
		t9 = new JTextField();
		t9.setBounds(890, 390, 30, 30);
		t10 = new JTextField();
		t10.setBounds(390, 700, 30, 30);
		t11 = new JTextField();
		t11.setBounds(620, 700, 30, 30);
		t12 = new JTextField();
		t12.setBounds(890, 700, 30, 30);
		l13.setFont(f1);
		l14.setFont(f1);
		l15.setFont(f1);
		l16.setFont(f1);
		l17.setFont(f1);
		l18.setFont(f1);
		l19.setFont(f1);
		l20.setFont(f1);
		l21.setFont(f1);
		l22.setFont(f1);
		l23.setFont(f1);
		l24.setFont(f1);
		cb7.setFont(f1);
		cb8.setFont(f1);
		cb9.setFont(f1);
		cb10.setFont(f1);
		cb11.setFont(f1);
		cb12.setFont(f1);

		maincoursePanel.add(t7);
		maincoursePanel.add(t8);
		maincoursePanel.add(t9);
		maincoursePanel.add(t10);
		maincoursePanel.add(t11);
		maincoursePanel.add(t12);
		maincoursePanel.add(l13);
		maincoursePanel.add(l14);
		maincoursePanel.add(l15);
		maincoursePanel.add(l16);
		maincoursePanel.add(l17);
		maincoursePanel.add(l18);
		maincoursePanel.add(l19);
		maincoursePanel.add(l20);
		maincoursePanel.add(l21);
		maincoursePanel.add(l22);
		maincoursePanel.add(l23);
		maincoursePanel.add(l24);
		maincoursePanel.add(cb7);
		maincoursePanel.add(cb8);
		maincoursePanel.add(cb9);
		maincoursePanel.add(cb10);
		maincoursePanel.add(cb11);
		maincoursePanel.add(cb12);
	}

	void billPanel() {
		billPanel.setLayout(null);
		b = new JButton("Bill");
		b.setBackground(Color.white);
		b.setBounds(370, 570, 100, 70);
		b.setFont(f1);
		b.addActionListener(this);
		Icon p = new ImageIcon("C:\\Users\\user\\Desktop\\kwak's hotel\\receipt.jpg");
		JLabel in = new JLabel(p);
		in.setBounds(20, 20, 800, 600);
		ta = new JTextArea();
		ta.setBounds(700, 200, 300, 300);
		ta.setFont(f1);
		billPanel.add(in);
		billPanel.add(b);
		billPanel.add(table);
		billPanel.add(ta);
		b1 = new JButton("Exit");
		b1.setBounds(370, 670, 100, 70);
		b1.setFont(f1);
		b1.addActionListener(this);
		billPanel.add(b1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int price = 0;
		if (e.getSource() == b) {
			if (cb1.isSelected()) {
				price = price + 200 * Integer.parseInt(t1.getText());
				p = cb1.getText() + " : 200" + " * " + t1.getText() + "\n";
			}
			if (cb2.isSelected()) {
				price = price + 250 * Integer.parseInt(t2.getText());
				p = p + cb2.getText() + " : 250" + " * " + t2.getText() + "\n";
			}
			if (cb3.isSelected()) {
				price = price + 250 * Integer.parseInt(t3.getText());
				p = p + cb3.getText() + " : 250" + " * " + t3.getText() + "\n";
			}
			if (cb4.isSelected()) {
				price = price + 300 * Integer.parseInt(t4.getText());
				p = p + cb4.getText() + " : 300" + " * " + t4.getText() + "\n";
			}
			if (cb5.isSelected()) {
				price = price + 250 * Integer.parseInt(t5.getText());
				p = p + cb5.getText() + " : 250" + " * " + t5.getText() + "\n";
			}
			if (cb6.isSelected()) {
				price = price + 250 * Integer.parseInt(t6.getText());
				p = p + cb6.getText() + " : 250" + " * " + t6.getText() + "\n";
			}
			if (cb7.isSelected()) {
				price = price + 500 * Integer.parseInt(t7.getText());
				p = p + cb7.getText() + " : 500" + " * " + t7.getText() + "\n";
			}
			if (cb8.isSelected()) {
				price = price + 550 * Integer.parseInt(t8.getText());
				p = p + cb8.getText() + " : 550" + " * " + t8.getText() + "\n";
			}
			if (cb9.isSelected()) {
				price = price + 450 * Integer.parseInt(t9.getText());
				p = p + cb9.getText() + " : 450" + " * " + t9.getText() + "\n";
			}
			if (cb10.isSelected()) {
				price = price + 450 * Integer.parseInt(t10.getText());
				p = p + cb10.getText() + " : 450" + " * " + t10.getText() + "\n";
			}
			if (cb11.isSelected()) {
				price = price + 400 * Integer.parseInt(t11.getText());
				p = p + cb11.getText() + " : 400" + " * " + t11.getText() + "\n";
			}
			if (cb12.isSelected()) {
				price = price + 350 * Integer.parseInt(t12.getText());
				p = p + cb12.getText() + " : 240" + " * " + t12.getText() + "\n";
			}
			if ((cb1.isSelected() == false) && (cb2.isSelected() == false) && (cb3.isSelected() == false)
					&& (cb4.isSelected() == false) && (cb5.isSelected() == false) && (cb6.isSelected() == false)
					&& (cb7.isSelected() == false) && (cb8.isSelected() == false) && (cb9.isSelected() == false)
					&& (cb10.isSelected() == false) && (cb11.isSelected() == false) && (cb12.isSelected() == false)) {
				ta.setText("Please select any food !");
			} else {
				p = p + "Total = " + price + "\n\nThank you Sir and Madam¢¾\nHave a nice day¢¾";
				ta.setText(p);
			}
		}
		if (e.getSource() == b1) {
			setVisible(false);
			dispose();
		}
	}

	public static void main(String[] args) {
		Hotel app = new Hotel();

	}

	public class WindowHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public class SliderHandler implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			// progressBar.setValue(slider.getValue());
		}
	}

}
