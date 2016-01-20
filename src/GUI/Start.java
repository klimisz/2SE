package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	Main_screen mainScreen;
	Edit editScreen;

	JPanel contentPane = new JPanel();
	private JPasswordField textField_password;
	private JTextField textField_username;
	CardLayout cl = new CardLayout();
	JPanel container = new JPanel();

	public String[] userData;
	int ac; // AccessLevel

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start() {

		new Condb(); // first init connection with database

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 651);
		mainScreen = new Main_screen(this);

		container.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(container);
		container.setLayout(cl);
		container.add(mainScreen, "1");
		container.add(new Admin_gui(this), "2");
		container.add(contentPane, "0");
		container.add(new Visit(this), "4");
		container.add(new Admission(this), "5");
		container.add(new Discharge(this), "6");
		container.add(new History(this), "7");

		cl.show(container, "0");
		contentPane.setLayout(null);

		JLabel label = new JLabel(
				"Καλώς ήλθατε στο Σύστημα Διαχείρησης Ιατρικού Φακέλου Ασθενούς (Σ.Δ.Ι.Φ.Α.) του νοσοκομείου.");
		label.setBounds(220, 119, 793, 22);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(label);

		JButton button_exit = new JButton("'Εξοδος");
		button_exit.setBounds(572, 440, 86, 23);
		contentPane.add(button_exit);
		button_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		JButton button_login = new JButton("Είσοδος");
		button_login.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("Username: " + textField_username.getText() +" Password: " +String.valueOf(textField_password.getPassword()));
				userData = Condb.validateUser(textField_username.getText(),
						String.valueOf(textField_password.getPassword()));
				if (userData == null)
					return;
				ac = Integer.parseInt(userData[3]);
				textField_username.setText("");
				textField_password.setText("");
				switch (ac) {
				case 0: // administrator
					SetCard("2");
					break;
				case 1: // Doctor
				case 2: // Gramatia
				case 3:// Nurse
					SetCard("1");
					break;
				}
				

				
			}

		});
		button_login.setBounds(572, 411, 86, 23);
		contentPane.add(button_login);

		textField_password = new JPasswordField();
		textField_password.setColumns(10);
		textField_password.setBounds(572, 385, 86, 20);
		contentPane.add(textField_password);

		JLabel label_1 = new JLabel("Όνομα Χρήστη:");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(572, 365, 86, 14);
		contentPane.add(label_1);

		textField_username = new JTextField();
		textField_username.setColumns(10);
		textField_username.setBounds(572, 339, 86, 20);
		contentPane.add(textField_username);

		JLabel label_2 = new JLabel("Κωδικός:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(572, 319, 86, 14);
		contentPane.add(label_2);

	}

	public void SetCard(String s) {
		switch (s) {
		case "0":
			cl.show(container, "0");
			break;
		case "1":
			cl.show(container, "1");

			break;
		case "2":
			cl.show(container, "2");
			break;
		case "3":
			editScreen = new Edit(this, mainScreen);
			container.add(editScreen, "3");
			cl.show(container, "3");
			break;
		case "4":
			cl.show(container, "4");
			break;
		case "5":
			cl.show(container, "5");
			break;
		case "6":
			cl.show(container, "6");
			break;
		case "7":
			cl.show(container, "7");
			break;
		}
		repaint();
	}
}
