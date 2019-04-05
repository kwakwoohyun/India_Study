package JAVA2_2018_06_22CRIS;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SwingStart extends Frame {
	public static int WIDTH = 450;
	public static int HEIGHT = 450;
	public static String TITLE = "SwingStart";
	JTabbedPane tabbedPane = new JTabbedPane();
	JPanel buttonPanel = new JPanel();
	JPanel barPanel = new JPanel();
	JPanel listPanel = new JPanel();
	JPanel tablePanel = new JPanel();
	JPanel[] panels = { buttonPanel, barPanel, listPanel, tablePanel };
	Icon worldIcon = new ImageIcon("C:\\Users\\user\\Downloads\\m.png");
	Icon printerIcon = new ImageIcon("C:/Users\\user\\Downloads\\pray.png");
	Icon leaf1Icon = new ImageIcon("C:/Users\\user\\Downloads\\picture.png");
	Icon leaf2Icon = new ImageIcon("C:/Users\\user\\Downloads\\family.png");
	Icon leaf3Icon = new ImageIcon("C:/Users\\user\\Downloads\\back.png");
	Icon[] leaves = { leaf1Icon, leaf2Icon, leaf3Icon };
	JButton printerButton = new JButton("Print", printerIcon);
	JToggleButton worldButton = new JToggleButton("Connect", worldIcon, true);
	JList leafList = new JList(leaves);
	JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 60);
	JProgressBar progressBar = new JProgressBar();
	String[] columns = { "Product ID", "Description", "Price" };
	Object[][] cells = { columns, { "zvga-1234", "Video Card", "$50" }, { "56m-11", "56K Modem", "$315" },
			{ "dc-10", "Net Card", "$499" } };
	JTable table = new JTable(cells, columns);

	public SwingStart() {
		super(TITLE);
		addWindowListener(new WindowHandler());
		buildGUI();
		setSize(WIDTH, HEIGHT);
		setBackground(Color.darkGray);
		show();
	}

	void buildGUI() {
		String[] tabs = { "Buttons", "Bars", "Lists", "Table" };
		String[] tabTips = { "A Button and a Toggle Button", "A slider and a Progress Bar", "An Icon List",
				"A Cost Table", "An Icon List" };
		for (int i = 0; i < tabs.length; ++i) {
			panels[i].setBackground(Color.lightGray);
			panels[i].setBorder(new TitledBorder(tabTips[i]));
			tabbedPane.addTab(tabs[i], null, panels[i], tabTips[i]);
		}
		addComponentsToTabs();
		add("Center", tabbedPane);
	}

	void addComponentsToTabs() {
		setupButtonPanel();
		setupBarPanel();
		setupListPanel();
		setupTablePanel();
	}

	void setupButtonPanel() {
		printerButton.setBackground(Color.white);
		worldButton.setBackground(Color.white);
		buttonPanel.add(printerButton);
		buttonPanel.add(worldButton);
	}

	void setupBarPanel() {
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.addChangeListener(new SliderHandler());
		progressBar.setOrientation(JProgressBar.HORIZONTAL);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(60);
		progressBar.setBorderPainted(true);
		barPanel.add(new JLabel("Slider"));
		barPanel.add(slider);
		barPanel.add(new JLabel("Progress Bar"));
		barPanel.add(progressBar);

	}

	void setupListPanel() {
		leafList.setFixedCellHeight(100);
		listPanel.add(leafList);
	}

	void setupTablePanel() {
		tablePanel.add(table);
	}

	public static void main(String[] args) {
		SwingStart app = new SwingStart();

	}

	public class WindowHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public class SliderHandler implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			progressBar.setValue(slider.getValue());
		}
	}

}
