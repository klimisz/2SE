package GUI;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class History extends JScrollPane {
	private String[][] allData;
	DefaultListModel<String> date = new DefaultListModel<String>();
	DefaultTableModel examsTableData = new DefaultTableModel(0, 0);
	DefaultTableModel medsTableData = new DefaultTableModel(0, 0);
	JTextArea textArea;
	JTextArea textArea_1;
	JTextArea textArea_2;
	/**
	 * Create the panel.
	 */
	public History(Start s) {

		setBounds(0, 0, 1421, 1063);
		setPreferredSize(new Dimension(2000, 2000));
		setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
		setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JPanel panel1 = new JPanel();
		add(panel1);
		setViewportView(panel1);
		panel1.setLayout(null);
		panel1.setPreferredSize(new Dimension(2000, 1063));

		
		examsTableData.setColumnIdentifiers(new String[] {"\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1/\u038F\u03C1\u03B1",
				"\u03A4\u03CD\u03C0\u03BF\u03C2 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5",
				"\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03BF",
				"\u03A5\u03C0\u03B5\u03CD\u03B8\u03B7\u03BD\u03BF\u03C2 \u0399\u03B1\u03C4\u03C1\u03CC\u03C2",
				"\u03A0\u03C1\u03BF\u03C4\u03B9\u03BD\u03CC\u03BC\u03B5\u03BD\u03B7 \u0394\u03BF\u03C3\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1" });
		medsTableData.setColumnIdentifiers(new String[] {"\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1/\u038F\u03C1\u03B1",
						"\u03A4\u03CD\u03C0\u03BF\u03C2 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5",
						"\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03BF",
						"\u03A5\u03C0\u03B5\u03CD\u03B8\u03B7\u03BD\u03BF\u03C2 \u0399\u03B1\u03C4\u03C1\u03CC\u03C2",
						"\u03A0\u03C1\u03BF\u03C4\u03B9\u03BD\u03CC\u03BC\u03B5\u03BD\u03B7 \u0394\u03BF\u03C3\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1" });
				
		JList<String> datelist = new JList<String>(date);
		datelist.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()){
					System.out.println(((JList)e.getSource()).getMaxSelectionIndex());
					setListView(((JList)e.getSource()).getMaxSelectionIndex());
				}
				
			}
		});
		datelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		datelist.setSelectedIndex(0);
		datelist.setVisibleRowCount(10);

		JScrollPane datelistpane = new JScrollPane(datelist);
		datelistpane.setBounds(29, 105, 100, 162);

		panel1.add(datelistpane);

		JLabel label = new JLabel("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC");
		label.setBounds(416, 36, 72, 20);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel1.add(label);

		 textArea = new JTextArea();
		textArea.setBounds(190, 105, 367, 162);
		panel1.add(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setOpaque(false);
		textArea.setEditable(false);

		JLabel label_1 = new JLabel("\u03A3\u03C5\u03BC\u03C0\u03C4\u03CE\u03BC\u03B1\u03C4\u03B1:");
		label_1.setBounds(210, 80, 64, 14);
		panel1.add(label_1);

		 textArea_1 = new JTextArea();
		textArea_1.setBounds(29, 311, 342, 190);
		panel1.add(textArea_1);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setOpaque(false);
		textArea_1.setEditable(false);

		JLabel label_2 = new JLabel(
				"\u0391\u03BB\u03B5\u03C1\u03B3\u03AF\u03B5\u03C2/\u03A0\u03B1\u03C1\u03B1\u03C4\u03B7\u03C1\u03AE\u03C3\u03B5\u03B9\u03C2:");
		label_2.setBounds(29, 286, 116, 14);
		panel1.add(label_2);

		 textArea_2 = new JTextArea();
		textArea_2.setBounds(662, 105, 367, 162);
		panel1.add(textArea_2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setOpaque(false);
		textArea_2.setEditable(false);

		JLabel label_3 = new JLabel("\u0394\u03B9\u03AC\u03B3\u03BD\u03C9\u03C3\u03B7:");
		label_3.setBounds(662, 80, 116, 14);
		panel1.add(label_3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(514, 311, 499, 190);
		panel1.add(scrollPane);

		JTable table_1 = new JTable(examsTableData);
		table_1.setCellSelectionEnabled(true);

		scrollPane.setViewportView(table_1);

		JLabel label_4 = new JLabel("\u0395\u03BE\u03B5\u03C4\u03AC\u03C3\u03B5\u03B9\u03C2:");
		label_4.setBounds(515, 286, 57, 14);
		panel1.add(label_4);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(29, 577, 528, 148);
		panel1.add(scrollPane2);

		JTable table_2 = new JTable(medsTableData);

		scrollPane2.setViewportView(table_2);

		JLabel label_5 = new JLabel(
				"\u03A6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03C5\u03C4\u03B9\u03BA\u03AE \u0391\u03B3\u03C9\u03B3\u03AE:");
		label_5.setBounds(29, 552, 108, 14);
		panel1.add(label_5);

		JLabel label_6 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1:");
		label_6.setBounds(32, 80, 69, 14);
		panel1.add(label_6);

		JButton buttonEmfStoixeion = new JButton(
				"\u0395\u03C6\u03BC\u03AC\u03BD\u03B7\u03C3\u03B7 \u03C3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD");
		buttonEmfStoixeion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				date.removeAllElements();
				allData = Condb.searchByInfosAm(Main_screen.amCode);
				for (int i = 0; i < allData.length; i++) {
					date.addElement(allData[i][0]);
				}
				repaint();
			}
		});
		buttonEmfStoixeion.setBounds(578, 523, 180, 40);
		panel1.add(buttonEmfStoixeion);
	}
	
	
	private void setListView(int i){
		textArea.setText(allData[i][2]);
		textArea_1.setText(allData[i][3]);
		textArea_2.setText(allData[i][4]);
		setTableData(Integer.parseInt(allData[i][5]));
		
	}
	
	private void setTableData(int visitId){
		System.out.println(visitId);
		examsTableData.setRowCount(0);
		String[][] examsData = Condb.searchExamsByVisitID(visitId);
		for(int i=0; i<examsData.length; i++){
			examsTableData.addRow(examsData[i]);
		}
		
		medsTableData.setRowCount(0);
		String[][] medsData = Condb.searchMedsByVisitID(visitId);
		for(int i=0; i<medsData.length; i++){
			medsTableData.addRow(medsData[i]);
		}
		
	}
	
}
