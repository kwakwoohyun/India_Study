package JAVA2_2018_06_29CRIS;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

public class exam extends Frame{
	public static String TITLE = "Kwak's Exam";
	JPanel mainPanel = new JPanel();
	JPanel appetizerPanel = new JPanel();
	JPanel maincoursePanel = new JPanel();
	JPanel billPanel = new JPanel();
	JTabbedPane tabbedPane = new JTabbedPane();
	JPanel[] panels = { mainPanel, appetizerPanel, maincoursePanel, billPanel };

	public static int WIDTH = 1200;
	public static int HEIGHT = 900;
	public exam() {
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

	private void addComponentsToTabs() {
		// TODO Auto-generated method stub
		mainPanel();
		appetizerPanel();
		maincoursePanel();
		billPanel();
	}
	private void mainPanel() {
		// TODO Auto-generated method stub
		
	}
	private void appetizerPanel() {
		// TODO Auto-generated method stub
		
	}
	private void maincoursePanel() {
		// TODO Auto-generated method stub
		
	}
	private void billPanel() {
		// TODO Auto-generated method stub
		
	}

	public class WindowHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exam();
	}

}
