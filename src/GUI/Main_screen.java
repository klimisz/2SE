package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class Main_screen extends JPanel implements ActionListener{
public static int amCode=-1;

	/**
	 * Create the panel.
	 */

	JLabel label_gender;

	JLabel label_tk;

	JLabel label_adress;

	JLabel label_city;

	JLabel label_kin;

	JLabel label_til;

	JLabel label_asf;

	JLabel label_amka;

	JLabel label_birthday;

	JLabel label_father;

	JLabel label_surname;

	JLabel label_name;

	JLabel label_am;

	JLabel label_status;

	public Main_screen(Start s) {
		setLayout(null);

		JButton button = new JButton("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setBounds(532, 374, 150, 25);
		add(button);

		JButton button_edit = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1");
		button_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.SetCard("3");
				revalidate();
			}

		});
		button_edit.setBounds(532, 230, 150, 25);
		add(button_edit);

		JLabel label = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(105, 86, 150, 15);
		add(label);

		JLabel label_1 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(105, 112, 150, 15);
		add(label_1);

		JLabel label_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03A0\u03B1\u03C4\u03C1\u03CC\u03C2:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(105, 138, 150, 15);
		add(label_2);

		JLabel label_3 = new JLabel(
				"\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(105, 164, 150, 15);
		add(label_3);

		JLabel label_4 = new JLabel("\u0391.\u039C.\u039A.\u0391.:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(105, 190, 150, 15);
		add(label_4);

		JLabel label_5 = new JLabel(
				"\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(105, 216, 150, 15);
		add(label_5);

		JLabel label_6 = new JLabel(
				"\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF \u039F\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(105, 242, 150, 15);
		add(label_6);

		JLabel label_7 = new JLabel("\u039A\u03B9\u03BD\u03B7\u03C4\u03CC:");
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(105, 268, 150, 15);
		add(label_7);

		JLabel label_8 = new JLabel(
				"\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(105, 320, 150, 15);
		add(label_8);

		JLabel label_9 = new JLabel("\u03A0\u03CC\u03BB\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(105, 294, 150, 15);
		add(label_9);

		JLabel label_10 = new JLabel("\u03A4\u039A:");
		label_10.setHorizontalAlignment(SwingConstants.TRAILING);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(105, 346, 150, 15);
		add(label_10);

		JLabel label_11 = new JLabel("\u03A6\u03CD\u03BB\u03BF:");
		label_11.setHorizontalAlignment(SwingConstants.TRAILING);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_11.setBounds(205, 372, 50, 15);
		add(label_11);

		label_gender = new JLabel("\u03A6\u03CD\u03BB\u03BF");
		label_gender.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_gender.setBounds(265, 372, 50, 15);
		add(label_gender);

		label_tk = new JLabel("\u03A4\u039A");
		label_tk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_tk.setBounds(265, 346, 150, 15);
		add(label_tk);

		label_adress = new JLabel(
				"\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2");
		label_adress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_adress.setBounds(265, 320, 150, 15);
		add(label_adress);

		label_city = new JLabel("\u03A0\u03CC\u03BB\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2");
		label_city.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_city.setBounds(265, 294, 150, 15);
		add(label_city);

		label_kin = new JLabel("\u039A\u03B9\u03BD\u03B7\u03C4\u03CC");
		label_kin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_kin.setBounds(265, 268, 150, 15);
		add(label_kin);

		label_til = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF \u039F\u03B9\u03BA\u03AF\u03B1\u03C2");
		label_til.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_til.setBounds(265, 242, 150, 15);
		add(label_til);

		label_asf = new JLabel(
				"\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2");
		label_asf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_asf.setBounds(265, 216, 150, 15);
		add(label_asf);

		label_amka = new JLabel("\u0391.\u039C.\u039A.\u0391.");
		label_amka.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_amka.setBounds(265, 190, 150, 15);
		add(label_amka);

		label_birthday = new JLabel(
				"\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03B7\u03C3\u03B7\u03C2");
		label_birthday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_birthday.setBounds(265, 164, 150, 15);
		add(label_birthday);

		label_father = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03A0\u03B1\u03C4\u03C1\u03CC\u03C2");
		label_father.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_father.setBounds(265, 138, 150, 15);
		add(label_father);

		label_surname = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		label_surname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_surname.setBounds(265, 112, 150, 15);
		add(label_surname);

		label_name = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		label_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_name.setBounds(265, 86, 150, 15);
		add(label_name);

		JButton button_search = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		button_search.addActionListener(this);

		button_search.setBounds(532, 302, 150, 25);
		add(button_search);

		JButton button_new = new JButton(
				"\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u03C6\u03B1\u03BA\u03AD\u03BB\u03BF\u03C5");
		button_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new New_Folder();

			}
		});
		button_new.setBounds(532, 266, 150, 25);
		add(button_new);

		JButton button_4 = new JButton("\u0391\u03C0\u03BF\u03C3\u03CD\u03BD\u03B4\u03B5\u03C3\u03B7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.SetCard("0");
			}
		});
		button_4.setBounds(532, 338, 150, 25);
		add(button_4);

		JButton button_history = new JButton(
				"\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		button_history.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("7");
			}
		});
		button_history.setBounds(532, 86, 150, 25);
		add(button_history);

		JButton button_admittion = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE");
		button_admittion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.SetCard("5");
			}
		});
		button_admittion.setBounds(532, 122, 150, 25);
		add(button_admittion);

		JButton button_discharge = new JButton("\u0395\u03BE\u03B1\u03B3\u03C9\u03B3\u03AE");
		button_discharge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("6");
			}
		});
		button_discharge.setBounds(532, 158, 150, 25);
		add(button_discharge);

		JButton button_visit = new JButton("\u0391\u03C0\u03BB\u03AE \u0395\u03C0\u03AF\u03C3\u03BA\u03B5\u03C8\u03B7");
		button_visit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("4");
				revalidate();
			}
		});
		button_visit.setBounds(532, 194, 150, 25);
		add(button_visit);

		JLabel label_24 = new JLabel("\u0391\u039C:");
		label_24.setHorizontalAlignment(SwingConstants.TRAILING);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_24.setBounds(105, 398, 150, 15);
		add(label_24);

		label_am = new JLabel("\u0391\u039C");
		label_am.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_am.setBounds(265, 398, 150, 15);
		add(label_am);

		JLabel lblNewLabel = new JLabel(
				"\u0399\u03B1\u03C4\u03C1\u03B9\u03BA\u03CC\u03C2 \u03A6\u03AC\u03BA\u03B5\u03BB\u03BF\u03C2 \u0391\u03C3\u03B8\u03B5\u03BD\u03BF\u03CD\u03C2");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(293, 11, 225, 20);
		add(lblNewLabel);

		JLabel label_13 = new JLabel("\u039A\u03B1\u03C4\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7:");
		label_13.setHorizontalAlignment(SwingConstants.TRAILING);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_13.setBounds(135, 424, 120, 15);
		add(label_13);

		label_status = new JLabel("\u039A\u03B1\u03C4\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7");
		label_status.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_status.setBounds(265, 424, 125, 15);
		add(label_status);

	}

	public void SetValues(String[] data) {
		label_name.setText(data[0]);
		label_surname.setText(data[1]);
		label_father.setText(data[2]);
		label_birthday.setText(data[3]);
		label_amka.setText(data[4]);
		label_asf.setText(data[5]);
		label_til.setText(data[6]);
		label_kin.setText(data[7]);
		label_city.setText(data[8]);
		label_adress.setText(data[9]);
		label_tk.setText(data[10]);
		label_gender.setText((Integer.parseInt(data[11]) == 1) ? "Áññåí" : "ÈÞëõ");
		label_am.setText(data[12]);
		label_status.setText(data[13]);
		amCode=Integer.parseInt(data[12]);
		repaint();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Search(this);
				
	}
}
