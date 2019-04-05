package JAVA2_2018_06_21CRIS;

import javax.swing.*;
import javax.swing.event.*;

 class p4_JTable_ListSelectionListener {
	p4_JTable_ListSelectionListener() {
		JFrame f = new JFrame();
		String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
		String column[] = { "ID", "NAME", "SALARY" };
		final JTable jt = new JTable(data, column);
		jt.setCellSelectionEnabled(true); // 고르는 것을 가능하게 하다., 주석처리하면 한줄이 다 선택된다.
		ListSelectionModel select = jt.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				String Data = null;
				int[] row = jt.getSelectedRows();
				int[] column = jt.getSelectedColumns();
				for (int i = 0; i < row.length; i++) {
					for (int j = 0; j < column.length; j++) {
						Data = (String) jt.getValueAt(row[i], column[i]);
					}
				}
				System.out.println("Table element selected is : " + Data);
			}
		});
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 200);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new p4_JTable_ListSelectionListener();
	}

}
