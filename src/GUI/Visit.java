package GUI;

import javax.swing.JPanel;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.BoundedRangeModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.table.TableModel;
import java.awt.Font;

public class Visit extends JScrollPane {
	private JTable examsTable;
	private JTable medsTable;
	private DefaultTableModel examsTableModel;
	private DefaultTableModel medsTableModel;

	/**
	 * Create the panel.
	 */
	public Visit(Start s) {

		setBounds(0, 0, 1421, 1063);
		setPreferredSize(new Dimension(2000, 2000));
		setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
		setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JPanel panel = new JPanel();
		add(panel);
		setViewportView(panel);
		panel.setLayout(null);

		panel.setPreferredSize(new Dimension(2000, 1063));

		JTextPane txtpnDgajrgftjmnarttjadgfnagfnagf = new JTextPane();
		txtpnDgajrgftjmnarttjadgfnagfnagf.setBounds(58, 275, 460, 213);
		panel.add(txtpnDgajrgftjmnarttjadgfnagfnagf);

		JLabel lblNewLabel = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1:");
		lblNewLabel.setBounds(58, 181, 69, 14);
		panel.add(lblNewLabel);

		JFormattedTextField formattedTextField = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
		formattedTextField.setBounds(187, 178, 171, 20);
		panel.add(formattedTextField);
		formattedTextField.setValue(new java.util.Date());

		JLabel label = new JLabel("\u03A3\u03C5\u03BC\u03C0\u03C4\u03CE\u03BC\u03B1\u03C4\u03B1:");
		label.setBounds(58, 250, 64, 14);
		panel.add(label);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(58, 598, 460, 148);
		panel.add(scrollPane2);

		examsTable = new JTable(new DefaultTableModel(new Object[][] {},
				new String[] { "\u03A4\u03CD\u03C0\u03BF\u03C2 \u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7\u03C2",
						"\u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7",
						"\u03A5\u03C0\u03B5\u03CD\u03B8\u03B7\u03BD\u03BF\u03C2 \u0399\u03B1\u03C4\u03C1\u03CC\u03C2",
						"\u0391\u03C0\u03BF\u03C4\u03B5\u03BB\u03AD\u03C3\u03BC\u03B1\u03C4\u03B1" }));

		scrollPane2.setViewportView(examsTable);
		examsTableModel = (DefaultTableModel) examsTable.getModel();
		JButton btnNewButton = new JButton(
				"\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7\u03C2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				examsTableModel.addRow(new Object[] { null, null, null, null, null, null });
			}
		});
		btnNewButton.setBounds(528, 620, 129, 23);
		panel.add(btnNewButton);

		JLabel label_1 = new JLabel("\u0395\u03BE\u03B5\u03C4\u03AC\u03C3\u03B5\u03B9\u03C2:");
		label_1.setBounds(58, 573, 57, 14);
		panel.add(label_1);

		JButton btnRemove = new JButton(
				"\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u0395\u03BE\u03AD\u03C4\u03B1\u03C3\u03B7\u03C2");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				examsTableModel.removeRow(examsTableModel.getRowCount() - 1);
			}
		});
		btnRemove.setBounds(528, 654, 125, 23);
		panel.add(btnRemove);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(807, 275, 460, 213);
		panel.add(textPane);

		JLabel label_2 = new JLabel(
				"\u0391\u03BB\u03B5\u03C1\u03B3\u03AF\u03B5\u03C2/\u03A0\u03B1\u03C1\u03B1\u03C4\u03B7\u03C1\u03AE\u03C3\u03B5\u03B9\u03C2:");
		label_2.setBounds(807, 250, 116, 14);
		panel.add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(807, 598, 460, 148);
		panel.add(scrollPane);

		medsTable = new JTable(new DefaultTableModel(new Object[][] {}, new String[] {
				"\u03A4\u03CD\u03C0\u03BF\u03C2 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5",
				"\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03BF",
				"\u03A5\u03C0\u03B5\u03CD\u03B8\u03B7\u03BD\u03BF\u03C2 \u0399\u03B1\u03C4\u03C1\u03CC\u03C2",
				"\u03A0\u03C1\u03BF\u03C4\u03B9\u03BD\u03CC\u03BC\u03B5\u03BD\u03B7 \u0394\u03BF\u03C3\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1" }));

		scrollPane.setViewportView(medsTable);
		medsTableModel = (DefaultTableModel) medsTable.getModel();

		JButton button = new JButton(
				"\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				medsTableModel.addRow(new Object[] { null, null, null, null, null, null });
			}
		});
		button.setBounds(1277, 620, 135, 23);
		panel.add(button);

		JLabel label_3 = new JLabel(
				"\u03A6\u03B1\u03C1\u03BC\u03B1\u03BA\u03B5\u03C5\u03C4\u03B9\u03BA\u03AE \u0391\u03B3\u03C9\u03B3\u03AE:");
		label_3.setBounds(807, 573, 108, 14);
		panel.add(label_3);

		JButton button_1 = new JButton(
				"\u0391\u03C6\u03B1\u03AF\u03C1\u03B5\u03C3\u03B7 \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medsTableModel.removeRow(medsTableModel.getRowCount() - 1);
			}
		});
		button_1.setBounds(1277, 654, 131, 23);
		panel.add(button_1);

		JLabel label_4 = new JLabel("\u0394\u03B9\u03AC\u03B3\u03BD\u03C9\u03C3\u03B7:");
		label_4.setBounds(58, 786, 116, 14);
		panel.add(label_4);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(58, 811, 460, 213);
		panel.add(textPane_1);

		JLabel lblNewLabel_1 = new JLabel(
				"\u0391\u03C0\u03BB\u03AE \u0395\u03C0\u03AF\u03C3\u03BA\u03B5\u03C8\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03BF\u03CD\u03C2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(598, 56, 206, 20);
		panel.add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.SetCard("1");
			}
		});
		btnNewButton_1.setBounds(807, 1001, 89, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("1");
			}
		});
		btnNewButton_2.setBounds(1005, 1001, 89, 23);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		btnNewButton_3.addActionListener(new ActionListener() {
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
				Condb.insertVisitPatient(Main_screen.amCode, formattedTextField.getText(), formattedTextField.getText(),
						txtpnDgajrgftjmnarttjadgfnagfnagf.getText(), textPane.getText(), textPane_1.getText(),examsData,medsData);
			}
		});
		btnNewButton_3.setBounds(906, 1001, 93, 23);
		panel.add(btnNewButton_3);

	}

	public String[] getRowAt(int row, DefaultTableModel model) {
		String[] result = new String[4];
		for (int i = 0; i < 4; i++) {
			result[i] = (String) model.getValueAt(row, i);
		}
		return result;
	}
}
