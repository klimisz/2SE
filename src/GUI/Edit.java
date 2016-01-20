package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Edit extends JPanel {
	private JTextField textField_name;
	private JTextField textField_surname;
	private JTextField textField_father;
	private JTextField textField_date;
	private JTextField textField_amka;
	private JTextField textField_asf;
	private JTextField textField_til;
	private JTextField textField_kin;
	private JTextField textField_city;
	private JTextField textField_adress;
	private JTextField textField_tk;
	private JTextField textField_status;
	private int am;
	private Main_screen ms;

	/**
	 * Create the panel.
	 */
	public Edit(Start s, Main_screen s2) {
		setLayout(null);
		am = Integer.parseInt(s2.label_am.getText());
		ms = s2;
		JLabel label = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(70, 78, 150, 20);
		add(label);

		textField_name = new JTextField(s2.label_name.getText());
		textField_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_name.setBounds(230, 78, 150, 20);
		add(textField_name);

		JLabel label_1 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(70, 104, 150, 22);
		add(label_1);

		textField_surname = new JTextField(s2.label_surname.getText());
		textField_surname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_surname.setBounds(230, 104, 150, 22);
		add(textField_surname);

		JLabel label_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03A0\u03B1\u03C4\u03C1\u03CC\u03C2:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(70, 132, 150, 20);
		add(label_2);

		textField_father = new JTextField(s2.label_father.getText());
		textField_father.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_father.setBounds(230, 132, 150, 20);
		add(textField_father);

		JLabel label_3 = new JLabel(
				"\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(70, 158, 150, 22);
		add(label_3);

		textField_date = new JTextField(s2.label_birthday.getText());
		textField_date.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_date.setBounds(230, 158, 150, 22);
		add(textField_date);

		JLabel label_4 = new JLabel("\u0391.\u039C.\u039A.\u0391.:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(70, 186, 150, 20);
		add(label_4);

		textField_amka = new JTextField(s2.label_amka.getText());
		textField_amka.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_amka.setBounds(230, 186, 150, 20);
		add(textField_amka);

		JLabel label_5 = new JLabel(
				"\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(70, 212, 150, 20);
		add(label_5);

		textField_asf = new JTextField(s2.label_asf.getText());
		textField_asf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_asf.setBounds(230, 212, 150, 20);
		add(textField_asf);

		JLabel label_6 = new JLabel(
				"\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF \u039F\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(70, 238, 150, 22);
		add(label_6);

		textField_til = new JTextField(s2.label_til.getText());
		textField_til.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_til.setBounds(230, 238, 150, 22);
		add(textField_til);

		JLabel label_7 = new JLabel("\u039A\u03B9\u03BD\u03B7\u03C4\u03CC:");
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(70, 266, 150, 20);
		add(label_7);

		textField_kin = new JTextField(s2.label_kin.getText());
		textField_kin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_kin.setBounds(230, 266, 150, 20);
		add(textField_kin);

		JLabel label_8 = new JLabel("\u03A0\u03CC\u03BB\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(70, 292, 150, 20);
		add(label_8);

		textField_city = new JTextField(s2.label_city.getText());
		textField_city.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_city.setBounds(230, 292, 150, 20);
		add(textField_city);

		JLabel label_9 = new JLabel(
				"\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(70, 318, 150, 20);
		add(label_9);

		textField_adress = new JTextField(s2.label_adress.getText());
		textField_adress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_adress.setBounds(230, 318, 150, 20);
		add(textField_adress);

		JLabel label_10 = new JLabel("\u03A4\u039A:");
		label_10.setHorizontalAlignment(SwingConstants.TRAILING);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(70, 344, 150, 22);
		add(label_10);

		textField_tk = new JTextField(s2.label_tk.getText());
		textField_tk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_tk.setBounds(230, 344, 150, 22);
		add(textField_tk);

		JButton button_ok = new JButton("\u039F\u039A");
		button_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("1");
			}
		});
		button_ok.setBounds(145, 455, 150, 25);
		button_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Condb.updateUser(textField_name.getText(), textField_surname.getText(), textField_father.getText(),
						textField_date.getText(), textField_amka.getText(), textField_asf.getText(),
						Long.parseLong(textField_til.getText()), Long.parseLong(textField_kin.getText()),
						textField_city.getText(), textField_adress.getText(), Integer.parseInt(textField_tk.getText()),
						am, Integer.parseInt(textField_status.getText()));
				ms.SetValues(Condb.searchByAmka(textField_amka.getText()));
			}
		});
		add(button_ok);

		JButton button_cancel = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		button_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.SetCard("1");
			}
		});
		button_cancel.setBounds(145, 486, 150, 25);
		add(button_cancel);

		JLabel label_12 = new JLabel(
				"\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_12.setBounds(135, 11, 182, 20);
		add(label_12);

		JLabel label_11 = new JLabel("\u039A\u03B1\u03C4\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7:");
		label_11.setHorizontalAlignment(SwingConstants.TRAILING);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_11.setBounds(70, 377, 150, 22);
		add(label_11);

		textField_status = new JTextField(s2.label_status.getText());
		textField_status.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_status.setBounds(230, 377, 150, 22);
		add(textField_status);

	}
}
