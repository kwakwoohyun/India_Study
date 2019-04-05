package JAVA2_2018_04_23CRIS;

import java.awt.*;
import java.awt.event.*;

public class p4_AwtControlDemo {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;

	public p4_AwtControlDemo() {
		prepareGUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p4_AwtControlDemo awtControlDemo = new p4_AwtControlDemo();
		awtControlDemo.showEventDemo();
	}

	private void prepareGUI() {
		mainFrame = new Frame("Java AWT Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);
		statusLabel = new Label();
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350, 100);
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showEventDemo() {
		headerLabel.setText("Control in action: Button");

		Button okButton = new Button("OK");
		Button submitButton = new Button("SUBMIT");
		Button cancelButton = new Button("CANCEL");

		okButton.setActionCommand("OK");
		submitButton.setActionCommand("SUBMIT");
		cancelButton.setActionCommand("CANCEL");
		okButton.addActionListener(new ButtonClickListener());
		submitButton.addActionListener(new ButtonClickListener());
		cancelButton.addActionListener(new ButtonClickListener());
		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);

		mainFrame.setVisible(true);
	}
	private class ButtonClickListener implements ActionListener {
		
		
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("OK")) {
				statusLabel.setText("OK Button Clicked.");
			} else if (command.equals("SUBMIT")) {
				statusLabel.setText("Submit Button Clicked.");
			} else {
				statusLabel.setText("Cancel Button Clicked.");
			}
		}
	}
}

