package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.awt.Font;

public class Discharge extends JScrollPane {
	private JTable table_1;
	private JTable table_2;
	private DefaultTableModel medsTableModel;
	private DefaultTableModel examsTableModel;

	/**
	 * Create the panel.
	 */
	public Discharge(Start s) {
		setBounds(0, 0, 800, 1000);
		setPreferredSize(new Dimension(1000, 600));
		setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
		setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JPanel panel = new JPanel();
		add(panel);
		setViewportView(panel);
		panel.setLayout(null);

		panel.setPreferredSize(new Dimension(1421, 1063));

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(54, 229, 460, 148);
		panel.add(scrollPane2);

		table_1 = new JTable(new DefaultTableModel(new Object[][] {  },
				new String[] { "\u03A4\u03CD\u03C0\u03BF\u03C2 \u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7\u03C2",
						"\u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7",
						"\u03A5\u03C0\u03B5\u03CD\u03B8\u03B7\u03BD\u03BF\u03C2 \u0399\u03B1\u03C4\u03C1\u03CC\u03C2",
						"\u0391\u03C0\u03BF\u03C4\u03B5\u03BB\u03AD\u03C3\u03BC\u03B1\u03C4\u03B1" }));

		scrollPane2.setViewportView(table_1);
		examsTableModel = (DefaultTableModel) table_1.getModel();

		JButton btnNewButton = new JButton(
				"\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7\u03C2");
		btnNewButton.setBounds(524, 251, 129, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				examsTableModel.addRow(new Object[] { null, null, null, null, null, null });
			}
		});
		panel.add(btnNewButton);

		JLabel label_1 = new JLabel("\u0395\u03BE\u03B5\u03C4\u03AC\u03C3\u03B5\u03B9\u03C2:");
		label_1.setBounds(54, 204, 57, 14);
		panel.add(label_1);

		JButton btnRemove = new JButton(
				"\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7\u03C2");
		btnRemove.setBounds(524, 285, 125, 23);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				examsTableModel.removeRow(examsTableModel.getRowCount() - 1);
			}
		});
		panel.add(btnRemove);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 445, 460, 148);
		panel.add(scrollPane);

		table_2 = new JTable(new DefaultTableModel(new Object[][] { },
				new String[] { "\u03A4\u03CD\u03C0\u03BF\u03C2 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5",
						"\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03BF",
						"\u03A5\u03C0\u03B5\u03CD\u03B8\u03B7\u03BD\u03BF\u03C2 \u0399\u03B1\u03C4\u03C1\u03CC\u03C2",
						"\u03A0\u03C1\u03BF\u03C4\u03B9\u03BD\u03CC\u03BC\u03B5\u03BD\u03B7 \u0394\u03BF\u03C3\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1" }));

		scrollPane.setViewportView(table_2);
		medsTableModel = (DefaultTableModel) table_2.getModel();

		JButton button = new JButton(
				"\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				medsTableModel.addRow(new Object[] { null, null, null, null, null, null });
			}
		});
		button.setBounds(524, 467, 135, 23);
		panel.add(button);

		JLabel label_3 = new JLabel(
				"\u03A6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03C5\u03C4\u03B9\u03BA\u03AE \u0391\u03B3\u03C9\u03B3\u03AE:");
		label_3.setBounds(54, 420, 57, 14);
		panel.add(label_3);

		JButton button_1 = new JButton(
				"\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medsTableModel.removeRow(medsTableModel.getRowCount() - 1);
			}
		});
		button_1.setBounds(524, 501, 131, 23);
		panel.add(button_1);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(54, 674, 460, 213);
		panel.add(textPane);

		JLabel label = new JLabel("\u0394\u03B9\u03AC\u03B3\u03BD\u03C9\u03C3\u03B7:");
		label.setBounds(54, 649, 116, 14);
		panel.add(label);

		JFormattedTextField formattedTextField = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
		formattedTextField.setBounds(153, 147, 171, 20);
		panel.add(formattedTextField);
		formattedTextField.setValue(new java.util.Date());

		JButton btnNewButton_1 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int examsRows = examsTableModel.getRowCount();
				int medsRows = medsTableModel.getRowCount();
				String[][] examsData = new String[examsRows][4];
				String[][] medsData = new String[medsRows][4];
				for (int i = 0; i < examsRows; i++) {
					examsData[i] = getRowAt(i, examsTableModel);
					

				}
				for (int i = 0; i < medsRows; i++) {
					medsData[i] = getRowAt(i, medsTableModel);
					
				}
				Condb.exitPatient(Main_screen.amCode, formattedTextField.getText(), textPane.getText(), examsData,
						medsData);
			}
		});

		btnNewButton_1.setBounds(54, 969, 89, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u0395\u03BE\u03B1\u03B3\u03C9\u03B3\u03AE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("1");
			}
		});
		btnNewButton_2.setBounds(153, 969, 89, 23);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("1");
			}
		});
		btnNewButton_3.setBounds(252, 969, 89, 23);
		panel.add(btnNewButton_3);

		JLabel label_2 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1:");
		label_2.setBounds(52, 150, 69, 14);
		panel.add(label_2);

		JLabel lblNewLabel = new JLabel(
				"\u0395\u03BE\u03B1\u03B3\u03C9\u03B3\u03AE \u0391\u03C3\u03B8\u03B5\u03BD\u03BF\u03CD\u03C2");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(329, 45, 152, 20);
		panel.add(lblNewLabel);
	}

	public String[] getRowAt(int row, DefaultTableModel model) {
		String[] result = new String[4];

		for (int i = 0; i < 4; i++) {
			result[i]  = (String) model.getValueAt(row, i);
		}

		return result;
	}
}
